package ch07_2_polymorphism;

public class Child2Example {
	public static void main(String[] args) {
		Parent2 parent = new Child2(); // �ڵ� Ÿ�Ժ�ȯ
		parent.field1 = "data";
		parent.method1();
		parent.method2();

//		parent.field2;     //�翬�� ������ ����
//		parent.method3();
		System.out.println("=======================");
		Child2 child = (Child2) parent; // ���� Ÿ�Ժ�ȯ
		child.field2 = "yyy";
		child.method3();

		child.field1 = "ggg";
		child.method1();
		child.method2(); // ���� �ڽ� Ŭ������ �ٵǳפ���
	}
}
