package ch07_2_polymorphism_ex;

class MobilePhone {
	// 필드
	protected String number; // 전화번호
	// 생성자
	public MobilePhone(String num) { // 생성자는 보통 필드를 초기화하려는 목적으로 만든다.
		this.number = num; // this를 안써도 되긴하지만 안쓰면 헷갈린다.
	}
	// 메소드
	public void receive() {
		System.out.println("Helle from " + this.number);
	}
}

class SmartPhone extends MobilePhone {
	// 필드
	private String androidVersion; // 운영체제 OS라고 생각하자 그냥
	// 생성자
	public SmartPhone(String num, String version) {
		super(num); // 무조건 부모꺼 먼저!!
		this.androidVersion = version;
	}
	// 메소드
	public void send(String number) {
		System.out.println("Hello ~ to " + number);
	}
	@Override
	public void receive() {
		System.out.println("I use Smartphone~~");
	}
	public void playApp() {
		System.out.println("App is running in " + androidVersion);
	}
}

public class MobileSmartPhone2 {
	public static void main(String[] args) {
		// 스마트폰 객체 생성
		SmartPhone smartPhone = new SmartPhone("010-1111-2222", "Android 7.0");
		
		// ****부모클래스의 참조변수(mobilePhone)는 자식클래스(SmartPhone)의 인스턴스(객체)를 참조할 수 있다.*****     
		// MobilePhone형 참조변수는 SartPhone형의 인스턴스를 참조가능!!
		MobilePhone mobilePhone = new SmartPhone("010-8888-7777", "Android 2.0");
		   //큰타입(부모)                작은타입(자식)
		//부모클래스가 자식클래스보다 큰 타입이니깐 모바일폰형으로 자동 타입변환이 된거라고 생각할 수 있다.

//		기본타입 형변환이랑 같은 이치라고 생각할 수 있징
//		int i = 100;
//		double d = 3.14;
//		d = i; //큰 타입으로 자동 형변환이 이루어진다.
//		d = 100.0; 	

		//전화걸기
		smartPhone.send("010-3333-4444");
//		mobilePhone.send("010-3333-4444"); 부모타입으로 바뀌었으니깐 자식메소드에만 있는건 사용할 수 없지
		// 전화받기
		smartPhone.receive();
		mobilePhone.receive(); //부모꺼에도 있는메소드니깐 당연히 되지. 대신!!재정의 된 메소드가 나온다.
		// 앱을 선택하여 실행하기
		smartPhone.playApp();
	}
}