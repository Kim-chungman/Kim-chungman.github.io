---
layout:     post
title:      "HomeWorkReview05"
subtitle:   " \"Java Stuty\""
date:       2021-03-11 12:00
author:     "Chungman"
catalog: true
tags:
    - Java_Study
    - Lecture04(0311)
---
```
package Review;

public class HomeWorkReview05 {

	public static void main(String[] args) {
		
		/*
		 * for문 5개, if문 1개
		System.out.println("--------------------------------");
		System.out.println("<문제5>");
		
		for(int i=1; i<=9; i++) {
			if(i<=5) {
				for(int j = 1; j<=i-1; j++) {
					System.out.print("-");
				}
				for(int j = 1; j<=6-i; j++) {
					System.out.print("*");
				}
			} else {
				for(int j = 1; j<=9-i; j++) {
					System.out.print("-");
				}
				for(int j = 1; j<=i-4; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		 */
		
		/*
		 * for문 3개, if문 3개
		for(int i=1; i<=9; i++) {
			if(i<=5) {
				for(int j = 1; j<=5; j++) {
					if(j < i) {
						System.out.print("-");
					} else {
						System.out.print("*");
					}
				
				}
			} else {
				for(int j =1; j <= 5; j++) {
					System.out.print(j<10-i ? '-' : '*');
				}
			}
			System.out.println();
		}
		*/
		
		/*
		 * 변수 2개 생성
		 * for문 3개, if 1개
		int space = 0;
		int star = 5;
		for(int i=1; i<=9; i++) {
			for(int j = 1; j<=space; j++) {
				System.out.print("-");
			}
			
			for(int j = 1; j<=star; j++) {
				System.out.print("*");
			}
			
			if(i < 5) {					// 다음행을 위한것임으로 5행보다 작아야한다.
				space++;
				star--;
			} else {
				space--;
				star++;
			}
			System.out.println();
		}
		*/
		/*
		int star = 5;
		for(int i=1; i<=9; i++) {
			for(int j = 1; j<=5-star; j++) {
				System.out.print("-");
			}
			
			for(int j = 1; j<=star; j++) {
				System.out.print("*");
			}
			
			if(i < 5) {					// 다음행을 위한것임으로 5행보다 작아야한다.
				star--;
			} else {
				star++;
			}
			System.out.println();
		}
		*/
		
		int startCol=1;
		for(int i=1; i<=9; i++) {
			for(int j = 1; j<=5; j++) {
				if(j < startCol) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			if(i < 5) {	
				startCol++;
			} else {
				startCol--;
			}
			
		}
	}
}
```
