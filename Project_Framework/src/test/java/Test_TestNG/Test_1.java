package Test_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_1 {
	
	@BeforeSuite
	public void bs() {
		System.out.println("BS");
		
	}
	@BeforeClass
	public void bc() {
		System.out.println("BC");
	}
	
	@BeforeTest
	public void bt() {
		System.out.println("BT");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("BM-----Browser open");
	}
	
	@Test
	public void Test1() {
		System.out.println("Test_1");
	}
	
	@Test
	public void Test2() {
		System.out.println("Test_2");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("AM-------Browser Close");
	}
	
	@AfterTest
	public void AT() {
		System.out.println("AT");
	}
	
	@AfterClass
	public void AC() {
		System.out.println("AC");
	}
	
	@AfterSuite
	public void AS() {
		System.out.println("AS");
	}
	
	

}
