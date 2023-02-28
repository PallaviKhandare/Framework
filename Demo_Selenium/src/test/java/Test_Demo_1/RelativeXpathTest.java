package Test_Demo_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeXpathTest {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		
		//Identify the Elements by using RelativeXpath
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("pallavi@gmail.com");
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		password.sendKeys("29051999");
		
		WebElement btnlogin=driver.findElement(By.xpath("//*[@id=\"loginbutton\"]"));
		btnlogin.click();
		
		Thread.sleep(5000);
		driver.close();

	}

}
