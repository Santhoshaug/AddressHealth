package com.zysk.addresshealth.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.zysk.addresshealth.abstractComponents.AbstractComponent;

public class ComplaintPage extends AbstractComponent {

	WebDriver driver;

	public ComplaintPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*******************Page element identifiers**********************************/
	
	@FindBy(xpath = "//button[contains(@class,'relative inline-flex')]")
	WebElement newComplaint;
	@FindBy(xpath = "//input[@placeholder='Search Student name or AH Id *']")
	WebElement searchStudent;
	@FindBy(xpath = "//ul[contains(@class,'absolute w-full z-50 max-h-48')]/li/div")
	WebElement studentName;
	@FindBy(xpath = "//select[contains(@class,'block w-full flex-1')]")
	WebElement complaints;
	@FindBy(name = "child_occupanied_by")
	WebElement childAccompained;

	By day = By.name("duration.days");
	By hours = By.name("duration.hours");
	By minutes = By.name("duration.minutes");

	/*****************************Breathlessness**********************/
	@FindBy(xpath="//div[.='Other complaints']/following-sibling::div/input")
	List<WebElement> otherComplaints;

	By examinationFindings = By.xpath("(//div[@class=' css-19bb58m'])[1]/input");

	By temperature = By.xpath("//div[@data-placeholder='°F']/input");

	By respiratoryFindings = By.xpath("//div[@class='my-1 mx-5']/div[2]/input");

	@FindBy(xpath = "//label[.='Permissions']/following-sibling::div/div/input")
	List<WebElement> permissions;
	@FindBy(xpath = "//div[.='Treatments']/following-sibling::div/input")
	List<WebElement> treatments;

	By medecines = By.xpath("(//div[@class=' css-19bb58m'])[2]/input");

	By med = By.name("medicinesValues[0]");

	By doctorReferral = By.xpath("(//div[@class='items-center my-4'])[2]/div/div/input");

	@FindBy(xpath = "//div[contains(.,'Advices')]/following-sibling::div/input")
	List<WebElement> advice;
	//fever-@FindBy(xpath = "(//div[@class='my-5'])[4]/div[5]/input")
	@FindBy(xpath = "//div[.='Outcome *']/following-sibling::div/input")
	List<WebElement> outcome;
	
	By notes = By.name("notes");

	@FindBy(xpath = "//button[@type='submit']")
	WebElement save;
	@FindBy(xpath = "(//button[@type='button'])[7]")
	WebElement backToHome;
	
	/*****************************Breathlessness**********************/
	
	@FindBy(xpath = "//label[.='K/C/O wheeze and treatment']/following-sibling::input")
	WebElement wheeze;
	@FindBy(id="other_ho_wheeze_and_treatment")
	WebElement wheeztText;
	
	@FindBy(xpath = "//label[.='K/C/O recent illness']/following-sibling::input")
	WebElement illeness;
	@FindBy(id="other_ho_recent_illness")
	WebElement illenessText;
	
	/******************************Convulsions*************************/
	@FindBy(xpath = "//label[.='K/C/O convulsion and treatment']/following-sibling::input")
	WebElement kcoConvulsions;
	@FindBy(xpath = "//label[.='K/C/O convulsion and treatment value *']/following-sibling::div/input")
	WebElement kcoConvulsionText;
	
	@FindBy(xpath = "//label[.='Consciousness']/following-sibling::div/div/input")
	List<WebElement>consciousness;
	
	/************************Respiratory findings********************/
	@FindBy(xpath = "//div[.='Inspections *']/following-sibling::div/input")
	List<WebElement> inspections;
	
	@FindBy(xpath = "//div[.='Auscultations *']/following-sibling::div/input")
	List<WebElement> auscultations;
	
	/************************Neurological finding**********************/
	@FindBy(xpath = "//div[.='Inspections *']/following-sibling::div/input")
	List<WebElement> neuroInspections;
	
	/************************Descriptions******************************/
	@FindBy(xpath = "//div[contains(.,'Descriptions')]/following-sibling::div/input")
	List<WebElement> descriptionsInput;
	@FindBy(xpath = "//div[contains(.,'Descriptions')]/following-sibling::div/div/label")
	List<WebElement> descriptionsLabel;
	
