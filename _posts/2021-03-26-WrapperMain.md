---
layout:     post
title:      "WrapperMain"
subtitle:   " \"Java Stuty\""
date:       2021-03-26 12:00
author:     "Chungman"
catalog: true
tags:
    - Java_Study
    - Lecture15(0326)
---

# WrapperMain 예제
# WrapperMain
```
package Java0326.Lecture15;

import java.util.ArrayList;
import java.util.List;

/*
 * <기본자료형>				Wrapper 클래스				class Booleans {
 * boolean				Boolean							private boolean value;
 * char					(Character)							}
 * byte					Char
 * short				Short
 * int					(Integer)
 * float				Float
 * double				Double
 * 
 */

public class WrapperMain {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(new Integer(1));
		list.add(2);						// 둘다 가능
											// Wrapper 클래스는 java.lang 패키지안에 들어있음
											// String valueOf => 어떤 값이 들어오든 String으로 변화
											// Integer.valueOf => Integer 값으로
		String str = "10234";
//		int num = Integer.parseInt(str);	// return int(기본자료형)
		int num = Integer.valueOf(str);		// return Integer(참조자료형)
		System.out.println(num + 100);
		
		int i = 123;
		Integer i2 = new Integer(123);
		
		Integer i3 = 123;					// auto boxing
		int i4 = new Integer(123);			// auto unboxing
//		<기본자료형>  <heap영역> => 원래는 말이 안되는 문법
		
		
		System.out.println("i : " + i);
		System.out.println("i2 : " + i2);
		System.out.println("i3 : " + i3);


	}

}
```
