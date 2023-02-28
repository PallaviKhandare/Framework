package Test_Demo_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/telecom/index.html");
		driver.manage().window().maximize();

		//mouse hover
		Actions act=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//a[text( )='Selenium']"));
		act.moveToElement(element).build().perform();
	}

}
