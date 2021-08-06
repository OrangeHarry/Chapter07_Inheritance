//package ch07_2_polymorphism_ex;
//
//class MobilePhone {
//	// 필드
//	protected String number; // 전화번호
//	// 생성자
//	public MobilePhone(String num) { // 생성자는 보통 필드를 초기화하려는 목적으로 만든다.
//		this.number = num; // this를 안써도 되긴하지만 안쓰면 헷갈린다.
//	}
//	// 메소드
//	public void receive() {
//		System.out.println("Helle from " + this.number);
//	}
//}
//
//class SmartPhone extends MobilePhone {
//	// 필드
//	private String androidVersion; // 운영체제 OS라고 생각하자 그냥
//	// 생성자
//	public SmartPhone(String num, String version) {
//		super(num); // 무조건 부모꺼 먼저!!
//		this.androidVersion = version;
//	}
//	// 메소드
//	public void send(String number) {
//		System.out.println("Hello ~ to " + number);
//	}
//	@Override
//	public void receive() {
//		super.receive();
//		System.out.println("I use Smartphone~~");
//	}
//	public void playApp() {
//		System.out.println("App is running in " + androidVersion);
//	}
//}
//
//public class MobileSmartPhone {
//	public static void main(String[] args) {
//		// 스마트폰 객체 생성
//		SmartPhone smartPhone = new SmartPhone("010-1111-2222", "Android 7.0");
//		// 전화걸기
//		smartPhone.send("010-3333-4444");
//		// 전화받기
//		smartPhone.receive();
//		// 앱을 선택하여 실행하기
//		smartPhone.playApp();
//	}
//}