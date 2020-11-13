package com.sist.di;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.stereotype.Component;

// �����ͺ��̽� ����
// �޸� �Ҵ�
/*
 * @Component : �Ϲ� Ŭ����
 * @Repository : �����(DataBase�� ����) => DAO
 * =======================Web
 * @Controller : Model ==> return ����Ʈ �ּ� (JSP ���� ��)
 * @RestController : Model => return �Ϲ� ���ڿ� (ajax, json..)
 * @Service : Manager, DAO�� �������϶� ��� ���
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