package javastudy;

public class BusExam {

	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run(); //busŬ�������� run�޼ҵ尡 ������, �θ�Ŭ������ carŬ������ �ֱ� ������ ��밡����
		bus.ppangppang();
		
		Car car = new Car();
		car.run();
//		car.ppangppang(); -> �����߻� �θ�Ŭ������ �ڽ��� ���� �� ��� �Ұ���
	}

}
