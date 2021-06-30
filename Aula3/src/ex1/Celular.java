package ex1;

public class Celular implements Precedente<Celular>{

	private int numero;
	
	public Celular(int numero) {
		this.numero = numero;
	}
	
	@Override
	public int precedeA(Celular c) {
		if (c.numero > this.numero) {
			return -1;
		}
		else {
			return 1;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Telefone: "+this.numero;
	}
	
}
