package com.sist.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config1 {
	@Bean("sawon")
	public Sawon sawonInfo(){
		Sawon s=new Sawon(); // 객체 생성
		// DI
		s.setName("이순신");
		s.setDept("개발부");
		s.setJob("과장");
		
		return s;
	}
}
