package ch07_1_inheritance;

public class CellPhone {
	// �ʵ�
	String model;
	String color;

	// ������
	public CellPhone() {
		System.out.println("�θ������ call..");
	}
	

	// �޼ҵ�
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}


	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}

	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}

	void sendVoice(String message) {
		System.out.println("�ڽ� : " + message);
	}

	void receiveVoice(String message) {
		System.out.println("���� : " + message);
	}

	void hangup() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}
