package Com.Test;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_3 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		 
		String title=driver.getTitle();
		System.out.println(title);
		 
		String CUrl=driver.getCurrentUrl();
		System.out.println(CUrl);
		
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();

	}

}
