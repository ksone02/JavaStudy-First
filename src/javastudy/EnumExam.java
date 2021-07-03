package javastudy;

public class EnumExam {
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";

	public static void main(String[] args) {
		//gender1에 MALE, FEMALE 둘중 하나 삽입
		String gender1;
		
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		
		//예외 상황 발생 -> 이런 상황도 문제가 됨
		gender1 = "boy";
		
		Gender gender2; //enum
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
		//컴파일 오류 발생
		//gender2 =  "boy";
	}

}

enum Gender{
	MALE,FEMALE;
}
