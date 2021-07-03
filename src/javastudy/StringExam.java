package javastudy;

public class StringExam {

	public static void main(String[] args) {
		// JAVA에서 가장 많이 사용하는 String 클래스
		
		//상수 영역에서 참조
		String str1 = "hello";
		String str2 = "hello";
		
		//새로운 영역에서 참조
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		if(str1 == str2)
			System.out.println("str1,str2는 같은 레퍼런스");
		if(str1 != str3)
			System.out.println("str1과 str3는 다른 레퍼런스입니다.");
		if(str3 != str4)
			System.out.println("str3과 str4는 다른 레퍼런스입니다.");
		
		//String클래스의 특징 -> 변하지 않는다.
		
		System.out.println(str1);
		//0,1,2제외 3부터 출력 -> 새로운 String 만들어서 반환
		System.out.println(str1.substring(3));
		//절대 변하지 않음.
		System.out.println(str1);

	}

}
