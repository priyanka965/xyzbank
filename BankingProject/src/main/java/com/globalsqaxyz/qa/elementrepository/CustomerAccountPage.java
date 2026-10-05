package com.globalsqaxyz.qa.elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerAccountPage {
	WebDriver driver;
	public CustomerAccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//button[@ng-click='withdrawl()']")
	private WebElement withDrawBtn;
	
	public WebElement getWithDrawBtn() {
		return withDrawBtn;
	}
	
	

}
