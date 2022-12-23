package com.zysk.addresshealth.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zysk.addresshealth.pageObjects.ComplaintPage;
import com.zysk.addresshealth.testComponents.BaseTest;

public class CreateConvulsionsComplaintTest extends BaseTest {
	
	@Test(dataProvider = "getData", groups = "Login")
	public void createComplaint(HashMap<String, String> input) throws Exception {
	alandingPage.loginApplication(input.get("phoneNumber"), input.get("password"));
	ComplaintPage createComplaintPage=new ComplaintPage(driver);
	createComplaintPage.newComplaint();
	createComplaintPage.searchStudent();
	createComplaintPage.complaintDropdown(3);
	createComplaintPage.childAccompained();
	createComplaintPage.kcoConvulsions();
	createComplaintPage.examinationFindings();
	createComplaintPage.consciousness();
	createComplaintPage.neuroInspections();
	createComplaintPage.permissions();
	createComplaintPage.treatments();
	createComplaintPage.medicines();
	createComplaintPage.doctorReferral();
	createComplaintPage.advice();
	createComplaintPage.outcome();
	createComplaintPage.notes();
	createComplaintPage.save();
	createComplaintPage.backToHome();
	
	
	
	
	}
	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				System.getProperty("user.dir") + "\\dataSource\\LoginCredentials.json");
		return new Object[][] { { data.get(0) } };
	}


}
