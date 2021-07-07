package javastudy;

//메소드가 하나이상 추상이면, 클래스는 추상이 될 수 밖에 없다.
public abstract class Bird {
	//추상으로 처리했기 때문에 구현할 필요 X
	public abstract void sing();
	public void fly() {
		//일반메소드 구현 가능
		System.out.println("날다");
	}
}
