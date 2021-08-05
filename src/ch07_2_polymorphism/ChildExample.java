package ch07_2_polymorphism;

public class ChildExample {
	public static void main(String[] args) {
		Child child1 = new Child("버럭이");
		Child child2 = new Child("소심이");

		Parent parent = child1; // 자동타입변환

		parent.method1();
		parent.method2(); // 재정의된 메소드가 호출됨
//		parent.method3(); // 호출 불가능
		parent.act();
		
		System.out.println("=====================");
		parent = child2;
		parent.method1();
		parent.method2();
		parent.act();
	}
}
