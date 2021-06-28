package exercicio1_TT;

public abstract class CLT extends Funcionario {

	protected double salarioBase;
	protected double bonus;
	protected int horasDeTrabalho;
	protected int metasBatidas;
	
	
	
	public CLT(String nome,double salarioBase, double bonus, int horasDeTrabalho, int metasBatidas) {
		super(nome);
		this.salarioBase = salarioBase;
		this.bonus = bonus;
		this.horasDeTrabalho = horasDeTrabalho;
		this.metasBatidas = metasBatidas;
	}



	public double pagarSalario() {
		return salarioBase + metasBatidas*salarioBase*(bonus/100);
	}
	
	public abstract CLT promove();
	
}
