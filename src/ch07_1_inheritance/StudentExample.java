package ch07_1_inheritance;

public class StudentExample {
	public static void main(String[] args) {
		Student student1 = new Student("하헌민", "931126-1111111", 2012057030);

		System.out.println("이름 : " + student1.getName());
		System.out.println("주민번호(ssn) : " + student1.getSsn()); // 부모에게 상속받은 필드 출력
		System.out.println("학번 : " + student1.getStudentNo());
	}
}
