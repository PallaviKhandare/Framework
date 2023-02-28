package Com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_4_isEnabled {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement txt_firstname=driver.findElement(By.xpath("//input[@name='firstName']"));
		Custom_sendkeys(txt_firstname,"pallavi");
		
		WebElement txt_Lastname=driver.findElement(By.xpath("//input[@name='lastName']"));
		Custom_sendkeys(txt_Lastname,"Khandare");
	}
 
	
	public static void Custom_sendkeys(WebElement element,String Value) {
		try {
			if(element.isEnabled() && element.isDisplayed()) {
				element.sendKeys(Value);
			}else {
				System.out.println("message");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	
		

	


