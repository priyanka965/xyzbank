package com.globalsqaxyz.qa.basetest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.globalsqaxyz.qa.genericUtility.PropertFileUtility;
import com.globalsqaxyz.qa.genericUtility.WebDriverUtility;

public class BaseClass {
	public WebDriver driver;
	WebDriverUtility wdu=new WebDriverUtility();
	PropertFileUtility pf = new PropertFileUtility();
	
	//HomePage hp= new HomePage(driver);
	
	@BeforeSuite
	public void configBS() {
		System.out.println("====Connect to DB,Report Configuration===");
		
	}
	
	//@Parameters("BROWSER")
		@BeforeClass(groups= {"Smoke Test","Integration Test", "System Test"})
			//public void configBC(String browser) throws IOException {
			public void configBC() throws IOException {
			System.out.println("====Launch Browser====");
		//	String BROWSER=browser;
			String browser=pf.readPropertyFile("browser");
			driver=wdu.launchBrowser(browser);

       }
		@BeforeMethod(groups= {"Smoke Test","Integration Test", "System Test"})
		public void configBM() throws IOException {
			
			String URL=pf.readPropertyFile("url");
			wdu.maximizeBrowser();
			wdu.implicitWaitMethod();
			wdu.getUrl(URL);
		}
		/*@AfterMethod(groups= {"Smoke Test","Integration Test", "System Test"})
		public void configAM() {
			HomePage hp= new HomePage(driver);
			hp.getHomeButton().click();
			
		}*/
		
		@AfterClass(groups= {"Smoke Test","Integration Test", "System Test"})
		public void configAC() {
			driver.quit();
		}

		@AfterSuite(groups= {"Smoke Test","Integration Test", "System Test"})
		public void configAS() {
			System.out.println("====Close DB, Report backup====");
			
			
		}
}
