package ch07_2_polymorphism;

public class InstanceofExample {
	public static void method1(Parent3 parent) {
		if (parent instanceof Child3) { // Child3 Ÿ������ ��ȯ�� �������� Ȯ��
			Child3 child = (Child3) parent;
			System.out.println("method1 - Child3�� ��ȯ ����");
		} else {
			System.out.println("method1 - Child3�� ��ȯ���� ����");
		}
	}

	public static void method2(Parent3 parent) {
		Child3 child = (Child3) parent; // classcastException�� �߻��� ���ɼ� ����
		System.out.println("method2 - Child3�� ��ȯ ����");
	}

	public static void main(String[] args) {
		Parent3 parentA = new Child3();
		method1(parentA); // Child3��ü�� �Ű������� ����
		method2(parentA);

		Parent3 parentB = new Parent3();
		method1(parentB);
//		method2(parentB); // Parent3 ��ü�� �Ű������� ����
	}

}
