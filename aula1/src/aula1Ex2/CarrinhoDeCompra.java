package aula1Ex2;

import java.util.ArrayList;

public class CarrinhoDeCompra {

	private ArrayList<Produto> carrinho = new ArrayList<Produto> ();
	
	public CarrinhoDeCompra() {
		// TODO Auto-generated constructor stub
	}
		
	public void add(Produto produto) {
		carrinho.add(produto);
	}
	
	public double contabilizar() {
		double valorTotal = 0;
		for(int i=0;i<carrinho.size();i++) {
			valorTotal += carrinho.get(i).getPreco();
		}
		return valorTotal;
	}
	
	@Override
	public String toString() {
		String text = "";
		for(int i=0;i<carrinho.size();i++) {
			String linha = carrinho.get(i).toString();
			text = text + linha + "\n";
		}
		
		return text;
	}
	
	
}
