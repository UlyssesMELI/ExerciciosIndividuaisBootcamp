package com.aula3.ex2.dao;

import java.util.ArrayList;
import java.util.List;

import com.aula3.ex2.DTO.ClienteDTO;
import com.aula3.ex2.entity.Cliente;
import com.aula3.ex2.entity.Pedido;
import com.aula3.ex2.entity.Produto;

public class ClienteDAO {

	private List<Cliente> clientes;
	
	public ClienteDAO() {
		super();
		clientes = new ArrayList<Cliente>();
		populate();
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public void addCliente(ClienteDTO c) {
		clientes.add(new Cliente(clientes.size(), c.getCpf(), c.getEmail(), c.getTelefone()));

	}
	
	private void populate() {
		
		for(int i=0; i<10;i++) {
			Cliente cliente = new Cliente(i, "123456789", "asd@zxc.com", "99889988");
			Pedido pedido = new Pedido(i,  22.5, "05/07/2021");
			Produto produto = new Produto(i, "", "", 1, 22.5);
			pedido.addProduto(produto);
			cliente.addPedido(pedido);
			this.clientes.add(cliente);
		}
		
	}
	
	
	
	
}
