package Practice612022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isEnabled {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement Email=driver.findElement(By.id("email"));
		System.out.println(Email.isEnabled());
		System.out.println(Email.isDisplayed());
		
		if(Email.isEnabled()==true) {
			Email.sendKeys("test@gmail.com");
		}else {
			System.out.println("Element is disable");
		}
		
		if(Email.isDisplayed()==true) {
		System.out.println("Element is Displayed");
		}else {
			System.out.println("Element is not Displayed");
		}
	}

}
