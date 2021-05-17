---
layout:     post
title:      "Interface_TV"
subtitle:   " \"Java Stuty\""
date:       2021-03-23 12:00
author:     "Chungman"
catalog: true
tags:
    - Java_Study
    - Lecture12(0323)
---

# Interface 예제
# TV
```
package Java0323.Lecture12.inter02;

public interface TV {

	/*public static final*/ int MAX_VOLUME_SIZE = 50;
	/*public static final*/ int MIN_VOLUME_SIZE = 0;
	
	/*public abstract*/ void powerOn();
	/*public abstract*/ void powerOff();
	/*public abstract*/ void channelUp();
	/*public abstract*/ void channelDown();
	/*public abstract*/ void soundUp();
	/*public abstract*/ void soundDown();
	/*public abstract*/ void mute();
	
	default void copyright() {
		System.out.println("모든 기술은 TV협회에 귀속됩니다.");
	}
	
}
```

# UserMain 
```
package Java0323.Lecture12.inter02;

public class UserMain {

	public static void main(String[] args) {
		
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.channelUp();
		tv.channelDown();
		tv.soundUp();
		tv.soundDown();
		tv.mute();
		tv.mute();
		tv.soundUp();
		tv.powerOff();
		tv.copyright();
		
		System.out.println("=========================");
		
		/*
		TV tv = new LGTV();
		tv.powerOn();
		tv.channelUp();
		tv.channelDown();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
		*/
	}

}
```

# SamsungTV 
```
package Java0323.Lecture12.inter02;

public class SamsungTV implements TV{

	private String modeName;
	private boolean power;
	private int volumeSize;
	private int channelNo;
	private boolean muteToggle;
	private int currentVolumeSize;
	
	public SamsungTV() {
		System.out.println("삼성TV 구매완료...");
		modeName = "삼성TV";
		power = false;
		volumeSize = 10;
		channelNo = 3;
		muteToggle = false;
		currentVolumeSize = volumeSize; 
	}
	
	@Override
	public void powerOn() {
		power = true;
		System.out.println("전원을 켭니다.");
		info();
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("전원을 끕니다.");
		
	}

	@Override
	public void channelUp() {
		channelNo++;
		if(channelNo == 100) {
			channelNo = 1;
		}
		System.out.println("채널을 올립니다.");
		info();
	}

	@Override
	public void channelDown() {
		channelNo--;
		if(channelNo == 0) {
			channelNo = 100;
		}
		System.out.println("채널을 내립니다.");
		info();
	}

	@Override
	public void soundUp() {
		System.out.println("볼륨을 올립니다.");
		if(muteToggle) {
			volumeSize = currentVolumeSize;
			muteToggle = false;
		}
		if(volumeSize < TV.MAX_VOLUME_SIZE) {
			volumeSize++;
		}
		info();
	}

	@Override
	public void soundDown() {
		System.out.println("볼륨을 내립니다.");
		if(volumeSize > TV.MIN_VOLUME_SIZE) {
			volumeSize--;
		}
		info();
	}

	@Override
	public void mute() {
		if(muteToggle==true) {					// muteToggle이라는 문자는 참인데 muteToggle은 거짓 값을 가지고있다.
			System.out.println("음소거 해제");
			volumeSize = currentVolumeSize;
		} else {
			System.out.println("음소거 중...");
			volumeSize = TV.MIN_VOLUME_SIZE;
		}
		muteToggle = !muteToggle;
//		System.out.println(muteToggle);
		
//		volumeSize = TV.MIN_VOLUME_SIZE;
		
		info();
	}
	
	private void info() {			// 내부정보로만 돌리는 핵심기술일때 private 설정가능
		System.out.println("채널번호 : " + channelNo + ", 음량크기 : " + volumeSize);
	}

}
```

# LGTV 
```
package Java0323.Lecture12.inter02;

public class LGTV implements TV {

	public LGTV() {
		System.out.println("LGTV 구매완료...");
	}
	
	@Override
	public void powerOn() {
		System.out.println("TV전원 ON");
	}

	@Override
	public void powerOff() {
		System.out.println("TV전원 OFF");
		
	}

	@Override
	public void channelUp() {
		System.out.println("Channel Up...");
		
	}

	@Override
	public void channelDown() {
		System.out.println("Channel Down...");
		
	}

	@Override
	public void soundUp() {
		System.out.println("Sound Up...");
		
	}

	@Override
	public void soundDown() {
		System.out.println("Sound Down...");
		
	}

	@Override
	public void mute() {
		System.out.println("MUTE");
		
	}

}
```
