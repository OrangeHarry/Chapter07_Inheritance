package ch07_1_inheritance;

public class DmbCellphone extends CellPhone {
	// 필드
	int channel;

	// 생성자
	public DmbCellphone(String model, String color, int channel) {
		this.model = model;
		this.color = color;  //부모 클래스로부터 상속받은 필드
		this.channel = channel;
		System.out.println("자식생성자 call..");
	}

	// 메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}

	void turnOff() {
		System.out.println("DMB 방송 수신을 종료합니다.");
	}
}
