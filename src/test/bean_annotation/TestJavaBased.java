package test.bean_annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.flychicken.sp.bean_annotation.javabased.MyDriverManager;
import com.flychicken.sp.bean_annotation.javabased.StringStore;

import test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestJavaBased extends UnitTestBase {
	public TestJavaBased() {
		super("/com/flychicken/sp/bean_annotation/spring-beanannotation.xml");
	}
	
	@Test
	public void Test23() {
		StringStore store = super.getBean("getStringStore");
		System.out.println(store.say());;
	}
	@Test
	public void TestDriver() {
		MyDriverManager store = super.getBean("myDriverManager");
		System.out.println(store.getClass().getName());;
	}
}
