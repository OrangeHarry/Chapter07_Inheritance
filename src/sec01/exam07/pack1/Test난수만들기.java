package sec01.exam07.pack1;

public class Test��������� {
	public static void main(String[] args) {
		// 50�� �ݺ�
		for (int i = 0; i < 50; i++) {
			int value = (int) (Math.random() * 100) + 1;

			// ¦�� �Ǻ�
			if (value % 2 == 0) {
				System.out.print(value + ", ");
			}
		}
	}
}
