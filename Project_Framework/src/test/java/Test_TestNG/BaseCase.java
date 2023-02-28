package Test_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseCase {
	//public static WebDriver driver;
	//@BeforeMethod
	//public void setup() {
	//WebDriverManager.chromedriver().setup();
   // driver=new ChromeDriver();
	//driver.get("https://www.facebook.com/login/");
	//driver.manage().window().maximize();
	//}
	
	//@AfterMethod
	//public void tearDown() {
//		driver.close();
	//}
	 public static WebDriver driver;
		@Parameters("BrowserName")
		@BeforeMethod
		
		public void setup(String BrowserName) {
			if(BrowserName.equalsIgnoreCase("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();	
			}
		
		 else if(BrowserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		 else if(BrowserName.equalsIgnoreCase("FireFox")) {
			 WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		 }
			driver.get("https://www.facebook.com/login/");
			driver.manage().window().maximize();
		}
		
	     @AfterMethod
	     public void tearDown() {
	    	 driver.close();
	     }
	}


