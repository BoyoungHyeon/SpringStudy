package com.sist.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
// app.xml
@Configuration
@ComponentScan(basePackages={"com.sist.di"})
public class AppConfig {
/*
 * 	�޸� �Ҵ�
 * @Component : �Ϲ� Ŭ���� (Sawon, MainClass..)
 * @Repository : DAO
 * @Controller : Model
 * @Service : Manager, DAO+DAO
 * @RestController : ���� ���� ���� ���ڿ� ����(Ajax, React...)
 * ==========> Spring
 *           =========
 *           1. DI, Controller ����
 *           2. AOP VS OOP
 *           3. DAO VS Service
 * ����(Inject) (�޸𸮿� ����� ��ü �ּҸ� ������ �� �� ���), �Ϲ� ������ ����� �� �̾���
 *  = @Autowired : ���������� ����� Ŭ�����߿� �´� �ּ� ã�Ƽ� �ڵ� ����
 *  ==============
 *  = @Resource 
 *  = @Qualifier
 *  = @Inject
 *  ==============
 *  @ComponentScan(basePackages={"com.sist.di"})
 */
}


