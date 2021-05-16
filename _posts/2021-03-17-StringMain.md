---
layout:     post
title:      "StringMain"
subtitle:   " \"Java Stuty\""
date:       2021-03-17 12:00
author:     "Chungman"
catalog: true
tags:
    - Java_Study
    - Lecture08(0317)
---

# String 함수 예제
```
package Lecture8;

public class StringMain01 {

	public static void main(String[] args) {

		String str = new String();
		char[] chars = {'A', 'B', 'C', 'D', 'E'};
		String str2 = new String(chars);
		String str3 = new String(chars, 1, 4);
		byte[] bytes = {97, 98, 99, 100, 101};
		String str4 = new String(bytes);
		String str5 = new String("Hello");
		String str6 = "Hello";
		
		System.out.println("str : [" + str + "]");
		System.out.println("str : [" + str2 + "]");
		System.out.println("str : [" + str3 + "]");
		System.out.println("str : [" + str4 + "]");
		System.out.println("str : [" + str5 + "]");
		System.out.println("str : [" + str6 + "]");
	}

}
```

```
package Lecture8;

import java.util.Arrays;
import java.util.Scanner;

public class StringMain02 {

	public static void main(String[] args) {

		// char[] chars = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
		String str = "Hello World";
		char[] chars = new char[str.length()];
		
		/*
		for(int i = 0; i < str.length(); i++) {
			chars[i] = str.charAt(i);
		}
		*/
		// str.getChars(0, str.length(), chars, 0);
		
		int loc = 0;
		for(int i = 3; i < 9; i++) {
			chars[loc++] = str.charAt(i);
		}
		str.getChars(3, 9, chars, 0);
		System.out.println("chars : " + Arrays.toString(chars));
		
		System.out.println("[" + str + "]의 길이 : " + str.length());
		System.out.println("0번째에 위치한 문자 : " + str.charAt(0));
		System.out.println("0번째에 위치한 문자 : " + str.charAt(7));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 :");
		char c = sc.nextLine().charAt(0);					// "A"
	}

}
```
