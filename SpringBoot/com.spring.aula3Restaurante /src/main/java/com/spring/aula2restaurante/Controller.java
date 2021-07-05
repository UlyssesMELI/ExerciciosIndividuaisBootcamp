package com.spring.aula2restaurante;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.aula2restaurante.dto.CaixaDTO;
import com.spring.aula2restaurante.dto.MesaDTO;
import com.spring.aula2restaurante.dto.PedidoDTO;
import com.spring.aula2restaurante.entity.Caixa;
import com.spring.aula2restaurante.entity.Mesa;
import com.spring.aula2restaurante.entity.Pedido;

import dao.MesaDAO;

@RestController
public class Controller {
	
	MesaDAO mesaDAO = new MesaDAO();
	Caixa caixa = new Caixa(0);
	
	@Autowired
	private PedidoService pedidoService;
	
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
	
	//CRUD Pedido
	
	@GetMapping("/pedido")
	public ResponseEntity<List<Pedido>> lstPedido(){
        return new ResponseEntity<>(pedidoService.getList(), HttpStatus.OK);		
	}
	
	@PostMapping("/addpedido")
	public void addPedido(@RequestBody PedidoDTO p){
		pedidoService.addPedido(p);		
	}
	
	@PostMapping("/updatepedido")
	public void updatePedido(@RequestBody Pedido p){
		pedidoService.updatePedido(p);		
	}
	
	@GetMapping("/removepedido/{id}")
	public void removePedido(@PathVariable long id){
		pedidoService.removePedido(id);		
	}
	
	@GetMapping("/pedido/data/{dia}/{mes}/{ano}")
	public List <Pedido> filtraPedido(@PathVariable String dia,@PathVariable String mes,@PathVariable String ano){
		Date date = null;
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(dia+"/"+mes+"/"+ano);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pedidoService.filterByDate(date);  		
	}
	
	
}
