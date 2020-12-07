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
	
	
	// 반려동물 자랑하기 List
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
		
		System.out.println("반려동물 게시판 리스트 출력");
		return "pet/list";
	}
	
	
	// 쿠키 저장 
	@RequestMapping("pet/detail_before.do")
	public String pet_detail_before(HttpServletRequest request, HttpServletResponse response) {
		String no = "";
	try {
		
		
		System.out.println("쿠키생성 모델");
		
		// 글번호 no와 세션의 id 출력
		no = request.getParameter("no");
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		
		// 쿠키 생성 
		Cookie cookie = new Cookie(id+"diary" + no, no);				// 쿠키의 키는 (세션아이디 + 글번호)  값은 글번호
		cookie.setMaxAge(60);
		cookie.setPath("/");
		response.addCookie(cookie);
		System.out.println("쿠키이름 : " + cookie.getName() + "값 : " + cookie.getValue());
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	return "redirect:../pet/detail.do?no=" + no;		// 글번호에 해당하는 detail.do로 리다이렉트
}
	
	
	
	@RequestMapping("pet/detail.do")
	public String pet_detail(Model model, String no, HttpSession session, HttpServletRequest request){
		
		try {
			
			PetVO pet_vo = dao.petDetailData(Integer.parseInt(no));
			
			dao.petHitIncrement(Integer.parseInt(no));
			
			List<Pet_replyVO> reply_list = dao.pet_listReply(Integer.parseInt(no));
			
			if(session.getAttribute("id") != null){
			
				// 스크랩 버튼 활성화 여부
				session=request.getSession();
				String id=(String)session.getAttribute("id");
				Pet_scrapVO svo=new Pet_scrapVO();
				svo.setId(id);
				svo.setMno(Integer.parseInt(no));
				int count=dao.scrapCount(svo);
				
				model.addAttribute("count", count);
				
				
				// 쿠키 ---------------------------------------------------------------------------------------------------
				session=request.getSession();
	//			String id=(String)session.getAttribute("id");
				// 쿠키 읽기
				Cookie[] cookies=request.getCookies();							// 쿠키 배열 생성
				List<PetVO> cookie_list=new ArrayList<PetVO>();					// 쿠키를 담을 리스트 생성
				if(cookies!=null)												// 쿠키가 비어있지 않으면
				{
					for(int i=cookies.length-1;i>=0;i--)						// (쿠키길이 - 1)부터 0까지 i를 1씩 감소 (그래야 최신 쿠키가 맨앞에 옴)
					{
						if(cookies[i].getName().startsWith(id + "diary"))							// 쿠키배열의 이름이 id를 시작하면
						{
							String cookie_no=cookies[i].getValue();								// 변수 no에 쿠키값 넣기
							DiaryVO vo = dao.petDetailData(Integer.parseInt(cookie_no));		// vo에 상세보기를 담아서
							cookie_list.add(vo);													// 쿠키배열에 vo 담기
						}
					}
				}
				model.addAttribute("cookie_list", cookie_list);										// 쿠키값이 담긴 리스트를 전송
			}
			
			
			// 워드클라우드 -----------------------------------------------------------------------------------------
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