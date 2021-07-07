package javastudy;

//public -> 접근제한자
public class AccessObj {
	//public -> 전체공개
	public int p = 3;
	//protected -> 같은 패키지 내 공유, But 다른 패키지 -> 상속이면 가능.
	protected int p2 = 4;
	//private -> 자신만 접근 가능
	private int i = 5;
	//default 접근 지성자 -> 같은패키지 내 공유가능
	int k = 2;
}
