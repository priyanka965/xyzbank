package com.globalsqaxyz.qa.elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CustomerLoginPage {
	
	WebDriver driver;
	public CustomerLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//select[@ng-model='custId']")
	private WebElement custDd;
	
	
	@FindBy(xpath="//button[text()='Home']")
	private WebElement homeBtn;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//label[text()='Your Name :']")
	private WebElement custPageText;
	
	public void getCustDd() {
		Select sel=new Select(custDd);
		//sel.selectByValue("1");
		//sel.selectByValue("2");
		//sel.selectByValue("3");
		//sel.selectByValue("4");
		//sel.selectByValue("5");
		//sel.selectByValue("6");
		//sel.selectByValue("7");
		//sel.selectByValue("8");
         sel.selectByValue("4");
		
	}
	
	
	
	public WebElement getHomeBtn() {
		return homeBtn;
	}

    public WebElement getLoginBtn() {
		return loginBtn;
	}



	public WebElement getCustPageText() {
		return custPageText;
	}




	
	

}
