//package ch07_2_polymorphism_ex;
//
////���� ģ��
//class UnivFriend {
//	// �ʵ�
//	private String name;
//	private String major;
//	private String phoneNum;
//
//	// ������
//	public UnivFriend(String na, String ma, String ph) {
//		this.name = na;
//		this.major = ma;
//		this.phoneNum = ph;
//	}
//
//	// �޼ҵ�
//	public void showInfo() {
//		System.out.println("�̸� : " + name);
//		System.out.println("���� : " + major);
//		System.out.println("��ȭ : " + phoneNum);
//	}
//}
////���� ����
//class CompFriend {
//	// �ʵ�
//	private String name;
//	private String department;
//	private String phoneNum;
//
//	// ������
//	public CompFriend(String na, String de, String ph) {
//		this.name = na;
//		this.department = de;
//		this.phoneNum = ph;
//	}
//
//	// �޼ҵ�
//	public void showInfo() {
//		System.out.println("�̸� : " + name);
//		System.out.println("�μ� : " + department);
//		System.out.println("��ȭ : " + phoneNum);
//	}
//}
//
//public class MyFriends {
//	public static void main(String[] args) {
//
//		// ���� ģ���� ������ ���� �迭�� ����
//		UnivFriend[] uf = new UnivFriend[3];
//		int ucnt = 0;
//		// ���� ������ ������ ���� �迭�� ����
//		CompFriend[] cf = new CompFriend[3];
//		int ccnt = 0;
//
//		// ����ģ�� �߰�
//		uf[ucnt++] = new UnivFriend("�����", "��������", "010-1111-2222");
//		uf[ucnt++] = new UnivFriend("������", "�����", "010-3333-4444");
//		uf[ucnt++] = new UnivFriend("�ּ�ö", "�����濵", "010-5555-6666");
//
//		// ���嵿�� �߰�
//		cf[ccnt++] = new CompFriend("�κ���", "����", "010-7777-8888");
//		cf[ccnt++] = new CompFriend("�̱�ȣ", "����", "010-9999-0000");
//		cf[ccnt++] = new CompFriend("�赿��", "����", "010-4444-6666");
//
//		// ����ģ����� �ϰ� ���
//		for (int i = 0; i < uf.length; i++) {
//			uf[i].showInfo();
//		}
//		System.out.println("================================");
//		// ����ģ����� �ϰ� ���
//		for (int i = 0; i < cf.length; i++) {
//			cf[i].showInfo();
//		}
//	}
//}
////���Ŭ������ ��ȯ�ؼ� ������