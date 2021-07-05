package com.aula3.ex2.repository;

import com.aula3.ex2.DTO.PedidoDTO;
import com.aula3.ex2.entity.Pedido;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class PedidoRepository {

	private static final File FILE = new File("pedidos.json");

	@Autowired
	private ObjectMapper mapper;

	public List<Pedido> getList(){
		List<Pedido> map = new ArrayList<Pedido>();
		try {
			FileInputStream is = new FileInputStream(FILE);
			TypeReference<List<Pedido>> typeReference = new TypeReference<List<Pedido>>() {};
			map = mapper.readValue(is, typeReference);
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return map;
	}

	public void addPedido(PedidoDTO pedido){
		List<Pedido> listP = this.getList();
		listP.add(new Pedido(listP.size()+1, pedido.getValorTotal(), pedido.getDate()));
		try {
			JsonGenerator g = mapper.getFactory().createGenerator(new FileOutputStream(FILE));
			
			mapper.writeValue(g, listP);
			
			g.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void updatePedido(Pedido pedido){
		List<Pedido> listP = getList();
		try {
			JsonGenerator g = mapper.getFactory().createGenerator(new FileOutputStream(FILE));
			
			
			for(Pedido p : listP) {
				if(p.getId()==pedido.getId()) {
					p = pedido;
				}
			}
			
			mapper.writeValue(g, listP);
			
			g.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void removePedido(long id){
		List<Pedido> listP = getList();
		try {
			JsonGenerator g = mapper.getFactory().createGenerator(new FileOutputStream(FILE));
			
			
			for(Pedido p : listP) {
				if(p.getId()==id) {
					listP.remove(p);
				}
			}
			
			mapper.writeValue(g, listP);
			
			g.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
