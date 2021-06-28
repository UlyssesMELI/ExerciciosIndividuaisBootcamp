package exercicio6;

public class Principal {

	public static void main(String[] args) {
		String text = "   Lorem Ipsum   ";
		System.out.println(NStringUltil.rpad(text,'X',6));
		System.out.println(NStringUltil.rtrim(text));
		System.out.println(NStringUltil.ltrim(text));
		System.out.println(NStringUltil.trim(text));
	}

}
