package javastudy;

public class Car {
	//타입 필드명
	String name;
	int number;
	
	//생성자 추가
	public Car(String name) {
		//this키워드는 나의 구성요소라는 의미.
		//내 필드 name에다가 지금 들어온 name을 넣어주라! 라는 의미
		this.name = name;
	}
	
	//생성자도 오버로딩 가능.
	//기본 생성자 추가
	public Car() {
//		this.name = "이름업소용";
//		this.number = 0; -> 아래와 중복, 비효율적
		this("이름없음", 0); //아래에 있는 생성자 호출됨.
		System.out.println("Car의 기본생성자입니다.");
	}
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public void run() {
		System.out.println("달리다");
	}
}
