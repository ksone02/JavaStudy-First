package javastudy;

public class BusExam {

	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run(); //bus클래스에는 run메소드가 없지만, 부모클래스인 car클래스에 있기 떄문에 사용가능함
		bus.ppangppang();
		
		Car car = new Car();
		car.run();
//		car.ppangppang(); -> 오류발생 부모클래스는 자식이 가진 것 사용 불가능
	}

}
