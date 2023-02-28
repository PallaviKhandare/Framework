package Test_Demo_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_FB_Login {

	public static void main(String[] args) {
		
		//Browser Open
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		//Identify Webelement--Locators--->ID-->Action
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("Pallavi@gmail.com");
		
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("29051999");
		
		//Locator--name
		WebElement loginbtn=driver.findElement(By.id("loginbutton"));
		loginbtn.click();
		
		

	}

}
