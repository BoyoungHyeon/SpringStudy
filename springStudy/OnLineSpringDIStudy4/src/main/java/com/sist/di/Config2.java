package com.sist.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config2 {
	@Bean("member")
	public Member memberInfo(){
		Member m=new Member();
		m.setName("√·«‚¿Ã");
		m.setAddr("¥∫øÂ");
		m.setTel("010-0000-0000");
		
		return m;
	}
}
