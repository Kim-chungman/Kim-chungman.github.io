---
layout:     post
title:      "HomeWorkReview02"
subtitle:   " \"Java Stuty\""
date:       2021-03-12 12:00
author:     "Chungman"
catalog: true
tags:
    - Java_Study
    - Lecture05(0312)
---

package Review;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkReview02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("4개의 정수를 입력 : ");
		int max = 0;
		for(int i = 0; i < 4; i++) {
			int num = sc.nextInt();
			if(i == 0 || max < num) {
				max = num;
			}
		}
		System.out.println("가장 큰 수 : " + max + "입니다.");
		
		/*
		Random r = new Random();
												// %10 하면 1~9사이의 숫자만 나올수있음. : 10으로 나눈 나머지니까 / 같은 의미로 %100 하면 1~99사이의 숫자가 나옴
		int num  = r.nextInt(100) + 1;			// (0 ~ 99) + 1 => (1~100)
		int num2 = r.nextInt(100) + 1;			// int num = r.nextInt() % 100; 하면 음수 값이 나올수있음
		int num3 = r.nextInt(100) + 1;
		int num4 = r.nextInt(100) + 1;
		System.out.println(num + ", " + num2 + ", " + num3 + ", " + num4);
		*/
		
		/*
		int max = num > num2 ? num : num2;
		if(max < num3) {
			max = num3;
		}
		if(max < num4) {
			max = num4;
		}
		System.out.println("가장 큰 수 : " + max + "입니다.");
		*/
		
		/*
		int max1 = num > num2 ? num : num2;
		int max2 = num3;
		if(num4 > num3) {
			max2 = num4;
		}
		
		System.out.println("가장 큰 수 : " + ((max1 > max2) ? max1 : max2) + "입니다.");
		*/
	}

}
