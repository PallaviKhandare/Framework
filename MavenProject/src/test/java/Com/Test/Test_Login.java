package Com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.Utility.Base_Class;
import Com.pages.Login_com;

public class Test_Login extends Base_Class {
	
	@Test
	public void Login_Test() {
		Login_com login=PageFactory.initElements(driver,Login_com.class);
		login.getTxt_email().sendKeys("TEST@123");
		login.getTxt_pass().sendKeys("123567");
		login.getButton().click();
	}

}
