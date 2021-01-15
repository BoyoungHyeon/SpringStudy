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
	
	// �Խ���1 ��� �б�
	public List<BoardVO> boardListData(Map map) {
		return mapper.boardListData(map);
	}

	// �Խ���1 �������� �б�
	public int boardTotalPage() {
		return mapper.boardTotalPage();
	}

	// �Խ���1 ��ȸ������,�󼼺���
	public BoardVO boardDetailData(int no) {
		mapper.boardHitIncrement(no);
		return mapper.boardDetailData(no);
	}

	// �Խ���1 �߰�
	public void boardInsert(BoardVO vo) {
		mapper.boardInsert(vo);
	}

	// �Խ���1 ����
	public void boardUpdate(Map map) {
		mapper.boardUpdate(map);
	}

	// �Խ���1 ����
	public void boardDelete(int no) {
		mapper.boardDelete(no);
	}

}