	/*************************Locations**********************************/
	@FindBy(xpath = "//div[contains(.,'Locations')]/following-sibling::div/input")
	List<WebElement> locationsInput;
	@FindBy(xpath = "//div[contains(.,'Locations')]/following-sibling::div/div/label")
	List<WebElement> locationsLabel;
	@FindBy(xpath = "//label[.='Other location *']/following-sibling::div/input")
	WebElement locationText;
	
	/*************************How it occured**********************************/
	@FindBy(xpath = "//label[.='How it occurred']/following-sibling::div/div/input")
	List<WebElement> howItOccuredInbox;
	@FindBy(xpath = "//label[.='How it occurred']/following-sibling::div/div/label")
	List<WebElement> howItOccuredLabel;
	@FindBy(xpath = "//label[.='Other *']/following-sibling::div/input")
	WebElement howItOccuredText;
	
	/************************Orientation**************************************/
	@FindBy(xpath = "//label[.='Orientation']/following-sibling::div/div/input")
	List<WebElement> orientationInput;
	@FindBy(xpath = "//label[.='Orientation']/following-sibling::div/div/label")
	List<WebElement> orientationLabel;
	
	/************************Palpations**************************************/
	@FindBy(xpath = "//div[.='Palpations']/following-sibling::div/input")
	List<WebElement> palpationInput;
	@FindBy(xpath = "//div[.='Palpations']/following-sibling::div/div/label")
	List<WebElement> palpationLabel;
	@FindBy(xpath = "//label[.='Other palpation *']/following-sibling::div/input")
	WebElement palpationText;
	
	/************************Diagnosis**************************************/
	@FindBy(xpath = "//div[.='Diagnosis *']/following-sibling::div/input")
	List<WebElement> diagnosisInput;
	@FindBy(xpath = "//div[.='Diagnosis *']/following-sibling::div/div/label")
	List<WebElement> diagnosisLabel;
	@FindBy(xpath = "//label[.='Other diagnosis *']/following-sibling::div/input")
	WebElement diagnosisText;
	
	/************************Covid** Rapid antigen test************************************/
	@FindBy(xpath = "//label[.='Rapid antigen test']/following-sibling::input")
	WebElement repidAntigenTest;
	@FindBy(xpath = "//label[.='Result *']/following-sibling::div/div/input")
	List<WebElement> resultsInbox;
	@FindBy(xpath = "//label[.='Result *']/following-sibling::div/div/label")
	List<WebElement> resultsLabel;
	@FindBy(xpath = "//label[.='Sample collected for RT PCR']/following-sibling::input")
	WebElement rtPcr;
	
	
	
	/**********************************************************************/
	

	public void newComplaint() {
		waitForWebElementToAppear(newComplaint);
		newComplaint.click();
	}

	public void searchStudent() throws InterruptedException {
		waitForWebElementToAppear(searchStudent);
		searchStudent.click();
		searchStudent.sendKeys("AH1000020");
		Thread.sleep(2000);
		waitForWebElementToAppear(studentName);
		studentName.click();
	}

	public void complaintDropdown(int complaintNo) {
		Select sel = new Select(complaints);
		//sel.selectByIndex(1);
		sel.selectByIndex(complaintNo);
	}

	public void childAccompained() {
		waitForWebElementToAppear(childAccompained);
		Select sel = new Select(childAccompained);
		sel.selectByIndex(3);
		scrollWebElementAppear(save);
	}

	public void duration() throws InterruptedException {
		scrollWebElementAppear(save);
		driver.findElement(day).sendKeys("3");
		driver.findElement(hours).sendKeys("2");
		driver.findElement(minutes).sendKeys("30");
	}

	public void otherComplaints() throws InterruptedException {
		scrollWebElementAppear(save);
		for(int i=0;i<otherComplaints.size();i++)
		{
			otherComplaints.get(0).click();
			break;
		}
	}

	public void examinationFindings() throws InterruptedException {

		driver.findElement(examinationFindings).sendKeys("temperature" + Keys.ENTER);
		waitForElementToAppear(temperature);
		driver.findElement(temperature).sendKeys("98");
	}

