---
layout:     post
title:      "ArrayMainDouble"
subtitle:   " \"Java Stuty\""
date:       2021-03-11 12:00
author:     "Chungman"
catalog: true
tags:
    - Java_Study
    - Lecture04(0311)
---

package Lecture4;

public class ArrayMainDouble {

	public static void main(String[] args) {
		
	//	int[][] arr = new int[2][4];
		int[][] arr = new int[2][];
		arr[0] = new int[5];
		arr[1] = new int[3];
		
		System.out.println("arr : " + arr);
		System.out.println("arr.length : " + arr.length);
		
		for(int i=0; i < arr.length; i++) {
			System.out.println("arr[" + i +"] : " + arr[i]);
			System.out.println("arr[" + i +"].length : " + arr[i].length);
		}
		
		/*
		int[][] arr = new int[3][];
		
		arr[0] = new int[] {1, 2, 3, 4};
		arr[1] = new int[] {5, 6, 7};
		arr[2] = new int[] {8, 9, 10, 11, 12};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		*/
	}

}
