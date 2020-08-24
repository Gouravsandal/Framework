package BasePacakage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utilities.BrowserFactory;
import utilities.ConfigDataProvider;
import utilities.Helper;

public class BaseClass {
	public WebDriver driver;
	public ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest logger;
	@BeforeSuite
	public void setUpSuite() throws IOException {
		config=new ConfigDataProvider();
		
		ExtentHtmlReporter extent =new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/FreeCRM.html"));
		report=new ExtentReports();
		report.attachReporter(extent);
	}
	
	@BeforeClass
	public void setUp() {
		driver=BrowserFactory.startApplication(driver, config.getDataFromConfig("Browser"), config.getDataFromConfig("url"));
	}
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			Helper.captureScreenshot(driver);
		}
		report.flush();
	}
	
	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);	
		
	}

}
