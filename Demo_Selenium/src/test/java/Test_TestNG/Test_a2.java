package Test_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePagePom;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_a2 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void BrowserLaunch() {
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		driver.manage().window().maximize();
			
	}
	@Test
	public void Test_1() {
		HomePagePom home=PageFactory.initElements(driver, HomePagePom.class);
		home.getAddress().sendKeys("Ganga nagar");
		home.getStreet_Address().sendKeys("XYZ");
		home.getStreet_Address2().sendKeys("Optional");
		home.getCity().sendKeys("pune");
		home.getState().sendKeys("Maharashtra");
		home.getZip_code().sendKeys("431051");
		
	}
	
	@Test
	public void Test_2() {
		HomePagePom home=PageFactory.initElements(driver, HomePagePom.class);
		home.getAddress().sendKeys("Ganga nagar");
		home.getStreet_Address().sendKeys("XYZ");
		home.getStreet_Address2().sendKeys("Optional");
		home.getCity().sendKeys("pune");
		home.getState().sendKeys("Maharashtra");
		home.getZip_code().sendKeys("431051");
		
	}
	
	@Test
	public void Test_3() {
		HomePagePom home=PageFactory.initElements(driver, HomePagePom.class);
		home.getAddress().sendKeys("Ganga nagar");
		home.getStreet_Address().sendKeys("XYZ");
		home.getStreet_Address2().sendKeys("Optional");
		home.getCity().sendKeys("pune");
		home.getState().sendKeys("Maharashtra");
		home.getZip_code().sendKeys("431051");
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
