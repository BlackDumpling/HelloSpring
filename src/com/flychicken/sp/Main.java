package com.flychicken.sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.flychicken.sp.injection.InjectionService;
import com.flychicken.sp.injection.InjectionServiceImpl;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"/com/flychicken/sp/injection/spring-injection.xml");
		InjectionService injectionService = (InjectionService) applicationContext.getBean("injectionService");
		injectionService.save("sdasdasdfafsf");
	}
}
