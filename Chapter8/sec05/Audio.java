package ch08.sec05;

public class Audio implements RemoteControl {
	//필드
	private int volume;
	
	//추상 메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 불륨: " + this.volume);
	}
		
	private int memoryVolume;	
	
	@Override
	public void setMute(boolean mute){
	if(mute) {
	this.memoryVolume = this.volume;
	System.out.println("무음 처리합니다.");
	setVolume(RemoteControl.MIN_VOLUME);
		  
	}else {
	System.out.println("무음 해체합니다.");
	setVolume(this.memoryVolume);
		}	
		
	}
}
