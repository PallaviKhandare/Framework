package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.HomePagePom;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestHomePom {

	public static void main(String[] args) {
     
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://formy-project.herokuapp.com/autocomplete");
	driver.manage().window().maximize();
	
	
	//HomePagePom
	HomePagePom home=PageFactory.initElements(driver,HomePagePom.class);
	home.getAddress().sendKeys("Ganga Nagar");
	home.getStreet_Address().sendKeys("XYZ");
	home.getStreet_Address2().sendKeys("optional");
	home.getCity().sendKeys("Pune");
	home.getState().sendKeys("Maharashtra");
	home.getZip_code().sendKeys("431051");
	home.getCountry().sendKeys("India");

	}

}
