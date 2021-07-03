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
}
