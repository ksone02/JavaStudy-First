package javastudy;

public class DuckExam {

	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.sing();
		duck.fly();
		
		//오류발생 -> 추상클래스는 부모는 가능, 하지만 객체생성 X
		//Bird b = new Bird();
	}

}
