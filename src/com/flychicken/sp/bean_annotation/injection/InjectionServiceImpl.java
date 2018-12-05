package com.flychicken.sp.bean_annotation.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Service
public class InjectionServiceImpl implements InjectionService {
	private InjectionDao injectionDao;
	/**
	 * 构造器注入
	 * @param injectionDao
	 */
//	 public InjectionServiceImpl(InjectionDao injectionDao) {
//		 this.injectionDao = injectionDao;
//	}
	/**
	 * setter注入
	 * @param injectionDao
	 */
	 @Autowired
	public void setInjectionDao(InjectionDao injectionDao) {
		this.injectionDao = injectionDao;
	}

	

	@Override
	public void save(String arg) {
		System.out.println("service接受到+"+arg);
		injectionDao.saveData(arg);
	}

}
