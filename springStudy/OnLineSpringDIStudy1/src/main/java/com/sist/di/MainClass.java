package com.sist.di;

public class MainClass {
	public MainClass() {
		// TODO Auto-generated constructor stub
		Sawon s=new Sawon();
		s.setName("ȫ�浿");
		s.setSex("����");
		s.setAge(20);
		// DI (������ ����)
		s.init();
		s.print();
	}
}
