package ch07_3_abstract_class;

//�߻�Ŭ����
abstract class Animal {
	// �ʵ�
	public String kind;
	// ������
	// �Ϲ� �޼ҵ�
	public void breath() {
		System.out.println("���� ���ϴ�.");
	}
	// �߻�޼ҵ�(��ӹ޴� �ڽ�Ŭ���������� �������̵��� ����ȭ)
	public abstract void sound();
}

class Dog extends Animal {
	// �ʵ�
	// ������
	public Dog() {
		this.kind = "������";
	}
	//�޼ҵ�
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
}

class Cat extends Animal {
	// �ʵ�
	// ������
	public Cat() {
		this.kind = "������";
	}
	//�޼ҵ�
	@Override
	public void sound() {
		System.out.println("�߾ƿ�");
	}
}

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("=============");
		
		//������ �ڵ�Ÿ�Ժ�ȯ
		Animal animal = null; //�׳� new�� �ȵǴϱ� �ӽù������� �̷��� �Ѱ� ���ƿ�
		animal = new Dog(); //�ڵ�Ÿ�Ժ�ȯ 
		animal.sound();  //������ �� �޼ҵ� ȣ��
		animal = new Cat();
		animal.sound();
		System.out.println("=============");
		
		//�޼ҵ��� ������
		animalSound(new Dog()); //�ڵ� Ÿ�� ��ȯ
		animalSound(new Cat()); //�ڵ� Ÿ�� ��ȯ
	}
	public static void animalSound(Animal animal) {
		animal.sound();//�����ǵ� �޼ҵ� ȣ��
	}
}
