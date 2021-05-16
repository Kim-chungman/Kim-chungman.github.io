---
layout:     post
title:      "HomeWorkReview07"
subtitle:   " \"Java Stuty\""
date:       2021-03-11 12:00
author:     "Chungman"
catalog: true
tags:
    - Java_Study
    - Lecture04(0311)
---

package Review;

public class HomeWorkReview07 {

	public static void main(String[] args) {
		/*
		int space = 4, star = 1;
		for(int i =1; i<=9; i++) {
			for(int j = 1; j <= space; j++) {
				System.out.print("-");
			}
			for(int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			space += i < 5 ? -1 : 1;
			if(i < 5) {
				star += 2;
			} else {
				star -= 2;
			}
		}
		*/
		
		int n = 1;
		for(int i =1; i<=9; i++) {
			for(int j = 1; j <= 5-n; j++) {
				System.out.print("-");
			}
			for(int j = 1; j <= 2*n-1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			if(i < 5) {
				n++;
			} else {
				n--;
			}
		}
	}

}
