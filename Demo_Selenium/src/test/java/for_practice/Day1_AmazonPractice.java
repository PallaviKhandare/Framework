package for_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1_AmazonPractice {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Identify Elements
		
		WebElement search_field=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		search_field.sendKeys("iphone 13");
		
		WebElement Search_Button=driver.findElement(By.id("nav-search-submit-button"));
		Search_Button.click();
		
		WebElement iphone=driver.findElement(By.xpath("//*[@id=\"CardInstanceQBf87OeGLm5tKfINUoiPfw\"]/div[1]/div[2]/div[1]/div/div[1]/a/div/img"));
		iphone.click();
		
		WebElement Colour_btn=driver.findElement(By.xpath("//*[@id=\"a-autoid-15-announce\"]/div/div[1]/img"));
		Colour_btn.click();
		
		WebElement Buy_now_btn=driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]"));
		Buy_now_btn.click();
		
		Thread.sleep(5000);
		driver.close();

	}

}
