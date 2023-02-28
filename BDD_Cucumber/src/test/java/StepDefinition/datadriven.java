package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class datadriven {
	WebDriver driver;
	

@Given("my user is on loginpage")
public void my_user_is_on_loginpage() throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://example.testproject.io/web/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    System.out.println("user is on login page");
   
}

@When("user is entering {string} & {string}")
public void user_is_entering(String uname, String pwd) throws InterruptedException {
	driver.findElement(By.id("name")).sendKeys(uname);
	Thread.sleep(3000);
	driver.findElement(By.id("password")).sendKeys(pwd);
    Thread.sleep(3000);
    System.out.println("user has entered username and password");
}

@Then("clicks on login button")
public void clicks_on_login_button() throws InterruptedException {
	driver.findElement(By.id("login")).click();
	Thread.sleep(2000);
	System.out.println("user clicked on login button");
	
    
}

@Then("verifying the title")
public void verifying_the_title() throws InterruptedException {
	System.out.println("Title of the page is:-"+driver.getTitle());
	Thread.sleep(2000);
	driver.quit();
   
}



}
