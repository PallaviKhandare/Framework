package Practice612022;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetUrl {

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String Curl=driver.getCurrentUrl();
		System.out.println(Curl);
		
		driver.navigate().to("https://www.facebook.com/");
		String pic=driver.getTitle();
		System.out.println(pic);
		
		String CurUrl=driver.getCurrentUrl();
		System.out.println(CurUrl);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();

	}

}
