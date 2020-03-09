package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;

public class APS14487_MemberLookUp_VerifyCoverage_Selector 
{
	private By HEADER_SUMMARY;
	private By ELEMENT_SELECT_A_CALL_CATEGORY;
	private By SELECT_A_CALL_CATEGORY_CLAIM_LINK;
	private By ELEMENT_CLAIM_HISTORY;
	private By CLAIMHISTORY_EDIT_CLAIM_ID;
	private By CLAIMHISTORY_LINK_CLAIMID; // blue arrow link in claim hisory page claim history link
	private By ELEMENT_CLAIM_DETAIL;
	private By CLAIMDETAIL_BUTTON_VERIFY_COVERAGE_CODE;
	private By ELEMENT_DRUG_RESULTS;
	private By DRUG_RESULTS_BUTTON_VERIFY_COVERAGE_CODE;
	private By ELEMENT_VERIFY_COVERAGE;
	
	private By VERIFYCOVERAGE_CLAIMID_TEXT;
	private By VERIFYCOVERAGE_CLAIM_DRUGNAME;
	private By VERIFYCOVERAGE_CLAIM_DRUG_QUANTITY_TABLE;
	private By VERIFYCOVERAGE_CLAIM_DRUG_PRESCRIBER_QLFR_ID_TABLE;
	private By VERIFYCOVERAGE_CLAIM_DRUG_PHARMACY_ADDRESS_PART2;
	private By VERIFYCOVERAGE_CLAIM_DRUG_PHARMACY_ADDRESS_PART3;
	private By VERIFYCOVERAGE_RESULTSPANEL_GENERAL_TABLE;
	private By VERIFYCOVERAGE_RESULTSPANEL_ERRORS_TABLE;
	private By 	MEMBERCOST_TOTALRXCOST_TABLE;
	private By MEMBERCOST_PATIENTPAY_TABLE1;
	private By MEMBERCOST_PATIENTPAY_TABLE2;
	private By MEMBERCOST_PATIENTPAY_TABLE3;
	private By MEMBERCOST_PATIENTPAY_TABLE4;
	private By MEMBERCOST_APPLIEDAMOUNT_TABLE;
	private By MEMBERCOST_BALANCES_TABLE;
	
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
	
	@SuppressWarnings("unused")
	private HybridDesktop_SharedResource SharedResource;
	private RxNova_Utlilty utils;
	@SuppressWarnings("unused")
	private WebDriver driver;
	
	public ArrayList<String> actMemberDetails = new ArrayList<String>();	
	public ArrayList<String> actHeaderSummary = new ArrayList<String>();
	public ArrayList<String> actClaimDrugDetails = new ArrayList<String>();
	public ArrayList<String> actGeneralTable_ResultsPanel_Details = new ArrayList<String>();
	public ArrayList<String> actErrorsTable_ResultsPanel_Details = new ArrayList<String>();
	public ArrayList<String> actMemberCost_TotalRxCost = new ArrayList<String>();
	public ArrayList<String> actMemberCost_PatientPay = new ArrayList<String>();
	public ArrayList<String> actMemberCost_AppliedAmounts = new ArrayList<String>();
	public ArrayList<String> actMemberCost_Balances = new ArrayList<String>();
	public ArrayList<String> actCoverageVerificationPanelDetails = new ArrayList<String>();
	
	public ArrayList<String> act_C_V_GeneralTable = new ArrayList<String>();
	public ArrayList<String> act_C_V_ErrorsTable_ = new ArrayList<String>();
	public ArrayList<String> act_C_V_TotalRxCostTable = new ArrayList<String>();
	public ArrayList<String> act_C_V_PatientPayTable = new ArrayList<String>();
	public ArrayList<String> act_C_V_AppliedAmountsTable = new ArrayList<String>();
	public ArrayList<String> act_C_V_BalancesTable = new ArrayList<String>();
		
