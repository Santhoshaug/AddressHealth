package com.zysk.addresshealth.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zysk.addresshealth.pageObjects.ComplaintAllFieldsPage;
import com.zysk.addresshealth.testComponents.BaseTest;

public class CreateAbdomenPainAllFields extends BaseTest {
	
	@Test(dataProvider = "getData", groups = "Login")
	public void createComplaint(HashMap<String, String> input) throws Exception {
	alandingPage.loginApplication(input.get("phoneNumber"), input.get("password"));
	ComplaintAllFieldsPage complaintAllFieldsPage=new ComplaintAllFieldsPage(driver);
		complaintAllFieldsPage.newComplaint();
		complaintAllFieldsPage.searchStudent();
		complaintAllFieldsPage.complaintDropdown(7);
		complaintAllFieldsPage.childAccompained();
		complaintAllFieldsPage.duration();
		complaintAllFieldsPage.locations();
		complaintAllFieldsPage.examinationFindings();
		complaintAllFieldsPage.palpations();
		complaintAllFieldsPage.permissions();
		complaintAllFieldsPage.treatments();
		complaintAllFieldsPage.medicines();
		complaintAllFieldsPage.diagnosis();
		complaintAllFieldsPage.doctorReferral();
		complaintAllFieldsPage.advice();
		try {
		complaintAllFieldsPage.outcome();
		complaintAllFieldsPage.notes();
		complaintAllFieldsPage.save();
		complaintAllFieldsPage.backToHome();
		complaintAllFieldsPage.complaintSection();
	
	}
	catch(Exception e)
	{
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
