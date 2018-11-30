package test.autowiring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.flychicken.sp.autowiring.AutoWiringService;

import test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAutoWiring extends UnitTestBase {
	public TestAutoWiring() {
		super("/com/flychicken/sp/autowiring/spring-autowiring.xml");
	}

	@Test
	public void testAutoWiring() {
		AutoWiringService service = super.getBean("autoWiringService");
		service.saysth("123456");
	}
}
