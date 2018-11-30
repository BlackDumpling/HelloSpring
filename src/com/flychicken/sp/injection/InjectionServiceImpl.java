package com.flychicken.sp.injection;

public class InjectionServiceImpl implements InjectionService {
	private InjectionDao injectionDao;
	/**
	 * 构造器注入
	 * @param injectionDao
	 */
	 public InjectionServiceImpl(InjectionDao injectionDao) {
		 this.injectionDao = injectionDao;
	}
	/**
	 * setter注入
	 * @param injectionDao
	 */
	public void setInjectionDao(InjectionDao injectionDao) {
		this.injectionDao = injectionDao;
	}

	

	@Override
	public void save(String arg) {
		System.out.println("service接受到+"+arg);
		injectionDao.saveData(arg);
	}

}
