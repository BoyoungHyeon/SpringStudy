package com.sist.di4;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.sist.di2.*;
import com.sist.di3.*;

@Component
public class MainClass {
	@Resource(name="sa")
	private Sawon sa;
	@Resource(name="mem")
	private Member mem;
	public static void main(String[] args) {
		// 초기화
//		MainClass mc=new MainClass();
		AnnotationConfigApplicationContext app=
				new AnnotationConfigApplicationContext(AppConfig.class);
		MainClass mc=(MainClass)app.getBean("mainClass");
		System.out.println("======= 사원 정보 =======");
		System.out.println(mc.sa.getName());
		System.out.println(mc.sa.getDept());
		System.out.println("======= 회원 정보 =======");
		System.out.println(mc.mem.getName());
		System.out.println(mc.mem.getTel());
	}
	
}
