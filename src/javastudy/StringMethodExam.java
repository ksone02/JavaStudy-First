package javastudy;

public class StringMethodExam {

	public static void main(String[] args) {
		String str = "Hello";
		
		//length함수는 문자열의 길이를 구함. -> 5
		System.out.println(str.length());
		 
		//concat함수는 문자열 붙히는 함수 -> Hello world
		System.out.println(str.concat(" world"));
		//참조는 그대로 맨 위의 "Hello"임. -> Hello
		System.out.println(str);
		
		//참조를 바꿔주어야 str이 바뀜. -> String 독특한 특징
		str = str.concat(" world");
		System.out.println(str);
		
		//substring함수는 문자열을 자름. -> lo world
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 7));

	}

}
