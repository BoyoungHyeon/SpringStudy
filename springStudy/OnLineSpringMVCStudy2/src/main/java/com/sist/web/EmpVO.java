package com.sist.web;
/*
 * 		1. 단일 변수
 * 		2. VO 단위
 * 		3. [] checkbox
 * 		4. List 단위
 * 
 */
public class EmpVO {
	private String empno;
	private String ename;
	private String job;
	private String dept;
	private String loc;
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
