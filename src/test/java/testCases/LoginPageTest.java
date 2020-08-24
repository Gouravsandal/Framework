package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BasePacakage.BaseClass;
import pages.LoginPage;

public class LoginPageTest extends BaseClass{
	
	
	
	
	@Test
	public void loginApp() throws InterruptedException {
		logger=report.createTest("login to CRM");
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);

		logger.info("Starting application");
		
		loginPage.loginToAppln("gauravgne4140@gmail.com", "Oct@1988");
		logger.pass("Login success");
		
	}

}
