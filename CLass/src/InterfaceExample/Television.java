package InterfaceExample;

public class Television implements RemoteControl {
	private int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	public void setVolume(int n) {
		if(n>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		} else if(n<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		} else {
			this.volume=n;
		}
		System.out.println("현재TV볼륨:"+this.volume);
	}
}
