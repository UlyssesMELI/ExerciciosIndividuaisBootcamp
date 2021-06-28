package exercicio1_TT;


public abstract class Funcionario {
	private String nome;
	
	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	public abstract double pagarSalario();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
