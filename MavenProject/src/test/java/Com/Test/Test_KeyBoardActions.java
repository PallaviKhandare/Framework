package Com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_KeyBoardActions {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
		//input in lower case
		act.keyDown(Email, Keys.SHIFT).sendKeys("pallavikhandare").keyUp(Keys.SHIFT).build().perform();
		//select
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		//Copy
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		//webelement
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		//Paste
		act.keyDown(pass, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();

	}

}
