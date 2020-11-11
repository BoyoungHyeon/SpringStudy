package com.sist.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/*
 * 		@RequestMapping("main/emp1.do")
 * 		@RequestMapping("main/emp2.do")
 * 		@RequestMapping("main/emp3.do")
 * 		@RequestMapping("main/emp4.do")
 * 		@RequestMapping("main/emp5.do")
 * 
 * 		전송 ==> GET ==> main/emp5.do
 * 
 * 		@GetMapping("main/emp1.do")
 * 		@GetMapping("main/emp2.do")
 * 		@PostMapping("main/emp3.do")
 * 		@PostMapping("main/emp4.do")
 * 		@PostMapping("main/emp5.do")
 * 		
 * 		변수 4개 == 4byte
 * 		byte 4개
 * 		int 4개(O)
 * 
 */
@Controller
@RequestMapping("main/")
public class MainController {
	/*@RequestMapping("main/emp.do")
	public String main_emp(){
		return "main/emp"; // 입력 폼
	}
	@RequestMapping("main/emp_ok.do")
	public String main_emp_ok(EmpVO vo, Model model){
		model.addAttribute("vo", vo);
		return "main/emp_ok"; //request를 전송 => foward
	}*/
	// <a> : GET
	@GetMapping("emp.do")
	public String main_emp(){
		return "emp"; //입력 폼
	}
	// <form>, ajax
	@PostMapping("emp_ok.do")
	public String main_emp_ok(EmpVO vo, Model model){
		model.addAttribute("vo", vo);
		return "emp_ok"; //request를 전송 => forward
	}
}
