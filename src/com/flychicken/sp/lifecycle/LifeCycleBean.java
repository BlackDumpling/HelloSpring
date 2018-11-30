package com.flychicken.sp.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleBean implements InitializingBean,DisposableBean{
	public void xmlinit() {
		System.out.println("配置文件初始化方法");
	}
	public void xmldestory() {
		System.out.println("配置文件销毁bean方法");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean  destroy");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean  afterpropertiesSet");
		
	}
}
