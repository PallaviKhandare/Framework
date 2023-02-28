package Com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_com {

		@FindBy(how=How.XPATH,using="//input[@id='email']")
		WebElement txt_email;
		
		@FindBy(how=How.XPATH,using="//input[@id='pass']")
		WebElement txt_pass;
		
		@FindBy(how=How.XPATH,using="//button[@id='loginbutton']")
		WebElement button;

		public WebElement getTxt_email() {
			return txt_email;
		}


		public WebElement getTxt_pass() {
			return txt_pass;
		}

		

		public WebElement getButton() {
			return button;
		}

		
}
