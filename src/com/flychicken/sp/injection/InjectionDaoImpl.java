package com.flychicken.sp.injection;

public class InjectionDaoImpl implements InjectionDao{

	@Override
	public void saveData(String arg) {
		System.out.println("保存数据："+arg);
	}

}
