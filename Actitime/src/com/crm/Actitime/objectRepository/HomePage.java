package com.crm.Actitime.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  {
		//DECLRATION
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement taskLink;
	
	@FindBy(xpath="c//div[.='Time-Track']")
	private WebElement timeTrackLink;
	
	@FindBy(xpath ="c//div[.='Reports']")
	private WebElement reportsLink;
	
	@FindBy(xpath="//div[.='Users']")
	private WebElement usersLink;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	
		//INTIALIZATION
	public HomePage(WebDriver d){
		PageFactory.initElements(d, this);
		
	}

		//UTILIZATION
	public WebElement getTaskLink() {
		return taskLink;
	}


	public WebElement getTimeTrackLink() {
		return timeTrackLink;
	}


	public WebElement getReportsLink() {
		return reportsLink;
	}


	public WebElement getUsersLink() {
		return usersLink;
	}


	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
		//BUSINESS LOGIC
	public void clickOnTaskTag() {
		taskLink.click();
	}
}
