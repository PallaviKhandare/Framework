package for_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataReader {

	public static void main(String[] args) throws Exception {
		
		String path="C:\\Workspace\\Demo_Selenium\\TestData\\TestData1.xlsx";
		FileInputStream XYZ=new FileInputStream(path);
		XSSFWorkbook Ab=new XSSFWorkbook(XYZ);
		String data_0_0=Ab.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		String data_1_0=Ab.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String data_2_0=Ab.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		String data_3_0=Ab.getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
		String data_4_0=Ab.getSheet("Sheet1").getRow(4).getCell(0).getStringCellValue();
		String data_5_0=Ab.getSheet("Sheet1").getRow(5).getCell(0).getStringCellValue();
		String data_6_0=Ab.getSheet("Sheet1").getRow(6).getCell(0).getStringCellValue();
		String data_7_0=Ab.getSheet("Sheet1").getRow(7).getCell(0).getStringCellValue();
		String data_8_0=Ab.getSheet("Sheet1").getRow(8).getCell(0).getStringCellValue();
		String data_9_0=Ab.getSheet("Sheet1").getRow(9).getCell(0).getStringCellValue();
		String data_10_0=Ab.getSheet("Sheet1").getRow(10).getCell(0).getStringCellValue();
		String data_11_0=Ab.getSheet("Sheet1").getRow(11).getCell(0).getStringCellValue();
		System.out.println(data_0_0);
		System.out.println(data_1_0);
		System.out.println(data_2_0);
		System.out.println(data_3_0);
		System.out.println(data_4_0);
		System.out.println(data_5_0);
		System.out.println(data_6_0);
		System.out.println(data_7_0);
		System.out.println(data_8_0);
		System.out.println(data_9_0);
		System.out.println(data_10_0);
		System.out.println(data_11_0);
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement First_Name=driver.findElement(By.xpath("(//input[@maxlength='60'])[1]"));
		First_Name.sendKeys(data_0_0);
		WebElement Last_Name=driver.findElement(By.xpath("//input[@name='lastName']"));
		Last_Name.sendKeys(data_1_0);
		WebElement Phone=driver.findElement(By.xpath("//input[@name='phone']"));
		Phone.sendKeys(data_2_0);
		WebElement Email=driver.findElement(By.xpath("//input[@name='userName']"));
		Email.sendKeys(data_3_0);
		WebElement Address=driver.findElement(By.xpath("//input[@name='address1']"));
		Address.sendKeys(data_4_0);
		WebElement City=driver.findElement(By.xpath("//input[@name='city']"));
		City.sendKeys(data_5_0);
		WebElement State=driver.findElement(By.xpath("//input[@name='state']"));
		State.sendKeys(data_6_0);
		WebElement Postal=driver.findElement(By.xpath("//input[@name='postalCode']"));
		Postal.sendKeys(data_7_0);
		WebElement Country=driver.findElement(By.xpath("//select[@name='country']"));
		Country.sendKeys(data_8_0);
		WebElement User_Name=driver.findElement(By.xpath("//input[@name='email']"));
		User_Name.sendKeys(data_9_0);
		WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
		Password.sendKeys(data_10_0);
		WebElement Con_Password=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		Con_Password.sendKeys(data_11_0);
		
		
		
		
		
		
		
		
		
		
		


		

	}

}
