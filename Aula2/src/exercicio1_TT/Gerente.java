package exercicio1_TT;

public class Gerente extends CLT {

	public Gerente(String nome) {
		super(nome,6000, 12.5, 40, 1);
	}
	
	@Override
	public CLT promove() {
		return new Diretor(getNome());
	}
	
}
