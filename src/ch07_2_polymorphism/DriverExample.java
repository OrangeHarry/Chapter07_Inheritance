package ch07_2_polymorphism;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
	
		Vehicle vehicle = new Vehicle();
		driver.drive(vehicle);

		driver.drive(bus); //�ڵ� Ÿ�Ժ�ȯ Vehicle vehicle = bus;
		driver.drive(taxi);//�ڵ� Ÿ�Ժ�ȯ Vehicle vehicle = taxi;
	}
}
