package ch07_2_polymorphism_ex;

class Box {
	public void simpleWrap() {
		System.out.println("Simple Wrapping");
	}
}

class PaperBox extends Box {
	public void paperWrap() {
		System.out.println("Paper Wrapping");
	}
}

class GoldPaperBox extends PaperBox {
	public void goldWrap() {
		System.out.println("Gold Wrapping");
	}
}

public class Wrapping {
	public static void main(String[] args) {
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();

		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}

	private static void wrapBox(Box box) { //자료형 Box형
		if(box instanceof GoldPaperBox) {
			((GoldPaperBox) box).goldWrap(); //강제 타입변환을 해준거야.
		}else if(box instanceof PaperBox) {
			((PaperBox) box).paperWrap();
		}else {
			box.simpleWrap();
		}
	}
}
