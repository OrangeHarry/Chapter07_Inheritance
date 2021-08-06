package ch07_2_polymorphism_ex;

class Cake{
	public void sweet() {System.out.println("Cake.sweet()");}
	public void send() {System.out.println("Cake sending.....");}
}
class CheeseCake extends Cake{
	public void milky() {System.out.println("Cheesecake.milky()");}
	@Override
	public void send() {System.out.println("CheeseCake Sending.....");}
}
class StrawberryCheeseCake extends CheeseCake{
	public void fresh() {System.out.println("StrawberryCheeseCake.fresh()");}
	@Override
	public void send() {System.out.println("StrawberryCheeseCake Seding.....");}
}

public class CakeControlCode {
	public static void main(String[] args) {
		
		// StrawberryCheeseCake 인스턴스는 CheeseCake 인스턴스 이면서 Cake 인스턴스이다.
		Cake cake1 = new StrawberryCheeseCake();
		CheeseCake cake2 = new StrawberryCheeseCake();
		
		cake1.sweet();
		cake2.milky();
		
		
		// ***참조변수 간 대입과 형변환***
		CheeseCake ca1 = new CheeseCake();
		Cake ca2 = ca1; //그치 가능하지 이것도
//		Cake ca2 = new CheeseCake(); 같은 의미
		
		Cake ca3 = new CheeseCake();
//		CheeseCake ca4 = ca3; 이건 될수가 없지!! ca3가 더 큰타입이자나(부모)
		CheeseCake ca4 = (CheeseCake) ca3; //이게 강제 형변환이징~
		
		//***일괄 처리(배열 관점에서 정리)*** //배열은 같은 자료형만 넣을 수 있다. //배열은 보통 반복을 하려고 많이 쓰인다.
		//치즈케이크에 상속을 하면 스트로베리치즈케이크나 초코치즈케이크나 똑같이 치즈케이크형으로 묶을 수가 있어서 치즈케이크형 배열로 일괄처리 할 수 있다.
		//그러면 똑같은 치즈케이크인데 누구는 초코치즈케이크 특성을 갖고 누구는 스트로베리치즈케이크 특성을 가져서 각자의 개성을 표현할 수 있다.(다형성의 느낌)
		
		Cake[] cakes = new Cake[3]; //객체를 생성해주는게 아닌 변수를 담을 수 있는 공간만 마련해준거다.
	                        //strawberryCheseCake로 바꾸고 싶으면 뒤에 있는애만 바꾸면 된다.	
		
		cakes[0] = new Cake();  //객체생성
		cakes[1] = new CheeseCake();
		cakes[2] = new StrawberryCheeseCake();
		
		for(int i=0; i<cakes.length; i++) {
			cakes[i].send();
		}
	}
}
