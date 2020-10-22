package com.sist.di;

import javax.annotation.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
   // 클래스
   @Bean("sa")
   public Sawon sawonInfo()
   {
      Sawon sa = new Sawon();
      sa.setName("홍길동");
      sa.setAddr("서울");
      sa.setTel("010-1111-1111");
      
      return sa;
   }
   @PostConstruct
   /*
    *  메소드 호출
    *  	  객체 생성시 : init-method (@PostConstruct)
    *              ==========DB (드라이버 등록)
    *    객체 소멸시 : destory-method (@PreDestroy)
    *              ==========DB (disConnection)
    *              
    *   DI
    *    = setterDI
    *    = methodDI (init-method, destory-method)
    *    = constructor DI 생성자 매개변수 값 주입
    *    = 자동 주입
    */
   public void init()
   {
      System.out.println("=========사원 정보 ==========");
      
   }
   
   @PreDestroy
   public void destory()
   {
      System.out.println("=========================");
   }
}