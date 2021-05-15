package Lecture2;

import java.util.Scanner;	// 자동 import = ctrl + shift + o

/*
 * 정수를 입력하세요 : 12
 * 12의 짝수유무 ; true
 * 정수를 입력하세요 : 5
 * 5의 짝수유무 : false
 * 단, 0이랑 음수는 false로 출력하자
 */

public class Operationmain3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// "정수를 입력하세요 : " 문장을 출력
		System.out.println("정수를 입력하세요 : ");
		
		// 키보드로 정수를 입력
		int num = sc.nextInt();
		
		// 결과 출력
		boolean result = (num > 0 && num % 2 == 0);	// boolean result = (num % 2 == 0);의 문제점 : 0을 넣었을때도 true로 나옴 
		System.out.println(num + "의 짝수 유무 : " + result);
	}

}
