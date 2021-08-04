package ch07_1_inheritance;

public class Student extends People {
	// 필드
	private int studentNo;

	// 생성자
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // 부모생성자 호출
		this.studentNo = studentNo;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
}
