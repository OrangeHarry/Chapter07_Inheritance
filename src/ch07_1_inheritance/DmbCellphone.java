package ch07_1_inheritance;

public class DmbCellphone extends CellPhone {
	// �ʵ�
	int channel;

	// ������
	public DmbCellphone(String model, String color, int channel) {
		this.model = model;
		this.color = color;  //�θ� Ŭ�����κ��� ��ӹ��� �ʵ�
		this.channel = channel;
		System.out.println("�ڽĻ����� call..");
	}

	// �޼ҵ�
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�.");
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}

	void turnOff() {
		System.out.println("DMB ��� ������ �����մϴ�.");
	}
}
