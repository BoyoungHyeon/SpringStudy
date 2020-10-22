package com.sist.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
   public static void main(String[] args) {
      AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(ApplicationConfig.class);
      
      // ��ϵ� Ŭ������ ���� = > Ŭ������ �ʿ��� �� ���� App�� ���ؼ� ��ü �ּҸ� ���´�.
      
      Sawon s1= app.getBean("sa",Sawon.class);// ���׸��� ������� �����´�.
      // (Sawon)app.getBean("sa")  object����ȯ  �׷��Ƿ� ����ȯ�� �����ش� 
      
      
      System.out.println("�̸� :"+s1.getName());
      System.out.println("�ּ� :"+s1.getAddr());
      System.out.println("��ȣ :"+s1.getTel());
   }
}