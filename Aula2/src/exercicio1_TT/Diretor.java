package exercicio1_TT;

public class Diretor extends CLT{

	public Diretor(String nome) {
		super(nome, 15000, 3, 0, 0);
	}
	
	public double pagarSalario() {
		return salarioBase + Empresa.getLucro()*0.3;
	}	
	
	@Override
	public CLT promove() {
		return this;
	}
}
