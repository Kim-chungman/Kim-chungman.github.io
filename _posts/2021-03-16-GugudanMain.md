---
layout:     post
title:      "GugudanMain"
subtitle:   " \"Java Stuty\""
date:       2021-03-16 12:00
author:     "Chungman"
catalog: true
tags:
    - Java_Study
    - Lecture07(0316)
---

# 구구단 
```
package Lecture7;

import java.util.Scanner;

/**
 * 구구단과 관련된 여러가지 기능을 가지는 기능클래스
 * @author HP
 *
 */
public class Gugudan {

	Scanner sc = new Scanner(System.in);
	
	void print(int dan) {
		
		System.out.println("*** " + dan + "단 ***");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
	
	void print() {
		
		print(2, 9);
		
		/*
		for(int i  = 2; i <= 9; i++) {
			print(i);
		}
		*/
		
		/*
		for(int i = 2; i <= 9; i++) {
			System.out.println("*** " + i + "단 ***");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
		*/
	}
	/**
	 * 시작단에서 종료단까지 구구단 출력
	 * @param sDan
	 * @param eDan
	 */
	void print(int sDan, int eDan) {
		for(int i = sDan; i <= eDan; i++) {
			print(i);
		}
	}
	
	int getDan() {
		int dan = sc.nextInt();
		sc.nextLine();
		return dan;
	}
	
	int getDan(String msg) {
		System.out.print(msg);
		int dan = sc.nextInt();
		sc.nextLine();
		return dan;
		
	}
}

```
package Lecture7;

import java.util.Scanner;

public class GugudanMain {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		
		Gugudan gu = new Gugudan();
		
		/*
		System.out.println("2~9 사이의 단 입력 :");
		int dan = gu.getDan();
		int dan = sc.nextInt();
		sc.nextLine();
		*/
		
		int dan = gu.getDan("2~9 사이의 단 입력 :");
		
		gu.print(dan);
		
		gu.print();
		
		int startDan = gu.getDan("시작단을 입력 : ");
		int endDan = gu.getDan("종료단을 입력 : ");
		
		/*
		System.out.println("시작단을 입력 : ");
		int startDan = gu.getDan();
		//sc.nextLine();
		
		System.out.println("종료단을 입력 : ");
		int endDan = gu.getDan();
		// sc.nextLine();
		*/
		
		gu.print(startDan, endDan);

	}

}
```

```
