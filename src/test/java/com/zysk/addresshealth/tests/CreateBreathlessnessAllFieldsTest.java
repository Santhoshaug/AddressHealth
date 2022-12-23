package com.zysk.addresshealth.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zysk.addresshealth.pageObjects.ComplaintAllFieldsPage;
import com.zysk.addresshealth.pageObjects.ComplaintOtherPage;
import com.zysk.addresshealth.testComponents.BaseTest;

public class CreateBreathlessnessAllFieldsTest extends BaseTest{
	
	@Test(dataProvider = "getData", groups = "Login")
	public void createComplaint(HashMap<String, String> input) throws Exception {
	alandingPage.loginApplication(input.get("phoneNumber"), input.get("password"));
	ComplaintAllFieldsPage creatComplaintAllFieldsPage=new ComplaintAllFieldsPage(driver);
	creatComplaintAllFieldsPage.newComplaint();
	creatComplaintAllFieldsPage.searchStudent();
	creatComplaintAllFieldsPage.complaintDropdown(2);
	creatComplaintAllFieldsPage.childAccompained();
	creatComplaintAllFieldsPage.duration();
	creatComplaintAllFieldsPage.otherComplaints();
	creatComplaintAllFieldsPage.wheeze();
	creatComplaintAllFieldsPage.illeness();
	creatComplaintAllFieldsPage.examinationFindings();
	creatComplaintAllFieldsPage.inspections();
	creatComplaintAllFieldsPage.auscultations();
	creatComplaintAllFieldsPage.permissions();
	creatComplaintAllFieldsPage.treatments();
	creatComplaintAllFieldsPage.medicines();
	creatComplaintAllFieldsPage.doctorReferral();
	creatComplaintAllFieldsPage.outcome();
	creatComplaintAllFieldsPage.notes();
	creatComplaintAllFieldsPage.save();
	
	
	
}


@DataProvider
public Object[][] getData() throws IOException {

	List<HashMap<String, String>> data = getJsonDataToMap(
			System.getProperty("user.dir") + "\\dataSource\\LoginCredentials.json");
	return new Object[][] { { data.get(0) } };
}


}
