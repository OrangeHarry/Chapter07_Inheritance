package ch07_1_inheritance;

public class DmbCellphoneExample {
	public static void main(String[] args) {
//		DmbCellphone ��ü ����
		DmbCellphone dmbCellphone = new DmbCellphone("������", "������", 10);

//		CellPhone Ŭ�����κ��� ��ӹ��� �ʵ�
		System.out.println("�� : " + dmbCellphone.model);
		System.out.println("���� : " + dmbCellphone.color);

//		DmbCellphone Ŭ������ �ʵ�
		System.out.println("ä�� : " + dmbCellphone.channel);
		System.out.println("=================================");

//		CellPhoneŬ�����κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("��������");
		dmbCellphone.receiveVoice("�ȳ��ϼ���! ���� ������Դϴ�.");
		dmbCellphone.sendVoice("�� ��~ �����Կ�~");
		dmbCellphone.hangup();
		System.out.println("=================================");

//		DmbCellphone Ŭ������ �޼ҵ� ȣ��
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOff();
	}
}
