package Test_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_a3 {
	
	@Test(priority=-1)
	public void testa() {
		System.out.println("TEST A");
		Assert.assertTrue(false);//fail
	}
	
	@Test(priority=0,dependsOnMethods="testa")
	public void testz() {
		System.out.println("TEST Z");
	}
	
	@Test(priority=3,enabled=false)
	public void testb() {
		System.out.println("TEST B");
	}
	
	@Test(priority=4,invocationCount=2)
	public void testg() {
		System.out.println("TEST G");
	}
	
	

}
