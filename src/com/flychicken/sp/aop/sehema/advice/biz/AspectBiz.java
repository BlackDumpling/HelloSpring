package com.flychicken.sp.aop.sehema.advice.biz;

public class AspectBiz {
	public void biz() {
		System.out.println("AcpectBiz biz");
	}
	
	public void init(String name,int age) {
		System.out.println("AspectBiz init");
	}
}
