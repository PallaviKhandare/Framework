package Com.Utility;

import org.openqa.selenium.WebElement;

public class Liabrary {
	
	public static void custom_sendkeys(WebElement element, String value) {
		try
		{
			element.sendKeys(value);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		public static void custom_click(WebElement element) {
			try {
				element.click();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			
		}
		
		
		
	}

}
