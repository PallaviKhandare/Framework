package Test_Demo_1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandle {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement CustomerID=driver.findElement(By.xpath("//input[@type='text']"));
		CustomerID.sendKeys("001122");
		
		WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		Thread.sleep(2000);
		
		Alert alt=driver.switchTo().alert();
		// Alert alt=getAlert(driver);
		System.out.println(alt.getText());
		alt.accept();
		Thread.sleep(2000);
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		

	}

}
