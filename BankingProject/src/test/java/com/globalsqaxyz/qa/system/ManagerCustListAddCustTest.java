package com.globalsqaxyz.qa.system;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.globalsqaxyz.qa.basetest.BaseClass;
import com.globalsqaxyz.qa.elementrepository.AddCustomerPage;
import com.globalsqaxyz.qa.elementrepository.CustomersPage;
import com.globalsqaxyz.qa.elementrepository.HomePage;
import com.globalsqaxyz.qa.elementrepository.ManagerLoginPage;
import com.globalsqaxyz.qa.genericUtility.ExcelfileUtility;

public class ManagerCustListAddCustTest extends BaseClass{
	
	@Test
	public void managerCustListAddCustTest() throws EncryptedDocumentException, IOException, InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.getMngrLoginBtn().click();
		
		ManagerLoginPage mlp=new ManagerLoginPage(driver);
		mlp.getAddCustBtn().click();

		AddCustomerPage acp=new AddCustomerPage(driver);
		ExcelfileUtility eutil=new ExcelfileUtility();
		String firstName = eutil.readExcelFile("CustDetails", 1, 0);
		String lastName = eutil.readExcelFile("CustDetails", 1, 1);
		String postCode = eutil.readExcelFile("CustDetails", 1, 2);
		acp.getFirstNameTextfield(firstName);
		acp.getLastNameTextfield(lastName);
		acp.getPostalCodeTextfield(postCode);
		acp.getAddCustbtn2().click();
		
		Alert ref=driver.switchTo().alert();
		ref.accept();
	//Thread.sleep(3000);
		CustomersPage cp=new CustomersPage(driver);
		cp.getCustList().click();
		//Thread.sleep(3000);
		mlp.getHomeBtn().click();
	}

}
