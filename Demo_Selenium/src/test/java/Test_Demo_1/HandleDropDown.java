package Test_Demo_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement DropDown=driver.findElement(By.xpath("//select[@name='country']"));
		Select opt=new Select(DropDown);
		
		List<WebElement> list=opt.getOptions();
		
		//without using select class method-handle drop down
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			
			if((list.get(i).getText().equals("INDIA"))) 
			{
				list.get(i).click();
				break;
			}
		}
		System.out.println(opt.getFirstSelectedOption().getText());
		

	}

}
