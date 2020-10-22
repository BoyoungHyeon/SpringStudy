package com.sist.di;

import javax.annotation.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
   // Ŭ����
   @Bean("sa")
   public Sawon sawonInfo()
   {
      Sawon sa = new Sawon();
      sa.setName("ȫ�浿");
      sa.setAddr("����");
      sa.setTel("010-1111-1111");
      
      return sa;
   }
   @PostConstruct
   /*
    *  �޼ҵ� ȣ��
    *  	  ��ü ������ : init-method (@PostConstruct)
    *              ==========DB (����̹� ���)
    *    ��ü �Ҹ�� : destory-method (@PreDestroy)
    *              ==========DB (disConnection)
    *              
    *   DI
    *    = setterDI
    *    = methodDI (init-method, destory-method)
    *    = constructor DI ������ �Ű����� �� ����
    *    = �ڵ� ����
    */
   public void init()
   {
      System.out.println("=========��� ���� ==========");
      
   }
   
   @PreDestroy
   public void destory()
   {
      System.out.println("=========================");
   }
}