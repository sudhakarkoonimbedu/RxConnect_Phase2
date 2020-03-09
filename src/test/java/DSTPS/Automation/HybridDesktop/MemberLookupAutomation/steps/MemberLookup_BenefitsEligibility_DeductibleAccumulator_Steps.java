package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.MemberLookup_BenefitsEligibility_DeductibleAccumulatorSelector;

public class MemberLookup_BenefitsEligibility_DeductibleAccumulator_Steps {

	MemberLookup_BenefitsEligibility_DeductibleAccumulatorSelector memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expBEDeductAccumDetails = new ArrayList<String>();
	public SoftAssert deductAccumDetailsSoft = new SoftAssert();
	
	public MemberLookup_BenefitsEligibility_DeductibleAccumulator_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector = new MemberLookup_BenefitsEligibility_DeductibleAccumulatorSelector(SharedResource,utils);
	}
	
	public void clickOnDeductibleAccumulator() throws Throwable{
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.clickOnDeductibleAndAccumulatorLink();
	}
	
	public void verifyDeductibleAccumulatorDetails(Map<String,String> deductibleAccumulatorDetails)throws Throwable {
		String strABPStart = deductibleAccumulatorDetails.get("ABPStart");
		String strABPEnd = deductibleAccumulatorDetails.get("ABPEnd");		
		String strABPLevel = deductibleAccumulatorDetails.get("ABPLevel");
		String strACAccumulatorID = deductibleAccumulatorDetails.get("ACAccumulatorID");
		String strACStart = deductibleAccumulatorDetails.get("ACStart");		
		String strACEnd = deductibleAccumulatorDetails.get("ACEnd");
		String strACIndicator = deductibleAccumulatorDetails.get("ACIndicator");
		String strAccumAmounts1 = deductibleAccumulatorDetails.get("AccumAmounts1");		
		String strAccumAmounts2 = deductibleAccumulatorDetails.get("AccumAmounts2");
		String strAccumAmounts3 = deductibleAccumulatorDetails.get("AccumAmounts3");
		String strAccumAmounts4 = deductibleAccumulatorDetails.get("AccumAmounts4");		
		String strAccumAmounts5 = deductibleAccumulatorDetails.get("AccumAmounts5");
		String strIAIndividualLimit = deductibleAccumulatorDetails.get("IAIndividualLimit");		
		String strIAMemberPaid = deductibleAccumulatorDetails.get("IAMemberPaid");
		String strIAAmountToMeet = deductibleAccumulatorDetails.get("IAAmountToMeet");
		String strIAPlanPaid = deductibleAccumulatorDetails.get("IAPlanPaid");		
		String strIAExcludedAmount = deductibleAccumulatorDetails.get("IAExcludedAmount");
		String strIAPLRO = deductibleAccumulatorDetails.get("IAPLRO");
		String strIAClaims = deductibleAccumulatorDetails.get("IAClaims");		
		String strIAMetDate = deductibleAccumulatorDetails.get("IAMetDate");
		String strFAFamilyLimit = deductibleAccumulatorDetails.get("FAFamilyLimit");		
		String strFAFamilyPaid = deductibleAccumulatorDetails.get("FAFamilyPaid");
		String strFAAmountToMeet = deductibleAccumulatorDetails.get("FAAmountToMeet");
		String strFAPlanPaid = deductibleAccumulatorDetails.get("FAPlanPaid");		
		String strFAExcludedAmount = deductibleAccumulatorDetails.get("FAExcludedAmount");
		String strFAClaims = deductibleAccumulatorDetails.get("FAClaims");		
		String strFAMetDate = deductibleAccumulatorDetails.get("FAMetDate");
				
		expBEDeductAccumDetails.add(strABPStart);
		expBEDeductAccumDetails.add(strABPEnd);
		expBEDeductAccumDetails.add(strABPLevel);
		expBEDeductAccumDetails.add(strACAccumulatorID);
		expBEDeductAccumDetails.add(strACStart);
		expBEDeductAccumDetails.add(strACEnd);
		expBEDeductAccumDetails.add(strACIndicator);
		expBEDeductAccumDetails.add(strAccumAmounts1);
		expBEDeductAccumDetails.add(strAccumAmounts2);
		expBEDeductAccumDetails.add(strAccumAmounts3);
		expBEDeductAccumDetails.add(strAccumAmounts4);
		expBEDeductAccumDetails.add(strAccumAmounts5);
		expBEDeductAccumDetails.add(strIAIndividualLimit);
		expBEDeductAccumDetails.add(strIAMemberPaid);
		expBEDeductAccumDetails.add(strIAAmountToMeet);
		expBEDeductAccumDetails.add(strIAPlanPaid);
		expBEDeductAccumDetails.add(strIAExcludedAmount);
		expBEDeductAccumDetails.add(strIAPLRO);
		expBEDeductAccumDetails.add(strIAClaims);
		expBEDeductAccumDetails.add(strIAMetDate);
		expBEDeductAccumDetails.add(strFAFamilyLimit);
		expBEDeductAccumDetails.add(strFAFamilyPaid);
		expBEDeductAccumDetails.add(strFAAmountToMeet);
		expBEDeductAccumDetails.add(strFAPlanPaid);
		expBEDeductAccumDetails.add(strFAExcludedAmount);
		expBEDeductAccumDetails.add(strFAClaims);
		expBEDeductAccumDetails.add(strFAMetDate);
		
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.waitUntillDeductibleAndAccumulator();
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorBenefitPeriod_Start(strABPStart);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorBenefitPeriod_End(strABPEnd);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorBenefitPeriod_Level(strABPLevel);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorComponent_AccumulatorID(strACAccumulatorID);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorComponent_Start(strACStart);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorComponent_End(strACEnd);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorComponent_Indicator(strACIndicator);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorAmounts_AccumAmounts1(strAccumAmounts1);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorAmounts_AccumAmounts2(strAccumAmounts2);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorAmounts_AccumAmounts3(strAccumAmounts3);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorAmounts_AccumAmounts4(strAccumAmounts4);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_AccumulatorAmounts_AccumAmounts5(strAccumAmounts5);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_IndividualAccumulations_IndividualLimit(strIAIndividualLimit);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_IndividualAccumulations_MemberPaid(strIAMemberPaid);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_IndividualAccumulations_AmountToMeet(strIAAmountToMeet);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_IndividualAccumulations_PlanPaid(strIAPlanPaid);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_IndividualAccumulations_ExcludedAmount(strIAExcludedAmount);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_IndividualAccumulations_PLRO(strIAPLRO);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_IndividualAccumulations_Claims(strIAClaims);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_IndividualAccumulations_MetDate(strIAMetDate);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_FamilyAccumulations_FamilyLimit(strFAFamilyLimit);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_FamilyAccumulations_FamilyPaid(strFAFamilyPaid);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_FamilyAccumulations_AmountToMeet(strFAAmountToMeet);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_FamilyAccumulations_PlanPaid(strFAPlanPaid);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_FamilyAccumulations_ExcludedAmount(strFAExcludedAmount);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_FamilyAccumulations_Claims(strFAClaims);
		memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.BenefitsEligibility_FamilyAccumulations_MetDate(strFAMetDate);
					
		for(int i=0;i<expBEDeductAccumDetails.size();i++)
		{
			deductAccumDetailsSoft.assertEquals(memberLookup_BenefitsEligibility_DeductibleAccumulatorSelector.actBEDeductAccumDetails.get(i), expBEDeductAccumDetails.get(i));
		}		
		deductAccumDetailsSoft.assertAll();
	}
}

