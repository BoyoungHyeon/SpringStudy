package com.sist.web;

import java.io.File;

import java.util.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.sist.dao.DiaryVO;
import com.sist.dao.Diary_replyVO;
import com.sist.dao.Diary_scrapVO;
import com.sist.dao.PetDAO;
import com.sist.dao.PetVO;
import com.sist.dao.Pet_replyVO;
	
@Controller
public class PetController {
	@Autowired
	private PetDAO dao;
	
	
	// �ݷ����� �ڶ��ϱ� List
	@RequestMapping("pet/list.do")
	public String pet_list(String page, Model model) {
		if(page==null)
			page="1";
		int curpage=Integer.parseInt(page);
		Map map=new HashMap();
		int rowSize=8;
		int start=(rowSize*curpage)-(rowSize-1);
		int end=rowSize*curpage;
		int BLOCK=5;
		int startPage=((curpage-1)/BLOCK*BLOCK)+1;
		int endPage=((curpage-1)/BLOCK*BLOCK)+BLOCK;
		int totalpage=dao.petTotalPage();
		map.put("start", start);
		map.put("end", end);
		if(endPage>totalpage) {
			endPage=totalpage;
		}
		List<PetVO> list=dao.petListData(map);
		model.addAttribute("list",list);
		model.addAttribute("curpage",curpage);
		model.addAttribute("totalpage",totalpage);
		model.addAttribute("startPage", startPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("BLOCK", BLOCK);
		
		System.out.println("�ݷ����� �Խ��� ����Ʈ ���");
		return "pet/list";
	}
	
	
	// ��Ű ���� 
	@RequestMapping("pet/detail_before.do")
	public String pet_detail_before(HttpServletRequest request, HttpServletResponse response) {
		String no = "";
	try {
		
		
		System.out.println("��Ű���� ��");
		
		// �۹�ȣ no�� ������ id ���
		no = request.getParameter("no");
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		
		// ��Ű ���� 
		Cookie cookie = new Cookie(id+"diary" + no, no);				// ��Ű�� Ű�� (���Ǿ��̵� + �۹�ȣ)  ���� �۹�ȣ
		cookie.setMaxAge(60);
		cookie.setPath("/");
		response.addCookie(cookie);
		System.out.println("��Ű�̸� : " + cookie.getName() + "�� : " + cookie.getValue());
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	return "redirect:../pet/detail.do?no=" + no;		// �۹�ȣ�� �ش��ϴ� detail.do�� �����̷�Ʈ
}
	
	
	
	@RequestMapping("pet/detail.do")
	public String pet_detail(Model model, String no, HttpSession session, HttpServletRequest request){
		
		try {
			
			PetVO pet_vo = dao.petDetailData(Integer.parseInt(no));
			
			dao.petHitIncrement(Integer.parseInt(no));
			
			List<Pet_replyVO> reply_list = dao.pet_listReply(Integer.parseInt(no));
			
			if(session.getAttribute("id") != null){
			
				// ��ũ�� ��ư Ȱ��ȭ ����
				session=request.getSession();
				String id=(String)session.getAttribute("id");
				Pet_scrapVO svo=new Pet_scrapVO();
				svo.setId(id);
				svo.setMno(Integer.parseInt(no));
				int count=dao.scrapCount(svo);
				
				model.addAttribute("count", count);
				
				
				// ��Ű ---------------------------------------------------------------------------------------------------
				session=request.getSession();
	//			String id=(String)session.getAttribute("id");
				// ��Ű �б�
				Cookie[] cookies=request.getCookies();							// ��Ű �迭 ����
				List<PetVO> cookie_list=new ArrayList<PetVO>();					// ��Ű�� ���� ����Ʈ ����
				if(cookies!=null)												// ��Ű�� ������� ������
				{
					for(int i=cookies.length-1;i>=0;i--)						// (��Ű���� - 1)���� 0���� i�� 1�� ���� (�׷��� �ֽ� ��Ű�� �Ǿտ� ��)
					{
						if(cookies[i].getName().startsWith(id + "diary"))							// ��Ű�迭�� �̸��� id�� �����ϸ�
						{
							String cookie_no=cookies[i].getValue();								// ���� no�� ��Ű�� �ֱ�
							DiaryVO vo = dao.petDetailData(Integer.parseInt(cookie_no));		// vo�� �󼼺��⸦ ��Ƽ�
							cookie_list.add(vo);													// ��Ű�迭�� vo ���
						}
					}
				}
				model.addAttribute("cookie_list", cookie_list);										// ��Ű���� ��� ����Ʈ�� ����
			}
			
			
			// ����Ŭ���� -----------------------------------------------------------------------------------------
			nm.naverData(pet_vo.getSubject());
			
			rm_diary.graph(Integer.parseInt(no));
			
			
			
			
			
			model.addAttribute("pet_vo", pet_vo);
			model.addAttribute("reply_list", reply_list);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return "pet/detail";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String pet_detail(String no, Model model) {
		PetVO vo=dao.petDetailData(Integer.parseInt(no));
		model.addAttribute("vo", vo);
		return "pet/detail";
	}
	
	@GetMapping("pet/insert.do")
	public String pet_insert() {
		return "pet/insert";
	}
	
	
	
	
	
	
	
	
	
}