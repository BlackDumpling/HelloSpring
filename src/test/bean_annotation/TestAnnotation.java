package test.bean_annotation;

import javax.sound.midi.VoiceStatus;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.flychicken.sp.bean_annotation.BeanAnnotation;
import com.flychicken.sp.bean_annotation.injection.InjectionService;


import test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAnnotation extends UnitTestBase {
	public  TestAnnotation() {
		super("/com/flychicken/sp/bean_annotation/spring-beanannotation.xml");
	}
	@Test
	public void testdd() {
		BeanAnnotation annotation = super.getBean("beanAnnotation");
		annotation.say("ddsssdsdfs");
	}
	@Test
	public void TestAnnota() {
		InjectionService injectionServiceImpl = super.getBean("injectionServiceImpl");
		injectionServiceImpl.save("pppooo");
	}

}
