package com.zysk.addresshealth.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zysk.addresshealth.abstractComponents.AbstractComponent;

public class ALandingPage extends AbstractComponent {

	WebDriver driver;

	public ALandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "phone_number")
	WebElement phoneNumber;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//button[contains(@class,'w-full')]")
	WebElement signin;

	@FindBy(xpath = "//div[@class='mt-6']/p")
	WebElement errorMessage;

	public void goTo() {
		driver.get("https://address-health-revamp-git-dev-v2-zysktech.vercel.app/login");
	}

	public HomePage loginApplication(String email, String pwd) {
		phoneNumber.sendKeys(email);
		password.sendKeys(pwd);
		signin.click();
		HomePage homePage = new HomePage(driver);
		return homePage;
	}

	public String getErrorMessage() {
		waitForWebElementToAppear(errorMessage);
		return errorMessage.getText();
	}

}