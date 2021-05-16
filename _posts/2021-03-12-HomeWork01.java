---
layout:     post
title:      "HomeWork01"
subtitle:   " \"Java Stuty\""
date:       2021-03-12 12:00
author:     "Chungman"
catalog: true
tags:
    - Java_Study
    - Lecture05(0312)
---



package HomeWork;

import java.util.Scanner;

/*
 * 문제 1. 0~99사이의 정수를 5개 입력받아 다음과 같이 출력하는 코드를 작성하시오
 */
	public class HomeWork01 {

	public static void main(String[] args) {
		
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < num.length; i++) {
			System.out.print((i+1)+"번째 정수 : ");
			num[i] = sc.nextInt();
			if(num[i]>100 || num[i]<0) {								// num[i]가 0보다 작거나 100보다 크면 오류 메시지
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				i -= 1;													// 다시 num[i]를 입력받기위해 숫자를 줄여준다. if문을 나가면 i++로 다시 원래 숫자로 입력받도록.
			}
		}
		System.out.println("<print>");
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "    \n");						// 입력받은 배열 출력
		}
		System.out.println("<reverse>");
		for(int i = 0; i < num.length; i++) {
			int a = num[i]/10;											// 2~100사이의 숫자를 10으로 나눴을때 몫을 일의 자리 숫자로
			int b = num[i]%10;											// 10으로 나눴을때 나머지에 x10해서 십의 자리 숫자로 변환
			num[i] = 10*b + a;
		}
		for(int i = 4; i >= 0; i--) {
		System.out.print(num[i] + "    \n");							// 반대로 찍기
		}
	}

}
