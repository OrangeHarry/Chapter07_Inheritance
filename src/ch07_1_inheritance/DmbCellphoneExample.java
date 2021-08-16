package ch07_1_inheritance;

public class DmbCellphoneExample {
	public static void main(String[] args) {
//		DmbCellphone 객체 생성
		DmbCellphone dmbCellphone = new DmbCellphone("아이폰", "로즈골드", 10);

//		CellPhone 클래스로부터 상속받은 필드
		System.out.println("모델 : " + dmbCellphone.model);
		System.out.println("색상 : " + dmbCellphone.color);

//		DmbCellphone 클래스의 필드
		System.out.println("채널 : " + dmbCellphone.channel);
		System.out.println("=================================");

//		CellPhone클래스로부터 상속받은 메소드 호출
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("여보세요");
		dmbCellphone.receiveVoice("안녕하세요! 저는 하헌민입니다.");
		dmbCellphone.sendVoice("아 예~ 끊을게요~");
		dmbCellphone.hangup();
		System.out.println("=================================");

//		DmbCellphone 클래스의 메소드 호출
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOff();
	}
}
