---
layout:     post
title:      "HomeWorkReview08"
subtitle:   " \"Java Stuty\""
date:       2021-03-11 12:00
author:     "Chungman"
catalog: true
tags:
    - Java_Study
    - Lecture04(0311)
---

package Review;
public class HomeWorkReview08 {

	public static void main(String[] args) {
		
		int star = 1;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j<=star || j >= 10-star) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
			
			if(i<5) {
				star++;
			} else {
				star--;
			}
		}
		
		/*
		int star = 1;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j<=star) {
					System.out.print("*");
				} else if(j < 10-star) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			
			if(i<5) {
				star++;
			} else {
				star--;
			}
		}
		*/
	}

}
