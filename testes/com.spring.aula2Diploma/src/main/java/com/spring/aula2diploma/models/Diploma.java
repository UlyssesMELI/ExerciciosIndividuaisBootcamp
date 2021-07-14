package com.spring.aula2diploma.models;

public class Diploma {

	private String nome;
	private double media;
	private String mensagem;
	
	public Diploma(String nome, double media) {
		super();
		this.nome = nome;
		this.media = media;
		this.mensagem =  media >= 9 ? "Parabens" : "";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
		this.mensagem =  media > 9 ? "Parabens" : "";
	}
	public String getMensagem() {
		return mensagem;
	}
	
	@Override
	public String toString() {
		return "Diploma [nome=" + nome + ", media=" + media + "]";
	}
	
	
	
	
}
