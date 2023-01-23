package com.crm.Actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Actitime.GernericLibrary.BaseClass;
import com.crm.Actitime.GernericLibrary.ListernnerImplimentation;
import com.crm.Actitime.objectRepository.HomePage;
import com.crm.Actitime.objectRepository.TaskPage;

@Listeners(ListernnerImplimentation.class)	//IN ORDER TO TAKES SS AND STORE IN SCREENSHOT FOLDER

public class CreateCustomer extends BaseClass {

	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(d);
		hp.clickOnTaskTag();
		
		TaskPage tp = new TaskPage(d);
		tp.createCustomer();
		
	}

//	@Test
//	public void createCustomer1() {
//		Assert.fail();
//		Reporter.log("CUTOMER CREATED 1",true);
//		
//	}
}
