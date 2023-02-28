package Test_2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Liabrary;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollTest {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		//scroll--pixel,Element
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
    	Thread.sleep(4000);
		//Scroll--Element
     //	WebElement element=driver.findElement(By.xpath("//li[text()='English (UK)']"));
	    //	js.executeScript("argument[0].scrollIntoView();", element);
     	
	  //  Thread.sleep(4000);
     	
		//genric
	//	Liabrary.ScrollToElement(driver, element);

	}

}
