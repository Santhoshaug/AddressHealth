package com.zysk.addresshealth.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zysk.addresshealth.pageObjects.ComplaintAllFieldsPage;
import com.zysk.addresshealth.testComponents.BaseTest;

public class CreatFeverAllFieldsTest extends BaseTest {

	@Test(dataProvider = "getData", groups = "Login")
	public void createComplaint(HashMap<String, String> input) throws Exception {
		alandingPage.loginApplication(input.get("phoneNumber"), input.get("password"));
		ComplaintAllFieldsPage creatComplaintAllFieldsPage = new ComplaintAllFieldsPage(driver);
		creatComplaintAllFieldsPage.newComplaint();
		creatComplaintAllFieldsPage.searchStudent();
		creatComplaintAllFieldsPage.complaintDropdown(1);
		creatComplaintAllFieldsPage.childAccompained();
		creatComplaintAllFieldsPage.duration();
		creatComplaintAllFieldsPage.otherComplaints();
		creatComplaintAllFieldsPage.examinationFindings();
		creatComplaintAllFieldsPage.respiratoryFindings();
		creatComplaintAllFieldsPage.permissions();
		creatComplaintAllFieldsPage.treatments();
		creatComplaintAllFieldsPage.medicines();
		creatComplaintAllFieldsPage.doctorReferral();
		creatComplaintAllFieldsPage.advice();
		creatComplaintAllFieldsPage.outcome();
		creatComplaintAllFieldsPage.notes();
		creatComplaintAllFieldsPage.save();
		creatComplaintAllFieldsPage.backToHome();
		creatComplaintAllFieldsPage.complaintSection();

	}

	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				System.getProperty("user.dir") + "\\dataSource\\LoginCredentials.json");
		return new Object[][] { { data.get(0) } };
	}

}
