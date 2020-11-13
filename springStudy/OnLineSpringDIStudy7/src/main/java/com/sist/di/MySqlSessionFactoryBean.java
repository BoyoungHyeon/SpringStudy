package com.sist.di;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

/*
 <bean id="ssf" class="org.mybatis.spring.SqlSessionFactoryBean"
   p:dataSource-ref="ds"
   p:configLocation="classpath:Config.xml"
 />
 */

@Component
//ID : MySqlSessionFactoryBean
/*
 *  라이브러리 => xml (공통 사용 부분)
 *  사용자 정의 => Annotation 
 */
public class MySqlSessionFactoryBean extends SqlSessionFactoryBean{

   @Autowired//CONSTRUCTOR(생성자), FIELD(멤버변수), METHOD(메소드), PARAMETER(매개변수)*
   public void setDataSource(DataSource dataSource) {
      // TODO Auto-generated method stub
      super.setDataSource(dataSource);
   }

   public MySqlSessionFactoryBean(){
      try{
         Resource res=new ClassPathResource("Config.xml");
         setConfigLocation(res);
      }catch(Exception ex){}
   }
}