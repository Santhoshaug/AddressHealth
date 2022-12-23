package com.zysk.addresshealth.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zysk.addresshealth.pageObjects.ComplaintAllFieldsPage;
import com.zysk.addresshealth.testComponents.BaseTest;

public class CreateInjuryAllFieldsTest extends BaseTest {
	@Test(dataProvider = "getData", groups = "Login")
	public void createComplaint(HashMap<String, String> input) throws Exception {
		alandingPage.loginApplication(input.get("phoneNumber"), input.get("password"));
		ComplaintAllFieldsPage complaintAllFieldsPage=new ComplaintAllFieldsPage(driver);
		try {
		
			complaintAllFieldsPage.newComplaint();
			complaintAllFieldsPage.searchStudent();
			complaintAllFieldsPage.complaintDropdown(6);
			complaintAllFieldsPage.childAccompained();
			complaintAllFieldsPage.locations();
			complaintAllFieldsPage.howItOccured();
			complaintAllFieldsPage.descriptions();
			complaintAllFieldsPage.examinationFindings();
			complaintAllFieldsPage.orientation();
			complaintAllFieldsPage.consciousness();
			complaintAllFieldsPage.permissions();
			complaintAllFieldsPage.treatments();
			complaintAllFieldsPage.medicines();
			complaintAllFieldsPage.doctorReferral();
			complaintAllFieldsPage.advice();
			complaintAllFieldsPage.outcome();
			complaintAllFieldsPage.notes();
			complaintAllFieldsPage.save();
			complaintAllFieldsPage.backToHome();
			
			
		} catch (Exception e) {
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
