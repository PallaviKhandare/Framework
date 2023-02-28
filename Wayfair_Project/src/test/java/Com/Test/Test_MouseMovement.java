package Com.Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_MouseMovement {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		//MoveToElement
		
		Actions act=new Actions(driver);
		//WebElement element=driver.findElement(By.xpath("//a[text()='Agile Project']"));
		//act.moveToElement(element).click().build().perform();
		
		//Right Click
		//WebElement Right_Click=driver.findElement(By.xpath("//span[text()='right click me']"));
		//act.contextClick(Right_Click).build().perform();
		
		//DoubleClick
		WebElement Double=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		act.doubleClick(Double).build().perform();
		
		//Alert
		Alert alt=driver.switchTo().alert();
		alt.accept();
		

	}

}
