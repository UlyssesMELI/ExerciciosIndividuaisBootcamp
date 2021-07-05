package com.aula3.ex2.entity;

public class Produto {

	 private long id; 
	 private String descrição;
	 private String cor; 
	 private int quantidade;
	 private double preço;
	
	 public Produto(long id, String descrição, String cor, int quantidade, double preço) {
		super();
		this.id = id;
		this.descrição = descrição;
		this.cor = cor;
		this.quantidade = quantidade;
		this.preço = preço;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}
	 
	 
	 
	
	 
	 
}
