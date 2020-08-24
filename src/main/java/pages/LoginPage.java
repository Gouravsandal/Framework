package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
		}

	
	
	
	@FindBy(xpath="//input[@name='email']")
	WebElement userName;
	
	@FindBy(xpath="//input[@name='password'] ")
	WebElement pwd;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement logIn;
	
		
	public void loginToAppln(String uname, String pass) {
		userName.sendKeys(uname);
		pwd.sendKeys(pass);
		logIn.click();
		
	}
}
