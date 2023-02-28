package Test_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Liabrary;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Genric_classScroll {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.xpath("//li[text()='English (UK)']"));
		Thread.sleep(4000);
		Liabrary.ScrollToElement(driver, element);


	}

}
