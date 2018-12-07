package com.flychicken.sp.bean_annotation.javabased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("/com/flychicken/sp/bean_annotation/javabased/config.xml")
public class StoreConfig {
	@Value("${url}")
	private String url;
	@Value("${userName}")
	private String userName;
	@Value("${passWord}")
	private String passWord;
	 @Bean
	public MyDriverManager myDriverManager() {
		return new MyDriverManager(url, userName, passWord);
	}
	
	
	
//	@Bean(name = "getStringStore", initMethod = "init", destroyMethod = "destory")
//	public Store getStringStore() {
//		return new StringStore();
//	}
}
