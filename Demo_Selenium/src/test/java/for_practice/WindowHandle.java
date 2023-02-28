package for_practice;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		String WindowHandle=driver.getWindowHandle();
		System.out.println(WindowHandle);

	}

}
