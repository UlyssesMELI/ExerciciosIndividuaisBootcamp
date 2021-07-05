package com.aula3.ex2.entity;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private long id;
	private List<Produto> produtos;
	double valorTotal;
	public Pedido(long id,  double valorTotal) {
		super();
		this.id = id;
		this.produtos = new ArrayList<Produto>();
		this.valorTotal = valorTotal;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public void addProduto(Produto p){
		produtos.add(p);
	}	
	
	
	
	
}
