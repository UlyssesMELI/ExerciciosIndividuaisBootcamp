package com.spring.aula2restaurante.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class Pedido {

	long id;
	long mesa;
	List <Prato> pratos;
	private double valorTotal;
	private boolean aberto;
	private Date date;
	
	public Pedido(long id, long mesa, List<Prato> pratos, double valorTotal, String date) {
		super();
		this.id = id;
		this.mesa = mesa;
		this.pratos = pratos;
		this.valorTotal = valorTotal;
		this.aberto = true;
		try {
			this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
	
	/*public Pedido(long id, double valorTotal) {
		super();
		this.id = id;
		this.mesa = 0;
		this.pratos = new ArrayList<Prato>();
		this.valorTotal = valorTotal;
		this.aberto = true;
	}*/
	
	public String getDate() {
		return new SimpleDateFormat("dd/MM/yyyy").format(date);
	}

	public long getMesa() {
		return mesa;
	}

	public void setMesa(Long mesa) {
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
	
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	private boolean getAberto() {
		return this.aberto;
	}
	
	public long getId() {
		return id;
	}

	
	@Override
	public String toString() {
		return "{Pedido numero: " + id + " Pratos = " + pratos.toString();
	}
	
	
	
	
	
	
}
