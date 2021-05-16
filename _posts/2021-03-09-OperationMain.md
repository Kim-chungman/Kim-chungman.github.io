---
layout:     post
title:      "OperationMain"
subtitle:   " \"Java Stuty\""
date:       2021-03-09 12:00
author:     "Chungman"
catalog: true
tags:
    - Java_Study
    - Lecture02(0309)
---

package Lecture2;

public class OperationMain {

	public static void main(String[] args) {

		int a = 5;
		System.out.println(a++);	//5
		System.out.println(++a);	//7
		System.out.println(a);		//7
		System.out.println(a--);	//7
		System.out.println(a++);	//6 다음 줄부터 다시 7로 바뀜
	
	}

}

/*
 * <논리연산자>
 * AND -> a&&b에서 a가 참일때 뒤를 보지만 a가 거짓이라면 F로 종결
 * OR -> a||b에서 a가 거짓일때 뒤를 보지만 a가 참이라면 T로 종결
 * 따라서 
*/
