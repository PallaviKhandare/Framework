package Test_Demo_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		// element identify --> src--destn
	
		WebElement src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement destn=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(src, destn).build().perform();
		Thread.sleep(2000);
		
        //amount dragging and dropping
	     WebElement source2=driver.findElement(By.xpath("(//a[@class='button button-orange']) [4]"));
		 WebElement destn2=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		 act.dragAndDrop(source2, destn2).build().perform();
		 
		 Thread.sleep(2000);
		}


}
