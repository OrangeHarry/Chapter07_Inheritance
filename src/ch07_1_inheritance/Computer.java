package ch07_1_inheritance;

public class Computer extends Calculator {
//	@Override
//	double areaCircle(double r) {
//		System.out.println("Computer 객체의 areaCircle() 실행");
//		// TODO Auto-generated method stub
//		return super.areaCircle(r);
//	}
	
	// 필드

	// 생성자

	// 메소드

	@Override //재정의 한다는걸 컴파일러에게 알리는 것이라서 메소드 안에 내용만 수정가능하다.
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
