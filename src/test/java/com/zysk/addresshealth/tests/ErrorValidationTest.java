package com.zysk.addresshealth.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zysk.addresshealth.pageObjects.HomePage;
import com.zysk.addresshealth.testComponents.BaseTest;
import com.zysk.addresshealth.testComponents.Retry;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ErrorValidationTest extends BaseTest{
	
	@Test(dataProvider = "getData", groups = {"ErrorHandling","Login"},retryAnalyzer = Retry.class)
	public void errorValidation(HashMap<String, String> input) throws Exception
	{
		
		HomePage homePage = alandingPage.loginApplication(input.get("phoneNumber"), input.get("password"));
		Assert.assertEquals("Invalid credentials", alandingPage.getErrorMessage()); 
		
	}
	
	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String, String>> data = getJsonDataToMap(
				System.getProperty("user.dir") + "\\dataSource\\LoginCredentials.json");
		return new Object[][] { { data.get(1) } };
	}
	
}
