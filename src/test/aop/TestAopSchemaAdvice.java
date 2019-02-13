package test.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.flychicken.sp.aop.sehema.advice.Fit;
import com.flychicken.sp.aop.sehema.advice.FitImpl;
import com.flychicken.sp.aop.sehema.advice.biz.AspectBiz;

import test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAopSchemaAdvice extends UnitTestBase {
	public TestAopSchemaAdvice() {
		super("/com/flychicken/sp/aop/sehema/advice/spring-aop-schema-advice.xml");
	}

	@Test
	public void testBiz() {
		AspectBiz biz = super.getBean("aspectBiz");
		biz.biz();
	}
	@Test
	public void testBizinit() {
		AspectBiz biz = super.getBean("aspectBiz");
		biz.init("wwww", 99);
	}
	
	@Test
	public void testFit() {
		Fit fitImpl=(Fit)super.getBean("aspectBiz");
		fitImpl.filter();
	}
}
