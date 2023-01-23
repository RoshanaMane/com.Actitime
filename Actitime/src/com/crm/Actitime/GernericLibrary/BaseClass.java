package com.crm.Actitime.GernericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.crm.Actitime.objectRepository.LoginPage;

public class BaseClass {
	public static WebDriver d;	// in order to get access in every annotation
	ReadDataFromPropertyFile r = new ReadDataFromPropertyFile(); //Property file object
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
//==========================================================

	@BeforeSuite
	public void dataBaseConnection() {
		Reporter.log("DataBase Connected",true);
	}
	@AfterSuite
	public void dataBaseDisconnection() {
		Reporter.log("DataBase Dis-connected",true);
	}
	
//==========================================================

	@BeforeTest
	public void launchBrowser() throws IOException {
		Reporter.log("Browser Launched Succesfully",true);
		
		 d = new ChromeDriver();
		 d.manage().window().maximize();
		 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 String URL = r.readDataFromProperty("url");
		 d.get(URL);
		
	}
	@AfterTest
	public void closeBrowser() {
		Reporter.log("Browser Closed Succesfully",true);
		d.close();
	}
	
//==========================================================
	
	@BeforeMethod
	public void loginToActiTime() throws IOException {
		Reporter.log("Login Sucesfully",true);
		
		String UN = r.readDataFromProperty("username");		
		String PW = r.readDataFromProperty("password");
				
			//OBJECT OF POM CLASS
		LoginPage lp = new LoginPage(d);
		lp.loginToActitime(UN, PW);
	}
	@AfterMethod
	public void logoutToActiTime() throws InterruptedException {	
		
		Thread.sleep(3000);
		d.findElement(By.xpath("//a[.='Logout']")).click();
		Reporter.log("Logout Sucesfully",true);
	}
}
