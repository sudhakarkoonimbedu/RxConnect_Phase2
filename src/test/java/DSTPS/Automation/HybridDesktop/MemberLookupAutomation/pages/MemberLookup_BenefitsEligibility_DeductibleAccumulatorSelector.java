package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class MemberLookup_BenefitsEligibility_DeductibleAccumulatorSelector {

	private By BE_DEDUCTIBLEACCUMULATOR_LINK,BE_ACCUMULATORBENEFITPERIOD_TABLE,BE_ACCUMULATORCOMPONENT_TABLE;
	private By BE_ACCUMULATORAMOUNTS_TABLE,BE_INDIVIDUALACCUMULATIONS_TABLE,BE_FAMILYACCUMULATIONS_TABLE;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actBEDeductAccumDetails = new ArrayList<String>();
	
	public MemberLookup_BenefitsEligibility_DeductibleAccumulatorSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		MemberLookup_BenefitsEligibility_DeductibleAccumulator_Objects();
	}
	
	private void  MemberLookup_BenefitsEligibility_DeductibleAccumulator_Objects()
	{		
		BE_DEDUCTIBLEACCUMULATOR_LINK = By.linkText("Deductible & Accumulators");
		BE_ACCUMULATORBENEFITPERIOD_TABLE = By.xpath("//*[@class='ui-datatable ui-widget fl custom-dt benefits-accumulator-period-dt']");
		BE_ACCUMULATORCOMPONENT_TABLE = By.id("benefitsSelectionForm:benefitsAccordionPanel:accumulatorComponentPanel");
		BE_ACCUMULATORAMOUNTS_TABLE = By.id("benefitsSelectionForm:benefitsAccordionPanel:accumulatorSummaryAmountsPanel");
		BE_INDIVIDUALACCUMULATIONS_TABLE = By.xpath("//table[@class='fl custom-tbls accumulator-amount-tbl']");
		BE_FAMILYACCUMULATIONS_TABLE = By.xpath("//table[@class='fl custom-tbls accumulator-amount-tb2 ml10']");
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Benefits & Eligibility Deductible & Accumulators Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void clickOnDeductibleAndAccumulatorLink() throws Throwable{
		utils.ClickOnLink(BE_DEDUCTIBLEACCUMULATOR_LINK);
		utils.GetBusyStatus();
	}
	
	public void waitUntillDeductibleAndAccumulator() throws Throwable{
		utils.CheckElementPresenceByLocator(BE_ACCUMULATORBENEFITPERIOD_TABLE);
		Thread.sleep(1000);
	}
	
	// Accumulator Benefit Period
	
	public void BenefitsEligibility_AccumulatorBenefitPeriod_Start(String strABPStart) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(BE_ACCUMULATORBENEFITPERIOD_TABLE,strABPStart));
	}
	
	public void BenefitsEligibility_AccumulatorBenefitPeriod_End(String strABPEnd) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(BE_ACCUMULATORBENEFITPERIOD_TABLE,strABPEnd));
	}
	
	public void BenefitsEligibility_AccumulatorBenefitPeriod_Level(String strABPLevel) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(BE_ACCUMULATORBENEFITPERIOD_TABLE,strABPLevel));
	}
	
	// Accumulator Component
	
	public void BenefitsEligibility_AccumulatorComponent_AccumulatorID(String strACAccumulatorID) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(BE_ACCUMULATORCOMPONENT_TABLE,strACAccumulatorID));
	}
	
	public void BenefitsEligibility_AccumulatorComponent_Start(String strACStart) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(BE_ACCUMULATORCOMPONENT_TABLE,strACStart));
	}
	
	public void BenefitsEligibility_AccumulatorComponent_End(String strACEnd) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(BE_ACCUMULATORCOMPONENT_TABLE,strACEnd));
	}
	
	public void BenefitsEligibility_AccumulatorComponent_Indicator(String strACIndicator) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(BE_ACCUMULATORCOMPONENT_TABLE,strACIndicator));
	}
	
	// Accumulator Amounts	
	
	public void BenefitsEligibility_AccumulatorAmounts_AccumAmounts1(String strAccumAmounts1) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowDataUsingReferenceText(BE_ACCUMULATORAMOUNTS_TABLE,strAccumAmounts1));
	}
	
	public void BenefitsEligibility_AccumulatorAmounts_AccumAmounts2(String strAccumAmounts2) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowDataUsingReferenceText(BE_ACCUMULATORAMOUNTS_TABLE,strAccumAmounts2));
	}
	
	public void BenefitsEligibility_AccumulatorAmounts_AccumAmounts3(String strAccumAmounts3) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowDataUsingReferenceText(BE_ACCUMULATORAMOUNTS_TABLE,strAccumAmounts3));
	}
	
	public void BenefitsEligibility_AccumulatorAmounts_AccumAmounts4(String strAccumAmounts4) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowDataUsingReferenceText(BE_ACCUMULATORAMOUNTS_TABLE,strAccumAmounts4));
	}
	
	public void BenefitsEligibility_AccumulatorAmounts_AccumAmounts5(String strAccumAmounts5) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowDataUsingReferenceText(BE_ACCUMULATORAMOUNTS_TABLE,strAccumAmounts5));
	}
	
	// Individual Accumulations	
	
	public void BenefitsEligibility_IndividualAccumulations_IndividualLimit(String strIAIndividualLimit) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_INDIVIDUALACCUMULATIONS_TABLE,strIAIndividualLimit));
	}
	
	public void BenefitsEligibility_IndividualAccumulations_MemberPaid(String strIAMemberPaid) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_INDIVIDUALACCUMULATIONS_TABLE,strIAMemberPaid));
	}
	
	public void BenefitsEligibility_IndividualAccumulations_AmountToMeet(String strIAAmountToMeet) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_INDIVIDUALACCUMULATIONS_TABLE,strIAAmountToMeet));
	}
	
	public void BenefitsEligibility_IndividualAccumulations_PlanPaid(String strIAPlanPaid) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_INDIVIDUALACCUMULATIONS_TABLE,strIAPlanPaid));
	}
	
	public void BenefitsEligibility_IndividualAccumulations_ExcludedAmount(String strIAExcludedAmount) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_INDIVIDUALACCUMULATIONS_TABLE,strIAExcludedAmount));
	}
	
	public void BenefitsEligibility_IndividualAccumulations_PLRO(String strIAPLRO) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_INDIVIDUALACCUMULATIONS_TABLE,strIAPLRO));
	}
	
	public void BenefitsEligibility_IndividualAccumulations_Claims(String strIAClaims) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_INDIVIDUALACCUMULATIONS_TABLE,strIAClaims));
	}
	
	public void BenefitsEligibility_IndividualAccumulations_MetDate(String strIAMetDate) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_INDIVIDUALACCUMULATIONS_TABLE,strIAMetDate));
	}
	
	// Family Accumulations
	
	public void BenefitsEligibility_FamilyAccumulations_FamilyLimit(String strFAFamilyLimit) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_FAMILYACCUMULATIONS_TABLE,strFAFamilyLimit));
	}
	
	public void BenefitsEligibility_FamilyAccumulations_FamilyPaid(String strFAFamilyPaid) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_FAMILYACCUMULATIONS_TABLE,strFAFamilyPaid));
	}
	
	public void BenefitsEligibility_FamilyAccumulations_AmountToMeet(String strFAAmountToMeet) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_FAMILYACCUMULATIONS_TABLE,strFAAmountToMeet));
	}
	
	public void BenefitsEligibility_FamilyAccumulations_PlanPaid(String strFAPlanPaid) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_FAMILYACCUMULATIONS_TABLE,strFAPlanPaid));
	}
	
	public void BenefitsEligibility_FamilyAccumulations_ExcludedAmount(String strFAExcludedAmount) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_FAMILYACCUMULATIONS_TABLE,strFAExcludedAmount));
	}
	
	public void BenefitsEligibility_FamilyAccumulations_Claims(String strFAClaims) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_FAMILYACCUMULATIONS_TABLE,strFAClaims));
	}
	
	public void BenefitsEligibility_FamilyAccumulations_MetDate(String strFAMetDate) throws Throwable{
		actBEDeductAccumDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(BE_FAMILYACCUMULATIONS_TABLE,strFAMetDate));
	}	
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Benefits & Eligibility Deductible & Accumulators Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
