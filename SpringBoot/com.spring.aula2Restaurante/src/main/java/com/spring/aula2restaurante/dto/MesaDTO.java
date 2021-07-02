package com.spring.aula2restaurante.dto;

import java.util.ArrayList;
import java.util.List;

import com.spring.aula2restaurante.entity.Mesa;

public class MesaDTO {
	
	private String pedidos;
	private double valorTotal;
	
	public MesaDTO(String pedidos, double valorTotal) {
		this.pedidos = pedidos;
		this.valorTotal = valorTotal;
	}
	
			
	public String getPedidos() {
		return pedidos;
	}


	public void setPedidos(String pedidos) {
		this.pedidos = pedidos;
	}


	public double getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}


	public static List <MesaDTO> converteL(List<Mesa> mesas){
		List <MesaDTO> mesasDTO = new ArrayList<MesaDTO>();
		for(Mesa m : mesas) {
			mesasDTO.add(new MesaDTO(m.getPedidos().toString(), m.getValorTotal()));
		}
		return mesasDTO;
	}
	
	public static MesaDTO converte(Mesa m){
		return new MesaDTO(m.getPedidos().toString(), m.getValorTotal());
	}
	
}
