package javastudy;

public class StringExam {

	public static void main(String[] args) {
		// JAVA���� ���� ���� ����ϴ� String Ŭ����
		
		//��� �������� ����
		String str1 = "hello";
		String str2 = "hello";
		
		//���ο� �������� ����
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		if(str1 == str2)
			System.out.println("str1,str2�� ���� ���۷���");
		if(str1 != str3)
			System.out.println("str1�� str3�� �ٸ� ���۷����Դϴ�.");
		if(str3 != str4)
			System.out.println("str3�� str4�� �ٸ� ���۷����Դϴ�.");
		
		//StringŬ������ Ư¡ -> ������ �ʴ´�.
		
		System.out.println(str1);
		//0,1,2���� 3���� ��� -> ���ο� String ���� ��ȯ
		System.out.println(str1.substring(3));
		//���� ������ ����.
		System.out.println(str1);

	}

}