	// Verify Coverage Title X-path
	public  APS14487_MemberLookUp_VerifyCoverage_Selector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils)
	{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;
		APS14487_MemberLookUp_VerifyCoverageCode_Objects();
	}
	public void APS14487_MemberLookUp_VerifyCoverageCode_Objects()
	{	
		HEADER_SUMMARY = By.xpath("//table[@class='fl docked-info-tbl word-break-tbl']");
		ELEMENT_SELECT_A_CALL_CATEGORY = By.xpath("//h2[text() = 'Select a call category']");
		SELECT_A_CALL_CATEGORY_CLAIM_LINK = By.id("wheelForm:claimLink");
		ELEMENT_CLAIM_HISTORY = By.xpath("//h2[text() = 'Claim History']");
		CLAIMHISTORY_EDIT_CLAIM_ID = By.id("claimSelectionForm:claimFilterTable:claimId");
		CLAIMHISTORY_LINK_CLAIMID = By.id("claimSelectionForm:claimResultTable:0:claimDetailLink"); // blue arrow link in claim hisory page claim history link
		ELEMENT_CLAIM_DETAIL = By.xpath("//h2[text() = 'Claim Detail']");
		CLAIMDETAIL_BUTTON_VERIFY_COVERAGE_CODE = By.xpath("//span[@class='ui-button-text' and text()='Verify Coverage']");
		ELEMENT_DRUG_RESULTS = By.xpath("//h2[text() = 'Drug Results']");
		DRUG_RESULTS_BUTTON_VERIFY_COVERAGE_CODE = By.xpath("//span[@class='ui-button-text' and text()='Verify Coverage']");
		ELEMENT_VERIFY_COVERAGE = By.xpath("//h2[text() = 'Verify Coverage']");
		ELEMENT_COVERAGE_VERIFICATION = By.xpath("//h2[text() = 'Coverage Verification']");
		
		VERIFYCOVERAGE_CLAIMID_TEXT = By.xpath("//h2[@class='formlary-coverage-verifcation-title']");
		VERIFYCOVERAGE_CLAIM_DRUGNAME = By.xpath("//div[@id='formularyVCForm:coverageVerifcationPanelFromClaim']/span");
		VERIFYCOVERAGE_CLAIM_DRUG_QUANTITY_TABLE = By.xpath("//table[@class='formlary-coverage-verifcation-detail-criteria-tb1']");
		VERIFYCOVERAGE_CLAIM_DRUG_PRESCRIBER_QLFR_ID_TABLE = By.xpath("//table[@class='formlary-coverage-verifcation-detail-criteria-tb2']");
		VERIFYCOVERAGE_CLAIM_DRUG_PHARMACY_ADDRESS_PART2 = By.xpath("//table[@class='formlary-coverage-verifcation-detail-criteria-tb2']/tbody/tr[4]/td[2]");
		VERIFYCOVERAGE_CLAIM_DRUG_PHARMACY_ADDRESS_PART3 = By.xpath("//table[@class='formlary-coverage-verifcation-detail-criteria-tb2']/tbody/tr[5]/td[2]");
		VERIFYCOVERAGE_RESULTSPANEL_GENERAL_TABLE = By.id("formularyVCForm:formularyAccordionPanel:generalPanelFromClaim");
		VERIFYCOVERAGE_RESULTSPANEL_ERRORS_TABLE = By.id("formularyVCForm:formularyAccordionPanel:errorsTableFromClaim");
		MEMBERCOST_TOTALRXCOST_TABLE = By.xpath("//table[@class='claim-pricing-tbls formlary-member-cost-coverage-verifcation-total-rx-cost-tb']");
		MEMBERCOST_PATIENTPAY_TABLE1 = By.xpath("//table[@class='mt10 claim-pricing-tbls formlary-member-cost-coverage-verifcation-patient-pay-tb']"); 
		MEMBERCOST_PATIENTPAY_TABLE2 = By.xpath("//table[@class='claim-pricing-tbls formlary-member-cost-coverage-verifcation-patient-pay-tb2']");
		MEMBERCOST_PATIENTPAY_TABLE3 = By.xpath("//table[@class='formlary-claim-pricing-total-tbls formlary-member-cost-coverage-verifcation-patient-pay-tb3']");
		MEMBERCOST_PATIENTPAY_TABLE4 = By.xpath("//*[@class='formlary-claim-pricing-total-tbls formlary-member-cost-coverage-verifcation-patient-pay-tb3'][2]");
		MEMBERCOST_APPLIEDAMOUNT_TABLE = By.xpath("//table[@class='mt10 claim-pricing-tbls formlary-member-cost-coverage-verifcation-applied-amount-tb']");
		MEMBERCOST_BALANCES_TABLE = By.xpath("//table[@class='mt10 claim-pricing-tbls formlary-member-cost-coverage-verifcation-balances-tb']");
		
		COVERAGE_VERIFICATION_DRUGNAME = By.xpath("//div[@id='formularyVCForm:coverageVerifcationPanel2']/span");
		COVERAGE_VERIFICATION_QUANTITY_EDIT = By.id("formularyVCForm:quantity2");
		COVERAGE_VERIFICATION_DAYS_SUPPLY_EDIT = By.id("formularyVCForm:daysSupply2");
		COVERAGE_VERIFICATION_DAW_LIST = By.id("formularyVCForm:dispenseAsWritten2");
		COVERAGE_VERIFICATION_FILLDATE_EDIT = By.id("formularyVCForm:fillDate2"); // 
		COVERAGE_VERIFICATION_PRESCRIBER_QLFR_ID_PART1 = By.id("formularyVCForm:prescriberIdQualifier2");
		COVERAGE_VERIFICATION_PRESCRIBER_QLFR_ID_PART2 = By.id("formularyVCForm:prescriberId2");
		COVERAGE_VERIFICATION_PHARMACY_SVC_TYPE = By.id("formularyVCForm:pharmacySvcType2");
		COVERAGE_VERIFICATION_PHARMACY_ADDRESS_PART1 = By.id("formularyVCForm:claimTestPharmacy2");
		COVERAGE_VERIFICATION_PHARMACY_ADDRESS_PART2 = By.xpath("//table[@id='formularyVCForm:claimTestPharmacy2']/tbody/tr[4]/td[2]");
		COVERAGE_VERIFICATION_PHARMACY_ADDRESS_PART3 = By.xpath("//table[@id='formularyVCForm:claimTestPharmacy2']/tbody/tr[5]/td[2]");
		COVERAGE_VERIFICATION_VERIFYCOVERAGE_BUTTON = By.id("formularyVCForm:verifyCoverageBtn2");	
		
		COVERAGE_VERIFICATION_GENERAL_TABLE = By.id("formularyVCForm:formularyAccordionPanel:generalPanel2");
		COVERAGE_VERIFICATION_ERRORS_TABLE = By.id("formularyVCForm:formularyAccordionPanel:errorsTable2");
		COVERAGE_VERIFICATION_TOTALRXCOST_TABLE = By.xpath("//span[@id='formularyVCForm:formularyAccordionPanel:membercostPanel2']//table[@class='claim-pricing-tbls formlary-member-cost-coverage-verifcation-total-rx-cost-tb']");
		COVERAGE_VERIFICATION_PATIENTPAY_TABLE1 = By.xpath("//span[@id='formularyVCForm:formularyAccordionPanel:membercostPanel2']//table[@class='mt10 claim-pricing-tbls claim-pricing-patient-pay-tbl formlary-member-cost-coverage-verifcation-patient-pay-tb']");
		COVERAGE_VERIFICATION_PATIENTPAY_TABLE2 = By.xpath("//span[@id='formularyVCForm:formularyAccordionPanel:membercostPanel2']//table[@class='claim-pricing-tbls formlary-member-cost-coverage-verifcation-patient-pay-tb2']");
		COVERAGE_VERIFICATION_PATIENTPAY_TABLE3 = By.xpath("//span[@id='formularyVCForm:formularyAccordionPanel:membercostPanel2']//table[@class='formlary-claim-pricing-total-tbls formlary-member-cost-coverage-verifcation-patient-pay-tb3']");
		COVERAGE_VERIFICATION_PATIENTPAY_TABLE4 = By.xpath("//span[@id='formularyVCForm:formularyAccordionPanel:membercostPanel2']//table[@class='formlary-claim-pricing-total-tbls formlary-member-cost-coverage-verifcation-patient-pay-tb3'][2]");
		COVERAGE_VERIFICATION_APPLIEDAMOUNTS_TABLE = By.xpath("//span[@id='formularyVCForm:formularyAccordionPanel:membercostPanel2']//table[@class='mt10 claim-pricing-tbls formlary-member-cost-coverage-verifcation-applied-amount-tb']");
		COVERAGE_VERIFICATION_BALANCES_TABLE = By.xpath("//span[@id='formularyVCForm:formularyAccordionPanel:membercostPanel2']//table[@class='mt10 claim-pricing-tbls formlary-member-cost-coverage-verifcation-balances-tb']");
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Member Lookup Landing Page Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	
	public void verifyMemberLookupDetail()
	{
		utils.VerifyObjectIsDisplayed(HEADER_SUMMARY);
		utils.VerifyObjectIsDisplayed(ELEMENT_SELECT_A_CALL_CATEGORY);
	}
	public void select_a_call_category_claimLink_Selection() throws Throwable
	{
		utils.ClickOnLink(SELECT_A_CALL_CATEGORY_CLAIM_LINK);
		utils.GetBusyStatus();
		Thread.sleep(1000);
	}
	
	public void waitUntillClaimHistoryPage() throws Throwable
	{		
		utils.CheckElementPresenceByLocator(ELEMENT_CLAIM_HISTORY);
		Thread.sleep(1000);
	}
	public void verifyClaimHistoryPage() throws Throwable
	{
		utils.VerifyObjectIsDisplayed(ELEMENT_CLAIM_HISTORY);
		Thread.sleep(1000);
	}
	
	public void claim_claimhistory_ClickOnCliamBlueArrowLink(Map<String,String>InputForClaimSearch) throws Throwable
	{
		String strClaimValue = InputForClaimSearch.get("claim_Input_link");
		utils.SetTextOnEdit(CLAIMHISTORY_EDIT_CLAIM_ID, strClaimValue);
		utils.GetBusyStatus();
		Thread.sleep(1000);
		utils.ClickOnLink(CLAIMHISTORY_LINK_CLAIMID);
		utils.GetBusyStatus();
		Thread.sleep(1000);
	}
	public void waitUntillClaimDetailsPage() throws Throwable
	{		
		utils.CheckElementPresenceByLocator(ELEMENT_CLAIM_DETAIL);
		Thread.sleep(1000);
	}
	public void verifyClaimDetailsPage() throws Throwable
	{
		utils.VerifyObjectIsDisplayed(ELEMENT_CLAIM_DETAIL);
		Thread.sleep(1000);
	}
	public void claimdetail_clickOnVerifyCoverage_Button() throws Throwable
	{
		utils.ClickOnButton(CLAIMDETAIL_BUTTON_VERIFY_COVERAGE_CODE);
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
	
	public void getClaimIdTitleValue() throws Throwable
	{
		actClaimDrugDetails.add(utils.GetElementText(VERIFYCOVERAGE_CLAIMID_TEXT));
	} 
	public void getDrugNameAndValue() throws Throwable
	{
		actClaimDrugDetails.add(utils.GetElementText(VERIFYCOVERAGE_CLAIM_DRUGNAME));
	}
	public void getClaim_DrugDetails_Quantity(String strQuantity) throws Throwable
	{
		actClaimDrugDetails.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(VERIFYCOVERAGE_CLAIM_DRUG_QUANTITY_TABLE,strQuantity));
	}
	public void getClaim_DrugDetails_DaysSupply(String strDays_Supply) throws Throwable
	{
		actClaimDrugDetails.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(VERIFYCOVERAGE_CLAIM_DRUG_QUANTITY_TABLE,strDays_Supply));
	}
	public void getClaim_DrugDetails_DAW(String strDAW) throws Throwable
	{
		actClaimDrugDetails.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(VERIFYCOVERAGE_CLAIM_DRUG_QUANTITY_TABLE,strDAW));
	}
	public void getClaim_DrugDetails_FillDate(String strFillDate) throws Throwable
	{
		actClaimDrugDetails.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(VERIFYCOVERAGE_CLAIM_DRUG_QUANTITY_TABLE,strFillDate));
	}
	public void getClaim_DrugDetails_PrescriberIDqualifier(String strPrescriberIDqualifier) throws Throwable
	{
		actClaimDrugDetails.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(VERIFYCOVERAGE_CLAIM_DRUG_PRESCRIBER_QLFR_ID_TABLE,strPrescriberIDqualifier));
	}
	public void getClaim_DrugDetails_PharmacyServiceType(String strPharmacyServiceType) throws Throwable
	{
		actClaimDrugDetails.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(VERIFYCOVERAGE_CLAIM_DRUG_PRESCRIBER_QLFR_ID_TABLE,strPharmacyServiceType));
	}
	public void getClaim_DrugDetails_PharmacyAddress_part1(String strPharmacyAddressPart1) throws Throwable
	{
		actClaimDrugDetails.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(VERIFYCOVERAGE_CLAIM_DRUG_PRESCRIBER_QLFR_ID_TABLE,strPharmacyAddressPart1));
	}
	public void getPharmacyAddressPart2() throws Throwable
	{
		actClaimDrugDetails.add(utils.GetElementText(VERIFYCOVERAGE_CLAIM_DRUG_PHARMACY_ADDRESS_PART2));
	}
	public void getPharmacyAddressPart3() throws Throwable
	{
		actClaimDrugDetails.add(utils.GetElementText(VERIFYCOVERAGE_CLAIM_DRUG_PHARMACY_ADDRESS_PART3));
	}
	
	// Verify Coverage Results Panel General Table
	
	
	public void getVerifyCoverage_Results_General_ClaimStatus(String strClaimStatus) throws Throwable
	{
		actGeneralTable_ResultsPanel_Details.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(VERIFYCOVERAGE_RESULTSPANEL_GENERAL_TABLE,strClaimStatus));
	}
	public void getVerifyCoverage_Results_General_NDC(String strNDC) throws Throwable
	{
		actGeneralTable_ResultsPanel_Details.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(VERIFYCOVERAGE_RESULTSPANEL_GENERAL_TABLE,strNDC));
	}
	public void getVerifyCoverage_Results_General_LabelName(String strLabelName) throws Throwable
	{
		actGeneralTable_ResultsPanel_Details.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(VERIFYCOVERAGE_RESULTSPANEL_GENERAL_TABLE,strLabelName));
	}
	public void getVerifyCoverage_Results_General_Quantity(String strQuantity) throws Throwable
	{
		actGeneralTable_ResultsPanel_Details.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(VERIFYCOVERAGE_RESULTSPANEL_GENERAL_TABLE,strQuantity));
	}
	public void getVerifyCoverage_Results_General_Days_Supply(String strDays_Supply) throws Throwable
	{
		actGeneralTable_ResultsPanel_Details.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(VERIFYCOVERAGE_RESULTSPANEL_GENERAL_TABLE,strDays_Supply));
	}
	public void getVerifyCoverage_Results_General_Pharmacy(String strPharmacy) throws Throwable
	{
		actGeneralTable_ResultsPanel_Details.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(VERIFYCOVERAGE_RESULTSPANEL_GENERAL_TABLE,strPharmacy));
	}
	public void getVerifyCoverage_Results_General_FillDate(String strFillDate) throws Throwable
	{
		actGeneralTable_ResultsPanel_Details.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(VERIFYCOVERAGE_RESULTSPANEL_GENERAL_TABLE,strFillDate));
	}
	public void getVerifyCoverage_Results_General_TierLevel(String strTierLevel) throws Throwable
	{
		actGeneralTable_ResultsPanel_Details.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(VERIFYCOVERAGE_RESULTSPANEL_GENERAL_TABLE,strTierLevel));
	}
	public void getVerifyCoverage_Results_General_Formulary_Indicator(String strFormulary_Indicator) throws Throwable
	{
		actGeneralTable_ResultsPanel_Details.add(utils.RxNovaConnect_WebTable_VerifyMultipleColumnData(VERIFYCOVERAGE_RESULTSPANEL_GENERAL_TABLE,strFormulary_Indicator));
	}
	
	// Verify Coverage Results Panel - Errors Table
	
	public void getVerifyCoverage_Results_Errors_Code(String strCode) throws Throwable
	{
		actErrorsTable_ResultsPanel_Details.add(utils.RxNovaConnect_WebTable_VerifyColumnData(VERIFYCOVERAGE_RESULTSPANEL_ERRORS_TABLE,strCode));
	}
	public void getVerifyCoverage_Results_Errors_Action(String strAction) throws Throwable
	{
		actErrorsTable_ResultsPanel_Details.add(utils.RxNovaConnect_WebTable_VerifyColumnData(VERIFYCOVERAGE_RESULTSPANEL_ERRORS_TABLE,strAction));
	}
	public void getVerifyCoverage_Results_Errors_ArgusErrorText(String strArgusErrorText) throws Throwable
	{
		actErrorsTable_ResultsPanel_Details.add(utils.RxNovaConnect_WebTable_VerifyColumnData(VERIFYCOVERAGE_RESULTSPANEL_ERRORS_TABLE,strArgusErrorText));
	}
	
	// Verify Coverage Member Cost Panel Total Rx Cost Table
	
	public void membercost_TotalRxCost_TotalPatientPay(String strTotalPatient_pay) throws Throwable
	{
		actMemberCost_TotalRxCost.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_TOTALRXCOST_TABLE,strTotalPatient_pay));
	}
	public void membercost_TotalRxCost_TotalPlanPaid(String strTotalplanpaid) throws Throwable
	{
		actMemberCost_TotalRxCost.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_TOTALRXCOST_TABLE,strTotalplanpaid));
	}
	public void membercost_TotalRxCost_TotalOtherPayerPaid(String strTotalotherpayerpaid) throws Throwable
	{
		actMemberCost_TotalRxCost.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_TOTALRXCOST_TABLE,strTotalotherpayerpaid));
	}
	public void membercost_TotalRxCost_TotalRxCost(String strTotalrxcost) throws Throwable
	{
		actMemberCost_TotalRxCost.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_TOTALRXCOST_TABLE,strTotalrxcost));
	}
	
	// Verify Coverage Member Cost Panel -- Patient Pay Table
	
	public void patientpay_BaseCopayAmount(String strBasecopayamount) throws Throwable
	{
		actMemberCost_PatientPay.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_PATIENTPAY_TABLE1,strBasecopayamount));
	}
	public void patientpay_BaseCoinsuranceAmount(String strBaseCoInsuranceAmount) throws Throwable
	{
		actMemberCost_PatientPay.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_PATIENTPAY_TABLE1,strBaseCoInsuranceAmount));
	}
	public void patientpay_AmountAppliedToPeriodicDeductible(String strAmountAppliedToPeriodicDeductible) throws Throwable
	{
		actMemberCost_PatientPay.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_PATIENTPAY_TABLE1,strAmountAppliedToPeriodicDeductible));
	}
	public void patientpay_AmountExceededProcessedBenefitMax(String strAmountExceededProcessedBenefitMax) throws Throwable
	{
		actMemberCost_PatientPay.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_PATIENTPAY_TABLE1,strAmountExceededProcessedBenefitMax));
	}
	public void patientpay_AmountAttributedToProcessorFee(String strAmountAttributedToProcessorFee) throws Throwable
	{
		actMemberCost_PatientPay.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_PATIENTPAY_TABLE1,strAmountAttributedToProcessorFee));
	}
	public void patientpay_AmountAttributedToSalesTax(String strAmountAttributedToSalesTax) throws Throwable
	{
		actMemberCost_PatientPay.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_PATIENTPAY_TABLE1,strAmountAttributedToSalesTax));
	}
	public void patientpay_AmountAttributedToCoverageGap(String strAmountAttributedToCoverageGap) throws Throwable
	{
		actMemberCost_PatientPay.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_PATIENTPAY_TABLE1,strAmountAttributedToCoverageGap));
	}
	public void patientpay_HealthPlanFundedAmount(String strHealthPlanFundedAmount) throws Throwable
	{
		actMemberCost_PatientPay.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_PATIENTPAY_TABLE1,strHealthPlanFundedAmount));
	}
	public void patientpay_MemberPaidDifference(String strMemberPaidDifference) throws Throwable
	{
		actMemberCost_PatientPay.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_PATIENTPAY_TABLE1,strMemberPaidDifference));
	}
	public void patientpay_AttributedToNetworkSelection(String strAttributedToNetworkSelection) throws Throwable
	{
		actMemberCost_PatientPay.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_PATIENTPAY_TABLE2,strAttributedToNetworkSelection));
	}
	public void patientpay_AttributedToBrandDrug(String strAttributedToBrandDrug) throws Throwable
	{
		actMemberCost_PatientPay.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_PATIENTPAY_TABLE2,strAttributedToBrandDrug));
	}
	public void patientpay_AttributedToNonPreferredFormulary(String strAttributedToNonPreferredFormulary) throws Throwable
	{
		actMemberCost_PatientPay.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_PATIENTPAY_TABLE2,strAttributedToNonPreferredFormulary));
	}
	public void patientpay_AttributedToNonPreferredFormularyBrand(String strAttributedToNonPreferredFormularyBrand) throws Throwable
	{
		actMemberCost_PatientPay.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_PATIENTPAY_TABLE2,strAttributedToNonPreferredFormularyBrand));
	}
	public void patientpay_TotalPatientPay(String strTotalPatientPay) throws Throwable
	{
		actMemberCost_PatientPay.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_PATIENTPAY_TABLE3,strTotalPatientPay));
	} 
	public void patientpay_HRAAmount(String strHRAAmount) throws Throwable
	{
		actMemberCost_PatientPay.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_PATIENTPAY_TABLE3,strHRAAmount));
	}
	public void patientpay_FSAAmount(String strFSAAmount) throws Throwable
	{
		actMemberCost_PatientPay.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_PATIENTPAY_TABLE3,strFSAAmount));
	}
	public void patientpay_HSAAmount(String strHSAAmount) throws Throwable
	{
		actMemberCost_PatientPay.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_PATIENTPAY_TABLE3,strHSAAmount));
	}
	public void patientpay_ADJAmount(String strADJAmount) throws Throwable
	{
		actMemberCost_PatientPay.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_PATIENTPAY_TABLE3,strADJAmount));
	}
	public void patientpay_SPAPAmount(String strSPAPAmount) throws Throwable
	{
		actMemberCost_PatientPay.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_PATIENTPAY_TABLE3,strSPAPAmount));
	}
	public void patientpay_TotalMemberPaidToPharmacy(String strTotalMemberPaidToPharmacy) throws Throwable
	{
		actMemberCost_PatientPay.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_PATIENTPAY_TABLE4,strTotalMemberPaidToPharmacy));
	}
	
	
	// Verify Coverage Member Cost Panel Applied Amounts Table
	
	public void AppliedAmounts_MemberDeductible(String strMemberDeductible) throws Throwable
	{
		actMemberCost_AppliedAmounts.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_APPLIEDAMOUNT_TABLE,strMemberDeductible));
	}
	public void AppliedAmounts_PlanDeductible(String strPlanDeductible) throws Throwable
	{
		actMemberCost_AppliedAmounts.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_APPLIEDAMOUNT_TABLE,strPlanDeductible));
	}
	public void AppliedAmounts_DeductibleExcluded(String strDeductibleExcluded) throws Throwable
	{
		actMemberCost_AppliedAmounts.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_APPLIEDAMOUNT_TABLE,strDeductibleExcluded));
	}
	public void AppliedAmounts_TROOP(String strTROOP) throws Throwable
	{
		actMemberCost_AppliedAmounts.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_APPLIEDAMOUNT_TABLE,strTROOP));
	}
	public void AppliedAmounts_NonTROOP(String strNonTROOP) throws Throwable
	{
		actMemberCost_AppliedAmounts.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_APPLIEDAMOUNT_TABLE,strNonTROOP));
	}
	public void AppliedAmounts_LICS(String strLICS) throws Throwable
	{
		actMemberCost_AppliedAmounts.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_APPLIEDAMOUNT_TABLE,strLICS));
	}
	public void AppliedAmounts_OtherTROOP(String strOtherTROOP) throws Throwable
	{
		actMemberCost_AppliedAmounts.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_APPLIEDAMOUNT_TABLE,strOtherTROOP));
	}
	public void AppliedAmounts_BenefitStageQualifier(String strBenefitStageQualifier) throws Throwable
	{
		actMemberCost_AppliedAmounts.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_APPLIEDAMOUNT_TABLE,strBenefitStageQualifier));
	}
	public void AppliedAmounts_BenefitStageAmount(String strBenefitStageAmount) throws Throwable
	{
		actMemberCost_AppliedAmounts.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_APPLIEDAMOUNT_TABLE,strBenefitStageAmount));
	}
	
	
	// Verify Coverage Member Cost Panel Balances Table
	
	public void Balances_SpendingAccountRemaining(String strSpendingAccountRemaining) throws Throwable
	{
		actMemberCost_Balances.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_BALANCES_TABLE,strSpendingAccountRemaining));
	}
	public void Balances_RemainingBenefit(String strRemainingBenefit) throws Throwable
	{
		actMemberCost_Balances.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_BALANCES_TABLE,strRemainingBenefit));
	}
	public void Balances_AccumulatedDeductible(String strAccumulatedDeductible) throws Throwable
	{
		actMemberCost_Balances.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_BALANCES_TABLE,strAccumulatedDeductible));
	}
	public void Balances_RemainingDeductible(String strRemainingDeductible) throws Throwable
	{
		actMemberCost_Balances.add(utils.RxNovaConnect_WebTable_VerifyRowDataWithThreeCols(MEMBERCOST_BALANCES_TABLE,strRemainingDeductible));
	}
    
	// act Coverage Verification Panel Details
	
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
		act_C_V_ErrorsTable_.add(utils.RxNovaConnect_WebTable_VerifyColumnData(COVERAGE_VERIFICATION_ERRORS_TABLE,strCode));
	}
	public void coverageVerification_Results_Errors_Action(String strAction) throws Throwable
	{
		act_C_V_ErrorsTable_.add(utils.RxNovaConnect_WebTable_VerifyColumnData(COVERAGE_VERIFICATION_ERRORS_TABLE,strAction));
	}
	public void coverageVerification_Results_Errors_ArgusErrorText(String strArgusErrorText) throws Throwable
	{
		act_C_V_ErrorsTable_.add(utils.RxNovaConnect_WebTable_VerifyColumnData(COVERAGE_VERIFICATION_ERRORS_TABLE,strArgusErrorText));
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
