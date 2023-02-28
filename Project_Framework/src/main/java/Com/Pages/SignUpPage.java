package Com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPage {
	
	@FindBy(how=How.XPATH,using="//input[@name='firstname']")
	WebElement first_name;
	
	@FindBy(how=How.XPATH,using="//input[@name='lastname']")
	WebElement last_name;
	
	@FindBy(how=How.XPATH,using="//input[@name='reg_email__']")
	WebElement Mobile_no;
	
	@FindBy(how=How.XPATH,using="//button[@name='websubmit']")
	WebElement button;

	public WebElement getFirst_name() {
		return first_name;
	}

	
	public WebElement getLast_name() {
		return last_name;
	}

	

	public WebElement getMobile_no() {
		return Mobile_no;
	}

	

	public WebElement getButton() {
		return button;
	}

	
	
	
	

}
