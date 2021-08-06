package sec01.exam07.pack1;

public class Test난수만들기 {
	public static void main(String[] args) {
		// 50번 반복
		for (int i = 0; i < 50; i++) {
			int value = (int) (Math.random() * 100) + 1;

			// 짝수 판별
			if (value % 2 == 0) {
				System.out.print(value + ", ");
			}
		}
	}
}
