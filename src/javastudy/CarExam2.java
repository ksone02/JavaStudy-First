package javastudy;

//������ -> �޼ҵ�� �ٸ��� ����Ÿ�� ����.
//�����ڸ� ���α׷��Ӱ� ������ �ʴ´ٸ� ������ �ÿ� �⺻ ������ �ڵ����� �������.

public class CarExam2 {
	public static void main(String[] args) {
		//Car c1 = new Car(); �����߻�
		Car c2 = new Car("�ҹ���"); //String �־������!!
		Car c3 = new Car("����ġ");
		
		System.out.println(c2.name);
		System.out.println(c3.name);
	}
}
