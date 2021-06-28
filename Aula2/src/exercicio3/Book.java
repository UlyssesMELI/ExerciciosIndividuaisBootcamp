package exercicio3;

public class Book {

	private String titulo; 
	private String isbn;
	private String autor;
	
	private Boolean is_alugado;
	private int id_locatario;
	
	public Book(String titulo, String isbn, String autor) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.id_locatario = 0;
		this.is_alugado = false;
	}
	
	public void emprestimo(int id) {
		this.id_locatario = id;
		this.is_alugado = true;
	}
	public void devolver() {
		// TODO Auto-generated method stub
		this.is_alugado = false;
	}	
	
	/*
	 * resposta a questao do pdf: O metodo tostring nao funciona se ficar no minusculo
	 * 
	 * */
	
	@Override
	public String toString() {
		String alugado = is_alugado ? "Sim" : "Nao";
		return String.format("Nome Livro: %s \t Autor: %s \t isbn: %s \t alugado: %s", 
				this.titulo,
				this.autor,
				this.isbn,
				alugado);
	}
}
