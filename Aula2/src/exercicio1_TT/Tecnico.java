package exercicio1_TT;

public class Tecnico extends CLT {

	public Tecnico(String nome) {
		super(nome, 3200, 5, 40, 1);
	}
	
	@Override
	public CLT promove() {
		return new Analista(getNome());
	}
	
}
