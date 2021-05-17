---
layout:     post
title:      "LibraryMain"
subtitle:   " \"Java Stuty\""
date:       2021-04-03 12:00
author:     "Chungman"
catalog: true
tags:
    - Java_Study
    - Java_Project
---

## LibraryMain
```
package MyLibrarySystem;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberInfo user = new MemberInfo();
		BookInfo book = new BookInfo();
		int num;
		
		boolean open;
		
		open = book.open();
		
		if(open==true) {
		while(true) {
			if(user.loginMember() == null) {
				do {
					System.out.print("1. 로그인 2. 회원가입 3. 종료 : ");
					num = sc.nextInt();
					sc.nextLine();
				} while(num < 1 || num > 3);
				
				if(num == 3) {
					System.out.println("도서관 시스템을 종료합니다.");
					break;
				}
				
				switch(num) {
				case 1 :
					user.logIn();
					break;
				case 2 :
					user.join();
					break;
				}
			} else if(user.loginMember().getId() == "cm") {
				do {
					System.out.print("1. 도서관리 2. 회원관리 3. 로그아웃 4. 종료 : ");
					num = sc.nextInt();
					sc.nextLine();
				} while(num < 1 || num > 4);
				
				if(num == 4) {
					System.out.println("도서관 시스템을 종료합니다.");
					break;
				}
				
				switch(num) {
				case 1 :
					do {
						System.out.print("1. 도서등록 2. 도서수정 3. 도서삭제 4. 도서검색 5. 도서리스트 6. 복귀");
						num = sc.nextInt();
						sc.nextLine();
					} while(num < 1 || num > 6);
					
					switch(num) {
						case 1 :
							book.bookAdd();
							break;
						case 2 :
							book.bookInfoChange();
							break;
						case 3 :
							book.bookDelete();
							break;
						case 4 :
							book.bookSearch();
							break;
						case 5 :
							book.printBookList();
							break;
						case 6 :
							break;
					} 
					break;
				case 2 :
					do {
						System.out.print("1. 회원 리스트 2. 이름검색 3. 회원삭제 4.복귀");
						num = sc.nextInt();
						sc.nextLine();
					} while(num < 1 || num > 4);
						
					switch(num) {
					case 1 :
						user.printUserList();
						break;
					case 2 :
						user.userSearch();
						break;
					case 3 :
						user.userDelete();
						break;
					case 4 :
						break;
					}
					break;
				case 3 :
					user.logOut();
					break;
				}
			} else {
				do {
					System.out.print("1. 도서대여 2. 도서반납 3. 도서검색 4. 정보수정 5. 로그아웃 6. 회원탈퇴 7. 종료");
					num = sc.nextInt();
					sc.nextLine();
				} while(num < 1 || num > 7);
				
				if(num==7) {
					System.out.println("도서관 시스템을 종료합니다.");
					break;
				}
				
				switch(num) {
				case 1 :
					book.borrow();
					break;
				case 2 : 
					book.returnBook();
					break;
				case 3 :
					book.bookSearch();
					break;
				case 4 :
					user.userUpdate();
					break;
				case 5 :
					user.logOut();
					break;
				case 6 :
					user.userDelete();
					break;
				}
			}
			} 
		} else {
			book.close();
		}
	}

}
```
