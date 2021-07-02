package dao;

import java.util.ArrayList;
import java.util.List;

import com.spring.aula2restaurante.dto.MesaDTO;
import com.spring.aula2restaurante.entity.Mesa;
import com.spring.aula2restaurante.entity.Pedido;
import com.spring.aula2restaurante.entity.Prato;

public class MesaDAO {

	private List<Mesa> mesas;

	public MesaDAO(List<Mesa> mesas) {
		super();
		this.mesas = mesas;
		populate();
	}
	
	public MesaDAO() {
		super();
		this.mesas = new ArrayList<Mesa>();
		populate();
	}

	public List<Mesa> getMesas() {
		return this.mesas;
	}

	public void addMesa(Mesa mesa) {
		this.mesas.add(mesa);
	}
	
	private void populate() {
		for(int i=0;i<10;i++) {
			List<Pedido> pedidos = new ArrayList<>();
			pedidos.add(new Pedido(1, 1.0));
			pedidos.add(new Pedido(2, 2.0));
			pedidos.add(new Pedido(3, 3.0));
			pedidos.add(new Pedido(4, 4.0));
			pedidos.add(new Pedido(5, 5.0));
			
			Mesa m = new Mesa(i, pedidos, i);
			
			for (Pedido p: pedidos) {
				p.addPratos(new Prato(i, i, "Huummm comida gostosa", i));
				p.setMesa(m);
			}
			this.mesas.add(m);
		}
		
	}
	
}
