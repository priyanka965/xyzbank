package com.globalsqaxyz.qa.elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CustomerInfoPage {
	
	WebDriver driver;
	public CustomerInfoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[@ng-click='transactions()']")
	private WebElement transacbtn;
	
	@FindBy(xpath="//button[@ng-click='deposit()']")
	private WebElement depositbtn1;
	
	@FindBy(xpath="//button[@ng-click='withdrawl()']")
	private WebElement withdrawbtn1;
	
	@FindBy(xpath="//select[@ng-model='accountNo']")
	private WebElement accDd;
	
	@FindBy(xpath="//input[@ng-model='amount']")
	private WebElement depositAmtTextField;
	
	@FindBy(xpath="//input[@ng-model='amount']")
	private WebElement WithDrawAmtTextField;
	
	@FindBy(xpath="//button[text()='Deposit']")
	private WebElement depositbtn2;
	
	@FindBy(xpath="//button[text()='Withdraw']")
	private WebElement withdrawbtn2;
	
	@FindBy(xpath="//button[text()='Logout']")
	private WebElement logOutBtn;
	
	
	public WebElement getTransacbtn() {
		return transacbtn;
	}

	public void getAccDd() {
		Select sel=new Select(accDd);
		sel.selectByValue("number:1010");
	}
	
	public void depositAmtTextField(String depamount) {
		depositAmtTextField.sendKeys(depamount);
		
	}

	public WebElement getDepositbtn1() {
		return depositbtn1;
	}

	public WebElement getDepositbtn2() {
		return depositbtn2;
	}

   
    public WebElement getWithdrawbtn1() {
		return withdrawbtn1;
	}
    
    public void withdrawAmtTextField(String withamount) {
    	WithDrawAmtTextField.sendKeys(withamount);
		
	}

    public WebElement getWithdrawbtn2() {
		return withdrawbtn2;
	}

	public WebElement getLogOutBtn() {
		return logOutBtn;
	}
    
    






	






	
	

}
