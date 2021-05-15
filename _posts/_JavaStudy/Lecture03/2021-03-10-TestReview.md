package Review;

/*
 * 4번 문제 리뷰
 */
import java.util.Scanner;

public class TestReview {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력하세요.");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 정수를 입력하세요.");
		int num2 = sc.nextInt();
		
		System.out.println("정수 " + num1 + "이 " + num2 + "의 배수 여부 판단 : " + (num2 > 0 && num1 % num2 == 0));
		System.out.println("정수 " + num1 + "이 " + num2 + "의 배수 여부 판단 : " + ((num2 > 0 && num1 % num2 == 0) ? "참" : "거짓"));
		
	}

}
