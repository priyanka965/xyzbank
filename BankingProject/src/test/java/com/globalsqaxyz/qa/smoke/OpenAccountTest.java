package com.globalsqaxyz.qa.smoke;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.globalsqaxyz.qa.basetest.BaseClass;
import com.globalsqaxyz.qa.elementrepository.HomePage;
import com.globalsqaxyz.qa.elementrepository.ManagerLoginPage;
import com.globalsqaxyz.qa.elementrepository.OpenAccPage;


public class OpenAccountTest extends BaseClass {
	
	@Test(groups= {"Smoke Test"})
	public void openAccountTest() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.getMngrLoginBtn().click();
		
		ManagerLoginPage mlp=new ManagerLoginPage(driver);
		mlp.getOpenAccBtn().click();
		
		OpenAccPage oap=new OpenAccPage(driver);
		oap.getUserSelectDd();
		oap.getCurrencyDd();
		oap.getProcessBtn().click();
		
		
		
	}

}
