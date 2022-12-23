package com.zysk.addresshealth.pageObjects;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zysk.addresshealth.abstractComponents.AbstractComponent;

public class HomePage extends AbstractComponent {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[contains(@class,'max-w-xl')]")
	WebElement nurseName;

	@FindBy(xpath = "//p[@class='ml-16 truncate text-sm font-medium text-gray-500']")
	List<WebElement> stats;

	@FindBy(xpath = "//p[@class='text-2xl font-semibold text-gray-900']")
	List<WebElement> number;

	// List<WebElement> lists1 = driver.findElements(By.xpath("//p[@class='ml-16
	// truncate text-sm font-medium text-gray-500']"));
	public String Nursename() {
		waitForWebElementToAppear(nurseName);
		return nurseName.getText();

	}

	public ComplaintPage stats() {

		for (int i = 0; i <= 2; i++) {
			System.out.print(stats.get(i).getText());
			System.out.print("\t");
			System.out.println(number.get(i).getText());

		}
		ComplaintPage createComplaintPage=new ComplaintPage(driver);
		return createComplaintPage;
	}
}