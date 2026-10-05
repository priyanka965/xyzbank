package com.globalsqaxyz.qa.elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagerLoginPage {
	
	WebDriver driver;
	public ManagerLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[text()='Home']")
	private WebElement homeBtn;
	
	@FindBy(xpath="//button[@ng-class='btnClass1']")
	private WebElement addCustBtn;
	
	@FindBy(xpath="//button[@ng-class='btnClass2']")
	private WebElement openAccBtn;
	
	@FindBy(xpath="//button[@ng-class='btnClass3']")
	private WebElement customerslist;
	
	
	public WebElement getHomeBtn() {
		return homeBtn;
	}

	public WebElement getAddCustBtn() {
		return addCustBtn;
	}

	public WebElement getOpenAccBtn() {
		return openAccBtn;
	}

	public WebElement getCustomerslist() {
		return customerslist;
	}
	

}
