package sec01.exam07.pack2;

public class Utill {
	public static void main(String[] args) {
//		ABC abc;
		ABC abc = new ABC();
		System.out.println(abc.run());
	}
}

class ABC {
	public double run() {
		return 3.14;
	}
}