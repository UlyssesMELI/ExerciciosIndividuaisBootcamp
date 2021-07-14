package com.spring.aula2diploma.dto;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.spring.aula2diploma.dao.AlunoDAO;
import com.spring.aula2diploma.models.Aluno;
import com.spring.aula2diploma.models.Disciplina;

public class AlunoDTO {
		
		@NotEmpty(message="Nome nao pode ficar vazio.") @Size(min=8, max=50)
		private String nome;

		private List<@Valid Disciplina> lstDisciplinas;
		
		public AlunoDTO(long id, String nome,List<@Valid Disciplina>  lstDisciplinas) {
			super();
			this.nome = nome;
			this.lstDisciplinas = lstDisciplinas;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public void addDisciplina(Disciplina d) {
			lstDisciplinas.add(d);

		}
		
		public List<Disciplina> getLstDisciplinas() {
			return lstDisciplinas;
		}
		
		public double getMedia(){
			double soma = 0;
			for(Disciplina d : this.lstDisciplinas)
				soma += d.getNota();
			return soma/lstDisciplinas.size();
		}
		
		@Override
		public String toString() {
			return "AlunoDTO [ nome=" + nome + ", lstDisciplinas=" + lstDisciplinas + "]";
		}
		

	public static Aluno converte(AlunoDTO alunoDTO, AlunoDAO dao) {
		return new Aluno(dao.getNextID(), alunoDTO.getNome(), alunoDTO.getLstDisciplinas());
	}

}
