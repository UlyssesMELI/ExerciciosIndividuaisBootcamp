package com.aula3.ex2.DTO;

import java.util.ArrayList;
import java.util.List;

import com.aula3.ex2.entity.Pedido;
import com.aula3.ex2.entity.Produto;

public class PedidoDTO {

	private List<ProdutoDTO> produtos;
	double valorTotal;
	public PedidoDTO(double valorTotal) {
		super();
		this.produtos = new ArrayList<ProdutoDTO>();
		this.valorTotal = valorTotal;
	}

	public List<ProdutoDTO> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<ProdutoDTO> produtos) {
		this.produtos = produtos;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	

	
	public static List<PedidoDTO> converteFDTO(List<Pedido> lstPedido){
		List<PedidoDTO> dtoPedidos = new ArrayList<PedidoDTO>();
		for(Pedido p: lstPedido) {
			PedidoDTO pdto = new PedidoDTO(p.getValorTotal());
			pdto.setProdutos(ProdutoDTO.converteFDTO(p.getProdutos()));
			dtoPedidos.add(pdto);
		}
		
		
		return dtoPedidos;
	}
	
	
}
