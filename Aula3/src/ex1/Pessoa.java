package ex1;

public class Pessoa implements Precedente<Pessoa>{
	
	private String nome; 
	private int cpf;
	
	public Pessoa(String nome, int cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public int precedeA(Pessoa pessoa) {
		if (pessoa.cpf > this.cpf) {
			return -1;
		}
		else {
			return 1;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Nome:%s     Cpf:%d",nome, cpf);
	}
	

}
