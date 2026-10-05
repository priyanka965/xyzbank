package com.globalsqaxyz.qa.elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OpenAccPage {
	
	WebDriver driver;
	public OpenAccPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[@ng-click='openAccount()']")
	private WebElement openAccBtn;
	
	@FindBy(xpath="//select[@ng-model='custId']")
	private WebElement userSelectDd;
	
	@FindBy(id="currency")
	private WebElement currencyDd;
	
	@FindBy(xpath="//select[@ng-model='currency']")
	private WebElement processBtn;
	
	
	public WebElement getOpenAccBtn() {
		return openAccBtn;
	}

	public WebElement getUserSelectDd() {
		Select sel=new Select(userSelectDd);
		 sel.selectByValue("4");
		return userSelectDd;
	}

	public WebElement getCurrencyDd() {
		Select sel=new Select(currencyDd);
		 sel.selectByValue("Rupee");
		return currencyDd;
	}

	public WebElement getProcessBtn() {
		return processBtn;
	}
	
	
	

}
