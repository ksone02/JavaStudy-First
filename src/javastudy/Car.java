package javastudy;

public class Car {
	//Ÿ�� �ʵ��
	String name;
	int number;
	
	//������ �߰�
	public Car(String name) {
		//thisŰ����� ���� ������Ҷ�� �ǹ�.
		//�� �ʵ� name���ٰ� ���� ���� name�� �־��ֶ�! ��� �ǹ�
		this.name = name;
	}
	
	//�����ڵ� �����ε� ����.
	//�⺻ ������ �߰�
	public Car() {
//		this.name = "�̸����ҿ�";
//		this.number = 0; -> �Ʒ��� �ߺ�, ��ȿ����
		this("�̸�����", 0); //�Ʒ��� �ִ� ������ ȣ���.
		System.out.println("Car�� �⺻�������Դϴ�.");
	}
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public void run() {
		System.out.println("�޸���");
	}
}
