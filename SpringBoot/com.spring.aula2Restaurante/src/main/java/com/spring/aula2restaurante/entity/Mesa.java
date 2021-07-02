package com.spring.aula2restaurante.entity;

import java.util.List;

public class Mesa {
	
	private long id;
	private List <Pedido> pedidos;
	private double valorTotal;
	
	public Mesa(long id, List<Pedido> pedidos, double valorTotal) {
		super();
		this.id = id;
		this.pedidos = pedidos;
		this.valorTotal = valorTotal;
	}
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Mesa [id=" + id + ", pedidos=" + pedidos + ", valorTotal=" + valorTotal + "]";
	}
	
}
