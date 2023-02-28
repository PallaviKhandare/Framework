package Com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
	
	WebDriverManager.chromedriver().setup();
     driver=new ChromeDriver();
     driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfb%20sign%20up%7C&placement=&creative=589");
     driver.manage().window().maximize();
     
	}
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
