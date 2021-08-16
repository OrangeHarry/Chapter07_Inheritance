package ch07_2_polymorphism;

public class Child2Example {
	public static void main(String[] args) {
		Parent2 parent = new Child2(); // 자동 타입변환
		parent.field1 = "data";
		parent.method1();
		parent.method2();

//		parent.field2;     //당연히 컴파일 에러
//		parent.method3();
		System.out.println("=======================");
		Child2 child = (Child2) parent; // 강제 타입변환
		child.field2 = "yyy";
		child.method3();

		child.field1 = "ggg";
		child.method1();
		child.method2(); // 역시 자식 클래스야 다되네ㅎㅎ
	}
}
