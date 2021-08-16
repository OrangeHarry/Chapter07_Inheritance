package ch07_2_polymorphism_ex;

class Friend {
	// �ʵ�
	private String name;
	private String phoneNum;
	// ������
	public Friend(String na, String ph) {
		this.name = na;
		this.phoneNum = ph;
	}
	// �޼ҵ�
	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ : " + phoneNum);
	}
	public String getName() {
		return name;
	}
}

class UnivFriend extends Friend {
	// �ʵ�
	private String major;
	// ������
	public UnivFriend(String na, String ma, String ph) {
		super(na, ph);
		this.major = ma;
	}
	// �޼ҵ�
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("���� : " + major);
	}
}

//���� ����
class CompFriend extends Friend {
	// �ʵ�
	private String department;
	// ������
	public CompFriend(String na, String de, String ph) {
		super(na, ph);
		this.department = de;
	}
	// �޼ҵ�
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("�μ� : " + department);
	}
}

public class MyFriends2 {
	public static void main(String[] args) {
		
		// ģ���� ������ ���� �迭�� ����
		Friend[] friend = new Friend[6];
		int cnt = 0; //�迭�� ���ϰ� ������
		
		// ����ģ�� �߰�
		friend[cnt++] = new UnivFriend("�����", "��������", "010-7777-8888");
		friend[cnt++] = new UnivFriend("������", "�����", "010-3333-4444");
		friend[cnt++] = new UnivFriend("�ּ�ö", "�����濵", "010-5555-6666");
		
		// ���嵿�� �߰�
		friend[cnt++] = new CompFriend("�κ���", "����", "010-7777-8888");
		friend[cnt++] = new CompFriend("�̱�ȣ", "����", "010-9999-0000");
		friend[cnt++] = new CompFriend("�赿��", "����", "010-4444-6666");

		// ģ����� �ϰ� ���
		for (int i = 0; i < friend.length; i++) {
			friend[i].showInfo();
			if(friend[i].getName().equals("�ּ�ö")) {
				System.out.println("�ּ�ö�� ��� "+(i+1)+"��°���� ã�ҽ��ϴ�.");
				}
		}
	}
}