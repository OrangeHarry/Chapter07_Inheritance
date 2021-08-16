package ch07_2_polymorphism_ex;

class Friend {
	// 필드
	private String name;
	private String phoneNum;
	// 생성자
	public Friend(String na, String ph) {
		this.name = na;
		this.phoneNum = ph;
	}
	// 메소드
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phoneNum);
	}
	public String getName() {
		return name;
	}
}

class UnivFriend extends Friend {
	// 필드
	private String major;
	// 생성자
	public UnivFriend(String na, String ma, String ph) {
		super(na, ph);
		this.major = ma;
	}
	// 메소드
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("전공 : " + major);
	}
}

//직장 동료
class CompFriend extends Friend {
	// 필드
	private String department;
	// 생성자
	public CompFriend(String na, String de, String ph) {
		super(na, ph);
		this.department = de;
	}
	// 메소드
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("부서 : " + department);
	}
}

public class MyFriends2 {
	public static void main(String[] args) {
		
		// 친구의 관리를 위한 배열과 변수
		Friend[] friend = new Friend[6];
		int cnt = 0; //배열을 편하게 쓰려공
		
		// 대학친구 추가
		friend[cnt++] = new UnivFriend("석재원", "목재종이", "010-7777-8888");
		friend[cnt++] = new UnivFriend("남지수", "국어국문", "010-3333-4444");
		friend[cnt++] = new UnivFriend("최성철", "국제경영", "010-5555-6666");
		
		// 직장동료 추가
		friend[cnt++] = new CompFriend("민병헌", "구매", "010-7777-8888");
		friend[cnt++] = new CompFriend("이규호", "객실", "010-9999-0000");
		friend[cnt++] = new CompFriend("김동우", "식음", "010-4444-6666");

		// 친구목록 일괄 출력
		for (int i = 0; i < friend.length; i++) {
			friend[i].showInfo();
			if(friend[i].getName().equals("최성철")) {
				System.out.println("최성철은 목록 "+(i+1)+"번째에서 찾았습니다.");
				}
		}
	}
}