---
layout:     post
title:      "Library_Data"
subtitle:   " \"Java Stuty\""
date:       2021-04-03 12:00
author:     "Chungman"
catalog: true
tags:
    - Java_Study
    - Java_Project
---

## BookData
```
package MyLibrarySystem;
/**
 * 책의 정보를 담고있는 클래스
 * @author 충만
 *
 */
public class BookData {
	private String genre, name, author;
	private int stock;
	private boolean rental;
	
	public boolean isRental() {
		return rental;
	}
	public void setRental(Boolean rental) {
		this.rental = rental;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}
```

## MemberData
```
package MyLibrarySystem;
/**
 * user(사용자)와 manager(관리자)의 정보를 담고있는 클래스
 * @author 충만
 *
 */
public class MemberData {

	private String id, pwd, name, birth, phone;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
```
