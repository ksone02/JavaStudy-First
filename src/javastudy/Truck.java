package javastudy;

public class Truck extends Car {
	//기본생성자
	public Truck() { 
		super(); //-> 자동으로 만들어짐. 부모생성자
		//만약 부모클래스에 기본생성자가 없다면, 사용자가 직접 호출해줘야 함.
		//exam) super("소방차") -> public Car(String name) 호출
		System.out.println("Truck의 기본생성자입니다.");
	}
}
