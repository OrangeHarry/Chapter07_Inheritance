package ch07_3_abstract_class;

//추상클래스
abstract class Animal {
	// 필드
	public String kind;
	// 생성자
	// 일반 메소드
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	// 추상메소드(상속받는 자식클래스에서의 오버라이딩을 강제화)
	public abstract void sound();
}

class Dog extends Animal {
	// 필드
	// 생성자
	public Dog() {
		this.kind = "포유류";
	}
	//메소드
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	// 필드
	// 생성자
	public Cat() {
		this.kind = "포유류";
	}
	//메소드
	@Override
	public void sound() {
		System.out.println("야아옹");
	}
}

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("=============");
		
		//변수의 자동타입변환
		Animal animal = null; //그냥 new가 안되니깐 임시방편으로 이렇게 한거 같아요
		animal = new Dog(); //자동타입변환 
		animal.sound();  //재정의 된 메소드 호출
		animal = new Cat();
		animal.sound();
		System.out.println("=============");
		
		//메소드의 다형성
		animalSound(new Dog()); //자동 타입 변환
		animalSound(new Cat()); //자동 타입 변환
	}
	public static void animalSound(Animal animal) {
		animal.sound();//재정의된 메소드 호출
	}
}
