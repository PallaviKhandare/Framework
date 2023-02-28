package Test_Demo_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2ByXpath {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement First_name=driver.findElement(By.xpath("//input[@name='firstName']"));
		First_name.sendKeys("Pallavi");
		WebElement Last_name=driver.findElement(By.xpath("//input[@name='lastName']"));
		Last_name.sendKeys("Khandare");
		WebElement Phone=driver.findElement(By.xpath("//input[@name='phone']"));
		Phone.sendKeys("9766222164");
		WebElement Email=driver.findElement(By.xpath("//input[@id='userName']"));
		Email.sendKeys("Test@gmail.com");
		WebElement Address=driver.findElement(By.xpath("(//input[@maxlength='60'])[3]"));
		Address.sendKeys("Ganga nagar");
		WebElement City=driver.findElement(By.xpath("//input[@name=\"city\"]"));
		City.sendKeys("Pune");
		WebElement State=driver.findElement(By.xpath("//input[@maxlength='40']"));
		State.sendKeys("Maharashtra");
		WebElement PostalCode=driver.findElement(By.xpath("//input[@name='postalCode']"));
		PostalCode.sendKeys("431513");
		WebElement User_Name=driver.findElement(By.xpath("//input[@name='email']"));
		User_Name.sendKeys("PALLAVI");
		WebElement Password=driver.findElement(By.xpath("(//input[@maxlength='60'])[6]"));
		Password.sendKeys("12345");
		WebElement Confirm_Password=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		Confirm_Password.sendKeys("12345");
		WebElement Submitbut=driver.findElement(By.xpath("//input[@name='submit']"));
		Submitbut.click();
		System.out.println("Your user name is PALLAVI.");

	}

}
