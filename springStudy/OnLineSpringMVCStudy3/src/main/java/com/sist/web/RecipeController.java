package com.sist.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sist.dao.RecipeDAO;
import com.sist.dao.RecipeVO;

/*
 *      MVC 
 *      ====
 *        ������ 
 *        =====
 *               DispatcherServlet
 *               ========== ��޺� 
 *          �մ� ==== ����  ========> �ֹ� (Model)
 *              �ֹ�              �ֹ��� 
 *          �մ�<====     <======== �ֹ�
 *                        ���� (request,session)
 *          xml,annotation => �޴��� 
 */
import java.util.*;
@Controller
public class RecipeController {
	@Autowired
    private RecipeDAO dao;
	
	// ����ڰ� ��û�� ���� �� ó�� 
	// �� => ����� ��û (URL�ּ�)  ==> �����ּ�(X) ==> URI  ==> .do
	@RequestMapping("recipe/list.do")
	// ����� ��û ó�� 
	public String recipe_list(String page,Model model)
	{
		if(page==null)
			page="1";
		int curpage=Integer.parseInt(page);
		// ������ �ޱ� => ���������� �޸� �Ҵ�=>�Ѱ��� ���� (����) = �̱���
		int rowSize=20;
		int start=(rowSize*curpage)-(rowSize-1);
		int end=rowSize*curpage;
		// Map���� ä���� => DAO�� ���� 
		Map map=new HashMap();
		map.put("start", start);
		map.put("end", end);
		List<RecipeVO> list=dao.recipeListData(map);
		for(RecipeVO vo:list)
		{
			String title=vo.getTitle();
			if(title.length()>22)
			{
				title=title.substring(0,22);
				title+="...";
			}
			vo.setTitle(title);
		}
		// �������� 
		int totalpage=dao.recipeTotalPage();
		
		// ���� 
		model.addAttribute("curpage", curpage);
		model.addAttribute("totalpage", totalpage);
		model.addAttribute("list", list);
		return "recipe/list";// forward => list.jsp=>request�� ���� 
	}
	/*
	 *    @RequestMapping() => ���� (GET,POST)
	 *    @GetMapping => Get������� ���� 
	 *                   <a> ,sendRedirect() , location.href
	 *    @PostMapping => ajax , form
	 */
	@GetMapping("recipe/chef.do")
	public String recipe_chef(String page,String chef,Model model)
	{
		// DB����
		if(page==null)
			page="1";
		int curpage=Integer.parseInt(page);
		int rowSize=20;
		int start=(rowSize*curpage)-(rowSize-1);
		int end=rowSize*curpage;
		Map map=new HashMap();
		map.put("start", start);
		map.put("end", end);
		map.put("chef", chef);
		List<RecipeVO> list=dao.recipeChefData(map);
		for(RecipeVO vo:list)
		{
			String title=vo.getTitle();
			if(title.length()>22)
			{
				title=title.substring(0,22);
				title+="...";
			}
			vo.setTitle(title);
		}
		// �������� 
		int totalpage=dao.recipeChefTotalPage(chef);
		
		// ���� 
		model.addAttribute("curpage", curpage);
		model.addAttribute("totalpage", totalpage);
		model.addAttribute("chef", chef);
		model.addAttribute("list", list);
		return "recipe/chef";
	}
	
}