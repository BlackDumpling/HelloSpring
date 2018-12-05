package com.flychicken.sp.bean_annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("singleton")
@Component
public class BeanAnnotation {
	public void say(String string) {
		System.out.println("beanannotation==="+string);
	}
}
