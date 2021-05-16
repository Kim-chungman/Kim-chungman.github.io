---
layout:     post
title:      "OperationMain2"
subtitle:   " \"Java Stuty\""
date:       2021-03-09 12:00
author:     "Chungman"
catalog: true
tags:
    - Java_Study
    - Lecture02(0309)
---

package Lecture2;

public class OperationMain2 {

	public static void main(String[] args) {

		int a = 1, b = -1, c = 0;
		
		boolean bool = ++a > 0 && ++b > 0 && ++c > 0;	
		/* a는 먼저 ++돼서 2는 0보다 크기 때문에 true
		 * b는 먼저 ++돼서 0, 0은 0보다 크지 않기 때문에 false
		 * c는 확인x 
		*/
		System.out.println("bool : " + bool);
		
		System.out.println("a : "+ a + ", b : " + b +", c : " + c);
		
	}

}
