---
layout:     post
title:      "KeyboardTestMain"
subtitle:   " \"Java Stuty\""
date:       2021-03-16 12:00
author:     "Chungman"
catalog: true
tags:
    - Java_Study
    - Lecture07(0316)
---

# 키보드 예제
```
package Lecture7;

import java.util.Scanner;

public class KeyboardTestMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수 : ");
//		int num = sc.nextInt();
//		sc.nextLine();
		
//		String data = sc.nextLine();
//		int num = Integer.parseInt(data);
		
		int num = Integer.parseInt(sc.nextLine()); 			// "123" + 10 => 12310를 막기위해 int num = Integer.parseInt(sc.nextLine());를 쓰면
															// 문자열 123을 int형으로 변환
		System.out.println("첫번째 문자 : ");					// 숫자를 입력받고 친 엔터를 문자로 입력받음
		String s = sc.nextLine();							// nextLine();은 엔터도 문자로 입력
		
		System.out.println("두번째 정수 : ");					// 단어단위로 입력받을 때는 next();
		int num2 = sc.nextInt();							// 문장단위로 입력받을 때는 nextLine();
		
		System.out.println("num : " + num + ", s : " +s +", num2 : " + num2);

	}

}
```
