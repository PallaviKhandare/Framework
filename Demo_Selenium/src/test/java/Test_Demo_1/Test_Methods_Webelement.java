package Test_Demo_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Methods_Webelement {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/enabled");
		driver.manage().window().maximize();
		
		//Identify Element===Enabled or disabled?
		
		WebElement disabledelement=driver.findElement(By.id("disabledInput"));
		boolean data=disabledelement.isEnabled();
		System.out.println(data); //False
		
		WebElement Input_here=driver.findElement(By.id("input"));
		System.out.println(Input_here.isEnabled());
		
		if(disabledelement.isEnabled()==true)
		{
			disabledelement.sendKeys("India");
		}else {
			System.out.println("Element is disabled");
			 
		}
		WebDriverManager.chromedriver().setup();
		ChromeDriver XYZ=new ChromeDriver();
		XYZ.get("https://formy-project.herokuapp.com/checkbox");
		XYZ.manage().window().maximize();
		
		
		WebElement checkbox1=XYZ.findElement(By.id("checkbox-1"));
		System.out.println(checkbox1.isSelected());
			checkbox1.click();
		
		
		WebElement logo=XYZ.findElement(By.id("logo"));
		System.out.println(logo.getText());
		
		if(logo.getText().equals("FORMY"))
		{
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test Case Fail");
		
		}
		
		

	}

}
