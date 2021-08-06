package ch07_3_abstract_class;

//�԰� Ŭ����
abstract class Phone {
	// �ʵ�
	public String owner;

	// ������
	public Phone(String owner) {
		this.owner = owner;
	}

	// �޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}

	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
}

class SmartPhone extends Phone {
	// �ʵ�
	// ������
	public SmartPhone(String owner) {
		super(owner);
	}

	// �޼ҵ�
	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
}

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone(null); //�߻�Ŭ������ �Ұ����ϴ�.

		SmartPhone smartPhone = new SmartPhone("�����");

		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
