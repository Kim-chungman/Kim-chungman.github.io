---
layout:     post
title:      "IcecreamMain"
subtitle:   " \"Java Stuty\""
date:       2021-03-20 12:00
author:     "Chungman"
catalog: true
tags:
    - Java_Study
    - 주말과제(0320)
---

```
package Homework;

/*
 * 아이스크림 가게에 들어온 손님
 */
public class IcecreamMain {

	public static void main(String[] args) {
	
		Employee e = new Employee();		// 주문을 받을 Employee 타입의 객체 e 생성
		
		e.purchase();						// e.purchase(); 메소드호출

	}

}
```

```
package Homework;


import java.util.Scanner;
/*
 * <구상>				상속
 * IcecreamStore    <- 		Employee				|	customer
 * 아이스크림 가게		  		직원 						|	(몇개 살지? 뭘 살지? 계속 구매할지? 입력)
 * 아이스크림 기본정보	  		정보기억					|	구매정보 확인
 * (이름, 가격)		  		(총 개수, 손님수, 총 금액)	|
 */
public class IcecreamStore {

	private String name;					// 아이스크림명
	private int price;						// 아이스크림 가격
	Scanner sc = new Scanner(System.in);
	
	public IcecreamStore(){						// 생성자
		
	}
	
	public String getName() {				// 아이스크림 이름을 저장할 메소드
		return this.name;
	}
	
	public int getPrice() {					// 아이스크림 가격을 저장할 메소드
		return this.price;
	}
	
	public void icecreaminfo(String n, int p) {	// i번째 배열에 이름과 가격을 저장
		this.name = n;
		this.price = p;
	}
	
	public String setName(String msg) {			// 아이스크림 이름을 바꿀 메소드
		System.out.print(msg);
		this.name = sc.nextLine();
		return name;
	}
	
	public int setPrice(String msg) {			// 아이스크림 가격을 바꿀 메소드
		System.out.print(msg);
		this.price = sc.nextInt();
		sc.nextLine();
		return price;
	}
	
}
```

```
package Homework;
/*
 * <구상>				상속
 * IcecreamStore    <- 		Employee				|	customer
 * 아이스크림 가게		  		직원 						|	(몇개 살지? 뭘 살지? 계속 구매할지? 입력)
 * 아이스크림 기본정보	  		정보기억					|	구매정보 확인
 * (이름, 가격)		  		(총 개수, 손님수, 총 금액)	|
 */
public class Employee extends IcecreamStore {

	private IcecreamStore[] store;				// 아이스크림 주문정보를 받을 배열
	private static int icecreamNum;				// 아이스크림 총 개수
	private static int customerNum;				// 손님 수
	private static int totalPrice;				// 총 판매액
	
	public Employee(){									// 생성자
		
	}
	/**
	 * 다른 클래스에서 IcecreamNum을 접근하기 위한 메소드
	 * @return IcecreamNum
	 */
	public int getIcecreamNum() {
		return this.icecreamNum;
	}
	
	/**
	 * 다른 클래스에서 IcecreamNum 값을 수정하기 위한 메소드
	 * @param icecreamNum - 입력받은 개수
	 * @return icecreamNum
	 */
	public int setIcecreamNum(int icecreamNum) {
		this.icecreamNum = icecreamNum;
		return icecreamNum;
	}
	
	/**
	 * 다른 클래스에서 getStore[]을 접근하기 위한 메소드
	 * @return store
	 */
	public IcecreamStore[] getStore() {
		return this.store;
	}
	
	/**
	 * Employee의 첫질문(아이스크림 구입 개수확인)
	 * @return num - 구입개수
	 */
	public int purchase() {
		int num = super.setPrice("아이스크림 몇개 구입하시겠습니까? : ");
		information(num);
		return num;
	}
	
	/**
	 * Employee의 아이스크림 정보 기억(아이스크림 이름, 가격 기억)
	 * @param num - 아이스크림 구매 개수
	 * @return store - 정보를 저장한 배열
	 */
	public IcecreamStore[] information(int num) {
		icecreamNum += num;								// 아이스크림 구입 개수 합산
		store = new IcecreamStore[num];					// 아이스크림 정보 입력할 배열 생성
		for(int i = 0; i < store.length; i++) {
			System.out.println("*** " + (i+1) + "번째 아이스크림 구매정보 입력 ***");
			super.setName("아이스크림 명 : ");
			super.setPrice("아이스크림 가격 : ");
			totalPrice += super.getPrice();				// 아이스크림 합산 가격 저장
			store[i] = new IcecreamStore();				// 아이스크림 이름, 가격에 접근하기위해 IcecreamStore타입의 객체 생성
			store[i].icecreaminfo(super.getName(), super.getPrice());	// 이름과 가격 저장
		}
		bill();
		return store;
	}
	
	/**
	 * 계산서, 정보확인목적
	 */
	public void bill() {				// 정보가 맞는지 확인
		System.out.println("< 총 " + store.length + "개 구매정보 출력 >");
		System.out.println("번호\t\t아이스크림명\t아이스크림가격");
		int icecreamNo = 1;				// 손님 한명당 아이스크림 구입 개수(손님마다 초기화)
		for(int i = 0; i < store.length; i++) {
			System.out.print((icecreamNo++) + "\t\t" + store[i].getName() + "\t\t" + store[i].getPrice());
			System.out.println();
		}
		customer();
	}
	
	/**
	 * 계속 구매여부 확인, 계속 구매를 원한다면 purchase();로 이동
	 */
	public void customer() {
		System.out.println("계속 구매하시겠습니까?(Y/N) : ");
		String yes = sc.nextLine();
		customerNum++;							// 손님 숫자증가(초기값 0)
		switch(yes) {							// 케이스별로 진행
			case "Y" :
				rePurchase();
				break;
			case "y" :
				rePurchase();
				break;
			case "N" :
				purchaseEnd();
				break;
			case "n" :
				purchaseEnd();
				break;
			default : 
		}
	}
	
	public void rePurchase() {			// 계속 구매 : purchase() 메소드 호출
		purchase();
	}
	
	public void purchaseEnd() {			// 구매 끝 : 종합정보 출력
		System.out.println("총 " + customerNum + "명의 고객이 아이스크림을 구매했습니다.");
		System.out.println("판매된 아이스크림 총 개수 : " + icecreamNum + "개");
		System.out.println("총 판매액 : " + totalPrice + "원");
	}
}
```
