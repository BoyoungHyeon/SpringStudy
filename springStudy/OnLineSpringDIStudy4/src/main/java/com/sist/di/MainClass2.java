package com.sist.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass2 {

   public static void main(String[] args) {
      AnnotationConfigApplicationContext app=
            new AnnotationConfigApplicationContext(Config1.class,Config2.class);
      Sawon s=(Sawon)app.getBean("sawon");//Config1의 Bean에 설정된 key로 찾아옴
      System.out.println(s.getName());
      System.out.println(s.getDept());
      System.out.println(s.getJob());
      
      System.out.println();
      
      Member m=(Member)app.getBean("member");
      System.out.println(m.getName());
      System.out.println(m.getAddr());
      System.out.println(m.getTel());

   }

}