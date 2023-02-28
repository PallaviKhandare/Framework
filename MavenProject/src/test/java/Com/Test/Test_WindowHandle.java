package Com.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_WindowHandle {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String ParentId=driver.getWindowHandle();
		System.out.println(ParentId);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> AllId=driver.getWindowHandles();
		System.out.println(AllId);
		
		List<String> listId=new ArrayList(AllId);
		driver.switchTo().window(listId.get(1));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Pallavi");
		Thread.sleep(3000);
		driver.quit();
		

	}

}
