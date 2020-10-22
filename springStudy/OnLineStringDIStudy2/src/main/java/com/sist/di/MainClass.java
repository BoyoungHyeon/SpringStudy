package com.sist.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
   public static void main(String[] args) {
      AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(ApplicationConfig.class);
      
      // 등록된 클래스를 관리 = > 클래스가 필요할 때 마다 App을 토해서 객체 주소를 얻어온다.
      
      Sawon s1= app.getBean("sa",Sawon.class);// 제네릭스 방법으로 꺼내온다.
      // (Sawon)app.getBean("sa")  object형반환  그러므로 형변환을 시켜준다 
      
      
      System.out.println("이름 :"+s1.getName());
      System.out.println("주소 :"+s1.getAddr());
      System.out.println("번호 :"+s1.getTel());
   }
}