package com.sist.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
// app.xml
@Configuration
@ComponentScan(basePackages={"com.sist.di"})
public class AppConfig {
/*
 * 	메모리 할당
 * @Component : 일반 클래스 (Sawon, MainClass..)
 * @Repository : DAO
 * @Controller : Model
 * @Service : Manager, DAO+DAO
 * @RestController : 파일 전송 없이 문자열 전송(Ajax, React...)
 * ==========> Spring
 *           =========
 *           1. DI, Controller 개념
 *           2. AOP VS OOP
 *           3. DAO VS Service
 * 주입(Inject) (메모리에 저장된 객체 주소를 가지고 올 때 사용), 일반 변수는 사용할 ㅅ ㅜ없다
 *  = @Autowired : 스프링에서 저장된 클래스중에 맞는 주소 찾아서 자동 주입
 *  ==============
 *  = @Resource 
 *  = @Qualifier
 *  = @Inject
 *  ==============
 *  @ComponentScan(basePackages={"com.sist.di"})
 */
}


