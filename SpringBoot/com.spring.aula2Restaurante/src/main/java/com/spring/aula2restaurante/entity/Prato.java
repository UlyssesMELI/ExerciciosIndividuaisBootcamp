package com.spring.aula2restaurante.entity;

public class Prato {

	private long id; 
	private double preço;
	private String descrição; 
	private int quantidade;
	
	public Prato(long id, double preço, String descrição, int quantidade) {
		super();
		this.id = id;
		this.preço = preço;
		this.descrição = descrição;
		this.quantidade = quantidade;
	}


	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	@Override
	public String toString() {
		return "Prato {id:" + id + ", preço:" + preço + ", descrição:" + descrição + ", quantidade:" + quantidade + "}";
	}
	
	
	
}
