package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.RegisterPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRegisterPage {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		//RegisterPage
		RegisterPage obj=PageFactory.initElements(driver, RegisterPage.class);
		
		obj.getFirst_Name().sendKeys("Anmol");
		obj.getLast_Name().sendKeys("Borikar");
		obj.getPhone().sendKeys("9766222163");
		obj.getEmail().sendKeys("AnmolBorikar@gmail.com");
		obj.getAddress().sendKeys("Ganga nagar");
		obj.getCity().sendKeys("Pune");
		obj.getState().sendKeys("Maharashtra");
		obj.getPostalCode().sendKeys("431051");
		obj.getCountry().sendKeys("India");
		obj.getUserName().sendKeys("Anmol");
		obj.getPassword().sendKeys("29051999");
		obj.getConfirm_Password().sendKeys("29051999");
		obj.getSubmit().click();

	}

}
