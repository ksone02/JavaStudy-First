package javastudy;

public class EnumExam {
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";

	public static void main(String[] args) {
		//gender1�� MALE, FEMALE ���� �ϳ� ����
		String gender1;
		
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		
		//���� ��Ȳ �߻� -> �̷� ��Ȳ�� ������ ��
		gender1 = "boy";
		
		Gender gender2; //enum
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
		//������ ���� �߻�
		//gender2 =  "boy";
	}

}

enum Gender{
	MALE,FEMALE;
}
