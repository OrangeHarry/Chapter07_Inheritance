package ch07_1_inheritance;

public class StudentExample {
	public static void main(String[] args) {
		Student student1 = new Student("�����", "931126-1111111", 2012057030);

		System.out.println("�̸� : " + student1.getName());
		System.out.println("�ֹι�ȣ(ssn) : " + student1.getSsn()); // �θ𿡰� ��ӹ��� �ʵ� ���
		System.out.println("�й� : " + student1.getStudentNo());
	}
}
