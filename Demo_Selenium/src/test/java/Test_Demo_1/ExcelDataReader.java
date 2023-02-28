package Test_Demo_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataReader {

	public static void main(String[] args) throws Exception {
		
		String path="C:\\Workspace\\Demo_Selenium\\TestData\\TestData.xlsx";
		
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String data_0_0=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		String data_0_1=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data_0_0);
		System.out.println(data_0_1);
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		// username and password
		
		WebElement text_email=driver.findElement(By.xpath("//input[@name='email']"));
		text_email.sendKeys(data_0_0);
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys(data_0_1);
		
		
	}

}
