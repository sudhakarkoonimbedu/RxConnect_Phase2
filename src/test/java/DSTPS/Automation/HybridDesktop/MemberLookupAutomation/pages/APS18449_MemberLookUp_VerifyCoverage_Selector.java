package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;

public class APS18449_MemberLookUp_VerifyCoverage_Selector 
{
	private By SELECT_A_CALL_CATEGORY_FORMULARY_LINK;
	private By ELEMENT_DRUG_RESULTS;
	private By DRUG_RESULTS_SEARCH_CRITERIAVALUE_EDITBOX;
	private By DRUG_RESULTS_SEARCH_CRITERIA_SEARCH_BUTTON;
	private By ELEMENT_SHOWING_DRUGS_WITH_BRAND_GENERIC;
	private By DRUG_RESULTS_NDC_EDITBOX; 
	private By DRUG_RESULTS_FIRST_NDC_RECORD;
	private By DRUG_RESULTS_BUTTON_VERIFY_COVERAGE_CODE;
	private By ELEMENT_VERIFY_COVERAGE;
	
	private By ELEMENT_COVERAGE_VERIFICATION;
	private By COVERAGE_VERIFICATION_DRUGNAME;
	private By COVERAGE_VERIFICATION_QUANTITY_EDIT;
	private By COVERAGE_VERIFICATION_DAYS_SUPPLY_EDIT;
	private By COVERAGE_VERIFICATION_DAW_LIST;
	private By COVERAGE_VERIFICATION_FILLDATE_EDIT;
	private By COVERAGE_VERIFICATION_PRESCRIBER_QLFR_ID_PART1;
	private By COVERAGE_VERIFICATION_PRESCRIBER_QLFR_ID_PART2;
	private By COVERAGE_VERIFICATION_PHARMACY_SVC_TYPE;
	private By COVERAGE_VERIFICATION_PHARMACY_ADDRESS_PART1;
	private By COVERAGE_VERIFICATION_PHARMACY_ADDRESS_PART2;
	private By COVERAGE_VERIFICATION_PHARMACY_ADDRESS_PART3;
	private By COVERAGE_VERIFICATION_VERIFYCOVERAGE_BUTTON;
	private By COVERAGE_VERIFICATION_GENERAL_TABLE;
	private By COVERAGE_VERIFICATION_ERRORS_TABLE;
	private By COVERAGE_VERIFICATION_TOTALRXCOST_TABLE;
	private By COVERAGE_VERIFICATION_PATIENTPAY_TABLE1;
	private By COVERAGE_VERIFICATION_PATIENTPAY_TABLE2;
	private By COVERAGE_VERIFICATION_PATIENTPAY_TABLE3;
	private By COVERAGE_VERIFICATION_PATIENTPAY_TABLE4;
	private By COVERAGE_VERIFICATION_APPLIEDAMOUNTS_TABLE;
	private By COVERAGE_VERIFICATION_BALANCES_TABLE;
	
	private HybridDesktop_SharedResource SharedResource;
	private RxNova_Utlilty utils;
	private WebDriver driver;
	
	public ArrayList<String> actCoverageVerificationPanelDetails = new ArrayList<String>();
	
	public ArrayList<String> act_C_V_GeneralTable = new ArrayList<String>();
	public ArrayList<String> act_C_V_ErrorsTable = new ArrayList<String>();
	public ArrayList<String> act_C_V_TotalRxCostTable = new ArrayList<String>();
	public ArrayList<String> act_C_V_PatientPayTable = new ArrayList<String>();
	public ArrayList<String> act_C_V_AppliedAmountsTable = new ArrayList<String>();
	public ArrayList<String> act_C_V_BalancesTable = new ArrayList<String>();
		
