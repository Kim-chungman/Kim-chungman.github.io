---
layout:     post
title:      "HandphoneMain"
subtitle:   " \"Java Stuty\""
date:       2021-03-15 12:00
author:     "Chungman"
catalog: true
tags:
    - Java_Study
    - Lecture06(0315)
---
# 핸드폰 
```
package Lecture6;

public class Handphone {

		String name;		// 소유주명
		String phone;		// 핸드폰 번호
		String company;		// 핸드폰 제조사

}
```

```
package Lecture6;

public class HandphoneMain {

	public static void main(String[] args) {
		
		// "홍길동", "010-1111-2222", "삼성"을 가지는 Handphone 객체 hp를 생성
		Handphone hp = new Handphone();
		hp.name = "홍길동";
		hp.phone = "010-1111-2222";
		hp.company = "삼성";
		
		//"윤길동", "010-3333-4444", "애플"을 가지는 객체 hp2
		Handphone hp2 = new Handphone();
		hp2.name = "윤길도";
		hp2.phone = "010-3333-4444";
		hp2.company = "애플";
		
		//"한길동", "010-5555-6666", "엘지"를 가지는 객체 hp3
		Handphone hp3 = new Handphone();
		hp3.name = "한길동";
		hp3.phone = "010-5555-6666";
		hp3.company = "엘지";
		
		System.out.println("소유주명 : " + hp.name + ", 전화번호 : " + hp.phone + ", 제조사 : " + hp.company);
		System.out.println("소유주명 : " + hp2.name + ", 전화번호 : " + hp2.phone + ", 제조사 : " + hp2.company);
		System.out.println("소유주명 : " + hp3.name + ", 전화번호 : " + hp3.phone + ", 제조사 : " + hp3.company);
		
		System.out.println("======================================================");
		
		Handphone[] hpArr = {hp, hp2, hp3};
		
		for(Handphone h : hpArr) {
			System.out.println("소유주명 : " + h.name + ", 전화번호 : " + h.phone + ", 제조사 : " + h.company);
		}
		
		
		/*
		for(int i = 0;  i < hpArr.length; i++) {
			System.out.print("소유주명 : " + hpArr[i].name + ", ");
			System.out.print("전화번호 : " + hpArr[i].phone + ", ");
			System.out.print("제조사 : " + hpArr[i].company);
			System.out.println();
		}
		*/
	}

}
```

```
package Lecture6;

public class HandphoneMain01 {

	public static void main(String[] args) {
		
		Handphone hp2 = new Handphone();
		Handphone[] hpArr = new Handphone[] {new Handphone(), hp2, new Handphone()};
		
		hpArr[0].name = "홍길동";
		hpArr[0].phone = "010-1111-2222";
		hpArr[0].company = "삼성";
		
		hpArr[1].name = "윤길동";
		hpArr[1].phone = "010-3333-4444";
		hpArr[1].company = "애플";
		
		hpArr[2].name = "한길동";
		hpArr[2].phone = "010-5555-6666";
		hpArr[2].company = "엘지";
		
		for(int i = 0; i < hpArr.length; i++) {
			System.out.println("소유주명 : " + hpArr[i].name);
			System.out.println("전화번호 : " + hpArr[i].phone);
			System.out.println("제조자 : " + hpArr[i].company);
			System.out.println("==============================");
		}

	}

}
```
