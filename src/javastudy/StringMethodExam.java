package javastudy;

public class StringMethodExam {

	public static void main(String[] args) {
		String str = "Hello";
		
		//length�Լ��� ���ڿ��� ���̸� ����. -> 5
		System.out.println(str.length());
		 
		//concat�Լ��� ���ڿ� ������ �Լ� -> Hello world
		System.out.println(str.concat(" world"));
		//������ �״�� �� ���� "Hello"��. -> Hello
		System.out.println(str);
		
		//������ �ٲ��־�� str�� �ٲ�. -> String ��Ư�� Ư¡
		str = str.concat(" world");
		System.out.println(str);
		
		//substring�Լ��� ���ڿ��� �ڸ�. -> lo world
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 7));

	}

}
