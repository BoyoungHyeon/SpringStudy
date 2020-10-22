package com.sist.di2;


import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainClass {
   public static void main(String[] args) {
      ApplicationContext app = new ClassPathXmlApplicationContext("app2.xml");
      
      EmpDAO dao = (EmpDAO)app.getBean("empDAO");      // @Repository ���� �� @Repository("dao")ó�� ������ �̸������� ������ Ŭ�����̸��� bean�̸� (ù���ڴ� �ҹ��ڷ�)
      List<EmpVO> list = dao.empAllData();
      for(EmpVO vo : list){
         System.out.println(vo.getEmpno() + vo.getEname() + vo.getJob() + vo.getSal());
      }
   
   
   }
}