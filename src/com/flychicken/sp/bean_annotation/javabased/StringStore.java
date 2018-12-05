package com.flychicken.sp.bean_annotation.javabased;

public class StringStore implements Store{

	@Override
	public String say() {
		
		return this.getClass().getName();
	}
	
	public void init() {
		System.out.println("init method");
	}
	
	public void destory() {
		System.out.println("destory method");
	}

}
