package Com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Com.Utility.Base_Class;

public class LoginPage {
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement txt_email;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement txt_pass;

	@FindBy(how=How.XPATH,using="//button[@id='loginbutton']")
	private WebElement button;

	
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
