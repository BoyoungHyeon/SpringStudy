package com.sist.aop;
// AOP�� ����� ����(x) => Transaction, ����
/*	   
 *      // ������ AOP ���α׷� => �����ϳ� �м��ϱ� ��ٷο�
 * 	   @Transectional
 * 	   public void allData(){
 * 			insert(); //�԰�
 *          insert(); // ���
 *         }
 *         
 *      // Java Ʈ����� �ڵ� 
 * 		public void allData(){
 * 			try{
 * 				--get Connection();
 * 				--conn.setAutoCommit(false);
 * 				insert(); // �԰�
 * 				insert(); // ���
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
		System.out.println("����Ŭ ���� ...");
	}
	public void disConnecition(){
		System.out.println("����Ŭ ���� ���� ....");
	}
	public void select (String name){
		getConnection();
		System.out.println("SELECT ���� ����...");   // �ٽ� ���
		disConnecition();
	}
	public void insert(){
		getConnection();
		System.out.println("INSERT ���� ����...");  
		disConnecition();
	}
	public void update(){
		getConnection();
		System.out.println("UPDATE ���� ����...");
		disConnecition();
	}
	public void print(){
		System.out.println("�Ϸ�");
	}
}

// ���� ��� - �ڵ� ȣ��
