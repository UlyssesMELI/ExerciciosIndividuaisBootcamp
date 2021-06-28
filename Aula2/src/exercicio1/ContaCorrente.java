package exercicio1;

public class ContaCorrente {

	private String nomeProprietario;
	private String cpf;
	private double saudo;
	
	public ContaCorrente(double saudo, String nomeProprietario, String cpf) {
		this.saudo = saudo;
		this.nomeProprietario = nomeProprietario;
		this.cpf = cpf;
	}
	
	public ContaCorrente(ContaCorrente conta) {
		this.saudo = conta.getSaudo();
		this.cpf = conta.getCpf();
		this.nomeProprietario = conta.getNomeProprietario();
		
	}
	
	
	private void deposito() {
		// TODO Auto-generated method stub

	}
	private void saque() {
		// TODO Auto-generated method stub

	}
	private void devolução() {
		// TODO Auto-generated method stub

	}
	private void transferência() {
		// TODO Auto-generated method stub

	}
	
	public double getSaudo() {
		return saudo;
	}
	
	public void setSaudo(double saudo) {
		this.saudo = saudo;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNomeProprietario() {
		return nomeProprietario;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Nome: %s  - cpf: %s / Saldo: %.2f", this.nomeProprietario, this.cpf, this.saudo);
	}

}