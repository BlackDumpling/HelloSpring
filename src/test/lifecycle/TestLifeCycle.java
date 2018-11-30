package test.lifecycle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.flychicken.sp.lifecycle.LifeCycleBean;

import test.base.UnitTestBase;
@RunWith(BlockJUnit4ClassRunner.class)
public class TestLifeCycle extends UnitTestBase {
	public TestLifeCycle() {
		super("/com/flychicken/sp/lifecycle/spring-lifecycle.xml");
	}
	@Test
	public void TestLife() {
		LifeCycleBean bean = super.getBean("ilfeCycleBean");
	}
}
