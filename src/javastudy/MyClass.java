package javastudy;

public class MyClass {
//	public ����Ÿ�� �޼ҵ�� (�Ű����� Ʋ) {����}
	public void method1() {
		System.out.println("�޼ҵ�1 �����");
	}
	
	public void method2(int x) {
		System.out.println(x + "�� �̿��� �޼ҵ�2 �����");
	}
	
	public int method3() {
		System.out.println("�޼ҵ�3 �����");
		return 10;
	}
	
	public void method4(int x, int y) {
		System.out.println(x + y + "�޼ҵ� 4 ����");
	}
	
	public int method5(int y) {
		System.out.println(y+"�̿��� �޼ҵ�5 ����");
		return y*2;
	}
}
