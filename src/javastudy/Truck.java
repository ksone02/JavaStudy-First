package javastudy;

public class Truck extends Car {
	//�⺻������
	public Truck() { 
		super(); //-> �ڵ����� �������. �θ������
		//���� �θ�Ŭ������ �⺻�����ڰ� ���ٸ�, ����ڰ� ���� ȣ������� ��.
		//exam) super("�ҹ���") -> public Car(String name) ȣ��
		System.out.println("Truck�� �⺻�������Դϴ�.");
	}
}
