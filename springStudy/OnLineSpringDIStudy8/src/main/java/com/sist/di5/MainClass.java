package com.sist.di5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		// xml �Ľ��ҋ��� genericxml �� ����ؾ���
		GenericXmlApplicationContext app=
				new GenericXmlApplicationContext("app.xml");
//		ApplicationContext app=
//				new ClassPathXmlApplicationContext("app.xml");
		Sawon sa1=(Sawon)app.getBean("sa");
		// ��� ����(Scope) => �̱���, Prototype
		Sawon sa2=(Sawon)app.getBean("sa");
		System.out.println("sa1:"+sa1);
		System.out.println("sa2:"+sa2);;
		sa1.print();
		app.close();
	}
}
