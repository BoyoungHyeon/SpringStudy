package com.sist.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;
import com.sist.dao.*;
/*
 *    public void display()
 *    {
 *        @Autowired (X)
 *        BoardDAO dao;
 *    }
 */
@Controller
public class BoardController {
   // 1. ���������κ��� �ʿ��� Ŭ���� ��ü�� �޾� �д� 
   // ���������� ������ ��ü �ּҸ� ���� ��쿡 => ���������� ��� �� �� ���� 
	/*
	 *    CONSTRUCTOR, FIELD, METHOD, PARAMETER
	 *    
	 *    class A
	 *    {
	 *        @Autowired
	 *        B b;  ===> FIELD
	 *        @Autowired
	 *        public void display(B b)
	 *        {
	 *        }
	 *        @Autowired
	 *        public A(B b)
	 *        {
	 *           
	 *        }
	 *        
	 *        public void display(@Autowired B b, @Autowired C c)
	 *        {
	 *        }
	 *    }
	 */
	@Autowired
	private BoardDAO dao;
	@RequestMapping("board/list.do")
	public String board_list(String page,Model model)
	{
		
		return "board/list";// forward ,sendRedirect => return "redirect:.do";
	}
	@RequestMapping("board/insert.do")
	public String board_insert()
	{
		return "board/insert";
	}
	@RequestMapping("board/insert_ok.do")
	public String board_insert_ok(BoardVO vo)
	{
		dao.boardInsert(vo);
		return "redirect:list.do";
	}
}
