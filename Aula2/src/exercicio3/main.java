package exercicio3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book livro = new Book("Senhor do aneis: A sociedade do anel","a23123344","Tolkien");
		Book livro2 = new Book("Senhor do aneis: As duas torres","b2123123123","Tolkien");
		Book livro3 = new Book("Senhor do aneis: o retorno do rei","c2asdas3123344","Tolkien");
	
		livro2.emprestimo(1);
		livro3.emprestimo(1);
		livro3.devolver();
		

		System.out.println(livro);
		System.out.println(livro2);
		System.out.println(livro3);

	}

}
