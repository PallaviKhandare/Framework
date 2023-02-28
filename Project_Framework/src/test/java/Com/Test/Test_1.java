package Com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import Com.Pages.LoginPage;
import Com.Utility.Base_Class;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_1 extends Base_Class {
	//public static void main(String[] args) {
	//	WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/login/");
		//driver.manage().window().maximize();
	public void Test_1() {
	
		LoginPage login=PageFactory.initElements(driver, LoginPage.class);
		login.getTxt_email().sendKeys("Test@123");
		login.getTxt_pass().sendKeys("12345");
		login.getButton().click();
		

	}

}
