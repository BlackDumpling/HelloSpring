package com.flychicken.sp.resourceloader;

import javax.annotation.Resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ResourceLoader implements ApplicationContextAware{
private ApplicationContext ctx;
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.ctx=arg0;
		
	}
	
	public void loader() {
		System.out.println("loafer=====");
		Resource resource = (Resource) ctx.getResource("url:https://upload-images.jianshu.io/upload_images/313937-3574958438e8ae73.png");
		System.out.println(resource.name());
	}

}
