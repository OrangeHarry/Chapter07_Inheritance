package ch07_2_polymorphism;

public class Tire {
	// �ʵ�
	public int maxRotation; // �ִ� ȸ����(Ÿ�̾� ����)
	public int accmulatedRotation; // ���� ȸ����
	public String location; // Ÿ�̾��� ��ġ

	// ������
	public Tire(String location, int maxRotation) {
		this.location = location;  //�ʱ�ȭ
		this.maxRotation = maxRotation; //�ʱ�ȭ
	}

	// �޼ҵ�
	public boolean roll() {
		++accmulatedRotation; // ���� 1ȸ�� ����
		if (accmulatedRotation < maxRotation) {
			System.out.println(location + "Tire ���� : " + (maxRotation - accmulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("***" + location + "Tire��ũ***");
			return false;
		}
	}
}
