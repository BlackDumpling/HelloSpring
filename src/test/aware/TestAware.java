package test.aware;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.flychicken.sp.aware.AwareBean;

import test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAware extends UnitTestBase {
	public TestAware() {
		super("/com/flychicken/sp/aware/spring-aware.xml");
	}
	@Test
	public void Testaware() {
		AwareBean bean = super.getBean("awareBean");
		System.out.println("testAware:"+bean.hashCode());
	}
}
