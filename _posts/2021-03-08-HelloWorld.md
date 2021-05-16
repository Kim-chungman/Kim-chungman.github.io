---
layout:     post
title:      "HelloWorld"
subtitle:   " \"Java Stuty\""
date:       2021-03-08 12:00:00
author:     "Chungman"
/* header-img: "img/증명사진.PNG" */
catalog: true
tags:
    - Java_Study
    - Lecture01(0308)
---

package kr.ac.kopo.lecture1;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello World!!");		//  System은 대문자 시작 클래스명, method는 소문자 시작 java.lang.System
		
		System.out.print(10);
		System.out.print('\n');
		System.out.print(10 + "\n" + 20 + "\n");
		
		System.out.println("빼뺴로" + "\t\t" + 1500);
		System.out.println("빠다코코넛" + "\t" + 2000);
		System.out.println("초코로만든 홈런볼" + "\t" + 2000);	// \t 간격
		
		System.out.printf("%7s\t%6d\n", "빼빼로", 1500);
		System.out.printf("%-7s\t%6d\n", "빼빼로", 1500);
		
		System.out.printf("%d%c%d", 10, '\n', 20, '\n');
		
		System.out.println(10.0/3.0);
		System.out.printf("%7.2f\n", 10.0 / 3.0);
		
		String s= new String("Hello");
		System.out.println(s);
		
		s = new String("abc");
		System.out.println(s);
	}

}

/*
	출력메소드
	
	System.out.print() : print와 println의 차이점 - 상수값을 출력하고자 하는 목적(공통), ln:엔터의 의미를 가지고 있나 아닌가의 차이, 줄바꿈(차이)
	
	System.out.println(10);		<->		System.out.print(10);
	System.out.print(10);		동일		System.out.print('\n');
										System.out.print(10);
										
	System.out.println()
	System.out.printf() : jdk 1.5
						System.out.printf(10 + "\n" + 20);
						%알파벳
						정수		%d
						실수		%f
						문자		%c
						문자열	%s
						논리값	%b
						%[-][간격]알파벳
						%[전체자리수][.소수점이하자리수]f
						
	1.  식별자
		-축약하지 않는다.
		-첫글자는 대문자
		-멤버변수와 메소드의 차이 : 보통 뒤에()가 붙으면 메소드 그외에 변수
		-상수는 전부 대문자 ex)MAX, MIN, MAX_VALUE, SERVER_NAME
*/
