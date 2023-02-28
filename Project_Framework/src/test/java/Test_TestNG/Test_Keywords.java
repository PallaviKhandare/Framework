package Test_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Keywords {

		
		@Test(priority=1,dependsOnMethods="p2")
		public void p1() {
			System.out.println("p1");
		}

		@Test(priority=2)
		public void p2() {
			System.out.println("p2");
			Assert.assertFalse(true);
		}
		
		@Test(priority=3,invocationCount=3)
		public void p3() {
			System.out.println("p3");
		}
		
		@Test(priority=4,enabled=false)
		public void p4() {
			System.out.println("p4");
		}
		
		@Test(priority=5)
		public void p5() {
			System.out.println("p5");
		}

	}


