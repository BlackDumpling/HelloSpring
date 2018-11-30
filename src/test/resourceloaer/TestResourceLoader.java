package test.resourceloaer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.flychicken.sp.resourceloader.ResourceLoader;

import test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestResourceLoader extends UnitTestBase {
	public TestResourceLoader() {
		super("/com/flychicken/sp/resourceloader/spring-reourceloader.xml"); // TODO Auto-generated constructor stub
	}
	@Test
	public void testloader() {
		ResourceLoader loader = super.getBean("resourceLoader");
		loader.loader();
	}
}
