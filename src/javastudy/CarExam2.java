package javastudy;

//생성자 -> 메소드와 다르게 리턴타입 없음.
//생성자를 프로그래머가 만들지 않는다면 컴파일 시에 기본 생성자 자동으로 만들어짐.

public class CarExam2 {
	public static void main(String[] args) {
		//Car c1 = new Car(); 오류발생
		Car c2 = new Car("소방차"); //String 넣어줘야함!!
		Car c3 = new Car("구급치");
		
		System.out.println(c2.name);
		System.out.println(c3.name);
	}
}
