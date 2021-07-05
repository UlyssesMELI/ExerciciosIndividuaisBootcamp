package com.spring.aula2restaurante.entity;

import java.util.List;

public class Caixa {

	private double valorCaixa;

	public Caixa(long valorCaixa) {
		super();
		this.valorCaixa = valorCaixa;
	}

	public double getValorCaixa() {
		return valorCaixa;
	}

	public double setValorCaixa(long id_mesa, List<Mesa> mesas) {
		for(Mesa m : mesas) {
			if(m.getId()==id_mesa) {
				valorCaixa += m.getValorTotal();
				mesas.remove(m);
				return m.getValorTotal();
			}
		}
		return 0;
	}
	
	
	
}
