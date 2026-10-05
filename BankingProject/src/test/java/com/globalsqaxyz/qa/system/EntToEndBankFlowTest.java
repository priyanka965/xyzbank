package com.globalsqaxyz.qa.system;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.globalsqaxyz.qa.basetest.BaseClass;
import com.globalsqaxyz.qa.elementrepository.AddCustomerPage;
import com.globalsqaxyz.qa.elementrepository.CustomerInfoPage;
import com.globalsqaxyz.qa.elementrepository.CustomerLoginPage;
import com.globalsqaxyz.qa.elementrepository.HomePage;
import com.globalsqaxyz.qa.elementrepository.ManagerLoginPage;
import com.globalsqaxyz.qa.genericUtility.ExcelfileUtility;

public class EntToEndBankFlowTest extends BaseClass{
	
	@Test
	public void entToEndBankFlowTest() throws EncryptedDocumentException, IOException {
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
	mlp.getHomeBtn().click();
	hp.getCustLoginBtn().click();
	
	CustomerLoginPage clp=new CustomerLoginPage(driver);
	clp.getCustDd();
	
	clp.getLoginBtn().click();
	
	CustomerInfoPage cip=new CustomerInfoPage(driver);
	cip.getDepositbtn1().click();
	
	String depositamt = eutil.readExcelFile("CustDetails", 1, 3);
	cip.depositAmtTextField(depositamt);
	cip.getDepositbtn2().click();
	
	
	
	
	cip.getWithdrawbtn1().click();
	
	String withdrawamt = eutil.readExcelFile("CustDetails", 1, 4);
	cip.withdrawAmtTextField(withdrawamt);
	cip.getWithdrawbtn2();
	
	cip.getTransacbtn().click();
	cip.getLogOutBtn().click();
	}	
	

}
