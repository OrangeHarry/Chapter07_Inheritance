package ch07_2_polymorphism;

public class ChildExample {
	public static void main(String[] args) {
		Child child1 = new Child("������");
		Child child2 = new Child("�ҽ���");

		Parent parent = child1; // �ڵ�Ÿ�Ժ�ȯ

		parent.method1();
		parent.method2(); // �����ǵ� �޼ҵ尡 ȣ���
//		parent.method3(); // ȣ�� �Ұ���
		parent.act();
		
		System.out.println("=====================");
		parent = child2;
		parent.method1();
		parent.method2();
		parent.act();
	}
}
