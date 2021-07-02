package com.spring.aula2restaurante.entity;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	long id;
	Mesa mesa;
	List <Prato> pratos;
	private double valorTotal;
	
	public Pedido(long id, Mesa mesa, List<Prato> pratos, double valorTotal) {
		super();
		this.id = id;
		this.mesa = mesa;
		this.pratos = pratos;
		this.valorTotal = valorTotal;
	}
	
	public Pedido(long id, double valorTotal) {
		super();
		this.id = id;
		this.mesa = null;
		this.pratos = new ArrayList<Prato>();
		this.valorTotal = valorTotal;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public List<Prato> getPratos() {
		return pratos;
	}

	public void setPratos(List<Prato> pratos) {
		this.pratos = pratos;
	}
	
	public void addPratos(Prato prato) {
		this.pratos.add(prato);
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
		return "{Pedido numero: " + id + " Pratos = " + pratos.toString();
	}
	
	
	
	
	
	
}
