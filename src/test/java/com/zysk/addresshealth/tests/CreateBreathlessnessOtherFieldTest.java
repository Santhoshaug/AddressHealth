package com.zysk.addresshealth.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zysk.addresshealth.pageObjects.ComplaintOtherPage;
import com.zysk.addresshealth.testComponents.BaseTest;

public class CreateBreathlessnessOtherFieldTest extends BaseTest{
	@Test(dataProvider = "getData", groups = "Login")
	public void createComplaint(HashMap<String, String> input) throws Exception {
	alandingPage.loginApplication(input.get("phoneNumber"), input.get("password"));
	ComplaintOtherPage createComplaintOtherPage=new ComplaintOtherPage(driver);
	createComplaintOtherPage.newComplaint();
	createComplaintOtherPage.searchStudent();
	createComplaintOtherPage.complaintDropdown(2);
	createComplaintOtherPage.childAccompained();
	createComplaintOtherPage.duration();
	createComplaintOtherPage.otherComplaints();
	createComplaintOtherPage.wheeze();
	createComplaintOtherPage.illeness();
	createComplaintOtherPage.examinationFindings();
	createComplaintOtherPage.inspections();
	createComplaintOtherPage.auscultations();
	createComplaintOtherPage.permissions();
	createComplaintOtherPage.treatments();
	createComplaintOtherPage.medicines();
	createComplaintOtherPage.doctorReferral();
	createComplaintOtherPage.outcome();
	createComplaintOtherPage.notes();
	createComplaintOtherPage.save();
	
	
	
}


@DataProvider
public Object[][] getData() throws IOException {

	List<HashMap<String, String>> data = getJsonDataToMap(
			System.getProperty("user.dir") + "\\dataSource\\LoginCredentials.json");
	return new Object[][] { { data.get(0) } };
}

}
