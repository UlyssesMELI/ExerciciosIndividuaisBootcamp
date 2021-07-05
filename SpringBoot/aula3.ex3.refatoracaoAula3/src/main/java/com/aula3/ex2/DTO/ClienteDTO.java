package com.aula3.ex2.DTO;

import java.util.ArrayList;
import java.util.List;

import com.aula3.ex2.entity.Cliente;
import com.aula3.ex2.entity.Pedido;

public class ClienteDTO {

	
	String cpf;
	String email;
	String telefone;
	private List<PedidoDTO> pedidosDTO;
	
	public ClienteDTO(String cpf, String email, String telefone) {
		super();
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
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
	
	public void setPedidosDTO(List<PedidoDTO> produtosDTO) {
		this.pedidosDTO = produtosDTO;
	}
	
	public List<PedidoDTO> getPedidosDTO() {
		return pedidosDTO;
	}
	
	
	
	public static List<ClienteDTO> converteFDTO(List<Cliente> lstCliente){
		List<ClienteDTO> dtoClientes = new ArrayList<ClienteDTO>();
		for(Cliente c: lstCliente) {
			ClienteDTO pdto = new ClienteDTO(c.getCpf(),c.getEmail(),c.getTelefone());
			pdto.setPedidosDTO(PedidoDTO.converteFDTO(c.getPedidos()));;
			dtoClientes.add(pdto);
		}
		return dtoClientes;
	}
	
	
}
