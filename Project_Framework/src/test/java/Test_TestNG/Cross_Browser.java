package Test_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Cross_Browser extends BaseCase {
	
	@Test
	public void Test_1() {
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("Test123@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("234254");
		
		WebElement button=driver.findElement(By.xpath("//button[@id='loginbutton']"));
		button.click();
		
	}
	
	

}
