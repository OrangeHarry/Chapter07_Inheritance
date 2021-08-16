//package ch07_2_polymorphism_ex;
//
////대학 친구
//class UnivFriend {
//	// 필드
//	private String name;
//	private String major;
//	private String phoneNum;
//
//	// 생성자
//	public UnivFriend(String na, String ma, String ph) {
//		this.name = na;
//		this.major = ma;
//		this.phoneNum = ph;
//	}
//
//	// 메소드
//	public void showInfo() {
//		System.out.println("이름 : " + name);
//		System.out.println("전공 : " + major);
//		System.out.println("전화 : " + phoneNum);
//	}
//}
////직장 동료
//class CompFriend {
//	// 필드
//	private String name;
//	private String department;
//	private String phoneNum;
//
//	// 생성자
//	public CompFriend(String na, String de, String ph) {
//		this.name = na;
//		this.department = de;
//		this.phoneNum = ph;
//	}
//
//	// 메소드
//	public void showInfo() {
//		System.out.println("이름 : " + name);
//		System.out.println("부서 : " + department);
//		System.out.println("전화 : " + phoneNum);
//	}
//}
//
//public class MyFriends {
//	public static void main(String[] args) {
//
//		// 대학 친구의 관리를 위한 배열과 변수
//		UnivFriend[] uf = new UnivFriend[3];
//		int ucnt = 0;
//		// 직장 동료의 관리를 위한 배열과 변수
//		CompFriend[] cf = new CompFriend[3];
//		int ccnt = 0;
//
//		// 대학친구 추가
//		uf[ucnt++] = new UnivFriend("석재원", "목재종이", "010-1111-2222");
//		uf[ucnt++] = new UnivFriend("남지수", "국어국문", "010-3333-4444");
//		uf[ucnt++] = new UnivFriend("최성철", "국제경영", "010-5555-6666");
//
//		// 직장동료 추가
//		cf[ccnt++] = new CompFriend("민병헌", "구매", "010-7777-8888");
//		cf[ccnt++] = new CompFriend("이규호", "객실", "010-9999-0000");
//		cf[ccnt++] = new CompFriend("김동우", "식음", "010-4444-6666");
//
//		// 대학친구목록 일괄 출력
//		for (int i = 0; i < uf.length; i++) {
//			uf[i].showInfo();
//		}
//		System.out.println("================================");
//		// 직장친구목록 일괄 출력
//		for (int i = 0; i < cf.length; i++) {
//			cf[i].showInfo();
//		}
//	}
//}
////상속클래스로 전환해서 만들어보쟈