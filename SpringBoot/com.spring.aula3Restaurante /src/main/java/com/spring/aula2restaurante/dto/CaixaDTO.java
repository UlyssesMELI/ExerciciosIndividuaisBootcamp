package com.spring.aula2restaurante.dto;

import com.spring.aula2restaurante.entity.Caixa;

public class CaixaDTO {

	private double valor;

	public CaixaDTO(double valor) {
		super();
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public static CaixaDTO converte(Caixa caixa) {
		return new CaixaDTO(caixa.getValorCaixa());
	}
	
}
