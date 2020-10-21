package com.sist.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass2 {
	public MainClass2() {
		// xml ÆÄ½Ì
		ApplicationContext app=
				new ClassPathXmlApplicationContext("app.xml");
		Sawon sa=(Sawon)app.getBean("sa");
		sa.init();
		sa.print();
		
		Sawon sa1=(Sawon)app.getBean("sa");
		System.out.println("sal="+sa1);
		sa.init();
		sa.print();
	}
}	
