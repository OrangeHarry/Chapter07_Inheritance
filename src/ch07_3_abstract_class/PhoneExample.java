package ch07_3_abstract_class;

//규격 클래스
abstract class Phone {
	// 필드
	public String owner;

	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}

	// 메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}

class SmartPhone extends Phone {
	// 필드
	// 생성자
	public SmartPhone(String owner) {
		super(owner);
	}

	// 메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone(null); //추상클래스라서 불가능하다.

		SmartPhone smartPhone = new SmartPhone("하헌민");

		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
