package Test_2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutUsingSendkeys {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement Email=driver.findElement(By.xpath("//input[@name='email']"));
		WebElement Password=driver.findElement(By.xpath("//input[@name='pass']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='BugSpotter'",Email);
		js.executeScript("arguments[0].value='29051999'",Password);
		
		
		
		

	}

}
