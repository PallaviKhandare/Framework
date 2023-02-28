package Test_Demo_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_1_FORMY {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		driver.manage().window().maximize();
		
		WebElement Address=driver.findElement(By.id("autocomplete"));
		Address.sendKeys("Ganga nagar");
		
		WebElement Street_address=driver.findElement(By.id("street_number"));
		Street_address.sendKeys("street_1");
		
		WebElement Street_address2=driver.findElement(By.id("route"));
		Street_address2.sendKeys("House no.192");
		
		WebElement City=driver.findElement(By.id("locality"));
		City.sendKeys("Pune");
		
		WebElement State=driver.findElement(By.id("administrative_area_level_1"));
		State.sendKeys("Maharashtra");
		
		WebElement Zip_code=driver.findElement(By.id("postal_code"));
		Zip_code.sendKeys("411023");
		
		WebElement Country=driver.findElement(By.id("country"));
		Country.sendKeys("India");

	}

}