	public void respiratoryFindings() throws InterruptedException {
		scrollWebElementAppear(save);
		driver.findElement(respiratoryFindings).click();
	}

	public void permissions() {
		scrollWebElementAppear(save);
		permissions.get(0).click();
		
	}

	public void treatments() {
		treatments.get(0).click();
	}

	public void medicines() {
		driver.findElement(medecines).sendKeys("Amrutanjan" + Keys.ENTER);
		waitForElementToAppear(med);
		driver.findElement(med).sendKeys("4");
	}

	public void doctorReferral() throws InterruptedException {
		scrollWebElementAppear(save);
		driver.findElement(doctorReferral).click();
	}

	public void advice() {
		scrollWebElementAppear(save);
		advice.get(0).click();
	}

	public void outcome() throws InterruptedException {
		scrollWebElementAppear(save);
		outcome.get(0).click();
	}

	public void notes() {
		driver.findElement(notes).sendKeys("test");
	}

	public void save() throws InterruptedException {
		scrollWebElementAppear(save);
		save.click();
	}
	public void backToHome() throws InterruptedException
	{
		waitForWebElementToAppear(backToHome);
		backToHome.click();
		Thread.sleep(5000);
	}
	/**********************************Breathlessness*************************/
	public void wheeze()
	{
		scrollWebElementAppear(save);
		wheeze.click();
		wheeztText.sendKeys("test");
	}
	public void illeness()
	{
		illeness.click();
		illenessText.sendKeys("test");
	}
	public void inspections()
	{
		inspections.get(0).click();
	}
	public void auscultations()
	{
		scrollWebElementAppear(save);
		auscultations.get(0).click();
	}
	
	/***********************************Convulsions**********************/
	public void kcoConvulsions()
	{
		scrollWebElementAppear(save);
		kcoConvulsions.click();
		kcoConvulsionText.sendKeys("test");
	}
	
	/********************************Consciousness***********************/
	public void consciousness()
	{
		consciousness.get(0).click();
	}
	
	/******************************Orientation****************************/
	public void orientation()
	{
		scrollWebElementAppear(save);
		for(int i=0;i<orientationLabel.size();i++)
		{
			if(orientationLabel.get(i).getText().equalsIgnoreCase("Yes"))
			{
				orientationInput.get(i).click();
			}
		}
	}
	
	public void neuroInspections()
	{
		neuroInspections.get(0).click();
	}
	
	/*********************************Descriptions***********************/
	public void descriptions()
	{
		scrollWebElementAppear(save);	
		for(int i=0;i<descriptionsInput.size();i++)
		{
			descriptionsInput.get(0).click();
		break;
		}
		
	}
	/*************************************Locations*********************/
	public void locations()
	{
		//scrollWebElementAppear(save);
		for(int i=0;i<locationsInput.size();i++)
		{
		locationsInput.get(0).click();
		break;
		}
	}
	
	/*****************************How it occured
	 * @throws InterruptedException *********************/
	public void howItOccured() throws InterruptedException
	{
		scrollWebElementAppear(save);
		for(int i=0;i<howItOccuredLabel.size();i++)
		{
			if(howItOccuredLabel.get(i).getText().equalsIgnoreCase("other"))
			{
				howItOccuredInbox.get(i).click();
				Thread.sleep(2000);
				howItOccuredText.sendKeys("test");
			}
		}
	}
	
	/************************Palpations**************************************/
	public void palpations()
	{
		scrollWebElementAppear(save);
		for(int i=0;i<palpationLabel.size();i++)
		{
			palpationInput.get(0).click();
			break;
		}
	}
	
	/************************diagnosis**************************************/
	public void diagnosis()
	{
		scrollWebElementAppear(save);
		diagnosisInput.get(0).click();
		
	}
	
	/************************Covid** Rapid antigen test************************************/
    public void rapidAntegenTest()
    {
    	repidAntigenTest.click();
    	waitForWebElementToAppear(rtPcr);
    	for(int i=0;i<resultsLabel.size();i++)
    	{
    		if(resultsLabel.get(i).getText().equals("Positive"))
    		{
    			resultsInbox.get(i).click();
    			break;
    		}
    		
    	}
    	rtPcr.click();
    	
    }
	
	

}
