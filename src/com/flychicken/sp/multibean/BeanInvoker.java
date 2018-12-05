package com.flychicken.sp.multibean;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanInvoker {
	@Autowired
	private List<MultiBeanFace> list;
	@Autowired
	private Map<String, MultiBeanFace> map;

	public void say() {
		if (list != null && list.size() != 0) {
			for (MultiBeanFace multiBeanFace : list) {
				System.out.println(multiBeanFace.say());
			}
		} else {
			System.out.println("List<MultiBeanFace>==null=========");
		}
		
		System.out.println("===================");
		if (map != null && map.size() != 0) {
			for(Map.Entry<String, MultiBeanFace> entry : map.entrySet()) {
				System.out.println(entry.getValue().say());
			}
		} else {
			System.out.println("map<MultiBeanFace>==null=========");
		}
	}

}
