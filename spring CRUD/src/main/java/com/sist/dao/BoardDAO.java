package com.sist.dao;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sist.mapper.BoardMapper;
import com.sist.vo.empVO;

@Repository
public class BoardDAO {
	
	@Autowired
	private BoardMapper mapper;
	
	// 게시판1 목록 읽기
	public List<BoardVO> boardListData(Map map) {
		return mapper.boardListData(map);
	}

	// 게시판1 총페이지 읽기
	public int boardTotalPage() {
		return mapper.boardTotalPage();
	}

	// 게시판1 조회수증가,상세보기
	public BoardVO boardDetailData(int no) {
		mapper.boardHitIncrement(no);
		return mapper.boardDetailData(no);
	}

	// 게시판1 추가
	public void boardInsert(BoardVO vo) {
		mapper.boardInsert(vo);
	}

	// 게시판1 수정
	public void boardUpdate(Map map) {
		mapper.boardUpdate(map);
	}

	// 게시판1 삭제
	public void boardDelete(int no) {
		mapper.boardDelete(no);
	}

}