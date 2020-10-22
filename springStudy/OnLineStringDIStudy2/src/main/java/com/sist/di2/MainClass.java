package com.sist.di2;


import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainClass {
   public static void main(String[] args) {
      ApplicationContext app = new ClassPathXmlApplicationContext("app2.xml");
      
      EmpDAO dao = (EmpDAO)app.getBean("empDAO");      // @Repository 불일 때 @Repository("dao")처럼 별도로 이름붙이지 않으면 클래스이름이 bean이름 (첫글자는 소문자로)
      List<EmpVO> list = dao.empAllData();
      for(EmpVO vo : list){
         System.out.println(vo.getEmpno() + vo.getEname() + vo.getJob() + vo.getSal());
      }
   
   
   }
}