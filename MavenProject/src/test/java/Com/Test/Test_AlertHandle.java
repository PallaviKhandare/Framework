package Com.Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_AlertHandle {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement ID=driver.findElement(By.xpath("//input[@name='cusid']"));
		ID.sendKeys("12344");
		WebElement button=driver.findElement(By.xpath("//input[@name='submit']"));
		button.click();
		
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		//alt.dismiss();
		alt.accept();
		Thread.sleep(3000);
		System.out.println(alt.getText());
		alt.accept();

	}

}
