package com.flychicken.sp.bean_annotation.injection;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class InjectionDaoImpl implements InjectionDao{

	@Override
	public void saveData(String arg) {
		System.out.println("Dao保存数据："+arg);
	}

}
