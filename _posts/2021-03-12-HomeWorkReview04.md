---
layout:     post
title:      "HomeWorkReview04"
subtitle:   " \"Java Stuty\""
date:       2021-03-12 12:00
author:     "Chungman"
catalog: true
tags:
    - Java_Study
    - Lecture05(0312)
---

package Review;

import java.util.Scanner;

/*
 * 문제 4 : 소수 구하기!
 */
public class HomeWorkReview04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int i = 2;
		while(i <= num-1 && num % i !=0) {
			i++;
		}
		if(i==num) {
			System.out.println(num + " : 소수입니다.");
		} else {
			System.out.println(num + " : 소수가 아닙니다.");
		}
		
		
		/* boolean형을 이용한 소수구하기
		boolean bool = true;
		for(int i = 2; i <= num/2; i++) {
			if(num % i ==0) {
				bool = false;
				break;
			}
		}
		if(bool) {
			System.out.println(num + " : 소수입니다.");
		} else {
			System.out.println(num + " : 소수가 아닙니다.");
		}
		*/
		
		/* 소수 후보군은 num/2까지임. num/2 이상은 볼 필요가 없음.
		int count = 0;
		for(int i = 2; i <= num/2; i++) {
			if(num % i ==0) {
				count++;
				break;
			}
		}
		if(num > 1 && count == 0) {
			System.out.println(num + " : 소수입니다.");
		} else {
			System.out.println(num + " : 소수가 아닙니다.");
		}
		*/
		
		/*
		// 1과 자기자신을 제외한 약수 개수 구하기(소수는 약수 0개)
		int count = 0;
		for(int i = 2; i <= num-1; i++) {
			if(num % i ==0) {
				count++;
			}
		}
		if(count == 0) {
			System.out.println(num + " : 소수입니다.");
		} else {
			System.out.println(num + " : 소수가 아닙니다.");
		}
		*/
		
		/*
		// 정수의 약수 개수 구하기
		// 정수의 약수개 될 수 있는 후보군 : 1 ~ 정수
		int count = 0;
		for(int i = 0; i <= num; i++) {
			if(num % i ==0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println(num + " : 소수입니다.");
		} else {
			System.out.println(num + " : 소수가 아닙니다.");
		}
		 */
	}

}