	// Verify Coverage Title X-path
	public  APS18449_MemberLookUp_VerifyCoverage_Selector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils)
	{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;
		APS18449_MemberLookUp_VerifyCoverageCode_Objects();
	}
	public void APS18449_MemberLookUp_VerifyCoverageCode_Objects()
	{	
		SELECT_A_CALL_CATEGORY_FORMULARY_LINK = By.id("wheelForm:formularyLink");
		ELEMENT_DRUG_RESULTS = By.xpath("//h2[text() = 'Drug Results']");
		DRUG_RESULTS_SEARCH_CRITERIAVALUE_EDITBOX = By.id("formularyForm:searchCriteriaValue_input");
		DRUG_RESULTS_SEARCH_CRITERIA_SEARCH_BUTTON = By.id("formularyForm:searchButton");
		ELEMENT_SHOWING_DRUGS_WITH_BRAND_GENERIC = By.xpath("//div[@class='drug-search-result-dt-hd']");
		DRUG_RESULTS_NDC_EDITBOX = By.xpath("//div[@class='ui-dt-c']/input[1]");
		DRUG_RESULTS_FIRST_NDC_RECORD = By.xpath("//div[@id='formularyForm:drugSearchResultTable']/table/tbody/tr[1]/td[1]");
		DRUG_RESULTS_BUTTON_VERIFY_COVERAGE_CODE = By.id("formularyForm:verifyCoverageBtn");
		ELEMENT_VERIFY_COVERAGE = By.xpath("//h2[text() = 'Verify Coverage']");
		ELEMENT_COVERAGE_VERIFICATION = By.xpath("//h2[text() = 'Coverage Verification']");
		
		COVERAGE_VERIFICATION_DRUGNAME = By.xpath("//div[@id='formularyVCForm:coverageVerifcationPanel1']/span");
		COVERAGE_VERIFICATION_QUANTITY_EDIT = By.id("formularyVCForm:quantity1");
		COVERAGE_VERIFICATION_DAYS_SUPPLY_EDIT = By.id("formularyVCForm:daysSupply1");
		COVERAGE_VERIFICATION_DAW_LIST = By.id("formularyVCForm:dispenseAsWritten1");
		COVERAGE_VERIFICATION_FILLDATE_EDIT = By.id("formularyVCForm:fillDate1"); 
		COVERAGE_VERIFICATION_PRESCRIBER_QLFR_ID_PART1 = By.id("formularyVCForm:prescriberIdQualifier1");
		COVERAGE_VERIFICATION_PRESCRIBER_QLFR_ID_PART2 = By.id("formularyVCForm:prescriberId1");
		COVERAGE_VERIFICATION_PHARMACY_SVC_TYPE = By.id("formularyVCForm:pharmacySvcType1");
		COVERAGE_VERIFICATION_PHARMACY_ADDRESS_PART1 = By.id("formularyVCForm:claimTestPharmacy1");
		COVERAGE_VERIFICATION_PHARMACY_ADDRESS_PART2 = By.xpath("//table[@id='formularyVCForm:claimTestPharmacy1']/tbody/tr[4]/td[2]");
		COVERAGE_VERIFICATION_PHARMACY_ADDRESS_PART3 = By.xpath("//table[@id='formularyVCForm:claimTestPharmacy1']/tbody/tr[5]/td[2]");
		COVERAGE_VERIFICATION_VERIFYCOVERAGE_BUTTON = By.id("formularyVCForm:verifyCoverageBtn1");	
		
		COVERAGE_VERIFICATION_GENERAL_TABLE = By.id("formularyVCForm:formularyAccordionPanel:generalPanel1");
		COVERAGE_VERIFICATION_ERRORS_TABLE = By.id("formularyVCForm:formularyAccordionPanel:errorsPanel1");
		COVERAGE_VERIFICATION_TOTALRXCOST_TABLE = By.xpath("//table[@class='claim-pricing-tbls formlary-member-cost-coverage-verifcation-total-rx-cost-tb']");
		COVERAGE_VERIFICATION_PATIENTPAY_TABLE1 = By.xpath("//table[@class='mt10 claim-pricing-tbls formlary-member-cost-coverage-verifcation-patient-pay-tb']");
		COVERAGE_VERIFICATION_PATIENTPAY_TABLE2 = By.xpath("//table[@class='claim-pricing-tbls formlary-member-cost-coverage-verifcation-patient-pay-tb2']");
		COVERAGE_VERIFICATION_PATIENTPAY_TABLE3 = By.xpath("//table[@class='formlary-claim-pricing-total-tbls formlary-member-cost-coverage-verifcation-patient-pay-tb3']");
		COVERAGE_VERIFICATION_PATIENTPAY_TABLE4 = By.xpath("//*[@class='formlary-claim-pricing-total-tbls formlary-member-cost-coverage-verifcation-patient-pay-tb3'][2]");
		COVERAGE_VERIFICATION_APPLIEDAMOUNTS_TABLE = By.xpath("//table[@class='mt10 claim-pricing-tbls formlary-member-cost-coverage-verifcation-applied-amount-tb']");
		COVERAGE_VERIFICATION_BALANCES_TABLE = By.xpath("//table[@class='mt10 claim-pricing-tbls formlary-member-cost-coverage-verifcation-balances-tb']");
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Member Lookup Landing Page Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	
	public void select_a_call_category_FORMULARYLink_Selection() throws Throwable
	{
		utils.ClickOnLink(SELECT_A_CALL_CATEGORY_FORMULARY_LINK);
		utils.GetBusyStatus();
		Thread.sleep(1000);
	}
	
	public void waitUntillDrugResultsPage() throws Throwable
	{		
		utils.CheckElementPresenceByLocator(ELEMENT_DRUG_RESULTS);
		Thread.sleep(1000);
	}
	public void verifyDrugResultsPage() throws Throwable
	{
		utils.VerifyObjectIsDisplayed(ELEMENT_DRUG_RESULTS);
		Thread.sleep(1000);
	}
	public void drugResults_setTextIntoSearchCriteriaInputEdit(String strSearchInputValue) throws Throwable
	{
		utils.SetTextOnEdit(DRUG_RESULTS_SEARCH_CRITERIAVALUE_EDITBOX, strSearchInputValue);
		utils.GetBusyStatus();
		driver.findElement(By.xpath("//span[text()='XANAX']")).click();
		utils.GetBusyStatus();
		Thread.sleep(1000);
	}
	public void drugResults_clickOnSearchButton() throws Throwable
	{
		utils.ClickOnButton(DRUG_RESULTS_SEARCH_CRITERIA_SEARCH_BUTTON);
	}
	public void showingDrugsWithBrandGeneric() throws Throwable
	{
		utils.WaitUntilWebElementExist(ELEMENT_SHOWING_DRUGS_WITH_BRAND_GENERIC);
		utils.VerifyObjectIsDisplayed(ELEMENT_SHOWING_DRUGS_WITH_BRAND_GENERIC);
	}
	public void drugResults_performNDCsearch(String strNDCvalue) throws Throwable
	{
		utils.SetTextOnEdit(DRUG_RESULTS_NDC_EDITBOX, strNDCvalue);
	}
	public void drugResults_SelectFirstNDCRecord() throws Throwable
	{
		utils.ClickOnLink(DRUG_RESULTS_FIRST_NDC_RECORD);
	}	
	public void DrugResults_clickOnVerifyCoverage_Button() throws Throwable
	{
		utils.ClickOnButton(DRUG_RESULTS_BUTTON_VERIFY_COVERAGE_CODE);
		utils.GetBusyStatus();
		Thread.sleep(1000);
	}
	public void waitUntillVerifyCoveragePage() throws Throwable
	{		
		utils.CheckElementPresenceByLocator(ELEMENT_VERIFY_COVERAGE);
		Thread.sleep(1000);
	}
	public void verify_VerifyCoverage_PageExistOrNot() throws Throwable
	{
		utils.VerifyObjectIsDisplayed(ELEMENT_VERIFY_COVERAGE);
		Thread.sleep(1000);
	}	
	public void getTitle_For_CoverageVerification() throws Throwable
    {
    	actCoverageVerificationPanelDetails.add(utils.GetElementText(ELEMENT_COVERAGE_VERIFICATION)); 
    }
    public void getDrugName_Under_CoverageVerification() throws Throwable
    {
    	actCoverageVerificationPanelDetails.add(utils.GetElementText(COVERAGE_VERIFICATION_DRUGNAME));
    }
    public void setTextIntoQuantity_TextBox(String strQuantity) throws Throwable
    {
    	utils.SetTextOnEdit(COVERAGE_VERIFICATION_QUANTITY_EDIT, strQuantity);
    }
    public void setTextIntoDaysSupply_TextBox(String strDaysSupply) throws Throwable
    {
    	utils.SetTextOnEdit(COVERAGE_VERIFICATION_DAYS_SUPPLY_EDIT, strDaysSupply);
    }
	public void selectAnOptionFromDAWlist(String strDAWItem) throws Throwable
	{
		utils.SelectItemFromWebList(COVERAGE_VERIFICATION_DAW_LIST, strDAWItem);
	}
	public void setTextInEditFillDate_TextBox(String strFillDate) throws Throwable
	{
		utils.SetTextOnEdit(COVERAGE_VERIFICATION_FILLDATE_EDIT, strFillDate);
	}
	public void getTextFormPrescriberQualifier_Part1()
	{
		actCoverageVerificationPanelDetails.add(utils.getValueFromTextBox(COVERAGE_VERIFICATION_PRESCRIBER_QLFR_ID_PART1));
	}
	public void getTextFormPrescriberQualifier_Part2()
	{
		actCoverageVerificationPanelDetails.add(utils.getValueFromTextBox(COVERAGE_VERIFICATION_PRESCRIBER_QLFR_ID_PART2));
	}
	public void getValueFrom_PharmacySVCTypeList()
	{
		actCoverageVerificationPanelDetails.add(utils.getSelectedOptionFromDropDown(COVERAGE_VERIFICATION_PHARMACY_SVC_TYPE));
	}
	public void  verify_coverageVerification_Pharmacy_Address_part1(String pharmacyAddressPart1) throws Throwable
	{
		actCoverageVerificationPanelDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(COVERAGE_VERIFICATION_PHARMACY_ADDRESS_PART1,pharmacyAddressPart1));
	}
	public void getCoverageVerification_PharmacyAddressPart2() throws Throwable
	{
		actCoverageVerificationPanelDetails.add(utils.GetElementText(COVERAGE_VERIFICATION_PHARMACY_ADDRESS_PART2));
	}
	public void getCoverageVerification_PharmacyAddressPart3() throws Throwable
	{
		actCoverageVerificationPanelDetails.add(utils.GetElementText(COVERAGE_VERIFICATION_PHARMACY_ADDRESS_PART3));
	}
	public void coverageVerification_ClickOnVerifyCoverageButton() throws Throwable
	{
		utils.ClickOnButton(COVERAGE_VERIFICATION_VERIFYCOVERAGE_BUTTON);
		
	}
	public void coverageverification_generalTableDisplay() throws Throwable
	{
		utils.WaitUntilWebElementExist(COVERAGE_VERIFICATION_GENERAL_TABLE);
		utils.VerifyObjectIsDisplayed(COVERAGE_VERIFICATION_GENERAL_TABLE);
	}
	
	// Coverage Verification Values
	
	// General Table Values Verification
	
	public void coverageVerification_Results_General_ClaimStatus(String strClaimStatus) throws Throwable
	{
		act_C_V_GeneralTable.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(COVERAGE_VERIFICATION_GENERAL_TABLE,strClaimStatus));
	}
	public void coverageVerification_Results_General_NDC(String strNDC) throws Throwable
	{
		act_C_V_GeneralTable.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(COVERAGE_VERIFICATION_GENERAL_TABLE,strNDC));
	}
	public void coverageVerification_Results_General_LabelName(String strLabelName) throws Throwable
	{
		act_C_V_GeneralTable.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(COVERAGE_VERIFICATION_GENERAL_TABLE,strLabelName));
	}
	public void coverageVerification_Results_General_Quantity(String strQuantity) throws Throwable
	{
		act_C_V_GeneralTable.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(COVERAGE_VERIFICATION_GENERAL_TABLE,strQuantity));
	}
	public void coverageVerification_Results_General_Days_Supply(String strDays_Supply) throws Throwable
	{
		act_C_V_GeneralTable.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(COVERAGE_VERIFICATION_GENERAL_TABLE,strDays_Supply));
	}
	public void coverageVerification_Results_General_Pharmacy(String strPharmacy) throws Throwable
	{
		act_C_V_GeneralTable.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(COVERAGE_VERIFICATION_GENERAL_TABLE,strPharmacy));
	}
	public void coverageVerification_Results_General_FillDate(String strFillDate) throws Throwable
	{
		act_C_V_GeneralTable.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(COVERAGE_VERIFICATION_GENERAL_TABLE,strFillDate));
	}
	public void coverageVerification_Results_General_TierLevel(String strTierLevel) throws Throwable
	{
		act_C_V_GeneralTable.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(COVERAGE_VERIFICATION_GENERAL_TABLE,strTierLevel));
	}
	public void coverageVerification_Results_General_Formulary_Indicator(String strFormulary_Indicator) throws Throwable
	{
		act_C_V_GeneralTable.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(COVERAGE_VERIFICATION_GENERAL_TABLE,strFormulary_Indicator));
	}
	
	// Results Panel - Errors Table
	
	public void coverageVerification_Results_Errors_Code(String strCode) throws Throwable
	{
		act_C_V_ErrorsTable.add(utils.RxNovaConnect_WebTable_VerifyColumnData_HavingMulti_Rows(COVERAGE_VERIFICATION_ERRORS_TABLE,strCode));
	}
	public void coverageVerification_Results_Errors_Action(String strAction) throws Throwable
	{
		act_C_V_ErrorsTable.add(utils.RxNovaConnect_WebTable_VerifyColumnData_HavingMulti_Rows(COVERAGE_VERIFICATION_ERRORS_TABLE,strAction));
	}
	public void coverageVerification_Results_Errors_ArgusErrorText(String strArgusErrorText) throws Throwable
	{
		act_C_V_ErrorsTable.add(utils.RxNovaConnect_WebTable_VerifyColumnData_HavingMulti_Rows(COVERAGE_VERIFICATION_ERRORS_TABLE,strArgusErrorText));
	}
	
	public void coverageVerification_Results_Errors_Code1(String strCode1) throws Throwable
	{
		act_C_V_ErrorsTable.add(utils.RxNovaConnect_WebTable_VerifyColumnData_HavingMulti_Rows(COVERAGE_VERIFICATION_ERRORS_TABLE,strCode1));
	}
	public void coverageVerification_Results_Errors_Action1(String strAction1) throws Throwable
	{
		act_C_V_ErrorsTable.add(utils.RxNovaConnect_WebTable_VerifyColumnData_HavingMulti_Rows(COVERAGE_VERIFICATION_ERRORS_TABLE,strAction1));
	}
	public void coverageVerification_Results_Errors_ArgusErrorText1(String strArgusErrorText1) throws Throwable
	{
		act_C_V_ErrorsTable.add(utils.RxNovaConnect_WebTable_VerifyColumnData_HavingMulti_Rows(COVERAGE_VERIFICATION_ERRORS_TABLE,strArgusErrorText1));
	}
	// Member Cost Panel Total Rx Cost Table
	
	public void coverageVerification_membercost_TotalRxCost_TotalPatientPay(String strTotalPatient_pay) throws Throwable
	{
		act_C_V_TotalRxCostTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_TOTALRXCOST_TABLE,strTotalPatient_pay));
	}
	public void coverageVerification_membercost_TotalRxCost_TotalPlanPaid(String strTotalplanpaid) throws Throwable
	{
		act_C_V_TotalRxCostTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_TOTALRXCOST_TABLE,strTotalplanpaid));
	}
	public void coverageVerification_membercost_TotalRxCost_TotalOtherPayerPaid(String strTotalotherpayerpaid) throws Throwable
	{
		act_C_V_TotalRxCostTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_TOTALRXCOST_TABLE,strTotalotherpayerpaid));
	}
	public void coverageVerification_membercost_TotalRxCost_TotalRxCost(String strTotalrxcost) throws Throwable
	{
		act_C_V_TotalRxCostTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_TOTALRXCOST_TABLE,strTotalrxcost));
	}
	
	
	// Member Cost Panel  -- Patient Pay Table
	
	public void coverageVerification_patientpay_BaseCopayAmount(String strBasecopayamount) throws Throwable
	{
		act_C_V_PatientPayTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_PATIENTPAY_TABLE1,strBasecopayamount));
	}
	public void coverageVerification_patientpay_BaseCoinsuranceAmount(String strBaseCoInsuranceAmount) throws Throwable
	{
		act_C_V_PatientPayTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_PATIENTPAY_TABLE1,strBaseCoInsuranceAmount));
	}
	public void coverageVerification_patientpay_AmountAppliedToPeriodicDeductible(String strAmountAppliedToPeriodicDeductible) throws Throwable
	{
		act_C_V_PatientPayTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_PATIENTPAY_TABLE1,strAmountAppliedToPeriodicDeductible));
	}
	public void coverageVerification_patientpay_AmountExceededProcessedBenefitMax(String strAmountExceededProcessedBenefitMax) throws Throwable
	{
		act_C_V_PatientPayTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_PATIENTPAY_TABLE1,strAmountExceededProcessedBenefitMax));
	}
	public void coverageVerification_patientpay_AmountAttributedToProcessorFee(String strAmountAttributedToProcessorFee) throws Throwable
	{
		act_C_V_PatientPayTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_PATIENTPAY_TABLE1,strAmountAttributedToProcessorFee));
	}
	public void coverageVerification_patientpay_AmountAttributedToSalesTax(String strAmountAttributedToSalesTax) throws Throwable
	{
		act_C_V_PatientPayTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_PATIENTPAY_TABLE1,strAmountAttributedToSalesTax));
	}
	public void coverageVerification_patientpay_AmountAttributedToCoverageGap(String strAmountAttributedToCoverageGap) throws Throwable
	{
		act_C_V_PatientPayTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_PATIENTPAY_TABLE1,strAmountAttributedToCoverageGap));
	}
	public void coverageVerification_patientpay_HealthPlanFundedAmount(String strHealthPlanFundedAmount) throws Throwable
	{
		act_C_V_PatientPayTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_PATIENTPAY_TABLE1,strHealthPlanFundedAmount));
	}
	public void coverageVerification_patientpay_MemberPaidDifference(String strMemberPaidDifference) throws Throwable
	{
		act_C_V_PatientPayTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_PATIENTPAY_TABLE1,strMemberPaidDifference));
	}
	public void coverageVerification_patientpay_AttributedToNetworkSelection(String strAttributedToNetworkSelection) throws Throwable
	{
		act_C_V_PatientPayTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_PATIENTPAY_TABLE2,strAttributedToNetworkSelection));
	}
	public void coverageVerification_patientpay_AttributedToBrandDrug(String strAttributedToBrandDrug) throws Throwable
	{
		act_C_V_PatientPayTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_PATIENTPAY_TABLE2,strAttributedToBrandDrug));
	}
	public void coverageVerification_patientpay_AttributedToNonPreferredFormulary(String strAttributedToNonPreferredFormulary) throws Throwable
	{
		act_C_V_PatientPayTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_PATIENTPAY_TABLE2,strAttributedToNonPreferredFormulary));
	}
	public void coverageVerification_patientpay_AttributedToNonPreferredFormularyBrand(String strAttributedToNonPreferredFormularyBrand) throws Throwable
	{
		act_C_V_PatientPayTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_PATIENTPAY_TABLE2,strAttributedToNonPreferredFormularyBrand));
	}
	public void coverageVerification_patientpay_TotalPatientPay(String strTotalPatientPay) throws Throwable
	{
		act_C_V_PatientPayTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_PATIENTPAY_TABLE3,strTotalPatientPay));
	} 
	public void coverageVerification_patientpay_HRAAmount(String strHRAAmount) throws Throwable
	{
		act_C_V_PatientPayTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_PATIENTPAY_TABLE3,strHRAAmount));
	}
	public void coverageVerification_patientpay_FSAAmount(String strFSAAmount) throws Throwable
	{
		act_C_V_PatientPayTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_PATIENTPAY_TABLE3,strFSAAmount));
	}
	public void coverageVerification_patientpay_HSAAmount(String strHSAAmount) throws Throwable
	{
		act_C_V_PatientPayTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_PATIENTPAY_TABLE3,strHSAAmount));
	}
	public void coverageVerification_patientpay_ADJAmount(String strADJAmount) throws Throwable
	{
		act_C_V_PatientPayTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_PATIENTPAY_TABLE3,strADJAmount));
	}
	public void coverageVerification_patientpay_SPAPAmount(String strSPAPAmount) throws Throwable
	{
		act_C_V_PatientPayTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_PATIENTPAY_TABLE3,strSPAPAmount));
	}
	public void coverageVerification_patientpay_TotalMemberPaidToPharmacy(String strTotalMemberPaidToPharmacy) throws Throwable
	{
		act_C_V_PatientPayTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_PATIENTPAY_TABLE4,strTotalMemberPaidToPharmacy));
	}
	
	// Coverage Verification  Member Cost Panel Applied Amounts Table
	
	public void coverageVerification_AppliedAmounts_MemberDeductible(String strMemberDeductible) throws Throwable
	{
		act_C_V_AppliedAmountsTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_APPLIEDAMOUNTS_TABLE,strMemberDeductible));
	}
	public void coverageVerification_AppliedAmounts_PlanDeductible(String strPlanDeductible) throws Throwable
	{
		act_C_V_AppliedAmountsTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_APPLIEDAMOUNTS_TABLE,strPlanDeductible));
	}
	public void coverageVerification_AppliedAmounts_DeductibleExcluded(String strDeductibleExcluded) throws Throwable
	{
		act_C_V_AppliedAmountsTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_APPLIEDAMOUNTS_TABLE,strDeductibleExcluded));
	}
	public void coverageVerification_AppliedAmounts_TROOP(String strTROOP) throws Throwable
	{
		act_C_V_AppliedAmountsTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_APPLIEDAMOUNTS_TABLE,strTROOP));
	}
	public void coverageVerification_AppliedAmounts_NonTROOP(String strNonTROOP) throws Throwable
	{
		act_C_V_AppliedAmountsTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_APPLIEDAMOUNTS_TABLE,strNonTROOP));
	}
	public void coverageVerification_AppliedAmounts_LICS(String strLICS) throws Throwable
	{
		act_C_V_AppliedAmountsTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_APPLIEDAMOUNTS_TABLE,strLICS));
	}
	public void coverageVerification_AppliedAmounts_OtherTROOP(String strOtherTROOP) throws Throwable
	{
		act_C_V_AppliedAmountsTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_APPLIEDAMOUNTS_TABLE,strOtherTROOP));
	}
	public void coverageVerification_AppliedAmounts_BenefitStageQualifier(String strBenefitStageQualifier) throws Throwable
	{
		act_C_V_AppliedAmountsTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_APPLIEDAMOUNTS_TABLE,strBenefitStageQualifier));
	}
	public void coverageVerification_AppliedAmounts_BenefitStageAmount(String strBenefitStageAmount) throws Throwable
	{
		act_C_V_AppliedAmountsTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_APPLIEDAMOUNTS_TABLE,strBenefitStageAmount));
	}
	
	// Verify Coverage Member Cost Panel Balances Table
	
	public void coverageVerification_Balances_SpendingAccountRemaining(String strSpendingAccountRemaining) throws Throwable
	{
		act_C_V_BalancesTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_BALANCES_TABLE,strSpendingAccountRemaining));
	}
	public void coverageVerification_Balances_RemainingBenefit(String strRemainingBenefit) throws Throwable
	{
		act_C_V_BalancesTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_BALANCES_TABLE,strRemainingBenefit));
	}
	public void coverageVerification_Balances_AccumulatedDeductible(String strAccumulatedDeductible) throws Throwable
	{
		act_C_V_BalancesTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_BALANCES_TABLE,strAccumulatedDeductible));
	}
	public void coverageVerification_Balances_RemainingDeductible(String strRemainingDeductible) throws Throwable
	{
		act_C_V_BalancesTable.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(COVERAGE_VERIFICATION_BALANCES_TABLE,strRemainingDeductible));
	}
		
}
