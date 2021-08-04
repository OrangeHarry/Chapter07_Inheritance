package sec01.exam07.pack2;

public class Car {
	String color;
	int exhaust;
	String company;
	String model;
	public Car(String color, int exhaust, String company, String model) {
		this.color = color;
		this.exhaust = exhaust;
		this.company = company;
		this.model = model;
	}
	public Car(String color, int exhaust) {
		this(color, exhaust, "null", "null");
	}
	public void run() {
		System.out.println(color+"차가 "+exhaust+"cc로 달립니다~~");
	}
}
