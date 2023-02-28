package Test_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Liabrary;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebPageScrolling {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		//find WebElement
		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys(Liabrary.getTestData("Sheet1", 0, 0));
		
		
		
		System.out.println(Liabrary.getTestData("Sheet1", 0, 0));
		//Liabrary.getTestData("Sheet1", 0, 1);

	}

}
