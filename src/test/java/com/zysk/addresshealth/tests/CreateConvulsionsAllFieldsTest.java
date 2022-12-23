package com.zysk.addresshealth.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zysk.addresshealth.pageObjects.ComplaintAllFieldsPage;
import com.zysk.addresshealth.testComponents.BaseTest;

public class CreateConvulsionsAllFieldsTest extends BaseTest{
	
	@Test(dataProvider = "getData", groups = "Login")
	public void createComplaint(HashMap<String, String> input) throws Exception {
	alandingPage.loginApplication(input.get("phoneNumber"), input.get("password"));
	ComplaintAllFieldsPage complaintAllFieldsPage = new ComplaintAllFieldsPage(driver);
	try {
		complaintAllFieldsPage.newComplaint();
		complaintAllFieldsPage.searchStudent();
		complaintAllFieldsPage.complaintDropdown(3);
		complaintAllFieldsPage.childAccompained();
		complaintAllFieldsPage.kcoConvulsions();
		complaintAllFieldsPage.examinationFindings();
		complaintAllFieldsPage.consciousness();
		complaintAllFieldsPage.neuroInspections();
		complaintAllFieldsPage.permissions();
		complaintAllFieldsPage.treatments();
		complaintAllFieldsPage.medicines();
		complaintAllFieldsPage.doctorReferral();
		complaintAllFieldsPage.advice();
		complaintAllFieldsPage.outcome();
		complaintAllFieldsPage.notes();
		complaintAllFieldsPage.save();
		complaintAllFieldsPage.backToHome();
		complaintAllFieldsPage.complaintSection();
		
	}
	catch (Exception e) {
		Thread.sleep(5000);
	}
	}
	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				System.getProperty("user.dir") + "\\dataSource\\LoginCredentials.json");
		return new Object[][] { { data.get(0) } };
	}
	
	
	
	

}
