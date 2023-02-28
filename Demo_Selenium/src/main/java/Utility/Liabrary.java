package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Liabrary {
	
	public static String getTestData(String Sheetname,int row,int cell) throws Exception {
		
		String path="C:\\Workspace\\Demo_Selenium\\TestData\\Testdata for Scrolling.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String data1=wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		
		return data1;
	}
	
	public static void ScrollToElement(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	

}
