package ch07_1_inheritance;

public class SupersonicAirplane extends Airplane {
	// �ʵ�
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	// ������
	
	// �޼ҵ�
	
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("�����Ӻ����մϴ�.");
		} else {
			super.fly(); // Airplane��ü�� fly()�޼ҵ� ȣ��
		}
	}
}
