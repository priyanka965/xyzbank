package com.globalsqaxyz.qa.elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WithdrawalPage {
	WebDriver driver;
	public WithdrawalPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[@ng-click='withdrawl()']")
	private WebElement withDrawBtn1;
	
	@FindBy(xpath="//input[@ng-model='amount']")
	private WebElement withDrawTextField;
	
	@FindBy(xpath="//button[text()='Withdraw']")
	private WebElement withDrawBtn2;
	public WebElement getWithDrawBtn1() {
		return withDrawBtn1;
	}

	public void getWithDrawTextField(String amount) {
		withDrawTextField.sendKeys(amount);
		
	}

	public WebElement getWithdrawBtn2() {
		return withDrawBtn2;
	}
	

}
