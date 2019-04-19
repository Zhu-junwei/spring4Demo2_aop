package com.zhujunwei.spring.demo3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectXml {
	
	/**
	 *  前置通知
	 * @param joinpoint
	 */
	public void checkPri(JoinPoint joinpoint) {
		System.out.println("权限校验*****"+joinpoint);
	}
	
	/**
	 *  后置通知
	 *  可以获取方法的返回值
	 */
	public void writeLog(Object result) {
		System.out.println("日志记录******"+result);
	}
	
	/**
	 * 	环绕通知
	 * @param joinPoint
	 * @return
	 * @throws Throwable
	 */
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("环绕前通知*****");
		Object object = joinPoint.proceed();
		System.out.println("环绕后通知*****");
		return object;
	}
	
	/**
	 * 异常抛出通知
	 */
	public void afterThrowing(Throwable ex) {
		System.out.println("异常抛出通知*****"+ex.getMessage());
	}
	
	public void after() {
		System.out.println("最终通知**********");
	}
}
