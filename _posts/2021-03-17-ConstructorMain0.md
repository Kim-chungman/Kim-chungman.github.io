---
layout:     post
title:      "ConstructorMain0"
subtitle:   " \"Java Stuty\""
date:       2021-03-17 12:00
author:     "Chungman"
catalog: true
tags:
    - Java_Study
    - Lecture08(0317)
---

# 생성자 호출
```
package Lecture8;

class Car {

	Car() {
		System.out.println("Car() 생성자 호출");
	}
	
	Car(String s){
		System.out.println("Car(String) 생성자 호출");
	}
	
	Car(int i, String s){
		System.out.println("Car(int, String) 생성자 호출");
	}
	
	void car() {		// 일반 메소드
		System.out.println("일반메소드 Car() 호출...");
	}
}


public class ConstructorMain01 {

	public static void main(String[] args) {
		Car c = new Car();
		Car c2 = new Car("소나타");
		Car c3 = new Car(1000, "모닝");
		
		c.car();

	}

}
```

```
package Lecture8;

public class ConstructorMain02 {

	public static void main(String[] args) {
		
		Member m = new Member();
		Member m2 = new Member("홍길동");
		Member m3 = new Member("강길동", 20);
		Member m4 = new Member("박길동", 33, "AB");
		
		m.info();
		m2.info();
		m3.info();
		m4.info();
	}

}
```
