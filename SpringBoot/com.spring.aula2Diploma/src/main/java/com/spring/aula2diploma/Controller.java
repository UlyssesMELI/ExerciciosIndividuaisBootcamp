package com.spring.aula2diploma;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.spring.aula2diploma.dao.AlunoDAO;
import com.spring.aula2diploma.models.Aluno;
import com.spring.aula2diploma.models.AlunoDTO;
import com.spring.aula2diploma.models.Diploma;

@RestController
public class Controller {

	private AlunoDAO dao = new AlunoDAO();
	
	@PostMapping("/aluno")
	public ResponseEntity<AlunoDTO> createAluno(@RequestBody AlunoDTO alunoDTO, UriComponentsBuilder uriBuilder) {
		Aluno aluno = AlunoDTO.converte(alunoDTO,dao);
		dao.add(aluno);
		URI uri = uriBuilder.path("/diploma/{id}").buildAndExpand(aluno.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@GetMapping("/diploma/{id}")
	public Diploma diploma(@PathVariable long id) {
		Aluno aluno = dao.get(id);
		Diploma diploma = new Diploma(aluno.getNome(), aluno.getMedia());
		return diploma;
	}
}
