package com.spring.aula2diploma.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Disciplina {

    @NotBlank(message = "O disciplina necessita de um nome")
	private String nome;
    @NotNull(message = "O disciplina necessita de uma nota")
	private double nota;
	
	public Disciplina(String nome, double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", nota=" + nota + "]";
	}
	
	
}
