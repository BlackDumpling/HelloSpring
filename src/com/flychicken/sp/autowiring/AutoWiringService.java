package com.flychicken.sp.autowiring;

public class AutoWiringService {
	private AutoWiringDao autoWiringDao;


	
	public void setAutoWiringDao(AutoWiringDao autoWiringDao) {
		this.autoWiringDao = autoWiringDao;
	}



	public void saysth(String ss) {
		System.out.println("service say=="+ss+"dao-- ");
		autoWiringDao.wiring(ss);
	}

}
