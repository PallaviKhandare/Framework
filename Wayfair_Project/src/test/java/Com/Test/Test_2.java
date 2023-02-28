package Com.Test;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_2 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.wayfair.com/home-improvement/cat/home-improvement-c45342.html");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String Curl=driver.getCurrentUrl();
		System.out.println(Curl);

		driver.navigate().to("https://www.facebook.com/login/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();
	}

}
