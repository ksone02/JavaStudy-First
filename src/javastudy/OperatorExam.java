package javastudy;

public class OperatorExam {

	public static void main(String[] args) {
		//삼향연산자 사용해보기
		int b1 = (5 < 4) ? 50 : 40;
		
		System.out.println(b1);
		
		int b2 = 0;
		if(5 < 4) {
			b2 = 50;
		} else {
			b2 = 40;
		}
		System.out.println(b2);
	}

}
