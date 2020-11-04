package com.sist.dao;
import java.util.*;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
public interface BoardMapper {
  // ��� ���
  // <select> => @Select ==> XML�� ��ü ������̼� 
  @Select("SELECT no,subject,name,regdate,hit,num "
		 +"FROM (SELECT no,subject,name,regdate,hit, rownum as num "
		 +"FROM (SELECT no,subject,name,regdate,hit "
		 +"FROM spring_board ORDER BY 1 DESC)) "
		 +"WHERE num BETWEEN #{start} AND #{end}")
  public List<BoardVO> boardListData(Map map);
  @Select("SELECT CEIL(COUNT(*)/10.0) FROM spring_board")
  public int boardTotalPage();
  // ������ �߰� 
  @SelectKey(keyProperty="no",resultType=int.class,before=true,
		    statement="SELECT NVL(MAX(no)+1,1) as no FROM spring_board")
  @Insert("INSERT INTO spring_board(no,name,subject,content,pwd) "
		 +"VALUES(#{no},#{name},#{subject},#{content},#{pwd})")
  public void boardInsert(BoardVO vo);
  // �󼼺��� 
  @Update("UPDATE spring_board SET "
		 +"hit=hit+1 "
		 +"WHERE no=#{no}")
  public void boardHitIncrement(int no);
  @Select("SELECT no,name,subject,content,regdate,hit "
		 +"FROM spring_board "
		 +"WHERE no=#{no}")
  public BoardVO boardDeteilData(int no);
  // ���� 
  // ����  
  @Delete("DELETE FROM spring_board "
		 +"WHERE no=#{no}")
  public void boardDelete(int no);
}