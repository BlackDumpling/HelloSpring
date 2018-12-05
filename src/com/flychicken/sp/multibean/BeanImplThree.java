package com.flychicken.sp.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(value=3)
@Component
public class BeanImplThree implements MultiBeanFace{

	@Override
	public String say() {
		
		return this.getClass().getName();
	}

}
