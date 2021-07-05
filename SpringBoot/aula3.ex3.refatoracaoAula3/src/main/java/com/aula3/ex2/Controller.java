package com.aula3.ex2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aula3.ex2.DTO.ClienteDTO;
import com.aula3.ex2.DTO.PedidoDTO;
import com.aula3.ex2.dao.ClienteDAO;
import com.aula3.ex2.entity.Pedido;
import com.aula3.ex2.service.PedidoService;

@RestController
public class Controller {

	
	private ClienteDAO dao = new ClienteDAO();
	
	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping("/cliente")
	public List<ClienteDTO> getCliente(){
		return ClienteDTO.converteFDTO(dao.getClientes());
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
