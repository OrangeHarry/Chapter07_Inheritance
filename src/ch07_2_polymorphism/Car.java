package ch07_2_polymorphism;

public class Car {
	// ?ʵ?
	Tire frontLeftTire = new Tire("?? ????", 6);
	Tire frontRightTire = new Tire("?? ??????", 2);
	Tire backLeftTire = new Tire("?? ????", 3);
	Tire backRightTire = new Tire("?? ??????", 4);

	// ??????

	// ?޼ҵ?
	int run() {
		if (frontLeftTire.roll() == false) {stop(); return 1;}
		if (frontRightTire.roll() == false) {stop(); return 2;}
		if (backLeftTire.roll() == false) {stop(); return 3;}
		if (backRightTire.roll() == false) {stop(); return 4;}
		return 0;
	}

	void stop() {
		System.out.println("?ڵ????? ?????ϴ?. ??ũ?? ????~~!!");
	}

}
