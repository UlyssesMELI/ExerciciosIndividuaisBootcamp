package com.spring.aula2restaurante.dto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.spring.aula2restaurante.entity.Mesa;
import com.spring.aula2restaurante.entity.Pedido;
import com.spring.aula2restaurante.entity.Prato;

public class PedidoDTO {

	String mesa;
	String pratos; 
	double valorTotal;
	String date;
	
	public PedidoDTO(long id, String mesa, String pratos, double valorTotal, String date) {
		super();
		this.mesa = mesa;
		this.pratos = pratos;
		this.valorTotal = valorTotal;
		this.date = date;
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
			lstPedidos.add(new PedidoDTO(p.getId(), "", p.getPratos().toString(), p.getValorTotal(),p.getDate()));
		}
		return lstPedidos;
	}
	
	public static PedidoDTO converte(Pedido pedido){
		return new PedidoDTO(0, "", pedido.getPratos().toString(), 0,pedido.getDate());
	}



	public String getDate() {
		return date;
	}

	
	
	
}
