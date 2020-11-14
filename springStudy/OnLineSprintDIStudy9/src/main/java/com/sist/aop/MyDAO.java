package com.sist.aop;
// AOP는 사용자 정의(x) => Transaction, 보안
/*	   
 *      // 스프링 AOP 프로그램 => 간단하나 분석하기 까다로움
 * 	   @Transectional
 * 	   public void allData(){
 * 			insert(); //입고
 *          insert(); // 재고
 *         }
 *         
 *      // Java 트랜잭션 코드 
 * 		public void allData(){
 * 			try{
 * 				--get Connection();
 * 				--conn.setAutoCommit(false);
 * 				insert(); // 입고
 * 				insert(); // 재고
 * 				--conn.commit();
 * 			catch(Exception ex){
 * 				--conn.rollback();
 * 				}
 * 			finally{
 * 				--conn.setAutoCommit(true);
 * 				--disConnection();
 * 				}
 * 	
 */
public class MyDAO {
	public void getConnection(){
		System.out.println("오라클 연결 ...");
	}
	public void disConnecition(){
		System.out.println("오라클 연결 종료 ....");
	}
	public void select (String name){
		getConnection();
		System.out.println("SELECT 문장 실행...");   // 핵심 모듈
		disConnecition();
	}
	public void insert(){
		getConnection();
		System.out.println("INSERT 문장 실행...");  
		disConnecition();
	}
	public void update(){
		getConnection();
		System.out.println("UPDATE 문장 실행...");
		disConnecition();
	}
	public void print(){
		System.out.println("완료");
	}
}

// 공통 모듈 - 자동 호출
