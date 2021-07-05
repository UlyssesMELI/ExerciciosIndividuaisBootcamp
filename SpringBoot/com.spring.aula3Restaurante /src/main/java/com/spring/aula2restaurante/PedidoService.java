package com.spring.aula2restaurante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.aula2restaurante.dto.PedidoDTO;
import com.spring.aula2restaurante.entity.Pedido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepo pedidoRepository;

    public List<Pedido> getList() {
        return pedidoRepository.getList();
    }
    
    public void addPedido(PedidoDTO p) {
        pedidoRepository.addPedido(p);
    }
    
    public void updatePedido(Pedido p) {
        pedidoRepository.updatePedido(p);;
    }
    
    public void removePedido(long id) {
        pedidoRepository.removePedido(id);;
    }

	public List<Pedido> filterByDate(Date searchDate) {
		List<Pedido> lstP = new ArrayList<Pedido>();
		Date date = null;
		for (Pedido p : this.getList()) {
			try {
				date = new SimpleDateFormat("dd/MM/yyyy").parse(p.getDate());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			if (date.equals(searchDate)) {
				lstP.add(p);
			}
		}
		return lstP;
	}

}