package test.injection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.flychicken.sp.injection.InjectionService;

import test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {
	public TestInjection() {
		super("/com/flychicken/sp/injection/spring-injection.xml");
	}
	@Test
	public void testSeter() {
		InjectionService service = super.getBean("injectionService");
		service.save("保存这个数据");
	}
	@Test
	public void testConer() {
		InjectionService service = super.getBean("injectionService");
		service.save("22222222222");
	}
}
