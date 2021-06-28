package exercicio1_TT;

public class Analista extends CLT {
	
	public Analista(String nome) {
		super(nome, 4000, 8, 44, 1);
	}
	
	@Override
	public CLT promove() {
		return new Gerente(getNome());
	}
	
}
