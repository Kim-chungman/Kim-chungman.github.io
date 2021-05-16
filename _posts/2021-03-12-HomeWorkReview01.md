---
layout:     post
title:      "HomeWorkReview01"
subtitle:   " \"Java Stuty\""
date:       2021-03-12 12:00
author:     "Chungman"
catalog: true
tags:
    - Java_Study
    - Lecture05(0312)
---
```
package Review;

import java.util.Scanner;

public class HomeWorkReview01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int min = num1, max = num2;
		if(num1 > num2) {
			min = num2;
			max = num1;
		}
		
		if(num3 < min) {
			System.out.println(max + " > " + min + " > " + num3);
		} else if(num3 > max) {
			System.out.println(num3 + " > " + max + " > " + min);
		} else {
			System.out.println(max + " > " + num3 + " > " + min);
		}
		
		
		/*
		if(num1 > num2) {
			if(num3 > num1) { //num3 > num1 > num2			// 조건식 너무 많아짐
				
			} else {		// num1 > (num2? > num3?)
				if(num2 > num3) {
					
				}
			}
		}
		 */
	}

}
```
