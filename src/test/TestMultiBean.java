package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.flychicken.sp.multibean.BeanInvoker;

import test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestMultiBean extends UnitTestBase {
	public TestMultiBean() {
		super("/com/flychicken/sp/multibean/Spring-multibean.xml");
	}

	@Test
	public void testMulti() {
		BeanInvoker invoker = super.getBean("beanInvoker");
		invoker.say();
	}
}
