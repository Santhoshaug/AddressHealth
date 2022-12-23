package com.zysk.addresshealth.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zysk.addresshealth.pageObjects.ComplaintOtherPage;
import com.zysk.addresshealth.pageObjects.HomePage;
import com.zysk.addresshealth.testComponents.BaseTest;

public class CreateFeverOtherComplaitTest extends BaseTest{
	
	@Test(dataProvider = "getData", groups = "Login")
	public void createComplaint(HashMap<String, String> input) throws Exception {
		alandingPage.loginApplication(input.get("phoneNumber"), input.get("password"));
		ComplaintOtherPage createComplaintOtherPage = new ComplaintOtherPage(driver);
		createComplaintOtherPage.newComplaint();
		createComplaintOtherPage.searchStudent();
		createComplaintOtherPage.complaintDropdown(1);
		createComplaintOtherPage.childAccompained();
		createComplaintOtherPage.duration();
		createComplaintOtherPage.otherComplaints();
		createComplaintOtherPage.examinationFindings();
		createComplaintOtherPage.respiratoryFindings();
		createComplaintOtherPage.permissions();
		createComplaintOtherPage.treatments();
		createComplaintOtherPage.medicines();
		createComplaintOtherPage.doctorReferral();
		createComplaintOtherPage.advice();
		createComplaintOtherPage.outcome();
		createComplaintOtherPage.notes();
		createComplaintOtherPage.save();
		createComplaintOtherPage.backToHome();
		
	

}
	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				System.getProperty("user.dir") + "\\dataSource\\LoginCredentials.json");
		return new Object[][] { { data.get(0) } };
	}
}
