package com.flychicken.sp.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(value=222)
@Component
public class BeanImplTwo implements MultiBeanFace{

	@Override
	public String say() {
		
		return this.getClass().getName();
	}

}
