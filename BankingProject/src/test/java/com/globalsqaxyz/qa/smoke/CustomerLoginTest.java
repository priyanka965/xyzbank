package com.globalsqaxyz.qa.smoke;

import org.testng.annotations.Test;

import com.globalsqaxyz.qa.basetest.BaseClass;
import com.globalsqaxyz.qa.elementrepository.CustomerLoginPage;
import com.globalsqaxyz.qa.elementrepository.HomePage;

public class CustomerLoginTest extends BaseClass{
	
	@Test(groups= {"Smoke Test"})
	public void customerLoginTest() {
		HomePage hp=new HomePage(driver);
		hp.getCustLoginBtn().click();
		
		CustomerLoginPage clp=new CustomerLoginPage(driver);
		clp.getCustDd();
		
		clp.getLoginBtn().click();
		
	}
	
	

}
