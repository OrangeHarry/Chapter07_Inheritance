//package ch07_2_polymorphism_ex;
//
//class MobilePhone {
//	// �ʵ�
//	protected String number; // ��ȭ��ȣ
//	// ������
//	public MobilePhone(String num) { // �����ڴ� ���� �ʵ带 �ʱ�ȭ�Ϸ��� �������� �����.
//		this.number = num; // this�� �Ƚᵵ �Ǳ������� �Ⱦ��� �򰥸���.
//	}
//	// �޼ҵ�
//	public void receive() {
//		System.out.println("Helle from " + this.number);
//	}
//}
//
//class SmartPhone extends MobilePhone {
//	// �ʵ�
//	private String androidVersion; // �ü�� OS��� �������� �׳�
//	// ������
//	public SmartPhone(String num, String version) {
//		super(num); // ������ �θ� ����!!
//		this.androidVersion = version;
//	}
//	// �޼ҵ�
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
//		// ����Ʈ�� ��ü ����
//		SmartPhone smartPhone = new SmartPhone("010-1111-2222", "Android 7.0");
//		// ��ȭ�ɱ�
//		smartPhone.send("010-3333-4444");
//		// ��ȭ�ޱ�
//		smartPhone.receive();
//		// ���� �����Ͽ� �����ϱ�
//		smartPhone.playApp();
//	}
//}