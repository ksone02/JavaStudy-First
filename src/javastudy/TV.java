package javastudy;

public interface TV {
	public int MIN_VOLUME=0;
	public int MAX_VOLUME=100; //���
	
	//class��� interface
	public void turnOn();
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
}
