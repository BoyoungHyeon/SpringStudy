package com.sist.dao;

import java.util.*;

public class Pet_replyVO {
	private int no,diary_no,gi,gs,gt,root,depth;
	private String id,content,msg;
	private Date regdate;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getDiary_no() {
		return diary_no;
	}
	public void setDiary_no(int diary_no) {
		this.diary_no = diary_no;
	}
	public int getGi() {
		return gi;
	}
	public void setGi(int gi) {
		this.gi = gi;
	}
	public int getGs() {
		return gs;
	}
	public void setGs(int gs) {
		this.gs = gs;
	}
	public int getGt() {
		return gt;
	}
	public void setGt(int gt) {
		this.gt = gt;
	}
	public int getRoot() {
		return root;
	}
	public void setRoot(int root) {
		this.root = root;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
}