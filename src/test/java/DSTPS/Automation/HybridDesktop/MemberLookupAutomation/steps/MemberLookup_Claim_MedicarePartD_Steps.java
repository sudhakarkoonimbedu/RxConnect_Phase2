package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.MemberLookup_Claim_MedicarePartDSelector;

public class MemberLookup_Claim_MedicarePartD_Steps {

	MemberLookup_Claim_MedicarePartDSelector memberLookup_Claim_MedicarePartDSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expMedicarePartD = new ArrayList<String>();
	public SoftAssert medicarePartDSoft = new SoftAssert();
	
	
	public MemberLookup_Claim_MedicarePartD_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		memberLookup_Claim_MedicarePartDSelector = new MemberLookup_Claim_MedicarePartDSelector(SharedResource,utils);
	}
	
	public void clickOnMedicarePartD() throws Throwable{
		memberLookup_Claim_MedicarePartDSelector.MemberLookup_Claim_clickOnMedicarePartD();
		memberLookup_Claim_MedicarePartDSelector.waitUnitillMedicarePartD();
	}
	
	public void verifyMedicarePartD(Map<String,String> medicarePartD)throws Throwable {
		 
		String strAlternateBusinessFlag = medicarePartD.get("AlternateBusinessFlag");
		String strNonTrOOPEligPLROAmt = medicarePartD.get("NonTrOOPEligPLROAmt");
		String strTotalCoveredDrugCost = medicarePartD.get("TotalCoveredDrugCost");
		String strGrossDrugCostAboveOOPThreshold = medicarePartD.get("GrossDrugCostAboveOOPThreshold");
		String strLICSEffectiveDate = medicarePartD.get("LICSEffectiveDate");
		String strMTMEffectiveDate = medicarePartD.get("MTMEffectiveDate");
		String strPlaceofService = medicarePartD.get("PlaceofService");
		String strPlanType = medicarePartD.get("PlanType");
		String strTransitionLetter = medicarePartD.get("TransitionLetter");
		String strTrOOPEligibleFlag = medicarePartD.get("TrOOPEligibleFlag");
		String strOtherTrOOPAmount = medicarePartD.get("OtherTrOOPAmount");
		String strReportedGapDiscount = medicarePartD.get("ReportedGapDiscount");
		String strGrossDrugCostBelowOOPThreshold = medicarePartD.get("GrossDrugCostBelowOOPThreshold");
		String strLICSAmount = medicarePartD.get("LICSAmount");
		String strInstitutionalCode = medicarePartD.get("InstitutionalCode");
		String strPatientLocationCode = medicarePartD.get("PatientLocationCode");
		String strSupplementalIndicator = medicarePartD.get("SupplementalIndicator");
		String strTransitionCode = medicarePartD.get("TransitionCode");
		String strTrOOPAppliedAmount = medicarePartD.get("TrOOPAppliedAmount");
		String strTrOOPAccumulationAmount = medicarePartD.get("TrOOPAccumulationAmount");
		String strFDADefStatus = medicarePartD.get("FDADefStatus");
		String strFreeFirstFillIndicator = medicarePartD.get("FreeFirstFillIndicator");
		String strLICSCode = medicarePartD.get("LICSCode");
		String strMTMCode = medicarePartD.get("MTMCode");
		String strInstitutionalEffectiveDate = medicarePartD.get("InstitutionalEffectiveDate");
		String strPatientResidence = medicarePartD.get("PatientResidence");
		String strProcessedasIndicator = medicarePartD.get("ProcessedasIndicator");		 
		 		 
		expMedicarePartD.add(strAlternateBusinessFlag);
		expMedicarePartD.add(strNonTrOOPEligPLROAmt);
		expMedicarePartD.add(strTotalCoveredDrugCost);
		expMedicarePartD.add(strGrossDrugCostAboveOOPThreshold);
		expMedicarePartD.add(strLICSEffectiveDate);
		expMedicarePartD.add(strMTMEffectiveDate);
		expMedicarePartD.add(strPlaceofService);
		expMedicarePartD.add(strPlanType);
		expMedicarePartD.add(strTransitionLetter);
		expMedicarePartD.add(strTrOOPEligibleFlag);
		expMedicarePartD.add(strOtherTrOOPAmount);
		expMedicarePartD.add(strReportedGapDiscount);
		expMedicarePartD.add(strGrossDrugCostBelowOOPThreshold);
		expMedicarePartD.add(strLICSAmount);
		expMedicarePartD.add(strInstitutionalCode);
		expMedicarePartD.add(strPatientLocationCode);
		expMedicarePartD.add(strSupplementalIndicator);
		expMedicarePartD.add(strTransitionCode);
		expMedicarePartD.add(strTrOOPAppliedAmount);
		expMedicarePartD.add(strTrOOPAccumulationAmount);
		expMedicarePartD.add(strFDADefStatus);
		expMedicarePartD.add(strFreeFirstFillIndicator);
		expMedicarePartD.add(strLICSCode);
		expMedicarePartD.add(strMTMCode);
		expMedicarePartD.add(strInstitutionalEffectiveDate);
		expMedicarePartD.add(strPatientResidence);
		expMedicarePartD.add(strProcessedasIndicator);		 
		
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_AlternateBusinessFlag(strAlternateBusinessFlag);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_NonTrOOPEligPLROAmt(strNonTrOOPEligPLROAmt);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_TotalCoveredDrugCost(strTotalCoveredDrugCost);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_GrossDrugCostAboveOOPThreshold(strGrossDrugCostAboveOOPThreshold);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_LICSEffectiveDate(strLICSEffectiveDate);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_MTMEffectiveDate(strMTMEffectiveDate);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_PlaceofService(strPlaceofService);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_PlanType(strPlanType);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_TransitionLetter(strTransitionLetter);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_TrOOPEligibleFlag(strTrOOPEligibleFlag);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_OtherTrOOPAmount(strOtherTrOOPAmount);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_ReportedGapDiscount(strReportedGapDiscount);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_GrossDrugCostBelowOOPThreshold(strGrossDrugCostBelowOOPThreshold);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_LICSAmount(strLICSAmount);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_InstitutionalCode(strInstitutionalCode);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_PatientLocationCode(strPatientLocationCode);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_SupplementalIndicator(strSupplementalIndicator);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_TransitionCode(strTransitionCode);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_TrOOPAppliedAmount(strTrOOPAppliedAmount);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_TrOOPAccumulationAmount(strTrOOPAccumulationAmount);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_FDADefStatus(strFDADefStatus);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_FreeFirstFillIndicator(strFreeFirstFillIndicator);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_LICSCode(strLICSCode);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_MTMCode(strMTMCode);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_InstitutionalEffectiveDate(strInstitutionalEffectiveDate);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_PatientResidence(strPatientResidence);
		memberLookup_Claim_MedicarePartDSelector.Claim_MedicarePartD_ProcessedasIndicator(strProcessedasIndicator);
		 
			
		for(int i=0;i<expMedicarePartD.size();i++)
		{
			medicarePartDSoft.assertEquals(memberLookup_Claim_MedicarePartDSelector.actMedicarePartD.get(i), expMedicarePartD.get(i));
		}		
		medicarePartDSoft.assertAll();
		
	}	
	
	 
}

