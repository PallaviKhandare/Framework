package for_practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeHandleByName_Id {

	public static void main(String[] args) throws Exception {
     
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Desktop/Class%20Notes/Java%20lectures%20notes/Iframe.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("MVN");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);

	}

}
