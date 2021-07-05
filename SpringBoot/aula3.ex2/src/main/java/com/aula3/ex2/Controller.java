package com.aula3.ex2;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula3.ex2.DTO.ClienteDTO;
import com.aula3.ex2.dao.ClienteDAO;

@RestController
public class Controller {

	
	private ClienteDAO dao = new ClienteDAO();
	
	@GetMapping("/cliente")
	public List<ClienteDTO> getCliente(){
		return ClienteDTO.converteFDTO(dao.getClientes());
	}
	
}
