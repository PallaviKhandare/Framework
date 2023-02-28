package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePagePom {
	
	@FindBy(how=How.XPATH,using="//input[@class='form-control pac-target-input']")
	private WebElement Address;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Street address']")
	private WebElement Street_Address;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Street address 2']")
	private WebElement Street_Address2;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='City']")
	private WebElement City;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='State']")
	private WebElement State;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Zip code']")
	private WebElement Zip_code;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Country']")
	private WebElement Country;
	
	//getter for 
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getStreet_Address() {
		return Street_Address;
	}
	public WebElement getStreet_Address2() {
		return Street_Address2;
	}
	public WebElement getCity() {
		return City;
	}
	public WebElement getState() {
		return State;
	}
	public WebElement getZip_code() {
		return Zip_code;
	}
	public WebElement getCountry() {
		return Country;
	}
	
	
	
	

}
