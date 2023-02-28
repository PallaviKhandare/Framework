package Com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_IframeHandleByElement {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/pallavi%20khandare/OneDrive/Documents/Iframe.html");
		driver.manage().window().maximize();
		
		//By Element Method
		driver.switchTo().frame(0);

		Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[@href='/artifact/se.fortnox.reactivewizard/reactivewizard-test'])[2]")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);

		Thread.sleep(3000);

        driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
		driver.switchTo().defaultContent();

        driver.findElement(By.xpath("//a[@href='https://www.facebook.com/']")).click();
		
		

	}

}
