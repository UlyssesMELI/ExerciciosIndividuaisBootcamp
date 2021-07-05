package com.aula3.ex2.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

	private long id;
	private List<Produto> produtos;
	double valorTotal;
	private Date date;
	
	public Pedido(long id,  double valorTotal, String date) {
		super();
		this.id = id;
		this.produtos = new ArrayList<Produto>();
		this.valorTotal = valorTotal;
		try {
			this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
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
	
	public String getDate() {
		return new SimpleDateFormat("dd/MM/yyyy").format(date);
	}
	
	
	
	
}
