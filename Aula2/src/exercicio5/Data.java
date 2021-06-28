package exercicio5;
import java.util.GregorianCalendar;

import java.time.format.DateTimeFormatter;

public class Data {

	private GregorianCalendar date;

	public Data(int dia, int mes, int ano) {
		// TODO Auto-generated constructor stub		
		try {
			this.date = new GregorianCalendar(ano,mes-1,dia);
			date.setLenient(false);

		} catch (Exception e) {
			System.out.println("Data invalida");
		}
	}


	public void setDate(int dia, int mes, int ano) {
		try {
			this.date.set(ano,mes-1,dia);

		} catch (Exception e) {
			System.out.println("Data invalida");
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.date.toZonedDateTime().format(DateTimeFormatter.ofPattern("d MMM uuuu"));
	}
}
