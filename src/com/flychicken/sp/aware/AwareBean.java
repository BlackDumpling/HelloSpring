package com.flychicken.sp.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AwareBean implements BeanNameAware, ApplicationContextAware {
	private String beanName;
	private ApplicationContext context;
	

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("setApplicationContext---"+arg0.getBean(beanName).hashCode());
	}

	@Override
	public void setBeanName(String arg0) {
		this.beanName = arg0;
		System.out.println("setBeanName --- "+arg0);

	}

}
