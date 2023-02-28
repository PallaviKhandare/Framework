package Com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_KeyActions {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/login/");
		 driver.manage().window().maximize();
		 
		 WebElement element=driver.findElement(By.xpath("//input[@type='text']"));
		 Actions act=new Actions(driver);
		 
		 // input from lower case to upper case
		 
		 act.keyDown(element, Keys.SHIFT).sendKeys("pallavi").keyUp(Keys.SHIFT).build().perform();
		 
		 // Select
		 act.keyDown(Keys.CONTROL ).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		 // copy
		 act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		 
		 WebElement pass=driver.findElement(By.xpath("//div[@class='_55r1 _1kbt']"));
		 //paste
		 act.keyDown(pass, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		 
		 //click on login button
		 WebElement button=driver.findElement(By.xpath("//button[@id='loginbutton']"));
		 button.sendKeys(Keys.ENTER);
		 driver.quit();
		 

	}

}
