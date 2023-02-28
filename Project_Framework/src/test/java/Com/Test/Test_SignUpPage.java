package Com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.Pages.SignUpPage;
import Com.Utility.BaseClass;


public class Test_SignUpPage extends BaseClass {
	@Test
	public void Test_SignUp() {
		SignUpPage SignUp=PageFactory.initElements(driver, SignUpPage.class);
		SignUp.getFirst_name().sendKeys("pallavi");
		SignUp.getLast_name().sendKeys("khandare");
		SignUp.getMobile_no().sendKeys("9322195030");
		SignUp.getButton().click();
		}
	

}
