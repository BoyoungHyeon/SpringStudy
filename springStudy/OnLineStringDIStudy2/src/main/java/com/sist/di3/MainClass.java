package com.sist.di3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public MainClass() {
		// TODO Auto-generated constructor stub
		AnnotationConfigApplicationContext app=
				new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Member m=app.getBean("mem", Member.class);
		m.print();
	}
}
