package ch07_2_polymorphism;

public class Parent {
	// �ʵ�
	String Charactor;
	// ������
	public Parent(String Charactor) {
		this.Charactor = Charactor;
	}
	// �޼ҵ�
	public void method1() {
		System.out.println("parent-method1()");
	}

	public void method2() {
		System.out.println("parent-method2()");
	}

	public void act() {
		System.out.println(Charactor);
	}
}
