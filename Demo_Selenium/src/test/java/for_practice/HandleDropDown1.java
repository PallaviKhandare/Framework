package for_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='country']"));
		Select drp=new Select(dropdown);
		List<WebElement>options=drp.getOptions();
		System.out.println(options.size());
		for(int i=0;i<=options.size();i++) {
			System.out.println(options.get(i).getText());
			if(options.get(i).getText().equals("INDIA")) {
				options.get(i).click();
				break;
			}
		}

	}

}
