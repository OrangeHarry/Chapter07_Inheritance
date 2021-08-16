package ch07_2_polymorphism_ex;

class MobilePhone {
	// �ʵ�
	protected String number; // ��ȭ��ȣ
	// ������
	public MobilePhone(String num) { // �����ڴ� ���� �ʵ带 �ʱ�ȭ�Ϸ��� �������� �����.
		this.number = num; // this�� �Ƚᵵ �Ǳ������� �Ⱦ��� �򰥸���.
	}
	// �޼ҵ�
	public void receive() {
		System.out.println("Helle from " + this.number);
	}
}

class SmartPhone extends MobilePhone {
	// �ʵ�
	private String androidVersion; // �ü�� OS��� �������� �׳�
	// ������
	public SmartPhone(String num, String version) {
		super(num); // ������ �θ� ����!!
		this.androidVersion = version;
	}
	// �޼ҵ�
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
		// ����Ʈ�� ��ü ����
		SmartPhone smartPhone = new SmartPhone("010-1111-2222", "Android 7.0");
		
		// ****�θ�Ŭ������ ��������(mobilePhone)�� �ڽ�Ŭ����(SmartPhone)�� �ν��Ͻ�(��ü)�� ������ �� �ִ�.*****     
		// MobilePhone�� ���������� SartPhone���� �ν��Ͻ��� ��������!!
		MobilePhone mobilePhone = new SmartPhone("010-8888-7777", "Android 2.0");
		   //ūŸ��(�θ�)                ����Ÿ��(�ڽ�)
		//�θ�Ŭ������ �ڽ�Ŭ�������� ū Ÿ���̴ϱ� ������������� �ڵ� Ÿ�Ժ�ȯ�� �ȰŶ�� ������ �� �ִ�.

//		�⺻Ÿ�� ����ȯ�̶� ���� ��ġ��� ������ �� ��¡
//		int i = 100;
//		double d = 3.14;
//		d = i; //ū Ÿ������ �ڵ� ����ȯ�� �̷������.
//		d = 100.0; 	

		//��ȭ�ɱ�
		smartPhone.send("010-3333-4444");
//		mobilePhone.send("010-3333-4444"); �θ�Ÿ������ �ٲ�����ϱ� �ڽĸ޼ҵ忡�� �ִ°� ����� �� ����
		// ��ȭ�ޱ�
		smartPhone.receive();
		mobilePhone.receive(); //�θ𲨿��� �ִ¸޼ҵ�ϱ� �翬�� ����. ���!!������ �� �޼ҵ尡 ���´�.
		// ���� �����Ͽ� �����ϱ�
		smartPhone.playApp();
	}
}