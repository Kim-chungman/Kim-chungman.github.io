---
layout:     post
title:      "StringUtilReview"
subtitle:   " \"Java Stuty\""
date:       2021-03-19 12:00
author:     "Chungman"
catalog: true
tags:
    - Java_Study
    - Lecture10(0319)
---

```
package HomeWorkReview;

public class StringUtilReview {

	/**
	 * 문자열을 거꾸로 변환하는 메소드
	 */
	public String reverseString(String str) {
		
		int length = str.length();
		char [] chars = new char[length];
		str.getChars(0, length, chars, 0);	// 값 복사
		
		for(int i = 0, j = length; i < length/2; i++) {
			char temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
		}
		return new String(chars);
		
		/*
		StringBuffer sb = new StringBuffer();
		String revStr = new String();
		for(int i = str.length()-1, j = 0; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		
		return sb.toString();
		*/
		
		/*
		char[] chars = new char[str.length()];
		for(int i = str.length()-1, j = 0; i >= 0; i--) {
			chars[j++] = str.charAt(i);
		}
		
		return new String(chars);
		*/
	}
	
	/**
	 * 문자열을 대문자로 변경하는 메소드
	 */
	public String toUpperString(String str) {
		
		char[] chars = new char[str.length()];
		str.getChars(0, str.length(), chars, 0);
		
		for(int i = 0; i < chars.length; i++) {			// chars.length()가 아닌 이유 : chars의 형태는 배열
			if(chars[i] >= 'a' && chars[i] <= 'z')
				chars[i] -= ('a'-'A');
		}
		return new String(chars);
		
		/*
		byte[] bytes = new byte[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			
			byte b = (byte)str.charAt(i);
			// 소문자의 경우 대문자로 변경해서 대입
			if(b >= 'a' && b <= 'z')
				b = (byte)(b - ('a'-'A'));
			bytes[i] = b;
		}
		
		return new String(bytes);
		*/
	}
}
```
