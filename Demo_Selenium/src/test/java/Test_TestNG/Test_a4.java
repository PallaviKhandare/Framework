package Test_TestNG;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;



public class Test_a4 extends BrowserO_C {
	
	
	
	@Test
	public void Test_1() {
		WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
		txt_email.sendKeys("xyz@gmail.com");
		
		WebElement txt_password=driver.findElement(By.xpath("//input[@name='pass']"));
		txt_password.sendKeys("123456");
		
		WebElement btn_login=driver.findElement(By.xpath("//button[@name='login']"));
		btn_login.click();
		
	}
	



}
