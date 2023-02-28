package Com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Javascript {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		

		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		js.executeScript("arguments[0].values='rutuja'",email);
		Thread.sleep(3000);

		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		js.executeScript("arguments[0].values='12345'", pass);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@name='login']")).click();


		
	}

}

	


