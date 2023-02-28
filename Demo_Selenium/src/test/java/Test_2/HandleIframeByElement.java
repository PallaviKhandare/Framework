package Test_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleIframeByElement {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Desktop/Class%20Notes/Java%20lectures%20notes/Iframe.html");
		driver.manage().window().maximize();
		
		//Handle I-frame By using WebElement
		WebElement Selenium_Frame=driver.findElement(By.xpath("//iframe[@name='Selenium']"));
		driver.switchTo().frame(Selenium_Frame);
		
		Thread.sleep(2000);
		WebElement menuBar=driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']"));
		menuBar.click();
		

	}

}
