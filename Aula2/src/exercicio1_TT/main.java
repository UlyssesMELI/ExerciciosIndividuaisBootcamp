package exercicio1_TT;

public class main {
	public static void main(String[] args) {	
		PJ pj = new PJ("Joao");
		System.out.println(pj.pagarSalario());
		
		CLT funcionarioCLT = new Tecnico("Maria");
		System.out.println(funcionarioCLT.pagarSalario());
		
		funcionarioCLT = funcionarioCLT.promove();
		System.out.println(funcionarioCLT.pagarSalario());
		
		funcionarioCLT = funcionarioCLT.promove();
		System.out.println(funcionarioCLT.pagarSalario());
		
		funcionarioCLT = funcionarioCLT.promove();
		System.out.println(funcionarioCLT.pagarSalario());

	}
	

}
