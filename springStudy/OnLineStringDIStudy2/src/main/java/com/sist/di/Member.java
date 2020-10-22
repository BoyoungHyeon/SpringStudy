package com.sist.di;
// 생성자 DI ==> 객체 생성시에 생성자 메개변수에 값을 채워라
/*
 * 	  XML, Annotation => 스프링에 요청
 */
public class Member {
	private String name;
	private String addr;
	private String tel;
	public Member(String name, String addr, String tel){
		this.name = name;
		this.addr = addr;
		this.tel = tel;
	}
	public void print(){
		System.out.println("이름:"+name);
		System.out.println("주소:"+addr);
		System.out.println("전화:"+tel);
	}
}
