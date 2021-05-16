---
layout:     post
title:      "StringUtilMain"
subtitle:   " \"Java Stuty\""
date:       2021-03-18 12:00
author:     "Chungman"
catalog: true
tags:
    - Java_Study
    - Lecture09(0318)
---

```
package HomeWork;

public class StringUtil {

	private int i, j;
	private char c;
	private String str;
	private boolean bool;
	
	StringUtil(){
		
	}
	
	void isUpperChar(char c){
		this.c = c;
		bool = true;
		if(bool) {
			if(c < 65 || c > 90) {
				bool = false;
			}
		}
		System.out.println(c + " 대문자 여부 : " + bool);
	}
	
	void isLowerChar(char c) {
		
	}
	
	void max(int i, int j) {
		
	}
	
	void min(int i, int j) {
		
	}
	
	void reverseString(String str) {
		
	}
	
	void toUpperString(String str) {
		
	}
	
	void toLowerString(String str) {
		
	}
}
```

```
package HomeWork;

public class StringUtilMain {

	public static void main(String[] args) {
	
		StringUtil su = new StringUtil();

		
	}

}
```
