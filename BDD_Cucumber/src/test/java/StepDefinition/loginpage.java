package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class loginpage {
	
	WebDriver driver;
	
	@Given("user on loginpage")
	public void user_on_loginpage() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver(); 
		
		driver.get("https://example.testproject.io/web/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	    
	    
	}

	@When("user enters username")
	public void user_enters_username() throws Exception  {
		
		driver.findElement(By.id("name")).sendKeys("Pallavi");
	    Thread.sleep(3000);
	    System.out.println("User has entered username");
	}

	@When("user enters password")
	public void user_enters_password() throws Exception  {
		driver.findElement(By.id("password")).sendKeys("12345");
		Thread.sleep(3000);
		System.out.println("User has entered password");
	}

	@Then("user clicks on login")
	public void user_clicks_on_login() throws Exception {
		
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(3000);
		
	   System.out.println("User has clicked on login button");
	    
	}

	@Then("verify the title")
	public void verify_the_title() {
		
		String title=driver.getTitle();
		
		System.out.println("The Title of Page is:-"+title);
	    
	}


}
