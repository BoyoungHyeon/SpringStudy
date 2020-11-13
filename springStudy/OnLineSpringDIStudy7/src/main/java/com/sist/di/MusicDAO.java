package com.sist.di;
// ���������� ���� 
/*
 * 	���������� ���� ���(���� ������ ����ϴ� ���)
 * 	 1) DAO
 *   2) Manager
 *   ================Web���� ���
 *   3) Model
 *   4) Service
 * 
 */
import java.util.*;
/*
 * 	BasicDataSource => SqlSessionFactoryBean => MusicDAO
 *  ����Ŭ ����                       Connection            => PreparedStatement, ResultSet
 * 
 */

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
// ID : MusicDAO
public class MusicDAO extends SqlSessionDaoSupport{
	
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// TODO Auto-generated method stub
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	public List<MusicVO> musicListData(){
		return getSqlSession().selectList("musicListData");
	}
}
