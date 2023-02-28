package Com.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeHandleByIndex {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/pallavi%20khandare/OneDrive/Documents/Iframe.html");
		driver.manage().window().maximize();
		
		//driver.switchTo().frame(1);   //By Index Method
		driver.switchTo().frame("Selenium");   //By Name
		//WebElement Selenium_Frame=driver.findElement(By.xpath("//span[@class='navbar-logo']"));
		//driver.switchTo().frame(Selenium_Frame); 
		Thread.sleep(2000);
		WebElement Menu_Bar=driver.findElement(By.xpath("//button[@class='navbar-toggler']"));
		Menu_Bar.click();
		//WebElement element=driver.findElement(By.xpath("//a[text()='Braintree Core']"));
		//element.click();
		//driver.switchTo().defaultContent();
		//driver.switchTo().frame("MVN");
		//Thread.sleep(2000);
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("Window.ScrollBy(0,600)", "");

	}

}
