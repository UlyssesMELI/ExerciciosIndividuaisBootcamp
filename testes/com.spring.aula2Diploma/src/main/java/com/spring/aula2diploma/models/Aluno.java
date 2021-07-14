package com.spring.aula2diploma.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Aluno {
	
	private long id;
	
	private String nome;
	private List<Disciplina> lstDisciplinas;
	
	public Aluno(long id, String nome, List<Disciplina> lstDisciplinas) {
		super();
		this.id = id;
		this.nome = nome;
		this.lstDisciplinas = lstDisciplinas;
	}
	
	public Aluno(long id, String nome) {
		super();
		this.id = id;
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
	
	public double getMedia(){
		double soma = 0;
		for(Disciplina d : this.lstDisciplinas)
			soma += d.getNota();
		return soma/lstDisciplinas.size();
	}
	
	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", lstDisciplinas=" + lstDisciplinas + "]";
	}

	public long getId() {
		// TODO Auto-generated method stub
		return this.id;
	}
	
	

}
