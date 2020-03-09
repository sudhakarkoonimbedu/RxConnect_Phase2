package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.MemberLookup_Claim_BenefitsSelector;

public class MemberLookup_Claim_Benefits_Steps {

	MemberLookup_Claim_BenefitsSelector memberLookup_Claim_BenefitsSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expBenefits = new ArrayList<String>();
	public SoftAssert benefitsSoft = new SoftAssert();
	
	
	public MemberLookup_Claim_Benefits_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		memberLookup_Claim_BenefitsSelector = new MemberLookup_Claim_BenefitsSelector(SharedResource,utils);
	}
	
	public void clickOnBenefits() throws Throwable{
		memberLookup_Claim_BenefitsSelector.MemberLookup_Claim_clickOnBenefits();
		memberLookup_Claim_BenefitsSelector.waitUnitillGeneralMemberDetails();
	}
	
	public void verifyBenefits(Map<String,String> benefits)throws Throwable {
		 
		String strCaseID = benefits.get("CaseID");
		String strHICN  = benefits.get("HICN");
		String strCopayFieldUsed  = benefits.get("CopayFieldUsed");
		String strTierLevel  = benefits.get("TierLevel");
		String strFormularyIndicator  = benefits.get("FormularyIndicator");
		String strPlaceOfService  = benefits.get("PlaceOfService");
		String strPatientResidence  = benefits.get("PatientResidence");
		String strPharmacyServiceType  = benefits.get("PharmacyServiceType");
		String strDeductibleMessage = benefits.get("DeductibleMessage");		
		String strLICSCode  = benefits.get("LICSCode");
		String strLICSEffectiveDate  = benefits.get("LICSEffectiveDate");
		String strInstitutionalCode  = benefits.get("InstitutionalCode");
		String strInstitutionalEffDate  = benefits.get("InstitutionalEffDate");
		String strFreeFirstFill  = benefits.get("FreeFirstFill");
		String strCostShareReduction  = benefits.get("CostShareReduction");
		String strGracePeriod  = benefits.get("GracePeriod");
		String strMemberDeductible  = benefits.get("MemberDeductible");
		String strPlanDeductible  = benefits.get("PlanDeductible");
		String strDeductibleExcluded  = benefits.get("DeductibleExcluded");
		String strTROOP  = benefits.get("TROOP");
		String strNonTROOP  = benefits.get("NonTROOP");
		String strLICS  = benefits.get("LICS");
		String strOtherTROOP  = benefits.get("OtherTROOP");
		String strBenefitStageQualifier  = benefits.get("BenefitStageQualifier");
		String strBenefitStageAmount  = benefits.get("BenefitStageAmount");
		String strSpendingAccRemaining  = benefits.get("SpendingAccRemaining");
		String strRemainingBenefit  = benefits.get("RemainingBenefit");
		String strAccumulatedDeductible  = benefits.get("AccumulatedDeductible");
		String strRemainingDeductible  = benefits.get("RemainingDeductible"); 
		 		 
		expBenefits.add(strCaseID);
		expBenefits.add(strHICN);  
		expBenefits.add(strCopayFieldUsed);
		expBenefits.add(strTierLevel);
		expBenefits.add(strFormularyIndicator);
		expBenefits.add(strPlaceOfService);
		expBenefits.add(strPatientResidence);
		expBenefits.add(strPharmacyServiceType);
		expBenefits.add(strDeductibleMessage);
		expBenefits.add(strLICSCode);
		expBenefits.add(strLICSEffectiveDate);
		expBenefits.add(strInstitutionalCode);
		expBenefits.add(strInstitutionalEffDate);
		expBenefits.add(strFreeFirstFill);
		expBenefits.add(strCostShareReduction);
		expBenefits.add(strGracePeriod);
		expBenefits.add(strMemberDeductible);
		expBenefits.add(strPlanDeductible);
		expBenefits.add(strDeductibleExcluded);
		expBenefits.add(strTROOP);
		expBenefits.add(strNonTROOP);
		expBenefits.add(strLICS);
		expBenefits.add(strOtherTROOP);
		expBenefits.add(strBenefitStageQualifier);
		expBenefits.add(strBenefitStageAmount);
		expBenefits.add(strSpendingAccRemaining);
		expBenefits.add(strRemainingBenefit);
		expBenefits.add(strAccumulatedDeductible);
		expBenefits.add(strRemainingDeductible);
		
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_CaseID(strCaseID); 
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_HICN(strHICN);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_CopayFieldUsed(strCopayFieldUsed);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_TierLevel(strTierLevel);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_FormularyIndicator(strFormularyIndicator);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_PlaceOfService(strPlaceOfService);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_PatientResidence(strPatientResidence);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_PharmacyServiceType(strPharmacyServiceType);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_DeductibleMessage(strDeductibleMessage);	 
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_LICSCode(strLICSCode);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_LICSEffectiveDate(strLICSEffectiveDate);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_InstitutionalCode(strInstitutionalCode);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_InstitutionalEffDate(strInstitutionalEffDate);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_FreeFirstFill(strFreeFirstFill);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_CostShareReduction(strCostShareReduction);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_GracePeriod(strGracePeriod);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_MemberDeductible(strMemberDeductible);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_PlanDeductible(strPlanDeductible);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_DeductibleExcluded(strDeductibleExcluded);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_TROOP(strTROOP);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_NonTROOP(strNonTROOP);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_LICS(strLICS);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_OtherTROOP(strOtherTROOP);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_BenefitStageQualifier(strBenefitStageQualifier);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_BenefitStageAmount(strBenefitStageAmount);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_SpendingAccRemaining(strSpendingAccRemaining);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_RemainingBenefit(strRemainingBenefit);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_AccumulatedDeductible(strAccumulatedDeductible);
		memberLookup_Claim_BenefitsSelector.Claim_Benefits_RemainingDeductible(strRemainingDeductible);
				 		 
			
		for(int i=0;i<expBenefits.size();i++)
		{
			benefitsSoft.assertEquals(memberLookup_Claim_BenefitsSelector.actBenefits.get(i), expBenefits.get(i));
		}		
		benefitsSoft.assertAll();
		
	}	
	
	 
}

