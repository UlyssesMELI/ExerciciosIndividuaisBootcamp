package com.spring.aula2diploma.models;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.spring.aula2diploma.dao.AlunoDAO;

public class AlunoDTO {

		
		private String nome;
		private List<Disciplina> lstDisciplinas;
		
		public AlunoDTO(long id, String nome) {
			super();
			this.nome = nome;
			this.lstDisciplinas = new ArrayList<Disciplina>();
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
