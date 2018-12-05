package com.flychicken.sp.bean_annotation.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StoreConfig {
	@Bean(name="getStringStore",initMethod="init",destroyMethod="destory")
	public Store getStringStore() {
		return new StringStore();
	}
}
