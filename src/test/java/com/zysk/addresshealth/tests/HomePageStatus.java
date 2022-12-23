package com.zysk.addresshealth.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zysk.addresshealth.pageObjects.HomePage;
import com.zysk.addresshealth.testComponents.BaseTest;

public class HomePageStatus extends BaseTest {

	@Test(dataProvider = "getData", groups = "Login")
	public void loginApp(HashMap<String, String> input) throws Exception {
		HomePage homePage = alandingPage.loginApplication(input.get("phoneNumber"), input.get("password"));
		Thread.sleep(5000);
		System.out.println(homePage.Nursename());
		homePage.stats();
	}

	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				System.getProperty("user.dir") + "\\dataSource\\LoginCredentials.json");
		return new Object[][] { { data.get(0) } };
	}

}
