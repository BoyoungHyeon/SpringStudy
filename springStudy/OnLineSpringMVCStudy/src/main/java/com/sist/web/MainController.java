package com.sist.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// MVC=> ModelŬ���� ���� : ��ûó�� => ����� ����(B)
/*
 *    Model 
 *     ===================
 *      = ~VO
 *      = ~DAO
 *      = ~Manager
 *      = ~Controller
 *     =================== ����   ===> Model + View = ���� (DispatcherServlet)
 *    View 
 *      = CSS
 *      = JS
 *      = JSP
 *      = HTML
 *     =================== ����
 *     
 *     1. ���α׷� => ���°��� (�����Ͱ���) : ���� (����,Ŭ����)
 *        var , val (kotlin)
 */
// 1. �� �޴� ��� 
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MainController {
    // ID,Password
	// 1. �Է��ϴ� JSP
	@RequestMapping("main/output.do")
	// �ް������� DispatcherServlet�� �������ش� (������ �������)
	public String main_output(HttpServletRequest request)
	{
		// ������ 2.5 ���� => request 
		// ������ 2.5 �̻� => ���� => request�� ������� �ʴ´� 
		// ���� (request�ȿ��� �������� IP�� Ȯ���� ����) => 5.0�̻� (Ŭ����)
		// ������ ó�� => ���� (JSP)
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		
		request.setAttribute("id", id);
		request.setAttribute("pwd", pwd);
		return "main/output"; 
		/*
		 *   return "" => forward
		 *   return "������/JSP��"
		 *          "main/main" ==> .jsp�� �����Ѵ�
		 *   return "" => sendRedirect
		 *          "redirect:main.do"
		 */
	}
	
	@RequestMapping("main/input.do")
	public String main_input()
	{
		return "main/input";
	}
	// ���� ==> Model
	@RequestMapping("main/output2.do")
	// MemberVO vo
	public String main_output2(String id,String pwd,Model model)
	{
		// Model => �������̽� (�ش� JSP�� ������ ���� ����)
		// ����
		model.addAttribute("id", id);
		model.addAttribute("pwd", pwd);
		// Spring => ��û�� �޴� ��� => �Ű������� �޴´� , ���۽ÿ��� Model�� �̿��ؼ� ����
		/*
		 *        public class Model
		 *        {
		 *           HttpServletRequest request;
		 *           public void addAttribute(String key,Object obj)
		 *           {
		 *               request.setAttribute(key,obj) => DispatcherServlet
		 *           }
		 *        }
		 */
		return "main/output2";
	}
}