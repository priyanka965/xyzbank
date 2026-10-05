package com.globalsqaxyz.qa.integration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.globalsqaxyz.qa.basetest.BaseClass;
import com.globalsqaxyz.qa.elementrepository.CustomerInfoPage;
import com.globalsqaxyz.qa.elementrepository.CustomerLoginPage;
import com.globalsqaxyz.qa.elementrepository.HomePage;

public class CustLoginLogoutSesionTest  extends BaseClass {
	
	@Test
	public void custLoginLogoutSessionTest() {
		HomePage hp=new HomePage(driver);
		hp.getCustLoginBtn().click();
		
		CustomerLoginPage clp=new CustomerLoginPage(driver);
		clp.getCustDd();
		
		clp.getLoginBtn().click();
		CustomerInfoPage cip=new CustomerInfoPage(driver);
		cip.getLogOutBtn().click();
		
		
		String text = clp.getCustPageText().getText();
		Assert.assertEquals(text, "Your Name :");
		System.out.println(text);
		
	}	

}
