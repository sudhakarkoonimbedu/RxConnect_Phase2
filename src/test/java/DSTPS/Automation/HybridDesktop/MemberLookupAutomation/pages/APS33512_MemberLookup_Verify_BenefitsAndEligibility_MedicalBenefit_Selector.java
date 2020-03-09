package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;

public class APS33512_MemberLookup_Verify_BenefitsAndEligibility_MedicalBenefit_Selector 
{	
	private HybridDesktop_SharedResource SharedResource;
	private RxNova_Utlilty utils;
	private WebDriver driver;

	public ArrayList<String> actBAEMedicalBenefitsDetails = new ArrayList<String>();
	
	private By BE_MEDICALBENEFIT_LINK,BE_MEDICALBENEFIT_TABLE;	
	private By BE_MEDICALBENEFIT_HRA,BE_MEDICALBENEFIT_FSA,BE_MEDICALBENEFIT_HSA,BE_MEDICALBENEFIT_ADJ,BE_MEDICALBENEFIT_SPAP;
	
	
	public APS33512_MemberLookup_Verify_BenefitsAndEligibility_MedicalBenefit_Selector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable
	{
		this.SharedResource = SharedResource;
		this.utils = utils;
		driver = SharedResource.getDriver();
		MemberLookup_BenefitsEligibility_MedicalBenefit_Objects();
	}
	public void MemberLookup_BenefitsEligibility_MedicalBenefit_Objects() throws Throwable
	{
		BE_MEDICALBENEFIT_LINK = By.linkText("Medical Benefit");
		BE_MEDICALBENEFIT_TABLE = By.id("benefitsSelectionForm:benefitsAccordionPanel:dualCoverageTab");
		BE_MEDICALBENEFIT_HRA = By.id("benefitsSelectionForm:benefitsAccordionPanel:cdhpRadio:0");
		BE_MEDICALBENEFIT_FSA = By.id("benefitsSelectionForm:benefitsAccordionPanel:cdhpRadio:1");
		BE_MEDICALBENEFIT_HSA = By.id("benefitsSelectionForm:benefitsAccordionPanel:cdhpRadio:2");
		BE_MEDICALBENEFIT_ADJ = By.id("benefitsSelectionForm:benefitsAccordionPanel:cdhpRadio:3");
		BE_MEDICALBENEFIT_SPAP = By.id("benefitsSelectionForm:benefitsAccordionPanel:cdhpRadio:4");
		BE_MEDICALBENEFIT_TABLE = By.id("benefitsSelectionForm:benefitsAccordionPanel:otcTable");
	}
	public void clickOnMedicalBenefitLink() throws Throwable
	{
		utils.ClickOnLink(BE_MEDICALBENEFIT_LINK);
		utils.GetBusyStatus();
	}
	public void waitUntillMedicalBenefittable() throws Throwable
	{
		utils.CheckElementPresenceByLocator(BE_MEDICALBENEFIT_TABLE);		
	}
	public void clickOnFSAradioButton() throws Throwable
	{
		utils.RxNovaConnect_MedicalBenefitTab_RadioButton_Selection(BE_MEDICALBENEFIT_FSA);
		utils.GetBusyStatus();
	}
	public void clickOnHSAradioButton() throws Throwable
	{
		utils.RxNovaConnect_MedicalBenefitTab_RadioButton_Selection(BE_MEDICALBENEFIT_HSA);
		utils.GetBusyStatus();
	}
	public void clickOnADJradioButton() throws Throwable
	{
		utils.RxNovaConnect_MedicalBenefitTab_RadioButton_Selection(BE_MEDICALBENEFIT_ADJ);
		utils.GetBusyStatus();
	}
	public void clickOnSPAPradioButton() throws Throwable
	{
		utils.RxNovaConnect_MedicalBenefitTab_RadioButton_Selection(BE_MEDICALBENEFIT_SPAP);
		utils.GetBusyStatus();
	}
	
	// Medical Benefit HRA
	
	public void benefitsandeligibility_MedicalBenefit_HRAStartDate(String strHRAStartDate) throws Throwable{
		actBAEMedicalBenefitsDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_MEDICALBENEFIT_TABLE,strHRAStartDate));
	}
	
	public void benefitsandeligibility_MedicalBenefit_HRAEndDate(String strHRAEndDate) throws Throwable{
		actBAEMedicalBenefitsDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_MEDICALBENEFIT_TABLE,strHRAEndDate));
	}
	
	public void benefitsandeligibility_MedicalBenefit_HRAOriginalBalance(String strHRAOriginalBalance) throws Throwable{
		actBAEMedicalBenefitsDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_MEDICALBENEFIT_TABLE,strHRAOriginalBalance));
	}
	
	public void benefitsandeligibility_MedicalBenefit_HRAAvailableBalance(String strHRAAvailableBalance) throws Throwable{
		actBAEMedicalBenefitsDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_MEDICALBENEFIT_TABLE,strHRAAvailableBalance));
	}
	
	public void benefitsandeligibility_MedicalBenefit_HRAProcessDate(String strHRAProcessDate) throws Throwable{
		actBAEMedicalBenefitsDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_MEDICALBENEFIT_TABLE,strHRAProcessDate));
	}
	
	// Medical Benefit FSA
	
	public void benefitsandeligibility_MedicalBenefit_FSAStartDate(String strFSAStartDate) throws Throwable{
		actBAEMedicalBenefitsDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_MEDICALBENEFIT_TABLE,strFSAStartDate));
	}
	
	public void benefitsandeligibility_MedicalBenefit_FSAEndDate(String strFSAEndDate) throws Throwable{
		actBAEMedicalBenefitsDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_MEDICALBENEFIT_TABLE,strFSAEndDate));
	}
	
	public void benefitsandeligibility_MedicalBenefit_FSAOriginalBalance(String strFSAOriginalBalance) throws Throwable{
		actBAEMedicalBenefitsDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_MEDICALBENEFIT_TABLE,strFSAOriginalBalance));
	}
	
	public void benefitsandeligibility_MedicalBenefit_FSAAvailableBalance(String strFSAAvailableBalance) throws Throwable{
		actBAEMedicalBenefitsDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_MEDICALBENEFIT_TABLE,strFSAAvailableBalance));
	}
	
	public void benefitsandeligibility_MedicalBenefit_FSAProcessDate(String strFSAProcessDate) throws Throwable{
		actBAEMedicalBenefitsDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_MEDICALBENEFIT_TABLE,strFSAProcessDate));
	}
	
	// Medical Benefit HSA
	
	public void benefitsandeligibility_MedicalBenefit_HSAStartDate(String strHSAStartDate) throws Throwable{
		actBAEMedicalBenefitsDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_MEDICALBENEFIT_TABLE,strHSAStartDate));
	}
	
	public void benefitsandeligibility_MedicalBenefit_HSAEndDate(String strHSAEndDate) throws Throwable{
		actBAEMedicalBenefitsDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_MEDICALBENEFIT_TABLE,strHSAEndDate));
	}
	
	public void benefitsandeligibility_MedicalBenefit_HSAOriginalBalance(String strHSAOriginalBalance) throws Throwable{
		actBAEMedicalBenefitsDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_MEDICALBENEFIT_TABLE,strHSAOriginalBalance));
	}
	
	public void benefitsandeligibility_MedicalBenefit_HSAAvailableBalance(String strHSAAvailableBalance) throws Throwable{
		actBAEMedicalBenefitsDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_MEDICALBENEFIT_TABLE,strHSAAvailableBalance));
	}
	
	public void benefitsandeligibility_MedicalBenefit_HSAProcessDate(String strHSAProcessDate) throws Throwable{
		actBAEMedicalBenefitsDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_MEDICALBENEFIT_TABLE,strHSAProcessDate));
	}
		
	// Medical Benefit ADJ
	
	public void benefitsandeligibility_MedicalBenefit_ADJStartDate(String strADJStartDate) throws Throwable{
		actBAEMedicalBenefitsDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_MEDICALBENEFIT_TABLE,strADJStartDate));
	}
	
	public void benefitsandeligibility_MedicalBenefit_ADJEndDate(String strADJEndDate) throws Throwable{
		actBAEMedicalBenefitsDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_MEDICALBENEFIT_TABLE,strADJEndDate));
	}
	
	public void benefitsandeligibility_MedicalBenefit_ADJOriginalBalance(String strADJOriginalBalance) throws Throwable{
		actBAEMedicalBenefitsDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_MEDICALBENEFIT_TABLE,strADJOriginalBalance));
	}
	
	public void benefitsandeligibility_MedicalBenefit_ADJAvailableBalance(String strADJAvailableBalance) throws Throwable{
		actBAEMedicalBenefitsDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_MEDICALBENEFIT_TABLE,strADJAvailableBalance));
	}
	
	public void benefitsandeligibility_MedicalBenefit_ADJProcessDate(String strADJProcessDate) throws Throwable{
		actBAEMedicalBenefitsDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_MEDICALBENEFIT_TABLE,strADJProcessDate));
	}
	
	// Medical Benefit SPAP
	
	public void benefitsandeligibility_MedicalBenefit_SPAPStartDate(String strSPAPStartDate) throws Throwable{
		actBAEMedicalBenefitsDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_MEDICALBENEFIT_TABLE,strSPAPStartDate));
	}
	
	public void benefitsandeligibility_MedicalBenefit_SPAPEndDate(String strSPAPEndDate) throws Throwable{
		actBAEMedicalBenefitsDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_MEDICALBENEFIT_TABLE,strSPAPEndDate));
	}
	
	public void benefitsandeligibility_MedicalBenefit_SPAPOriginalBalance(String strSPAPOriginalBalance) throws Throwable{
		actBAEMedicalBenefitsDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_MEDICALBENEFIT_TABLE,strSPAPOriginalBalance));
	}
	
	public void benefitsandeligibility_MedicalBenefit_SPAPAvailableBalance(String strSPAPAvailableBalance) throws Throwable{
		actBAEMedicalBenefitsDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_MEDICALBENEFIT_TABLE,strSPAPAvailableBalance));
	}
	
	public void benefitsandeligibility_MedicalBenefit_SPAPProcessDate(String strSPAPProcessDate) throws Throwable{
		actBAEMedicalBenefitsDetails.add(utils.RxNovaConnect_WebTable_VerifySingleRowColumnData(BE_MEDICALBENEFIT_TABLE,strSPAPProcessDate));
	}
	
}
