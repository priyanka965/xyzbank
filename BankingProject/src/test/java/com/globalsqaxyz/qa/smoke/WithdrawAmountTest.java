package com.globalsqaxyz.qa.smoke;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.globalsqaxyz.qa.basetest.BaseClass;
import com.globalsqaxyz.qa.elementrepository.CustomerAccountPage;
import com.globalsqaxyz.qa.elementrepository.CustomerLoginPage;
import com.globalsqaxyz.qa.elementrepository.HomePage;
import com.globalsqaxyz.qa.elementrepository.WithdrawalPage;
import com.globalsqaxyz.qa.genericUtility.ExcelfileUtility;

public class WithdrawAmountTest extends BaseClass {
	
	@Test(groups= {"Smoke Test"})
	public void withdrawAmountTest() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.getCustLoginBtn().click();
		
		CustomerLoginPage clp=new CustomerLoginPage(driver);
		clp.getCustDd();
		
		clp.getLoginBtn().click();
		
		CustomerAccountPage cap=new CustomerAccountPage(driver);
		cap.getWithDrawBtn().click();
		
		WithdrawalPage wdp=new WithdrawalPage(driver);
		ExcelfileUtility eutil=new ExcelfileUtility();
		String withdrawamount = eutil.readExcelFile("CustDetails", 1, 4);
		wdp.getWithDrawTextField(withdrawamount);
		wdp.getWithdrawBtn2().click();
		
	}

}
