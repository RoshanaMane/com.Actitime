package com.crm.Actitime.objectRepository;	//pom also known as Object repository


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
		//DECLRATION
	@FindBy(id = "username")
	private WebElement untbx;
	
	@FindBy(name = "pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement lgnbtn;
	
		//INITILIZATION
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
		//DECLERATION
	public WebElement getUntbx() {
		return untbx;
	}

	public WebElement getPwtbx() {
		return pwtbx;
	}

	public WebElement getLgnbtn() {
		return lgnbtn;
	}
	
		//BUSINESS LOGIC
	public void loginToActitime(String UN, String PW) {
			// as we not hard coding...create obj
		
			//USERNAME
		untbx.sendKeys(UN);
			//PASSWORD
		pwtbx.sendKeys(PW);
			//LOGIN
		lgnbtn.click();
	}
	
	
}
