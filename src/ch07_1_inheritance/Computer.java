package ch07_1_inheritance;

public class Computer extends Calculator {
//	@Override
//	double areaCircle(double r) {
//		System.out.println("Computer ��ü�� areaCircle() ����");
//		// TODO Auto-generated method stub
//		return super.areaCircle(r);
//	}
	
	// �ʵ�

	// ������

	// �޼ҵ�

	@Override //������ �Ѵٴ°� �����Ϸ����� �˸��� ���̶� �޼ҵ� �ȿ� ���븸 ���������ϴ�.
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}
}
