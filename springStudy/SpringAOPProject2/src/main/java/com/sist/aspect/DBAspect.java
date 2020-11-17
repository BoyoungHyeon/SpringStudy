package com.sist.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/*
 *   @Aspect => ������ => DAO���� ������ ������ ��� �ش�(�޸� �Ҵ��� ���� �ʴ´�)
     @Component => �޸� �Ҵ�
 */
import com.sist.dao.*;
/*
 *    public List<EmpVO> empListData()
 *    {
 *         try
 *         {
 *             getConnection() ==> Before
 *             ------- SQL => ���� => ����� => List,VO
 *             -------
 *             -------
 *         }catch(Exception e)
 *         {
 *             e.printStackTrace() After-Throwing
 *         }
 *         finally
 *         {
 *             disConnection() => After
 *         }
 *         
 *    }
 *    
 *    �ڵ� ȣ�� 
 *    ===============================
 *    1. ���� ===> PointCut
 *    2. ��� ==> JoinPoint
 *    =============================== Advice
 *    Advice => ������ => Aspect
 */
@Aspect
@Component
public class DBAspect {
   @Autowired
   private DBConnection dbConn;
   
   @Before("execution(* com.sist.dao.EmpDAO.emp*(..))")
   public void before()
   {
	   dbConn.getConnection();
   }
   @After("execution(* com.sist.dao.EmpDAO.emp*(..))")
   public void after()
   {
	   dbConn.disConnection();
   }
   /*
    * 	Around 
    * 	1. �ڵ�ȣ�� 
    * 		�ٽ��ڵ� SQL���� ����
    * 	2. �ڵ� ȣ�� commit()
    * 
    */
   @Around("execution(* com.sist.web.EmpController.*(..))")
   public Object around(ProceedingJoinPoint jp) throws Throwable{
	   Object obj=null;
	   System.out.println("����� ȣ����:"+jp.getSignature().getName());
	   obj=jp.proceed();
	   System.out.println("����� ȣ�� ��:"+jp.getSignature().getName());
	   return obj;
   }
   @AfterReturning(value="execution(* com.sist.web.EmpController.*(..))",returning="val")
   public void afterReturning(JoinPoint jp,Object val){
	   System.out.println("���ϰ�:"+val);
   }
   
   @AfterThrowing(value="execution(* com.sist.web.EmpController.*(..))",throwing="ex")
   public void afterThrowing(Throwable ex){
	   System.out.println(ex.getMessage());
   }
}

