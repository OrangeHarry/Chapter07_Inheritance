package ch07_2_polymorphism;

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;

		B b1 = d; //할아버지가 A 아버지가B 다중상속은 아니지만 이런식으로도 되네 
		C c1 = e;  
//		
//		B b3=e; //상속관계에 있지 않기 때문에 컴파일에러 발생
//		C c2=d;

	}
}