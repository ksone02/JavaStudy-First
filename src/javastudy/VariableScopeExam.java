package javastudy;

public class VariableScopeExam {
	//변수 호환범위 클래스 전체
	int globalScope = 10;
	static int staticVal = 7;
	
	public void scopeTest(int value) {
		//변수 호환범위 메소드 내
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	public void scopeTest2(int value2) {
		//globalScope변수는 호환됨.
		System.out.println(globalScope);
		//localScope변수, value변수는 호환범위 외이므로 호환되지 않음.
		//System.out.println(localScope);
		//System.out.println(value);
		System.out.println(value2);
		//문제 X
		System.out.println(staticVal);
	}

	public static void main(String[] args) {
		//globalScope 사용X 이유 -> "static"
		//static을 사용하면 인스턴트 하지 않아도 사용가능
		//System.out.println(globalScope);
		//System.out.println(localScope);
		//System.out.println(value);
		
		System.out.println(staticVal); //->7
		
		//static 메소드에서 static화 되지 않은 변수 사용법
		VariableScopeExam v1 = new VariableScopeExam();
		System.out.println(v1.globalScope); //->10
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println(v1.globalScope);//->10
		System.out.println(v2.globalScope);//->20
		
		//static변수는 값 공유 공간 한곳뿐, 값 공유됨.
		v1.staticVal = 50;
		v2.staticVal = 100;
		System.out.println(v1.staticVal);//->100
		System.out.println(v2.staticVal);//->100


	}

}
