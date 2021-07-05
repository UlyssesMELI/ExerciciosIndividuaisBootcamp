package com.aula3.ex2.DTO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.aula3.ex2.entity.Pedido;
import com.aula3.ex2.entity.Produto;

public class PedidoDTO {

	private List<ProdutoDTO> produtos;
	double valorTotal;
	private Date date;
	
	public PedidoDTO(double valorTotal, String date) {
		super();
		this.produtos = new ArrayList<ProdutoDTO>();
		this.valorTotal = valorTotal;
		try {
			this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
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
			PedidoDTO pdto = new PedidoDTO(p.getValorTotal(),p.getDate());
			pdto.setProdutos(ProdutoDTO.converteFDTO(p.getProdutos()));
			dtoPedidos.add(pdto);
		}
		
		
		return dtoPedidos;
	}

	public String getDate() {
		return new SimpleDateFormat("dd/MM/yyyy").format(date);
	}
	
	
}
