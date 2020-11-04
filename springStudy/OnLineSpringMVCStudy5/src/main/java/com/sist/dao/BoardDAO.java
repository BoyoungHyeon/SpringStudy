package com.sist.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository
public class BoardDAO {
	@Autowired
    private BoardMapper mapper;
	// ��� �б�
	public List<BoardVO> boardListData(Map map)
	{
		return mapper.boardListData(map);
	}
	// �������� �б�
	public int boardTotalPage()
	{
		return mapper.boardTotalPage();
	}
	// �󼼺��� 
	public BoardVO boardDetailData(int no)
	{
		mapper.boardHitIncrement(no);
		return mapper.boardDeteilData(no);
	}
	// �߰� 
	public void boardInsert(BoardVO vo)
	{
		mapper.boardInsert(vo);
	}
}