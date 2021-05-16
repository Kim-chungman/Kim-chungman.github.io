package Lecture2;

import java.util.Scanner;

/*
 * 1~3사이 정수 입력 : 1
 * one 출력
 * 1~3사이 정수 입력 : 2
 * two 출력
 * 1~3사이 정수 입력 : 3
 * three 출력
 * 1~3사이 정수 입력 : 다른 숫자
 * none 출력
 */

public class Switch_example {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~3 사이의 정수를 선택하세요 : ");
		int num = sc.nextInt();
		
		Scanner s = new Scanner(System.in);
		System.out.println("좋아하는 계절을 선택하세요 : ");
		String season = s.nextLine();
		
		// <다중선택문 : switch문>
		switch(num) {
		case 1 :
			System.out.println("ONE");
			break;
		case 2 :
			System.out.println("TWO");
			break;
		case 3 :
			System.out.println("THREE");
			break;
		default :
			System.out.println("ERROR");	//default는 전부 수행한후 처리! case 1 뒤에 잇다고 default 처리되지 않음.
		}
		
		/*
		 * if(season.equals("spring")) {
		 * 		System.out.println("봄은 3월부터 5월까지입니다.");
		 */
		
		switch(season) {
		case "spring" :
			System.out.println("봄은 3월부터 5월까지 입니다.");
			break;
		case "봄" :
			System.out.println("봄은 3월부터 5월까지 입니다.");
			break;
		case "summer" :
			System.out.println("여름은 6월부터 8월까지 입니다.");
			break;
		
		default :
			System.out.println("ERROR");	//default는 전부 수행한후 처리! case 1 뒤에 잇다고 default 처리되지 않음.
		}
		System.out.println("선택하신 숫자는 " + num + "이고 좋아하는 계절은 " + season + "입니다.");
		
		
		/*
		 * <if문으로 구성>
		if(num==1) {
			System.out.println("one");
		} else if(num==2) {
			System.out.println("two");
		} else if(num==3) {
			System.out.println("three");
		} else {
			System.out.println("Error");
		}
		*/
	}
}
