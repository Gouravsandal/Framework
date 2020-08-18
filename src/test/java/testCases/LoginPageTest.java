package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BrowserFactory;

public class LoginPageTest {
	WebDriver driver;
	@Test
	public void loginApp() throws InterruptedException {
		
		driver=BrowserFactory.startApplication(driver, "Chrome", "http://qaclickacademy.com/");
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a//span[text()='Login']")));
		Assert.assertEquals(driver.getTitle(), "QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");
		driver.findElement(By.xpath("//a//span[text()='Login']")).click();
		
		BrowserFactory.quitBrowser(driver);	
	}
	
	@Test
	public void verifyLoginPageTitle() throws InterruptedException {
		
		driver=BrowserFactory.startApplication(driver, "Chrome", "http://qaclickacademy.com/");
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a//span[text()='Login']")));
		Thread.sleep(3000);
		//Assert.assertEquals(driver.getTitle(), expected);
		System.out.println(driver.getTitle());
		BrowserFactory.quitBrowser(driver);
	}

}
