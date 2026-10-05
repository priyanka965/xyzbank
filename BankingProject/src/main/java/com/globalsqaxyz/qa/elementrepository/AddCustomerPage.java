package com.globalsqaxyz.qa.elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver driver;
	public AddCustomerPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[@ng-click='addCust()']")
	private WebElement addCustbtn1;
	
	@FindBy(xpath="//input[@ng-model='fName']")
	private WebElement firstNameTextfield;
	
	@FindBy(xpath="//input[@ng-model='lName']")
	private WebElement lastNameTextfield;
	
	@FindBy(xpath="//input[@ng-model='postCd']")
	private WebElement postalCodeTextfield;
	
	@FindBy(xpath="//button[text()='Add Customer']")
	private WebElement addCustbtn2;
	

	public WebElement getAddCustbtn1() {
		return addCustbtn1;
	}

	public void getFirstNameTextfield(String firstName) {
		 firstNameTextfield.sendKeys(firstName);;
	}

	public void getLastNameTextfield(String lastName) {
		 lastNameTextfield.sendKeys(lastName);;
	}

	public void getPostalCodeTextfield(String postCode) {
		 postalCodeTextfield.sendKeys(postCode);;
	}

	public WebElement getAddCustbtn2() {
		return addCustbtn2;
	}
	
	
	

}
