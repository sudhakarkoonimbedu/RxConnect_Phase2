package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.APS33512_MemberLookup_Verify_BenefitsAndEligibility_MedicalBenefit_Selector;

public class APS33512_MemberLookup_Verify_BenefitsAndEligibility_MedicalBenefit_Steps 
{
	private HybridDesktop_SharedResource SharedResource;
	private RxNova_Utlilty utils;
	private WebDriver driver;
	
	public ArrayList<String> expBAEMedicalBenefitDetails = new ArrayList<String>();
	public SoftAssert MedicalBenefitDetailsSoft = new SoftAssert();
	
	APS33512_MemberLookup_Verify_BenefitsAndEligibility_MedicalBenefit_Selector medicalbenefit_selector;
	
	public APS33512_MemberLookup_Verify_BenefitsAndEligibility_MedicalBenefit_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable
	{
		this.SharedResource = SharedResource;
		this.utils = utils;
		driver = SharedResource.getDriver();
		init();
	}
	public void init() throws Throwable
	{
		medicalbenefit_selector = new APS33512_MemberLookup_Verify_BenefitsAndEligibility_MedicalBenefit_Selector(SharedResource,utils);
	}	
	public void clickOnMedicalBenefit() throws Throwable
	{
		medicalbenefit_selector.clickOnMedicalBenefitLink();
	}
		
	public void verifyMedicalBenefitDetails(Map<String,String> MedicalBenefitDetails) throws Throwable
	{		
		String strRadioName = "";
		String strName = "";
		
		if(MedicalBenefitDetails.containsKey("HRA_Radio"))
		{
			strName = MedicalBenefitDetails.get("HRA_Radio");
		}
		else if(MedicalBenefitDetails.containsKey("FSA_Radio"))
		{
			strName = MedicalBenefitDetails.get("FSA_Radio");
		}
		else if(MedicalBenefitDetails.containsKey("HSA_Radio"))
		{
			strName = MedicalBenefitDetails.get("HSA_Radio");
		}
		else if(MedicalBenefitDetails.containsKey("ADJ_Radio"))
		{
			strName = MedicalBenefitDetails.get("ADJ_Radio");
		}
		else if(MedicalBenefitDetails.containsKey("SPAP_Radio")) 
		{
			strName = MedicalBenefitDetails.get("SPAP_Radio");
		}
		
		strRadioName = strName;
		
		switch(strRadioName)
		{
			case "HRA":
					String strHRAStartDate = MedicalBenefitDetails.get("HRA_StartDate"); 
					String strHRAEndDate = MedicalBenefitDetails.get("HRA_EndDate");
					String strHRAOriginalBalance = MedicalBenefitDetails.get("HRA_OriginalBalance");
					String strHRAAvailableBalance = MedicalBenefitDetails.get("HRA_AvailableBalance");
					String strHRAProcessDate = MedicalBenefitDetails.get("HRA_ProcessDate");
					
					expBAEMedicalBenefitDetails.add(strHRAStartDate);
					expBAEMedicalBenefitDetails.add(strHRAEndDate);
					expBAEMedicalBenefitDetails.add(strHRAOriginalBalance);
					expBAEMedicalBenefitDetails.add(strHRAAvailableBalance);
					expBAEMedicalBenefitDetails.add(strHRAProcessDate);
					
					medicalbenefit_selector.waitUntillMedicalBenefittable();
					medicalbenefit_selector.benefitsandeligibility_MedicalBenefit_HRAStartDate(strHRAStartDate);
					medicalbenefit_selector.benefitsandeligibility_MedicalBenefit_HRAEndDate(strHRAEndDate);
					medicalbenefit_selector.benefitsandeligibility_MedicalBenefit_HRAOriginalBalance(strHRAOriginalBalance);
					medicalbenefit_selector.benefitsandeligibility_MedicalBenefit_HRAAvailableBalance(strHRAAvailableBalance);
					medicalbenefit_selector.benefitsandeligibility_MedicalBenefit_HRAProcessDate(strHRAProcessDate);
					break;
			case "FSA":
					String strFSAStartDate = MedicalBenefitDetails.get("FSA_StartDate");
					String strFSAEndDate = MedicalBenefitDetails.get("FSA_EndDate");
					String strFSAOriginalBalance = MedicalBenefitDetails.get("FSA_OriginalBalance");
					String strFSAAvailableBalance = MedicalBenefitDetails.get("FSA_AvailableBalance");
					String strFSAProcessDate = MedicalBenefitDetails.get("FSA_ProcessDate");
					
					expBAEMedicalBenefitDetails.add(strFSAStartDate);
					expBAEMedicalBenefitDetails.add(strFSAEndDate);
					expBAEMedicalBenefitDetails.add(strFSAOriginalBalance);
					expBAEMedicalBenefitDetails.add(strFSAAvailableBalance);
					expBAEMedicalBenefitDetails.add(strFSAProcessDate);
					
					medicalbenefit_selector.clickOnFSAradioButton();
					utils.GetBusyStatus();
					medicalbenefit_selector.benefitsandeligibility_MedicalBenefit_FSAStartDate(strFSAStartDate);
					medicalbenefit_selector.benefitsandeligibility_MedicalBenefit_FSAEndDate(strFSAEndDate);
					medicalbenefit_selector.benefitsandeligibility_MedicalBenefit_FSAOriginalBalance(strFSAOriginalBalance);
					medicalbenefit_selector.benefitsandeligibility_MedicalBenefit_FSAAvailableBalance(strFSAAvailableBalance);
					medicalbenefit_selector.benefitsandeligibility_MedicalBenefit_FSAProcessDate(strFSAProcessDate);
					break;
			case "HSA":
					String strHSAStartDate = MedicalBenefitDetails.get("HSA_StartDate");
					String strHSAEndDate = MedicalBenefitDetails.get("HSA_EndDate");
					String strHSAOriginalBalance = MedicalBenefitDetails.get("HSA_OriginalBalance");
					String strHSAAvailableBalance = MedicalBenefitDetails.get("HSA_AvailableBalance");
					String strHSAProcessDate = MedicalBenefitDetails.get("HSA_ProcessDate");
					
					expBAEMedicalBenefitDetails.add(strHSAStartDate);
					expBAEMedicalBenefitDetails.add(strHSAEndDate);
					expBAEMedicalBenefitDetails.add(strHSAOriginalBalance);
					expBAEMedicalBenefitDetails.add(strHSAAvailableBalance);
					expBAEMedicalBenefitDetails.add(strHSAProcessDate);
					
					medicalbenefit_selector.clickOnHSAradioButton();
					utils.GetBusyStatus();
					medicalbenefit_selector.benefitsandeligibility_MedicalBenefit_HSAStartDate(strHSAStartDate);
					medicalbenefit_selector.benefitsandeligibility_MedicalBenefit_HSAEndDate(strHSAEndDate);
					medicalbenefit_selector.benefitsandeligibility_MedicalBenefit_HSAOriginalBalance(strHSAOriginalBalance);
					medicalbenefit_selector.benefitsandeligibility_MedicalBenefit_HSAAvailableBalance(strHSAAvailableBalance);
					medicalbenefit_selector.benefitsandeligibility_MedicalBenefit_HSAProcessDate(strHSAProcessDate);
					break;
			case "ADJ":
					String strADJStartDate = MedicalBenefitDetails.get("ADJ_StartDate");
					String strADJEndDate = MedicalBenefitDetails.get("ADJ_EndDate");
					String strADJOriginalBalance = MedicalBenefitDetails.get("ADJ_OriginalBalance");
					String strADJAvailableBalance = MedicalBenefitDetails.get("ADJ_AvailableBalance");
					String strADJProcessDate = MedicalBenefitDetails.get("ADJ_ProcessDate");
					
					expBAEMedicalBenefitDetails.add(strADJStartDate);
					expBAEMedicalBenefitDetails.add(strADJEndDate);
					expBAEMedicalBenefitDetails.add(strADJOriginalBalance);
					expBAEMedicalBenefitDetails.add(strADJAvailableBalance);
					expBAEMedicalBenefitDetails.add(strADJProcessDate);
					
					medicalbenefit_selector.clickOnADJradioButton();
					utils.GetBusyStatus();
					medicalbenefit_selector.benefitsandeligibility_MedicalBenefit_ADJStartDate(strADJStartDate);
					medicalbenefit_selector.benefitsandeligibility_MedicalBenefit_ADJEndDate(strADJEndDate);
					medicalbenefit_selector.benefitsandeligibility_MedicalBenefit_ADJOriginalBalance(strADJOriginalBalance);
					medicalbenefit_selector.benefitsandeligibility_MedicalBenefit_ADJAvailableBalance(strADJAvailableBalance);
					medicalbenefit_selector.benefitsandeligibility_MedicalBenefit_ADJProcessDate(strADJProcessDate);
					break;
			case "SPAP":
					String strSPAPStartDate = MedicalBenefitDetails.get("SPAP_StartDate");
					String strSPAPEndDate = MedicalBenefitDetails.get("SPAP_EndDate");
					String strSPAPOriginalBalance = MedicalBenefitDetails.get("SPAP_OriginalBalance");
					String strSPAPAvailableBalance = MedicalBenefitDetails.get("SPAP_AvailableBalance");
					String strSPAPProcessDate = MedicalBenefitDetails.get("SPAP_ProcessDate");
					
					expBAEMedicalBenefitDetails.add(strSPAPStartDate);
					expBAEMedicalBenefitDetails.add(strSPAPEndDate);
					expBAEMedicalBenefitDetails.add(strSPAPOriginalBalance);
					expBAEMedicalBenefitDetails.add(strSPAPAvailableBalance);
					expBAEMedicalBenefitDetails.add(strSPAPProcessDate);
					
					medicalbenefit_selector.clickOnSPAPradioButton();
					utils.GetBusyStatus();
					medicalbenefit_selector.benefitsandeligibility_MedicalBenefit_SPAPStartDate(strSPAPStartDate);
					medicalbenefit_selector.benefitsandeligibility_MedicalBenefit_SPAPEndDate(strSPAPEndDate);
					medicalbenefit_selector.benefitsandeligibility_MedicalBenefit_SPAPOriginalBalance(strSPAPOriginalBalance);
					medicalbenefit_selector.benefitsandeligibility_MedicalBenefit_SPAPAvailableBalance(strSPAPAvailableBalance);
					medicalbenefit_selector.benefitsandeligibility_MedicalBenefit_SPAPProcessDate(strSPAPProcessDate);
					break;
		}
																													
		for(int i=0;i<expBAEMedicalBenefitDetails.size();i++)
		{
			MedicalBenefitDetailsSoft.assertEquals(medicalbenefit_selector.actBAEMedicalBenefitsDetails.get(i), expBAEMedicalBenefitDetails.get(i));
		}		
		MedicalBenefitDetailsSoft.assertAll();
		expBAEMedicalBenefitDetails.clear();
		medicalbenefit_selector.actBAEMedicalBenefitsDetails.clear();
	}
}
