package com.spring.aula2restaurante.dto;

import java.util.ArrayList;
import java.util.List;

import com.spring.aula2restaurante.entity.Mesa;
import com.spring.aula2restaurante.entity.Pedido;
import com.spring.aula2restaurante.entity.Prato;

public class PedidoDTO {

	long id;
	String mesa;
	String pratos; 
	double valorTotal;
	
	
	
	
	public PedidoDTO(long id, String mesa, String pratos, double valorTotal) {
		super();
		this.id = id;
		this.mesa = mesa;
		this.pratos = pratos;
		this.valorTotal = valorTotal;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMesa() {
		return mesa;
	}


	public void setMesa(String mesa) {
		this.mesa = mesa;
	}

	public String getPratos() {
		return pratos;
	}

	public void setPratos(String pratos) {
		this.pratos = pratos;
	}

	public double getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public static List <PedidoDTO> converteL(List <Pedido> pedidos){
		List<PedidoDTO> lstPedidos = new ArrayList<PedidoDTO>();
		for (Pedido p : pedidos) {
			lstPedidos.add(new PedidoDTO(p.getId(), p.getMesa().toString(), p.getPratos().toString(), p.getValorTotal()));
		}
		return lstPedidos;
	}
	
	public static PedidoDTO converte(Pedido pedido){
		return new PedidoDTO(0, pedido.getMesa().toString(), pedido.getPratos().toString(), 0);
	}
	
	
	
}
