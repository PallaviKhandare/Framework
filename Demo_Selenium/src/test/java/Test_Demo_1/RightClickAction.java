package Test_Demo_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickAction {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.guru99.com/selenium-tutorial.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//span[@class='nav-drop-title-wrap']"));
		act.moveToElement(element).click().build().perform();

	}

}
