---
layout:     post
title:      "ShapeMain"
subtitle:   " \"Java Stuty\""
date:       2021-03-20 12:00
author:     "Chungman"
catalog: true
tags:
    - Java_Study
    - 주말과제(0320)
---

# ShapeMain 
```
package Homework;


public class ShapeMain {

	public static void main(String[] args) {
		
		Shape shape = new Shape();					// Shape형의 shape변수생성
		shape.select();								// 프로그램 호출

	}

}
```

# Shape
```
package Homework;
/**
 * 	 <구상>							상속관계(화살표)
 * Circle   ㅡ> 		Square		ㅡ>		Shape	<ㅡ		Rectangle	<ㅡ	Triangle
 *  <필요>			<필요>				<필요>			 <필요>		  	 <필요>
 * 가로(반지름)		   가로(밑변=높이)		     가로				가로(밑변)			가로(밑변)
 * 										 높이				세로(높이)			세로(높이)
 * 이름				이름					 이름				이름				이름
 * PI, 면적(double)	면적				  랜덤,스캐너			면적				면적(double)
 */
import java.util.Random;
import java.util.Scanner;

public class Shape {

	private String name;
	private int width;
	private int height;
	
	Scanner sc = new Scanner(System.in);
	static Random r = new Random();
	
	public Shape(){

	}
	
	public Shape(String name, int width) {					// 정사각형과 원의 이름과 가로길이를 생성하기위한 생성자
		this.name = name;
		this.width = width;
	}
	
	public Shape(String name, int width, int height) {		// 직사각형과 삼각형의 이름과 가로, 세로길이를 생성하기위한 생성자
		this.name = name;
		this.width = width;
		this.height = height;
	}
	
	public String getName() {								// 이름에 접근하기위한 메소드
		return name;
	}
	
	public int getWidth() {									// 가로에 접근하기위한 메소드
		return width;
	}
	
	public int getHeight() {								// 세로에 접근하기위한 메소드
		return height;
	}
	
	public int setWidth(int width) {
		this.width = width;
		return width;
	}
	
	public int setHeight(int height) {
		this.height = height;
		return height;
	}
	
	public void select() {									// 도형선택
		System.out.println("도형을 선택하세요(1. 직사각형, 2. 정사각형, 3.삼각형, 4.원) => ");
		int num = sc.nextInt();
		sc.nextLine();
		if(num > 4 || num < 1) {							// 1~4 이외 숫자 입력시 다시 실행
			System.out.println("1~4 중에 선택해주세요.");
			select();
		}
		setArea(num);
	}
	
	public void setArea(int num) {							// 도형의 면적구하기
		switch(num) {
			case 1 :										// 직사각형일때
				Rectangle rectangle = new Rectangle("직사각형", random(2, 9), random(2, 9));
				rectangle.rectangleArea();
				rectangle.print();
				break;
			case 2 :										// 정사각형일때
				Square square = new Square("정사각형", random(2, 9));
				square.squareArea();
				square.print();
				break;
			case 3 :										// 삼각형일때
				Triangle triangle = new Triangle("삼각형", random(2, 9), random(2, 9));
				triangle.triangleArea();
				triangle.print();
				break;
			case 4 :										// 원일때
				Circle circle = new Circle("원", random(2, 9));
				circle.circleArea();
				circle.print();
				break;
			default :
		}
	}
	
	public static int random(int min, int max) {			// 2~9사이의 랜덤숫자 출력을 위한 메소드
		return r.nextInt(max-min+1)+min;
	}
}
```
