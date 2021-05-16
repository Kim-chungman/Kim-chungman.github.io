package kr.ac.kopo.lecture1;

/*
 * 상수 : 5가지
 * 1. 정수형상수 : 10, 20, -678
 * 2. 실수형상수 : 1.2, 3,157
 * 3. 문자형상수 : '3', 'A', 'm', '가'
 * 4. 문자열상수 : "abc", "A"
 * 5. 논리형상수 : true, false
 */

public class ConstMain {

	public static void main(String[] args) {
		
		System.out.printf("%c+%c\n", 'A', 'B');
		System.out.println('A' + 10);
		System.out.println('A' + 'B');
		
		boolean bool = true; //final boolean BOOL = true; (변수를 대문자로 표시, bool = false; 작성하면 에러발생)
		
		bool = false;
		
		System.out.println(bool);
	}

}
