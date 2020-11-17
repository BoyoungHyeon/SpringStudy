package com.sist.web;
/*
 *   1. ������Ʈ ���� 
 *      ������Ʈ�� => ��Ű�� ����(3���̻�)
 *   2. �ڹ� ���� ���� 
 *   2-2. pom.xml(���̺귯�� �߰�)
 *        =======
 *        ���̺귯���� ���� ��� : mvnrepository.com �˻��� �߰� 
 *   3. web.xml ���� 
 *   4. application-context.xml ����
 *      �ڹٷ� ���� 
 *   5. �ڹ� (Model , DAO , VO) => html
 *   
 */
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sist.dao.*;
@Controller
public class EmpController {
   @Autowired
   private EmpDAO dao;
   @GetMapping("emp/list.do")
   public String emp_list(Model model)
   {
	   List<EmpVO> list=dao.empListData();
	   model.addAttribute("list", list);
	   return "emp/list";
   }
   @GetMapping("emp/detail.do")
   public String emp_detail(int empno,Model model)
   {
	   EmpVO vo=dao.empDetailData(empno);
	   model.addAttribute("vo", vo);
	   
	   dao.deptInsert(90, "�����", "��õ");
	   return "emp/detail";
   }
}

