package com.sist.di;
// ������ DI ==> ��ü �����ÿ� ������ �ް������� ���� ä����
/*
 * 	  XML, Annotation => �������� ��û
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
		System.out.println("�̸�:"+name);
		System.out.println("�ּ�:"+addr);
		System.out.println("��ȭ:"+tel);
	}
}
