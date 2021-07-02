package com.spring.aula2restaurante;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.aula2restaurante.dto.CaixaDTO;
import com.spring.aula2restaurante.dto.MesaDTO;
import com.spring.aula2restaurante.entity.Caixa;
import com.spring.aula2restaurante.entity.Mesa;

import dao.MesaDAO;

@RestController
public class Controller {
	
	MesaDAO mesaDAO = new MesaDAO();
	Caixa caixa = new Caixa(0);
	
	@GetMapping("/mesa/{id}")
	public MesaDTO getMesa(@PathVariable long id){
		//return mesaDAO.getMesas();
		Optional<Mesa> opt = mesaDAO.getMesas().stream().filter(item -> item.getId()==id).findFirst();
		Mesa m = opt.get();
		return MesaDTO.converte(m);
	}

	@GetMapping("/mesa/limpa/{id}")
	public String limpaMesa(@PathVariable long id){
		double valor = caixa.setValorCaixa(id, mesaDAO.getMesas());
		return "Valor somado " + valor +" no caixa";
	}
	
	@GetMapping("/caixa")
	public CaixaDTO getCaixa(){	
		return CaixaDTO.converte(caixa);
	}
	
}
