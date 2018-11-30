package test.tscope;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.flychicken.sp.tscope.BeanScope;

import test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestScope extends UnitTestBase {
	public TestScope() {
		super("/com/flychicken/sp/tscope/spring-beanscope.xml");
	}
	
	@Test
	public void testScope() {
		BeanScope scope = super.getBean("beanscope");
		scope.say();
		BeanScope scopew = super.getBean("beanscope");
		scopew.say();
	}
	@Test
	public void testScopew() {
		BeanScope scope = super.getBean("beanscope");
		scope.say();
	}
}
