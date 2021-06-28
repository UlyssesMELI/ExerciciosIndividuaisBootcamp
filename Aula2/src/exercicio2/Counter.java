package exercicio2;

public class Counter {
	
	private int value;

	public Counter() {
		this.value = 0;
	}
	
	public Counter(int value) {
		this.value = value;
	}
	
	
	public void countUp() {
		this.value++;
	}
	public void countDown() {
		this.value++;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+this.value;
	}
}
