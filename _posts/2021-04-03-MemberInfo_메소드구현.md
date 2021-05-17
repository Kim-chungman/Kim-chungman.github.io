---
layout:     post
title:      "MemberInfo_메소드구현"
subtitle:   " \"Java Stuty\""
date:       2021-04-03 12:00
author:     "Chungman"
catalog: true
tags:
    - Java_Study
    - Java_Project
---

## MemberInfo
```
package MyLibrarySystem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * user(사용자)와 manager(관리자)의 기능이 구현되는 클래스
 * @author 충만
 *
 */
public class MemberInfo extends MemberData implements Member{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	private Calendar now = Calendar.getInstance();
	private List<MemberData>list = new ArrayList<MemberData>();
	private MemberData userdb;

	/**
	 * MemberInfo - 생성자 호출
	 * 1. 생성자 호출시 manager 정보 저장
	 */
	public MemberInfo() {
		MemberData db = new MemberData();
		db.setId("cm");
		db.setPwd("1010");
		db.setName("manager");
		db.setBirth("1995-10-10");
		db.setPhone("010-1010-1010");
		list.add(db);
	}
	
	/**
	 * join - 회원가입
	 * 1. MemberData 객체 생성
	 * 2. readUser(String id)메소드 호출로 id list에 동일한 id가 있는지 체크
	 * 3. id 설정(제약조건 : 3자리 이상), password 설정(제약조건 : 4자리 이상)
	 * 4. name 설정(제약조건 : Pattern.matches("^[ㄱ-ㅎ가-힣]*$", db.getName())로 한글체크) - 인터넷 참고 했습니다.
	 * 5. birthday 설정(제약조건 : SimpleDateFormat사용(1900~2008년생(14세이상)만 가입가능), dateFormat.setLenient(false)로 날짜체크 - 인터넷 참고 했습니다.
	 * 6. phonenumber 설정(제약조건 : "-"로 split활용, equals(),length()활용) // 문제점 : 010제외 숫자가 아니여도 입력됩니다..
	 * 7. 회원가입 정보확인
	 * 8. 회원저장(list.add(db), db는 MemberData type)
	 */
	@Override
	public void join() {
		System.out.println("<회원가입>");
		try {
			MemberData db = new MemberData();
			System.out.print("아이디를 입력해주세요. : ");
			db.setId(br.readLine());
			
			if(readUser(db.getId()) != null) {
				System.out.println("이미 등록된 아이디 입니다.");
				return;
			} else if(db.getId().length() < 3) {
				System.out.println("ID는 최소 3자리 이상 문자+숫자 조합입니다.");
			} else {
				System.out.println("사용가능한 아이디 입니다.");
				System.out.print("패스워드를 입력해주세요. : ");
				db.setPwd(br.readLine());
				if(db.getPwd().length() < 4) {
					System.out.println("PASSWORD는 최소 4자리 이상 문자+숫자 조합입니다.");
					return;
				}
				
				System.out.print("이름을 입력해주세요. : ");
				db.setName(br.readLine());
				if(!Pattern.matches("^[ㄱ-ㅎ가-힣]*$", db.getName())) {
					System.out.println("이름은 한글만 입력 가능합니다.");
					return;
				}
				
				System.out.print("생년월일을 입력해주세요.(YYYY-MM-DD) : ");
				db.setBirth(br.readLine());
				String start ="1900-01-01";
				String end = "2008-12-31";
				String birth = db.getBirth();
				
				try {
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
					Date birthday = dateFormat.parse(birth);
					Date start_day = dateFormat.parse(start);
					Date end_day = dateFormat.parse(end);
					
					if(birthday.getYear() < start_day.getYear()) {
						System.out.println("선택 불가능한 연도입니다."); return;
					}else if(birthday.getYear() > end_day.getYear()) {
						System.out.println("14세 이상 회원가입 가능합니다."); return;
					}
					
				}catch(Exception e) {
					System.out.println(e.toString());
				}finally {
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
					dateFormat.setLenient(false);
					dateFormat.parse(birth);
				}
				
				System.out.print("핸드폰 번호를 입력해주세요.( - 입력) : ");
				db.setPhone(br.readLine());
				String[] mobNum = db.getPhone().split("-");
				String Num1 = mobNum[0];
				String Num2 = mobNum[1];
				String Num3 = mobNum[2];
				if(!(Num1.equals("010"))) {
					System.out.println("핸드폰 번호는 010으로 시작합니다.");
					return;
				}
				if(!(Num2.length() == 4 && Num3.length() == 4)) {
					System.out.println("핸드폰 번호를 잘못 입력하셨습니다.");
					return;
				}
				
				System.out.println("이름\t생년월일\tID\t핸드폰번호");
				System.out.println("===========================================================");
				System.out.println(db.getName() + "\t" + db.getBirth() + "\t" + db.getId() + "\t" + db.getPhone());
				
				System.out.print("입력하신 정보가 맞나요?(y/n) : ");
				String ans = sc.nextLine();
				if(ans.equals("y")||ans.equals("Y")) {
					list.add(db);
					System.out.println("회원가입을 축하합니다.");
				} else if(ans.equals("n")||ans.equals("N")) {
					System.out.println("회원가입이 취소되었습니다.");
				} else {
					System.out.println("y또는n만 입력해주세요.");
					System.out.println("회원정보를 다시 입력해주세요.");
					join();
				}
			}
			
		} catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

	
	/**
	 * logIn - 로그인
	 * 1. id 입력(id는 readUser(id)활용 - null이면 없는 id, 있다면 저장된 MemberData db불러옴)
	 * 2. password 입력(db.getPwd().equals(pwd) 확인)
	 * 3. userdb=db; (1,2번이 맞다면 MemberData userdb에 db 정보입력)
	 */
	@Override
	public void logIn() {
		System.out.println("<로그인>");
		String id, pwd;
		
		try {
			System.out.print("아이디를 입력해주세요. : ");
			id=br.readLine();
			
			System.out.print("패스워드를 입력해주세요. : ");
			pwd=br.readLine();
			
			MemberData db = readUser(id);
			if(db == null) {
				System.out.println("존재하지 않는 ID입니다. 다시 시도해주세요.");
				return;
			} else {
				if(db.getPwd().equals(pwd)) {
					userdb = db;
					return;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					System.out.println("프로그램을 다시 실행해주세요.");
					return;
				}
			}
		} catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

	
	/**
	 * logOut - 로그아웃
	 * userdb=null; (그동안 userdb에 db가 들어있었는데 userdb를 null값으로 바꿈)
	 */
	@Override
	public void logOut() {
		userdb = null;
		
		System.out.println("로그아웃 되었습니다.");
		
	}

	/**
	 * userSearch - 회원검색(manager 메뉴)
	 * 1. ID로 찾기 2. 이름으로 찾기 3. 핸드폰 번호로 찾기
	 * 일치하는 회원정보 찾기 : 1.5버전의 for문 활용
	 * db.getId().equals(str), db.getName().equals(str), db.getPhone().equals(str) 활용(내용동일)  
	 */
	@Override
	public void userSearch() {

		System.out.println("<회원검색>");
		try {
			System.out.print("1. ID로 찾기 2. 이름으로 찾기 3. 핸드폰 번호로 찾기 : ");
			String num = br.readLine();
			switch(num) {
			case "1" :
				System.out.println("\n<ID 검색>");
				try {
					System.out.print("찾을 ID를 입력하세요. : ");
					String sid = br.readLine();
					MemberData db = null;
					System.out.println("이름\t생년월일\tID\t핸드폰번호");
					for(MemberData data : list) {
						if(data.getId().equals(sid)) {
							db = data;
							break;
						}
					}
					System.out.println("===========================================================");
					System.out.print(db.getName() + "\t");
					System.out.print(db.getBirth() + "\t");
					System.out.print(db.getId() + "\t");
					System.out.print(db.getPhone() + "\n");
					System.out.println("===========================================================");
					System.out.println("첫 화면으로 돌아갑니다.");
				} catch(Exception e) {
					System.out.println(e.toString());
				}
				break;
			case "2" :
				System.out.println("\n<이름 검색>");
				try {
					System.out.print("찾을 이름을 입력하세요. : ");
					String sname = br.readLine();
					MemberData db = null;
					System.out.println("이름\t생년월일\tID\t핸드폰번호");
					for(MemberData data : list) {
						if(data.getName().equals(sname)) {
							db = data;
							System.out.println("===========================================================");
							System.out.print(db.getName() + "\t");
							System.out.print(db.getBirth() + "\t");
							System.out.print(db.getId() + "\t");
							System.out.print(db.getPhone() + "\n");
							System.out.println("===========================================================");
						}
					}
					
					System.out.println("첫 화면으로 돌아갑니다.");
				} catch(Exception e) {
					System.out.println(e.toString());
				}
				break;
			case "3" :
				System.out.println("\n<핸드폰 번호 검색>");
				try {
					System.out.print("찾을 핸드폰 번호를 입력하세요. : ");
					String sphone = br.readLine();
					MemberData db = null;
					System.out.println("이름\t생년월일\tID\t핸드폰번호");
					for(MemberData data : list) {
						if(data.getPhone().equals(sphone)) {
							db = data;
							System.out.println("===========================================================");
							System.out.print(db.getName() + "\t");
							System.out.print(db.getBirth() + "\t");
							System.out.print(db.getId() + "\t");
							System.out.print(db.getPhone() + "\n");
							System.out.println("===========================================================");
						}
					}
					
					System.out.println("첫 화면으로 돌아갑니다.");
				} catch(Exception e) {
					System.out.println(e.toString());
				}
				break;
			default :
				System.out.println("다시 선택해주세요.");
				break;
			}
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}

	/**
	 * printUserList - 회원리스트(manager 메뉴)
	 * 전체 회원리스트 : : 1.5버전의 for문으로 출력
	 */
	@Override
	public void printUserList() {
		System.out.println("\n<회원가입 명단>");
		System.out.println("전체인원수 : " + list.size());
		for(MemberData db : list) {
			System.out.print(db.getName() + "\t\t");
			System.out.print(db.getBirth() + "\t\t");
			System.out.print(db.getId() + "\t\t");
			System.out.print(db.getPhone() + "\n");
		}
		System.out.println();
	}

	/**
	 * userUpdate - 회원 정보수정
	 * 1. 내정보 2. 패스워드 수정 3. 핸드폰번호 수정
	 * 1. 내정보 : 내정보 출력(보기) - 접속해있는 userdb의 정보출력
	 * 2. 패스워드 수정 : 패스워드 한번 더 입력, 패스워드 수정(회원가입때와 제약조건 동일 : 문자+숫자 4자리 이상)
	 * 3. 핸드폰번호 수정 : 패스워드 한번 더 입력, 핸드폰번호 수정(회원가입떄와 제약조건 동일)
	 * 4. 이름, 생일, id 수정불가(생일과 id같은 경우는 고유의 값)
	 */
	@Override
	public void userUpdate() {
		if(userdb == null) {
			System.out.println("\n로그인이 필요합니다.");
			return;
		}
		System.out.println("\n<회원정보 수정>");
		
		System.out.println("1. 내정보 2. 패스워드 수정 3. 핸드폰번호 수정");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1 :
			System.out.println("이름\t생년월일\tID\t핸드폰번호");
			System.out.println("===========================================================");
			System.out.print(userdb.getName() + "\t");
			System.out.print(userdb.getBirth() + "\t");
			System.out.print(userdb.getId() + "\t");
			System.out.print(userdb.getPhone() + "\n");
			System.out.println("===========================================================");
			break;
		case 2 :
			try {
				MemberData db = readUser(userdb.getId());
				
				System.out.print("패스워드를 입력하세요.");
				String pwd = br.readLine();
				
				if(!db.getPwd().equals(pwd)) {
					System.out.println("패스워드가 일치하지 않습니다.");
					return;
				}
				
				System.out.println("수정할 패스워드");
				String newPassword = br.readLine();
				if(newPassword.length() < 4) {
					System.out.println("수정할 패스워드는 문자+숫자 4자리 수 이상입니다.");
					System.out.println("다시 시도해주세요.");
					return;
				} else {
					db.setPwd(newPassword);
					System.out.println("변경되었습니다.");
				}
				break;
			} catch(Exception e) {
				System.out.println(e.toString());
			}
			break;
		case 3 :
			try {
				MemberData db = readUser(userdb.getId());
			
				System.out.print("패스워드를 입력하세요.");
				String pwd = br.readLine();
			
				if(!db.getPwd().equals(pwd)) {
					System.out.println("패스워드가 일치하지 않습니다.");
					return;
				}
			
			System.out.println("수정할 핸드폰번호");
			String newPhone = br.readLine();
			String[] mobNum = newPhone.split("-");
			String Num1 = mobNum[0];
			String Num2 = mobNum[1];
			String Num3 = mobNum[2];
			if(!(Num1.equals("010"))) {
				System.out.println("핸드폰 번호는 010으로 시작합니다.");
				return;
			}
			if(!(Num2.length() == 4 && Num3.length() == 4)) {
				System.out.println("핸드폰 번호를 잘못 입력하셨습니다.");
				return;
			}
			db.setPhone(newPhone);
			System.out.println("변경되었습니다.");
			} catch(Exception e) {
				System.out.println(e.toString());
			}
			break;
		default :
			System.out.println("잘못 선택하셨습니다.");	
		}
	}
	
	/**
	 * userDelete - 회원탈퇴(user) 및 회원삭제(manager)
	 * 1. db1 = user, db2 = manager
	 * 2. 패스워드 한번 더 입력
	 * 3-1. db1일때 회원탈퇴 의사 물음 - list.remove(db1)으로 정보 삭제
	 * 3-2. db2일떄 삭제할 회원 물음 - 관리자 패스워드 입력 - list.remove(db1)으로 정보 삭제
	 */
	@Override
	public void userDelete() {
		
		MemberData db1 = readUser(userdb.getId());
		MemberData db2 = readUser("cm");
		
		try {
			if(userdb.getId() != "cm") {
				System.out.println("\n<회원탈퇴>");
				
				System.out.print("패스워드를 다시 입력하세요.");
				String pwd = br.readLine();
				
				if(! db1.getPwd().equals(pwd)) {
					System.out.println("패스워드가 일치하지 않습니다.");
					return;
				}
			} else if(userdb.getId() == "cm") {
				System.out.println("\n<회원삭제>");
				
				System.out.println("삭제할 아이디 :");
				db1 = readUser(br.readLine());
				if(db1 == null) {
					System.out.println("아이디가 존재하지 않습니다.");
					return;
				}
				System.out.print(db1.getId() + "\t");
				System.out.print(db1.getName() + "\t");
				System.out.print(db1.getPhone() + "\t\n");
				System.out.print("삭제할 아이디가 맞나요? [y/n] : ");
				String s1 = br.readLine();
				
				if(s1.equals("Y") || s1.equals("y")) {
					System.out.println("\n관리자 패스워드를 입력하세요.");
					String pwd = br.readLine();
					
					if(! db2.getPwd().equals(pwd)) {
						System.out.println("패스워드가 일치하지 않습니다.");
						return;
					}
				} else {
					System.out.println("삭제를 취소합니다.");
					return;
				}
			}
			
			list.remove(db1);
			
			if(userdb.getId() != "cm") {
				System.out.println("회원탈퇴가 처리 되었습니다.");
			} else {
				System.out.println("회원삭제가 처리 되었습니다.");
			}
		} catch(Exception e) {
			System.out.println(e.toString());
		}
		
		userdb = null;
		return;
	}
	
	
	
	/**
	 * readUser - 회원정보를 불러오기위한 메소드
	 * @param id - 입력받은 id
	 * @return db - 회원리스트 중 일치하는 회원의 db 리턴 
	 */
	private MemberData readUser(String id) {
		MemberData db = null;
		
		for(MemberData data : list) {
			if(data.getId().equals(id)) {
				db = data;
				break;
			}
		}
		return db;
	}
	
	
	
	/**
	 * loginMember - 로그인한 유저 정보리턴
	 * @return userdb
	 */
	public MemberData loginMember() {
		return userdb;
	}

	/**
	 * open - 도서관 개방시간
	 * Calendar 활용
	 * 개방유무 : boolean 활용
	 * 월~금 08:00~23:00
	 * 토,일 휴무
	 */
	@Override
	public boolean open() {
		boolean bool = true;
		System.out.println("도서관에 오신걸 환영합니다.");
		System.out.println("============================");
		System.out.println("<도서관 이용시간>");
		System.out.println("월~금 08:00 ~ 23:00");
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;	// 0 ~ 11
		int date = now.get(Calendar.DAY_OF_MONTH);
		int day = now.get(Calendar.DAY_OF_WEEK);	// 일(1)~토(7)
		int hours = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		String[] dayArr = {"", "일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println("현재 시간은 " + year + "년 " + month + "월 " 
					+ date + "일(" + dayArr[day] + ")" + hours + "시 " + minute + "분 입니다.");
		if(hours >= 11 || dayArr[day].equals("토") || dayArr[day].equals("일")) {
			System.out.println("도서관 이용시간은 월~금 08:00~23:00시 입니다.");
			System.out.println("12:00~13:00는 점심시간 입니다.");
			bool = false;
		}
		return bool;
		
	}

	
	/**
	 * close - 도서관 휴무안내
	 */
	@Override
	public void close() {
		System.out.println("도서관 개방시간에 찾아와주세요.");
	}

}
```
