package com.zysk.addresshealth.pageObjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.zysk.addresshealth.abstractComponents.AbstractComponent;

public class ComplaintOtherPage extends AbstractComponent{
	WebDriver driver;

	public ComplaintOtherPage(WebDriver driver) {
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

	/********************************Other complaints******************************/
	@FindBy(xpath="//div[.='Other complaints']/following-sibling::div/input")
	List <WebElement> otherCom;
	@FindBy(xpath = "//div[.='Other complaints']/following-sibling::div/div/label")
	List <WebElement> otherComp;
	@FindBy(xpath = "//label[.='Other complaint *']/parent::div/div/input")
	WebElement otherCompText;
	
	By examinationFindings = By.xpath("(//div[@class=' css-19bb58m'])[1]/input");

	By temperature = By.xpath("//div[@data-placeholder='°F']/input");

	By respiratoryFindings = By.xpath("//div[@class='my-1 mx-5']/div[2]/input");
	@FindBy(xpath = "//div[@class='my-1 mx-5']/div[@class='flex my-2']/input")
	List <WebElement> respInbox;
	@FindBy(xpath = "//div[@class='my-1 mx-5']/div[@class='flex my-2']/div/label")
	List <WebElement> respLabel;
	@FindBy(xpath = "//label[.='Other auscultation *']/parent::div/div/input")
	WebElement respText;
	
	@FindBy(xpath = "//label[.='Permissions']/following-sibling::div/div/input")
	List<WebElement> permissions;
	
    /*****************************Treatments**********************/
	@FindBy(xpath="//div[.='Treatments']/following-sibling::div/input")
	List<WebElement> treatmentInput;
	@FindBy(xpath="//div[.='Treatments']/following-sibling::div/div/label")
	List<WebElement> treatmentLabel;
	@FindBy(xpath="//label[.='Other treatment *']/following-sibling::div/input")
	WebElement treatmentText;
	
	By medecines = By.xpath("(//div[@class=' css-19bb58m'])[2]/input");

	By med = By.name("medicinesValues[0]");

	By doctorReferral = By.xpath("//label[.='Referred to AH Doctor *']/following-sibling::div/div/input");
	
	/*****************************Advice**********************/
	@FindBy(xpath="//div[contains(.,'Advices')]/following-sibling::div/input")
	List<WebElement> adviceInput;
	@FindBy(xpath = "//div[contains(.,'Advices')]/following-sibling::div/div/label")
	List<WebElement> adviceLabel;
	@FindBy(xpath = "//label[.='Other advice *']/following-sibling::div/input")
	WebElement adviceText;
	
	@FindBy(xpath = "(//div[@class='my-5'])[3]/div[2]/input")   //4 -fever
	WebElement outcome;
	
	@FindBy(xpath = "//div[.='Outcome *']/following-sibling::div/input")      //4 -fever
	List<WebElement> outcomeInbox;
	@FindBy(xpath = "//div[.='Outcome *']/following-sibling::div/div/label")  //4 -fever
	List<WebElement> outcomeLabel;
	
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
	
	/************************Respiratory findings********************/
	@FindBy(xpath = "//div[.='Inspections *']/following-sibling::div/input")
	List<WebElement> inspectionsInput;
	@FindBy(xpath = "//div[.='Inspections *']/following-sibling::div/div/label")
	List<WebElement> inspectinsLabel;
	@FindBy(xpath = "//label[.='Other inspection *']/parent::div/div/input")
	WebElement inspectionsText;
	
	@FindBy(xpath = "//div[.='Auscultations *']/following-sibling::div/input")
	List<WebElement> auscultationsInput;
	@FindBy(xpath = "//div[.='Auscultations *']/following-sibling::div/div/label")
	List<WebElement> auscultationsLabel;
	@FindBy(xpath = "//label[.='Other auscultation *']/parent::div/div/input")
	WebElement auscultationsText;
	
	/******************************Convulsions*************************/
	@FindBy(xpath = "//label[.='K/C/O convulsion and treatment']/following-sibling::input")
	WebElement kcoConvulsions;
	@FindBy(xpath = "//label[.='K/C/O convulsion and treatment value *']/following-sibling::div/input")
	WebElement kcoConvulsionText;
	
	@FindBy(xpath = "//label[.='Consciousness']/following-sibling::div/div/input")
	List<WebElement>consciousness;
	
	/************************Neurological finding**********************/
	@FindBy(xpath = "//div[.='Inspections *']/following-sibling::div/input")
	List<WebElement> neuroInspectionsInput;
	@FindBy(xpath = "//div[.='Inspections *']/following-sibling::div/div/label")
	List<WebElement> neuroInspectionsLabel;
	@FindBy(xpath = "//label[.='Other inspection *']/parent::div/div/input")
	WebElement neuroInspectionsText;
	
	/************************Descriptions******************************/
	@FindBy(xpath = "//div[contains(.,'Descriptions')]/following-sibling::div/input")
	List<WebElement> descriptionsInput;
	@FindBy(xpath = "//div[contains(.,'Descriptions')]/following-sibling::div/div/label")
	List<WebElement> descriptionsLabel;
	@FindBy(xpath = "//label[.='Other description *']/following-sibling::div/input")
	WebElement descriptionsText;
	
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
		searchStudent.sendKeys("AH1000022");
		Thread.sleep(2000);
		waitForWebElementToAppear(studentName);
		studentName.click();
	}

	public void complaintDropdown(int complaintNo) {
		Select sel = new Select(complaints);
		sel.selectByIndex(complaintNo);
	}

	public void childAccompained() {
		waitForWebElementToAppear(childAccompained);
		Select sel = new Select(childAccompained);
		sel.selectByIndex(2);
	}

	public void duration() throws InterruptedException {
		scrollWebElementAppear(save);
		driver.findElement(day).sendKeys("3");
		driver.findElement(hours).sendKeys("2");
		driver.findElement(minutes).sendKeys("30");
	}

	/***********************************convulsions**********************/
	public void otherComplaints() throws InterruptedException {
		scrollWebElementAppear(save);
		waitForElementToAppear(examinationFindings);
		for(int i=0;i<otherComp.size();i++)
		{
			if(otherComp.get(i).getText().equalsIgnoreCase("other"))
			{
				otherCom.get(i).click();
				otherCompText.sendKeys("cold");
			}
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
		waitForElementToAppear(respiratoryFindings);
		for(int i=0;i<respLabel.size();i++)
		{
			if(respLabel.get(i).getText().equalsIgnoreCase("other"))
			{
				respInbox.get(i).click();
				respText.sendKeys("ronchi");
			}
		}
	}

	public void permissions() {
		scrollWebElementAppear(save);
		permissions.get(0).click();
		
	}

	public void treatments() {
		for(int i=0;i<treatmentLabel.size();i++)
		{
			if(treatmentLabel.get(i).getText().equalsIgnoreCase("other"))
			{
				treatmentInput.get(i).click();
				waitForWebElementToAppear(treatmentText);
				treatmentText.sendKeys("test");
			}
		}
	}

	public void medicines() {
		driver.findElement(medecines).sendKeys("Amrutanjan" + Keys.ENTER);
		waitForElementToAppear(med);
		driver.findElement(med).sendKeys("4");
		
	}

	public void doctorReferral() throws InterruptedException {
		scrollWebElementAppear(save);
		driver.findElements(doctorReferral).get(0).click();
	}

	public void advice() {
		scrollWebElementAppear(save);
		for(int i=0;i<adviceLabel.size();i++)
		{
			if(adviceLabel.get(i).getText().equalsIgnoreCase("other"))
			{
				adviceInput.get(i).click();
				waitForWebElementToAppear(adviceText);
				adviceText.sendKeys("test");
			}
		}
	}

	public void outcome() throws InterruptedException {
		
		for(int i=0;i<outcomeLabel.size();i++)
		{
			if(outcomeLabel.get(i).getText().equalsIgnoreCase("Kept for observation"))
			{
				outcomeInbox.get(i).click();
			}
		}	
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
	
	public void wheeze()
	{
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
		scrollWebElementAppear(save);
		for(int i=0;i<inspectinsLabel.size();i++)
		{
			if(inspectinsLabel.get(i).getText().equalsIgnoreCase("other"))
			{
				inspectionsInput.get(i).click();
				inspectionsText.sendKeys("test");
				
			}
		}
	}
	public void auscultations()
	{
		scrollWebElementAppear(save);
		for(int i=0;i<auscultationsLabel.size();i++)
		{
			if(auscultationsLabel.get(i).getText().equalsIgnoreCase("other"))
			{
				auscultationsInput.get(i).click();
				auscultationsText.sendKeys("test");
			}
		}
	}
	/***********************************convulsions**********************/
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
			if(orientationLabel.get(i).getText().equalsIgnoreCase("yes"))
			{
				orientationInput.get(i).click();
			}
		}
	}
	public void neuroInspections()
	{
		scrollWebElementAppear(save);
		for(int i=0;i<neuroInspectionsLabel.size();i++)
		{
		    if(neuroInspectionsLabel.get(i).getText().equalsIgnoreCase("other"))
		    {
		    	neuroInspectionsInput.get(i).click();
		    	neuroInspectionsText.sendKeys("test");
	   		}
	
		}
	}
	
	/*********************************Descriptions***********************/
	public void descriptions()
	{
		scrollWebElementAppear(save);
		for(int i=0;i<descriptionsLabel.size();i++)
		{
			if(descriptionsLabel.get(i).getText().equalsIgnoreCase("other")) {
			descriptionsInput.get(i).click();
			descriptionsText.sendKeys("test");
			
			}
		}
		
	}
	/*************************************Locations*********************/
	public void locations()
	{	
		scrollWebElementAppear(save);
		for(int i=0;i<locationsLabel.size();i++)
		{
			
			if(locationsLabel.get(i).getText().equals("Other"))
			{
				locationsInput.get(i).click();
				locationText.sendKeys("test");
				
			}
		}
	}
	
	/*****************************How it occured*********************/
	public void howItOccured()
	{
		scrollWebElementAppear(save);
		for(int i=0;i<howItOccuredLabel.size();i++)
		{
			if(howItOccuredLabel.get(i).getText().equalsIgnoreCase("other"))
			{
				howItOccuredInbox.get(i).click();
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
			if(palpationLabel.get(i).getText().equalsIgnoreCase("other"))
			{
				palpationInput.get(i).click();
				palpationText.sendKeys("test");
			}
		}
	}
	
	/************************diagnosis**************************************/
	public void diagnosis()
	{
		scrollWebElementAppear(save);
		for(int i=0;i<diagnosisLabel.size();i++)
		{
			
			if(diagnosisLabel.get(i).getText().equalsIgnoreCase("other"))
			{
				diagnosisLabel.get(i).click();
				diagnosisText.sendKeys("test");
			}
		}
		
	}
	
	/************************Covid** Rapid antigen test************************************/
    public void rapidAntegenTest()
    {
    	scrollWebElementAppear(save);
    	repidAntigenTest.click();
    	waitForWebElementToAppear(rtPcr);
    	for(int i=0;i<resultsLabel.size();i++)
    	{
    		if(resultsLabel.get(i).getText().equals("Positive"))
    		{
    			resultsInbox.get(i).click();
    		}
    		
    	}
    	rtPcr.click();
    	
    }

}
