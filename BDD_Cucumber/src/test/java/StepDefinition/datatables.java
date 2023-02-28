package StepDefinition;

import java.util.List;

import org.bouncycastle.asn1.dvcs.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class datatables {
	WebDriver driver;
	
	@Given("user on login page")
	public void user_on_login_page() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://example.testproject.io/web/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    System.out.println("user is on login page");
	}
	

	@When("user enters username & password")
	public void user_enters_username_password(DataTable dataTable) throws InterruptedException {
		
		 List<List<String>> data = dataTable.cells();
		 driver.findElement(By.id("name")).sendKeys(data.get(0).get(0));
		 Thread.sleep(2000);
		 driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
		 Thread.sleep(2000);
		 System.out.println("Entered username and password with datatable");
		 
	 
	}

	@Then("Clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		System.out.println("Click on login button");
		   
	}
	
	@Then("user enters personal info")
	public void user_enters_personal_info(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    List<List<String>> data1 =dataTable.cells();
	    driver.findElement(By.id("address")).sendKeys(data1.get(0).get(1));
	    Thread.sleep(2000);
	    driver.findElement(By.id("email")).sendKeys(data1.get(1).get(1));
	    Thread.sleep(2000);
	    driver.findElement(By.id("phone")).sendKeys(data1.get(2).get(1));
	    Thread.sleep(2000);
	    
	    System.out.println("user has entered personal info and closing the browser");
	    driver.close();
	    
	}


}
