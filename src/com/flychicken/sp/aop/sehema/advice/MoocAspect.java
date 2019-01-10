package com.flychicken.sp.aop.sehema.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class MoocAspect {
	public void before() {
		System.out.println("MoocAspect before!");
	}
	
	public Object around(ProceedingJoinPoint pJoinPoint) {
		Object object = null;
		try {
			System.out.println("around 1");
			object=pJoinPoint.proceed();
			System.out.println("around 2");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}
	
	public Object aroundInit(ProceedingJoinPoint pJoinPoint,String name,int age) {
		System.out.println("aroundInit-"+name+"-"+age);
		Object object = null;
		try {
			System.out.println("aroundInit 1");
			object=pJoinPoint.proceed();
			System.out.println("aroundInit 2");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}
}
