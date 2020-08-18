package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
		}

	
	@FindBy(xpath="//a//span[text()='Login']")
	WebElement login;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement userName;
	
	@FindBy(xpath="//input[@name=' password'] ")
	WebElement pwd;
	
	@FindBy(xpath="//input[@name='commit']")
	WebElement signIn;
	
	@FindBy(xpath="//div[@class='VfPpkd-RLmnJb']")
	WebElement next;
	
	public void loginToAppln(String uname, String pass) throws InterruptedException {
		userName.sendKeys(uname);
		Thread.sleep(2000);
		next.click();
		Thread.sleep(2000);
		pwd.sendKeys(pass);
		signIn.click();
		
	}
}
