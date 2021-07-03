package javastudy;

public class MyClassExam {

	public static void main(String[] args) {
		//MyClass 클래스 참조
		MyClass myclass = new MyClass();
		
		myclass.method1();
		myclass.method2(5);
		int value = myclass.method3();
		System.out.println("메소드3이 리턴한 값: " + value);
		myclass.method4(1, 2);
		int value2 = myclass.method5(10);
		System.out.println("메소드3이 리턴한 값: " + value2);
	}

}
