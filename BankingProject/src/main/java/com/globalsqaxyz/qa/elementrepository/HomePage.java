package com.globalsqaxyz.qa.elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	 
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//button[text()='Home']")
	private WebElement homeButton;
	
	@FindBy(xpath="//button[text()='Customer Login']")
	private WebElement custLoginBtn;
	
	@FindBy(xpath="//button[text()='Bank Manager Login']")
	private WebElement mngrLoginBtn;
	
	@FindBy(xpath="//button[text()='XYZ Bank']")
	private WebElement titleText;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getHomeButton() {
		return homeButton;
	}

	public WebElement getCustLoginBtn() {
		return custLoginBtn;
	}

	public WebElement getMngrLoginBtn() {
		return mngrLoginBtn;
	}

	public WebElement getTitleText() {
		return titleText;
	}
	
	
	

}
