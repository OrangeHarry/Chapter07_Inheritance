package ch07_2_polymorphism;

public class Child extends Parent {
	// 필드
	// 생성자
	public Child(String Charactor) {
		super(Charactor);
	}
	// 메소드
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	public void method3() {
		System.out.println("Child-method3()");
	}
	@Override
	public void act() {
		super.act();
	}
}
