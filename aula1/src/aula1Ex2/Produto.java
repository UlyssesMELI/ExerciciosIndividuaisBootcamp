package aula1Ex2;


public class Produto {
	private int numero;
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(int numero, String nome, double preco, int quantidade) {
		this.numero = numero;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public double getPreco() {
		return this.preco*this.quantidade;
	}
	
	@Override
	public String toString() {
		return String.format("Numero: %d  Nome: %s  Preco:%f  Quantidade: %d", this.numero,this.nome,this.preco, this.quantidade);
	}
	
}
