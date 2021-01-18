package com.sist.mapper;


import java.util.*;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;

import com.sist.dao.BoardVO;


public interface BoardMapper {
	
	
	@Select("SELECT boardnumber,name,subject,pwd,content,hit,regdate FROM project1_board")
	public List<BoardVO> boardListData(Map map);
	
	// �Խ���1 �������� 8���� �߶��� �� �������� ��
	@Select("SELECT CEIL(COUNT(*)/8.0) FROM project1_board")
	public int boardTotalPage();
	
	// �Խ���1 �۹�ȣ �ڵ�����, �۾��� �������߰�
	@SelectKey(keyProperty="boardnumber",resultType=int.class,before=true,
			statement="SELECT NVL(MAX(boardnumber)+1,1) as boardnumber FROM project1_board")
	@Insert("INSERT INTO project1_board(boardnumber,name,subject,pwd,content) "
			+"VALUES(#{boardnumber},#{name},#{subject},#{pwd},#{content})")
	public void boardInsert(BoardVO vo);
	
	// �Խ���1 ��ȸ������
	@Update("UPDATE project1_board SET "
			+"hit=hit+1 "
			+"WHERE boardnumber=#{boardnumber}")
	public void boardHitIncrement(int boardnumber);
	
	// �Խ���1 �󼼺���
	@Select("SELECT * FROM project1_board WHERE boardnumber=#{boardnumber}")
	public BoardVO boardDetailData(int boardnumber);
	
	// �Խ���1 ����
	@Update("UPDATE project1_board SET content=#{content}, subject=#{subject} WHERE boardnumber=#{boardnumber} AND pwd=#{pwd}")
	public void boardUpdate(Map map);
	
	// �Խ���1 ���� 
	@Delete("DELETE FROM project1_board "
			+"WHERE boardnumber=#{boardnumber}")
	public void boardDelete(int boardnumber);

}