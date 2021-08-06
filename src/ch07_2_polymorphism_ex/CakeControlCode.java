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
		
		// StrawberryCheeseCake �ν��Ͻ��� CheeseCake �ν��Ͻ� �̸鼭 Cake �ν��Ͻ��̴�.
		Cake cake1 = new StrawberryCheeseCake();
		CheeseCake cake2 = new StrawberryCheeseCake();
		
		cake1.sweet();
		cake2.milky();
		
		
		// ***�������� �� ���԰� ����ȯ***
		CheeseCake ca1 = new CheeseCake();
		Cake ca2 = ca1; //��ġ �������� �̰͵�
//		Cake ca2 = new CheeseCake(); ���� �ǹ�
		
		Cake ca3 = new CheeseCake();
//		CheeseCake ca4 = ca3; �̰� �ɼ��� ����!! ca3�� �� ūŸ�����ڳ�(�θ�)
		CheeseCake ca4 = (CheeseCake) ca3; //�̰� ���� ����ȯ��¡~
		
		//***�ϰ� ó��(�迭 �������� ����)*** //�迭�� ���� �ڷ����� ���� �� �ִ�. //�迭�� ���� �ݺ��� �Ϸ��� ���� ���δ�.
		//ġ������ũ�� ����� �ϸ� ��Ʈ�κ���ġ������ũ�� ����ġ������ũ�� �Ȱ��� ġ������ũ������ ���� ���� �־ ġ������ũ�� �迭�� �ϰ�ó�� �� �� �ִ�.
		//�׷��� �Ȱ��� ġ������ũ�ε� ������ ����ġ������ũ Ư���� ���� ������ ��Ʈ�κ���ġ������ũ Ư���� ������ ������ ������ ǥ���� �� �ִ�.(�������� ����)
		
		Cake[] cakes = new Cake[3]; //��ü�� �������ִ°� �ƴ� ������ ���� �� �ִ� ������ �������ذŴ�.
	                        //strawberryCheseCake�� �ٲٰ� ������ �ڿ� �ִ¾ָ� �ٲٸ� �ȴ�.	
		
		cakes[0] = new Cake();  //��ü����
		cakes[1] = new CheeseCake();
		cakes[2] = new StrawberryCheeseCake();
		
		for(int i=0; i<cakes.length; i++) {
			cakes[i].send();
		}
	}
}
