package javastudy;

public class MyClass {
//	public 리턴타입 메소드명 (매개변수 틀) {구현}
	public void method1() {
		System.out.println("메소드1 실행됨");
	}
	
	public void method2(int x) {
		System.out.println(x + "를 이용한 메소드2 실행됨");
	}
	
	public int method3() {
		System.out.println("메소드3 실행됨");
		return 10;
	}
	
	public void method4(int x, int y) {
		System.out.println(x + y + "메소드 4 실행");
	}
	
	public int method5(int y) {
		System.out.println(y+"이용한 메소드5 실행");
		return y*2;
	}
}
