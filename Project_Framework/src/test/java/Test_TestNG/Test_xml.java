package Test_TestNG;

import org.testng.annotations.Test;

public class Test_xml {
	
	@Test(groups= {"sanity"})
	public void m1() {
		System.out.println("m1");
	}
	
	@Test(groups= {"sanity"})
	public void m2() {
		System.out.println("m2");
	}
	
	@Test(priority=4,groups= {"sanity"})
	public void m3() {
		System.out.println("m3");
	}
	
	@Test(priority=3,groups= {"Regration"})
	public void m4() {
		System.out.println("m4");
	}
	
	@Test(priority=2,groups= {"Regration"})
	public void m5() {
		System.out.println("m5");
	}

}
