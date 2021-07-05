package com.aula3.ex2.DTO;

import java.util.ArrayList;
import java.util.List;

import com.aula3.ex2.entity.Pedido;
import com.aula3.ex2.entity.Produto;

public class ProdutoDTO {

	 private String descrição;
	 private String cor; 
	 private int quantidade;
	 private double preço;
	
	 public ProdutoDTO(String descrição, String cor, int quantidade, double preço) {
		super();
		this.descrição = descrição;
		this.cor = cor;
		this.quantidade = quantidade;
		this.preço = preço;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	
	
	public static List<ProdutoDTO> converteFDTO(List<Produto> lstProduto){
		List<ProdutoDTO> dtoProduto = new ArrayList<ProdutoDTO>();
		for(Produto p: lstProduto) {
			ProdutoDTO pdto = new ProdutoDTO(p.getDescrição(),p.getCor(),p.getQuantidade(),p.getPreço());
			dtoProduto.add(pdto);
		}
		return dtoProduto;
	}
}
