package com.globalsqaxyz.qa.integration;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.globalsqaxyz.qa.basetest.BaseClass;
import com.globalsqaxyz.qa.elementrepository.AddCustomerPage;
import com.globalsqaxyz.qa.elementrepository.HomePage;
import com.globalsqaxyz.qa.elementrepository.ManagerLoginPage;
import com.globalsqaxyz.qa.genericUtility.ExcelfileUtility;

public class CustMgmtAccMgmtTest extends BaseClass{
	
	@Test
	public void custMgmtAccMgmtTest() throws EncryptedDocumentException, IOException {
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
		
		
		
	}
	

}
