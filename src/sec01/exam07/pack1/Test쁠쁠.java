package sec01.exam07.pack1;

public class Test�ܻ� {
	public static void main(String[] args) {
		int total = 0, x = 0, y = 0;
		while (++x < 5) {
			y = x * x;
			System.out.println(y);
			total += y;
		}
		System.out.println("������" + total);
	}
}
//��ư� �������� ����. ++x�� 1�� �߰����� �����̴ϱ� �ؿ� x�鵵 �׳� 1�� �߰��� ������ �� ���°ž