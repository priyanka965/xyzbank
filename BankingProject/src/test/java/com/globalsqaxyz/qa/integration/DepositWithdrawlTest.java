package com.globalsqaxyz.qa.integration;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.globalsqaxyz.qa.basetest.BaseClass;
import com.globalsqaxyz.qa.elementrepository.CustomerInfoPage;
import com.globalsqaxyz.qa.elementrepository.CustomerLoginPage;
import com.globalsqaxyz.qa.elementrepository.HomePage;
import com.globalsqaxyz.qa.genericUtility.ExcelfileUtility;

public class DepositWithdrawlTest extends BaseClass{
	
	@Test
	public void depositWithdrawTest() throws EncryptedDocumentException, IOException, InterruptedException {
		
			HomePage hp=new HomePage(driver);
			hp.getCustLoginBtn().click();
			CustomerLoginPage clp=new CustomerLoginPage(driver);
			clp.getCustDd();
			clp.getLoginBtn().click();
			
			CustomerInfoPage cip=new CustomerInfoPage(driver);
			cip.getDepositbtn1().click();
			ExcelfileUtility eutil=new ExcelfileUtility();
			String depositamt = eutil.readExcelFile("CustDetails", 1, 3);
			cip.depositAmtTextField(depositamt);
			cip.getDepositbtn2().click();
			
			Thread.sleep(3000);
			
			
			cip.getWithdrawbtn1().click();
			
			String withdrawamt = eutil.readExcelFile("CustDetails", 1, 4);
			cip.withdrawAmtTextField(withdrawamt);
			cip.getWithdrawbtn2();
			
			cip.getTransacbtn().click();
			cip.getLogOutBtn().click();
			
			
		
	}

}
