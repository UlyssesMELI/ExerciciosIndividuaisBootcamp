package com.aula3.ex2.entity;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private long id;
	private String cpf;
	private String email;
	private String telefone;
	private List<Pedido> pedidos;
	
	
	public Cliente(long id, String cpf, String email, String telefone) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.pedidos = new ArrayList<Pedido>();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
	public void addPedido(Pedido p){
		pedidos.add(p);
	}
	
	
}
