package sec01.exam07.pack1;

public class Test쁠쁠 {
	public static void main(String[] args) {
		int total = 0, x = 0, y = 0;
		while (++x < 5) {
			y = x * x;
			System.out.println(y);
			total += y;
		}
		System.out.println("총합은" + total);
	}
}
//어렵게 생각하지 말자. ++x는 1이 추가된후 연산이니깐 밑에 x들도 그냥 1이 추가된 값으로 쭉 가는거야