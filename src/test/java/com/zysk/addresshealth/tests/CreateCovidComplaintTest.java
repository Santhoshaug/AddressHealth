package com.zysk.addresshealth.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zysk.addresshealth.pageObjects.ComplaintPage;
import com.zysk.addresshealth.testComponents.BaseTest;

public class CreateCovidComplaintTest extends BaseTest {
	@Test(dataProvider = "getData", groups = "Login")
	public void createComplaint(HashMap<String, String> input) throws Exception {
		alandingPage.loginApplication(input.get("phoneNumber"), input.get("password"));
		ComplaintPage complaintPage = new ComplaintPage(driver);
		try {

			complaintPage.newComplaint();
			complaintPage.searchStudent();
			complaintPage.complaintDropdown(8);
			complaintPage.childAccompained();
			complaintPage.otherComplaints();
			complaintPage.examinationFindings();
			complaintPage.auscultations();
			complaintPage.rapidAntegenTest();
			complaintPage.permissions();
			complaintPage.treatments();
			complaintPage.medicines();
			complaintPage.doctorReferral();
			complaintPage.advice();
			complaintPage.outcome();
			complaintPage.notes();
			complaintPage.save();
			complaintPage.backToHome();
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
