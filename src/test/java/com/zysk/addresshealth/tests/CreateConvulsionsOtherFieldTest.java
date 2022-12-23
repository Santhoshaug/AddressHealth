package com.zysk.addresshealth.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zysk.addresshealth.pageObjects.ComplaintOtherPage;
import com.zysk.addresshealth.testComponents.BaseTest;

public class CreateConvulsionsOtherFieldTest extends BaseTest{
	
	@Test(dataProvider = "getData", groups = "Login")
	public void createComplaint(HashMap<String, String> input) throws Exception {
	alandingPage.loginApplication(input.get("phoneNumber"), input.get("password"));
	ComplaintOtherPage complaintOtherPage=new ComplaintOtherPage(driver);
	try {
		complaintOtherPage.newComplaint();
		complaintOtherPage.searchStudent();
		complaintOtherPage.complaintDropdown(3);
		complaintOtherPage.childAccompained();
		complaintOtherPage.kcoConvulsions();
		complaintOtherPage.examinationFindings();
		complaintOtherPage.consciousness();
		complaintOtherPage.neuroInspections();
		complaintOtherPage.permissions();
		complaintOtherPage.treatments();
		complaintOtherPage.medicines();
		complaintOtherPage.doctorReferral();
		complaintOtherPage.advice();
		complaintOtherPage.outcome();
		complaintOtherPage.notes();
		complaintOtherPage.save();
		complaintOtherPage.backToHome();
	

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
