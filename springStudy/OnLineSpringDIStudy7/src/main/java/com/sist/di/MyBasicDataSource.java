package com.sist.di;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.stereotype.Component;

// 데이터베이스 정보
// 메모리 할당
/*
 * @Component : 일반 클래스
 * @Repository : 저장소(DataBase와 관련) => DAO
 * =======================Web
 * @Controller : Model ==> return 사이트 주소 (JSP 파일 명)
 * @RestController : Model => return 일반 문자열 (ajax, json..)
 * @Service : Manager, DAO가 여러개일때 묶어서 사용
 */
@Component
// ID => myBatisDatSource
public class MyBasicDataSource extends BasicDataSource {
	public MyBasicDataSource(){
		setDriverClassName("oracle.jdbc.driver.OracleDriver");
		setUrl("jdbc:oracle:thin:@211.238.142.195:1521:XE");
		setUsername("hr");
		setPassword("happy");
	}
}