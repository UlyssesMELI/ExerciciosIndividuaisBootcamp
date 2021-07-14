package com.spring.aula2diploma;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.spring.aula2diploma.dto.AlunoDTO;
import com.spring.aula2diploma.models.Diploma;
import com.spring.aula2diploma.models.Disciplina;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ApplicationTests {
	
	public static final MediaType APPLICATION_JSON_UTF8 = new MediaType(MediaType.APPLICATION_JSON.getType(), MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));

	
	@Autowired
	private MockMvc mockMvc;

	ObjectWriter ow;
	
	@BeforeEach
	void inti() {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
	    mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
	    this.ow = mapper.writer().withDefaultPrettyPrinter();

	}
	
	
	@Test
	void createdTestAnalyzeNotes() throws Exception {
		List <Disciplina> listDisciplina = new ArrayList<>();
		AlunoDTO newAluno = new AlunoDTO(1,"teste123", listDisciplina);
		String requestJson = this.ow.writeValueAsString(newAluno);
		
		this.mockMvc.perform(post("/aluno").contentType(APPLICATION_JSON_UTF8)
		.content(requestJson))
		.andExpect(status().isCreated());
		
	}
	
	@Test
	void minNameTestAnalyzeNotes() throws Exception {
		List <Disciplina> listDisciplina = new ArrayList<>();
		AlunoDTO newAluno = new AlunoDTO(1,"abc", listDisciplina);
	    String requestJson = this.ow.writeValueAsString(newAluno);

		this.mockMvc.perform(post("/aluno").contentType(APPLICATION_JSON_UTF8)
		.content(requestJson))
		.andExpect(status().isBadRequest());	
	}
	
	@Test
	void maxNameTestAnalyzeNotes() throws Exception {
		List <Disciplina> listDisciplina = new ArrayList<>();
		String fiftySizeString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		AlunoDTO newAluno = new AlunoDTO(1,fiftySizeString, listDisciplina);
	    String requestJson = this.ow.writeValueAsString(newAluno);

		this.mockMvc.perform(post("/aluno").contentType(APPLICATION_JSON_UTF8)
		.content(requestJson))
		.andExpect(status().isBadRequest());	
	}
	
	@Test
	void testCalculateAverage() {
		List <Disciplina> listDisciplina = new ArrayList<>();
		listDisciplina.add(new Disciplina("fisica 1", 6));
		listDisciplina.add(new Disciplina("calculo 1", 8));
		listDisciplina.add(new Disciplina("Computacao Basica", 10));
		
		AlunoDTO newAluno = new AlunoDTO(1,"teste123", listDisciplina);
		
		assertEquals((6+8+10)/3, newAluno.getMedia());

		
	}
	@Test
	void failTestCalculateAverage() {
		List <Disciplina> listDisciplina = new ArrayList<>();
		listDisciplina.add(new Disciplina("fisica 1", 6));
		listDisciplina.add(new Disciplina("calculo 1", 8));
		listDisciplina.add(new Disciplina("Computacao Basica", 10));
		
		AlunoDTO newAluno = new AlunoDTO(1,"teste123", listDisciplina);
		
		assertNotEquals((8+10)/3, newAluno.getMedia());

		
	}
	
	@Test
	void testWriteDiploma() throws Exception {
		List <Disciplina> listDisciplina = new ArrayList<>();
		AlunoDTO newAluno = new AlunoDTO(1,"teste123", listDisciplina);
		String requestJson = this.ow.writeValueAsString(newAluno);
		
		this.mockMvc.perform(post("/aluno").contentType(APPLICATION_JSON_UTF8)
		.content(requestJson))
		.andExpect(status().isCreated());
		
		this.mockMvc.perform(get("/diploma/1")).andExpect(status().isOk());
		
	}
	
	@Test
	void testWithHonors() {
		Diploma diploma = new Diploma("teste123", 9);
		assertEquals("Parabens", diploma.getMensagem());
	}
	
	@Test
	void FaiTestWithHonors() {
		Diploma diploma = new Diploma("teste123", 5);
		assertEquals("", diploma.getMensagem());
	}
}
