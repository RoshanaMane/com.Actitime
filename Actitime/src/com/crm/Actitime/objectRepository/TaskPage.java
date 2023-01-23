package com.crm.Actitime.objectRepository;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Actitime.GernericLibrary.ReadDataFromExcelFile;

public class TaskPage {
		//DECLRATION
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addNewbtn;
	
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newCustomerbtn;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement customerNameText;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement cutomerDescriptionText;
	
	@FindBy(xpath = "(//div[.='- Select Customer -'])[2]")
	private WebElement dropDown;
	
	@FindBy(xpath = "(//div[@class='itemRow cpItemRow '])[6]")
	private WebElement companyName;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createCutomerbtn;
	
		//INTIALIZATION
	public TaskPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

		//UTILIZATION

	public WebElement getAddNewbtn() {
		return addNewbtn;
	}

	public WebElement getNewCustomerbtn() {
		return newCustomerbtn;
	}

	public WebElement getCustomerNameText() {
		return customerNameText;
	}

	public WebElement getCutomerDescriptionText() {
		return cutomerDescriptionText;
	}

	public WebElement getDropDown() {
		return dropDown;
	}

	public WebElement getCompanyName() {
		return companyName;
	}

	public WebElement getCreateCutomerbtn() {
		return createCutomerbtn;
	}
			
		//BUSINESS LOGIC
	public void createCustomer() throws EncryptedDocumentException, IOException {
			//OBJECT To get user input
		ReadDataFromExcelFile r = new ReadDataFromExcelFile();
		String name = r.readDataFromExcel("Sheet1", 1, 1);
		String desc = r.readDataFromExcel("Sheet1", 1, 2);
		
		addNewbtn.click();
		newCustomerbtn.click();
		customerNameText.sendKeys(name);
		cutomerDescriptionText.sendKeys(desc);
		dropDown.click();
		companyName.click();
		createCutomerbtn.click();
		
	}

	
}
