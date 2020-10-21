package com.sist.di;

public class MainClass {
	public MainClass() {
		// TODO Auto-generated constructor stub
		Sawon s=new Sawon();
		s.setName("홍길동");
		s.setSex("남자");
		s.setAge(20);
		// DI (의존성 주입)
		s.init();
		s.print();
	}
}
