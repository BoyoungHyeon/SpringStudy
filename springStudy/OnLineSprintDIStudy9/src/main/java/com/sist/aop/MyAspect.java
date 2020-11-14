package com.sist.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// 공동 모듈
@Aspect
@Component
public class MyAspect {
	@Autowired
	private MyDAO dao;
	@Before("execution(* com.sist.aop.MyDAO.db_*())")
	public void before(){
		dao.getConnection();
	}
	@After("execution(* com.sist.aop.MyDAO.db_*())")
	public void after(){
		dao.disConnecition();
	}
}
