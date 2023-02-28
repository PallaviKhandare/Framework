package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage {
	
	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	private WebElement First_Name;
	
	@FindBy(how=How.XPATH,using="//input[@name='lastName']")
	private WebElement Last_Name;
	
	@FindBy(how=How.XPATH,using="//input[@name='phone']")
	private WebElement Phone;
	
	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	private WebElement Email;
	
	@FindBy(how=How.XPATH,using="//input[@name='address1']")
	private WebElement Address;
	
	@FindBy(how=How.XPATH,using="//input[@name='city']")
	private WebElement City;
	
	@FindBy(how=How.XPATH,using="//input[@name='state']")
	private WebElement State;
	
	@FindBy(how=How.XPATH,using="//input[@name='postalCode']")
	private WebElement PostalCode;
	
	@FindBy(how=How.XPATH,using="//select[@name='country']")
	private WebElement Country;
	
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	private WebElement UserName;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	private WebElement Password;
	
	@FindBy(how=How.XPATH,using="//input[@name='confirmPassword']")
	private WebElement Confirm_Password;
	
	@FindBy(how=How.XPATH,using="//input[@name='submit']")
	private WebElement Submit;
	
	//getter method
	public WebElement getFirst_Name() {
		return First_Name;
	}
	public WebElement getLast_Name() {
		return Last_Name;
	}
	public WebElement getPhone() {
		return Phone;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getCity() {
		return City;
	}
	public WebElement getState() {
		return State;
	}
	public WebElement getPostalCode() {
		return PostalCode;
	}
	public WebElement getCountry() {
		return Country;
	}
	public WebElement getUserName() {
		return UserName;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getConfirm_Password() {
		return Confirm_Password;
	}
	public WebElement getSubmit() {
		return Submit;
	}
	

	

}
