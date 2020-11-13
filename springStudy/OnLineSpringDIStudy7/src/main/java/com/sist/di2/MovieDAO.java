package com.sist.di2;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;
import java.util.*;
@Repository
public class MovieDAO extends SqlSessionDaoSupport{

	@Override
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// TODO Auto-generated method stub
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	//ssf
	public List<MovieVO> movieListData(){
		return getSqlSession().selectList("movieListData");
	}
}
