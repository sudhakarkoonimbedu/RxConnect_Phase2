package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.APS14487_MemberLookUp_VerifyCoverage_Selector;

public class APS14487_MemberLookup_VerifyCoverage_Steps 
{
	APS14487_MemberLookUp_VerifyCoverage_Selector verifycoverage_selector;
	
	private HybridDesktop_SharedResource SharedResource;
	@SuppressWarnings("unused")
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expMemberDetails = new ArrayList<String>();	
	public ArrayList<String> expHeaderSummary = new ArrayList<String>();
	public ArrayList<String> expClaim_Drug_Details = new ArrayList<String>();
	public ArrayList<String> expGeneralTable_ResultsPanel_Details = new ArrayList<String>();
	public ArrayList<String> expErrorsTable_ResultsPanel_Details = new ArrayList<String>();
	public ArrayList<String> expTotalRxCostTable_MemberCostPanel_Details = new ArrayList<String>();
	public ArrayList<String> expPatientPayTable_MemberCostPanel_Details = new ArrayList<String>();
	public ArrayList<String> expAppliedAmountsTable_MemberCostPanel_Details = new ArrayList<String>();
	public ArrayList<String> expBalancesTable_MemberCostsPanel_Details = new ArrayList<String>();
	public ArrayList<String> expCoverageVerification_Panel_Details = new ArrayList<String>();
	
	public ArrayList<String> exp_C_V_GeneralTable = new ArrayList<String>();
	public ArrayList<String> exp_C_V_ErrorsTable = new ArrayList<String>();
	public ArrayList<String> exp_C_V_TotalRxCostTable = new ArrayList<String>();
	public ArrayList<String> exp_C_V_PatientPayTable = new ArrayList<String>();
	public ArrayList<String> exp_C_V_AppliedAmountsTable = new ArrayList<String>();
	public ArrayList<String> exp_C_V_BalancesTable = new ArrayList<String>();
	
	public SoftAssert memberDetailsSoft = new SoftAssert();	
	public SoftAssert headerSummarySoft = new SoftAssert();
	public SoftAssert Claim_Drug_DetailsSoft = new SoftAssert();
	public SoftAssert GeneralTable_ResultsPanel_Detailssoft = new SoftAssert();
	public SoftAssert ErrorsTable_ResultsPanel_Detailssoft = new SoftAssert();
	public SoftAssert TotalRxCostTable_MemberCostsPanel_Detailssoft = new SoftAssert();
	public SoftAssert PatientPayTable_MemberCostsPanel_Detailssoft = new SoftAssert();
	public SoftAssert AppliedAmountsTable_MemberCostsPanel_Detailssoft = new SoftAssert();
	public SoftAssert BalancesTable_MemberCostsPanel_Detailssoft = new SoftAssert();
	public SoftAssert CoverageVerificationPanel_Detailssoft = new SoftAssert();
	
	public SoftAssert C_V_GeneralTable_soft = new SoftAssert();
	public SoftAssert C_V_ErrorsTable_soft = new SoftAssert();
	public SoftAssert C_V_TotalRxCostTable_soft = new SoftAssert();
	public SoftAssert C_V_PatientPayTable_soft = new SoftAssert();
	public SoftAssert C_V_AppliedAmountsTable_soft = new SoftAssert();
	public SoftAssert C_V_BalancesTable_soft = new SoftAssert();
	
	public APS14487_MemberLookup_VerifyCoverage_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable
	{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		verifycoverage_selector = new APS14487_MemberLookUp_VerifyCoverage_Selector(SharedResource,utils);
	}
	public void verifyMemberLookupDetail()
	{
		verifycoverage_selector.verifyMemberLookupDetail();
	}
	public void clickOnClaimLink() throws Throwable
	{
		verifycoverage_selector.select_a_call_category_claimLink_Selection();
		
	}
	public void verifyClaimHistory() throws Throwable
	{
		verifycoverage_selector.waitUntillClaimHistoryPage();
		verifycoverage_selector.verifyClaimHistoryPage();
		
	}
	public void claimhistory_ClickOnCliamBlueArrowLink(Map<String,String> ClaimSearchInut) throws Throwable
	{
		verifycoverage_selector.claim_claimhistory_ClickOnCliamBlueArrowLink(ClaimSearchInut);
	}
	public void verifyClaimDetails() throws Throwable
	{
		verifycoverage_selector.waitUntillClaimDetailsPage();
		verifycoverage_selector.verifyClaimDetailsPage();		
	}
	public void naigateToVerifyCoveragePage() throws Throwable
	{
		verifycoverage_selector.claimdetail_clickOnVerifyCoverage_Button();
		verifycoverage_selector.waitUntillDrugResultsPage();
		verifycoverage_selector.verifyDrugResultsPage();
		verifycoverage_selector.DrugResults_clickOnVerifyCoverage_Button();
		verifycoverage_selector.waitUntillVerifyCoveragePage();
		verifycoverage_selector.verify_VerifyCoverage_PageExistOrNot();
	}
	public void verify_VerifyCoverage_Page() throws Throwable
	{
		verifycoverage_selector.waitUntillVerifyCoveragePage();
		verifycoverage_selector.verify_VerifyCoverage_PageExistOrNot();
	}
	public void verifyClaim_Drug_Details(Map<String,String> claim_drug_details) throws Throwable
	{
		String strClaimText = claim_drug_details.get("claim_Text");
		String strDrugValue = claim_drug_details.get("drug_value");
		String strQuantity = claim_drug_details.get("quantity");
		String strDays_supply = claim_drug_details.get("days_supply");
		String strDAW = claim_drug_details.get("daw");
		String strFill_Date = claim_drug_details.get("fill_date");
		String strPrescriber_Qlfr_Id = claim_drug_details.get("prescriber_qlfr_id");
		String strPharmacy_Svc_Type = claim_drug_details.get("pharmacy_Svc_Type");
		String strPharmacy_Address1 = claim_drug_details.get("pharmacy_address1");
		String strPharmacy_Address2 = claim_drug_details.get("pharmacy_address2");
		String strPharmacy_Address3 = claim_drug_details.get("pharmacy_address3");
		
		expClaim_Drug_Details.add(strClaimText);
		expClaim_Drug_Details.add(strDrugValue);
		expClaim_Drug_Details.add(strQuantity);
		expClaim_Drug_Details.add(strDays_supply);
		expClaim_Drug_Details.add(strDAW);
		expClaim_Drug_Details.add(strFill_Date);
		expClaim_Drug_Details.add(strPrescriber_Qlfr_Id);
		expClaim_Drug_Details.add(strPharmacy_Svc_Type);
		expClaim_Drug_Details.add(strPharmacy_Address1);
		expClaim_Drug_Details.add(strPharmacy_Address2);
		expClaim_Drug_Details.add(strPharmacy_Address3);
		
		verifycoverage_selector.getClaimIdTitleValue();
		verifycoverage_selector.getDrugNameAndValue();
		verifycoverage_selector.getClaim_DrugDetails_Quantity(strQuantity);
		verifycoverage_selector.getClaim_DrugDetails_DaysSupply(strDays_supply);
		verifycoverage_selector.getClaim_DrugDetails_DAW(strDAW);
		verifycoverage_selector.getClaim_DrugDetails_FillDate(strFill_Date);
		verifycoverage_selector.getClaim_DrugDetails_PrescriberIDqualifier(strPrescriber_Qlfr_Id);
		verifycoverage_selector.getClaim_DrugDetails_PharmacyServiceType(strPharmacy_Svc_Type);
		verifycoverage_selector.getClaim_DrugDetails_PharmacyAddress_part1(strPharmacy_Address1);
		verifycoverage_selector.getPharmacyAddressPart2();
		verifycoverage_selector.getPharmacyAddressPart3();
		
		for(int i=0;i<expClaim_Drug_Details.size()-1;i++)
		{
			Claim_Drug_DetailsSoft.assertEquals(verifycoverage_selector.actClaimDrugDetails.get(i), expClaim_Drug_Details.get(i));			
		}		
		Claim_Drug_DetailsSoft.assertAll();		
	}
	public void verify_ValuesFor_GeneralTable_ResultsPanel_(Map<String,String> general_Table_Results_Panel) throws Throwable
	{
		String strclaimstatus = general_Table_Results_Panel.get("claimStatus");
		String strndc = general_Table_Results_Panel.get("ndc");
		String strlabelname = general_Table_Results_Panel.get("labelname");
		String strquantity = general_Table_Results_Panel.get("quantity");
		String strdayssupply = general_Table_Results_Panel.get("daysSupply");
		String strpharmacy = general_Table_Results_Panel.get("pharmacy");
		String strfilldate = general_Table_Results_Panel.get("filldate");
		String strtierlevel = general_Table_Results_Panel.get("tierLevel");
		String strformularyIndicator = general_Table_Results_Panel.get("formularyIndicator");
		
		expGeneralTable_ResultsPanel_Details.add(strclaimstatus);
		expGeneralTable_ResultsPanel_Details.add(strndc);
		expGeneralTable_ResultsPanel_Details.add(strlabelname);
		expGeneralTable_ResultsPanel_Details.add(strquantity);
		expGeneralTable_ResultsPanel_Details.add(strdayssupply);
		expGeneralTable_ResultsPanel_Details.add(strpharmacy);
		expGeneralTable_ResultsPanel_Details.add(strfilldate);
		expGeneralTable_ResultsPanel_Details.add(strtierlevel);
		expGeneralTable_ResultsPanel_Details.add(strformularyIndicator);
		
		verifycoverage_selector.getVerifyCoverage_Results_General_ClaimStatus(strclaimstatus);
		verifycoverage_selector.getVerifyCoverage_Results_General_NDC(strndc);
		verifycoverage_selector.getVerifyCoverage_Results_General_LabelName(strlabelname);
		verifycoverage_selector.getVerifyCoverage_Results_General_Quantity(strquantity);
		verifycoverage_selector.getVerifyCoverage_Results_General_Days_Supply(strdayssupply);
		verifycoverage_selector.getVerifyCoverage_Results_General_Pharmacy(strpharmacy);
		verifycoverage_selector.getVerifyCoverage_Results_General_FillDate(strfilldate);
		verifycoverage_selector.getVerifyCoverage_Results_General_TierLevel(strtierlevel);
		verifycoverage_selector.getVerifyCoverage_Results_General_Formulary_Indicator(strformularyIndicator);
		
		for(int i=0;i<expGeneralTable_ResultsPanel_Details.size()-1;i++)
		{
			GeneralTable_ResultsPanel_Detailssoft.assertEquals(verifycoverage_selector.actGeneralTable_ResultsPanel_Details.get(i), expGeneralTable_ResultsPanel_Details.get(i));			
		}		
		GeneralTable_ResultsPanel_Detailssoft.assertAll();		
	}
	public void verify_ValuesFor_ErrorsTable_ResultPanel(Map<String,String> errors_table_Results_Panel) throws Throwable
	{
		String errorsCode = errors_table_Results_Panel.get("errors_Code");
		String errorsAction = errors_table_Results_Panel.get("errors_Action");
		String errorsArgusErrorText = errors_table_Results_Panel.get("errors_Argus_Error_Text");
		
		expErrorsTable_ResultsPanel_Details.add(errorsCode);
		expErrorsTable_ResultsPanel_Details.add(errorsAction);
		expErrorsTable_ResultsPanel_Details.add(errorsArgusErrorText);
		
		verifycoverage_selector.getVerifyCoverage_Results_Errors_Code(errorsCode);
		verifycoverage_selector.getVerifyCoverage_Results_Errors_Action(errorsAction);
		verifycoverage_selector.getVerifyCoverage_Results_Errors_ArgusErrorText(errorsArgusErrorText);
		
		for(int i=0;i<expErrorsTable_ResultsPanel_Details.size()-1;i++)
		{
			ErrorsTable_ResultsPanel_Detailssoft.assertEquals(verifycoverage_selector.actErrorsTable_ResultsPanel_Details.get(i), expErrorsTable_ResultsPanel_Details.get(i));			
		}		
		ErrorsTable_ResultsPanel_Detailssoft.assertAll();	
	}
	public void verify_ValuesFor_TotalRxCostTable_MemberCostPanel(Map<String,String> totalrxCostTable) throws Throwable
	{
		String strTotalPatientPay = totalrxCostTable.get("totalpatientpay");
		String strTotalPlanPaid = totalrxCostTable.get("totalplanpaid");
		String strTotalOtherPayerPaid = totalrxCostTable.get("totalotherpayerpaid");
		String strTotalRxCost = totalrxCostTable.get("taotalrxcost");
		
		expTotalRxCostTable_MemberCostPanel_Details.add(strTotalPatientPay);
		expTotalRxCostTable_MemberCostPanel_Details.add(strTotalPlanPaid);
		expTotalRxCostTable_MemberCostPanel_Details.add(strTotalOtherPayerPaid);
		expTotalRxCostTable_MemberCostPanel_Details.add(strTotalRxCost);
		
		verifycoverage_selector.membercost_TotalRxCost_TotalPatientPay(strTotalPatientPay);
		verifycoverage_selector.membercost_TotalRxCost_TotalPlanPaid(strTotalPlanPaid);
		verifycoverage_selector.membercost_TotalRxCost_TotalOtherPayerPaid(strTotalOtherPayerPaid);
		verifycoverage_selector.membercost_TotalRxCost_TotalRxCost(strTotalRxCost);
		
		for(int i=0;i<expTotalRxCostTable_MemberCostPanel_Details.size()-1;i++)
		{
			TotalRxCostTable_MemberCostsPanel_Detailssoft.assertEquals(verifycoverage_selector.actMemberCost_TotalRxCost.get(i), expTotalRxCostTable_MemberCostPanel_Details.get(i));			
		}		
		TotalRxCostTable_MemberCostsPanel_Detailssoft.assertAll();	
	}
	public void verify_ValueFor_PatientPayTable_MemberCostPanel(Map<String,String> PatientPayTable) throws Throwable
	{
		String BaseCopayAmount = PatientPayTable.get("Base_copay_amount");
		String BaseCoinsuranceAmount = PatientPayTable.get("Base_coinsurance_amount");
		String AmountAppliedToPeriodicDeductible = PatientPayTable.get("Amount_applied_to_periodic_deductible");
		String AmountExceededProcessedBenefitMax = PatientPayTable.get("Amount_exceeded_processed_benefit_max");
		String AmountAttributedToProcessorFee = PatientPayTable.get("Amount_attributed_to_processor_fee");
		String AmountAttributedToSalesTax = PatientPayTable.get("Amount_attributed_to_sales_tax");
		String AmountAttributedToCoverageGap = PatientPayTable.get("Amount_attributed_to_coverage_gap");
		String HealthPlanFundedAmount = PatientPayTable.get("Health_plan_funded_amount");
		String MemberPaidDifference = PatientPayTable.get("Member_paid_difference");
		String AttributedToNetworkSelection = PatientPayTable.get("Attributed_to_network_selection");
		String AttributedToBrandDrug = PatientPayTable.get("Attributed_to_brand_drug");
		String AttributedToNonPreferredFormulary = PatientPayTable.get("Attributed_to_non_preferred_formulary");
		String AttributedToNonPreferredFormularyBrand = PatientPayTable.get("Attributed_to_non_preferred_formulary_brand");
		String TotalPatientPay = PatientPayTable.get("Total_patient_pay");
		String HRAAmount = PatientPayTable.get("HRA_amount");
		String FSAAmount = PatientPayTable.get("FSA_amount");
		String HSAAmount = PatientPayTable.get("HSA_amount");
		String ADJAmount = PatientPayTable.get("ADJ_amount");
		String SPAPAmount = PatientPayTable.get("SPAP_amount");
		String TotalMemberPaidToPharmacy = PatientPayTable.get("Total_member_paid_to_pharmacy");
		
		expPatientPayTable_MemberCostPanel_Details.add(BaseCopayAmount);
		expPatientPayTable_MemberCostPanel_Details.add(BaseCoinsuranceAmount);
		expPatientPayTable_MemberCostPanel_Details.add(AmountAppliedToPeriodicDeductible);
		expPatientPayTable_MemberCostPanel_Details.add(AmountExceededProcessedBenefitMax);
		expPatientPayTable_MemberCostPanel_Details.add(AmountAttributedToProcessorFee);
		expPatientPayTable_MemberCostPanel_Details.add(AmountAttributedToSalesTax);
		expPatientPayTable_MemberCostPanel_Details.add(AmountAttributedToCoverageGap);
		expPatientPayTable_MemberCostPanel_Details.add(HealthPlanFundedAmount);
		expPatientPayTable_MemberCostPanel_Details.add(MemberPaidDifference);
		expPatientPayTable_MemberCostPanel_Details.add(AttributedToNetworkSelection);
		expPatientPayTable_MemberCostPanel_Details.add(AttributedToBrandDrug);
		expPatientPayTable_MemberCostPanel_Details.add(AttributedToNonPreferredFormulary);
		expPatientPayTable_MemberCostPanel_Details.add(AttributedToNonPreferredFormularyBrand);
		expPatientPayTable_MemberCostPanel_Details.add(TotalPatientPay);
		expPatientPayTable_MemberCostPanel_Details.add(HRAAmount);
		expPatientPayTable_MemberCostPanel_Details.add(FSAAmount);
		expPatientPayTable_MemberCostPanel_Details.add(HSAAmount);
		expPatientPayTable_MemberCostPanel_Details.add(ADJAmount);
		expPatientPayTable_MemberCostPanel_Details.add(SPAPAmount);
		expPatientPayTable_MemberCostPanel_Details.add(TotalMemberPaidToPharmacy);
		
		verifycoverage_selector.patientpay_BaseCopayAmount(BaseCopayAmount);
		verifycoverage_selector.patientpay_BaseCoinsuranceAmount(BaseCoinsuranceAmount);
		verifycoverage_selector.patientpay_AmountAppliedToPeriodicDeductible(AmountAppliedToPeriodicDeductible);
		verifycoverage_selector.patientpay_AmountExceededProcessedBenefitMax(AmountExceededProcessedBenefitMax);
		verifycoverage_selector.patientpay_AmountAttributedToProcessorFee(AmountAttributedToProcessorFee);
		verifycoverage_selector.patientpay_AmountAttributedToSalesTax(AmountAttributedToSalesTax);
		verifycoverage_selector.patientpay_AmountAttributedToCoverageGap(AmountAttributedToCoverageGap);
		verifycoverage_selector.patientpay_HealthPlanFundedAmount(HealthPlanFundedAmount);
		verifycoverage_selector.patientpay_MemberPaidDifference(MemberPaidDifference);
		verifycoverage_selector.patientpay_AttributedToNetworkSelection(AttributedToNetworkSelection);
		verifycoverage_selector.patientpay_AttributedToBrandDrug(AttributedToBrandDrug);
		verifycoverage_selector.patientpay_AttributedToNonPreferredFormulary(AttributedToNonPreferredFormulary);
		verifycoverage_selector.patientpay_AttributedToNonPreferredFormularyBrand(AttributedToNonPreferredFormularyBrand);
		verifycoverage_selector.patientpay_TotalPatientPay(TotalPatientPay);
		verifycoverage_selector.patientpay_HRAAmount(HRAAmount);
		verifycoverage_selector.patientpay_FSAAmount(FSAAmount);
		verifycoverage_selector.patientpay_HSAAmount(HSAAmount);
		verifycoverage_selector.patientpay_ADJAmount(ADJAmount);
		verifycoverage_selector.patientpay_SPAPAmount(SPAPAmount);
		verifycoverage_selector.patientpay_TotalMemberPaidToPharmacy(TotalMemberPaidToPharmacy);
		
		for(int i=0;i<expPatientPayTable_MemberCostPanel_Details.size()-1;i++)
		{
			PatientPayTable_MemberCostsPanel_Detailssoft.assertEquals(verifycoverage_selector.actMemberCost_PatientPay.get(i), expPatientPayTable_MemberCostPanel_Details.get(i));			
		}		
		PatientPayTable_MemberCostsPanel_Detailssoft.assertAll();
	}
	public void verify_ValueFor_AppliedAmountsTable_MemberCostPanel(Map<String,String> AppliedAmountsTable) throws Throwable
	{
		String MemberDeductible = AppliedAmountsTable.get("member_deductible");
		String PlanDeductible = AppliedAmountsTable.get("plan_deductible");	
		String DeductibleExcluded = AppliedAmountsTable.get("deductible_excluded");	
		String TROOP = AppliedAmountsTable.get("TROOP");	
		String NonTROOP = AppliedAmountsTable.get("Non_TROOP");	
		String LICS = AppliedAmountsTable.get("LICS");	
		String OtherTROOP = AppliedAmountsTable.get("Other_TROOP");	
		String BenefitStageQualifier = AppliedAmountsTable.get("Benefit_stage_qualifier");	
		String BenefitStageAmount = AppliedAmountsTable.get("Benefit_stage_amount");
		
		expAppliedAmountsTable_MemberCostPanel_Details.add(MemberDeductible);
		expAppliedAmountsTable_MemberCostPanel_Details.add(PlanDeductible);
		expAppliedAmountsTable_MemberCostPanel_Details.add(DeductibleExcluded);		
		expAppliedAmountsTable_MemberCostPanel_Details.add(TROOP);
		expAppliedAmountsTable_MemberCostPanel_Details.add(NonTROOP);
		expAppliedAmountsTable_MemberCostPanel_Details.add(LICS);		
		expAppliedAmountsTable_MemberCostPanel_Details.add(OtherTROOP);
		expAppliedAmountsTable_MemberCostPanel_Details.add(BenefitStageQualifier);
		expAppliedAmountsTable_MemberCostPanel_Details.add(BenefitStageAmount);
		
		verifycoverage_selector.AppliedAmounts_MemberDeductible(MemberDeductible);
		verifycoverage_selector.AppliedAmounts_PlanDeductible(PlanDeductible);
		verifycoverage_selector.AppliedAmounts_DeductibleExcluded(DeductibleExcluded);
		verifycoverage_selector.AppliedAmounts_TROOP(TROOP);
		verifycoverage_selector.AppliedAmounts_NonTROOP(NonTROOP);
		verifycoverage_selector.AppliedAmounts_LICS(LICS);
		verifycoverage_selector.AppliedAmounts_OtherTROOP(OtherTROOP);
		verifycoverage_selector.AppliedAmounts_BenefitStageQualifier(BenefitStageQualifier);
		verifycoverage_selector.AppliedAmounts_BenefitStageAmount(BenefitStageAmount);
		
		for(int i=0;i<expAppliedAmountsTable_MemberCostPanel_Details.size()-1;i++)
		{
			AppliedAmountsTable_MemberCostsPanel_Detailssoft.assertEquals(verifycoverage_selector.actMemberCost_AppliedAmounts.get(i), expAppliedAmountsTable_MemberCostPanel_Details.get(i));			
		}		
		AppliedAmountsTable_MemberCostsPanel_Detailssoft.assertAll();		
	}
	public void verify_ValueFor_BalancesTable_MemberCostPanel(Map<String,String> BalancesTable) throws Throwable
	{
		String SpendingAccountRemaining = BalancesTable.get("Spending_account_remaining");
		String RemainingBenefit = BalancesTable.get("Remaining_benefit");
		String AccumulatedDeductible = BalancesTable.get("Accumulated_deductible");
		String RemainingDeductible = BalancesTable.get("Remaining_deductible");
		
		expBalancesTable_MemberCostsPanel_Details.add(SpendingAccountRemaining);
		expBalancesTable_MemberCostsPanel_Details.add(RemainingBenefit);
		expBalancesTable_MemberCostsPanel_Details.add(AccumulatedDeductible);
		expBalancesTable_MemberCostsPanel_Details.add(RemainingDeductible);
		
		verifycoverage_selector.Balances_SpendingAccountRemaining(SpendingAccountRemaining);
		verifycoverage_selector.Balances_RemainingBenefit(RemainingBenefit);
		verifycoverage_selector.Balances_AccumulatedDeductible(AccumulatedDeductible);
		verifycoverage_selector.Balances_RemainingDeductible(RemainingDeductible);
		
		for(int i=0;i<expBalancesTable_MemberCostsPanel_Details.size()-1;i++)
		{
			BalancesTable_MemberCostsPanel_Detailssoft.assertEquals(verifycoverage_selector.actMemberCost_Balances.get(i), expBalancesTable_MemberCostsPanel_Details.get(i));			
		}		
		BalancesTable_MemberCostsPanel_Detailssoft.assertAll();
	}
	public void verify_ValuesFor_CoverageVerification_DefaultPanel(Map<String,String> cv_PanelValues) throws Throwable
	{
		String strcvPanelTitle = cv_PanelValues.get("coverageverificationTitle");
		String strcvDrugName = cv_PanelValues.get("coverageverifiation_drugname");
		String strcvPrescriberqlfrid1 = cv_PanelValues.get("prescriberqlfrid_Part1");
		String strcvPrescriberqlfrid2 = cv_PanelValues.get("prescriberqlfrid_Part2");
		String strcvPharmacySvcType = cv_PanelValues.get("pharmacySvcType");
		String strcvPharmacyAddressPart1 = cv_PanelValues.get("pharmacy_address_part1");
		String strcvPharmacyAddressPart2 = cv_PanelValues.get("pharmacy_address_part2");
		String strcvPharmacyAddressPart3 = cv_PanelValues.get("pharmacy_address_part3");
		
		expCoverageVerification_Panel_Details.add(strcvPanelTitle);
		expCoverageVerification_Panel_Details.add(strcvDrugName);
		expCoverageVerification_Panel_Details.add(strcvPrescriberqlfrid1);
		expCoverageVerification_Panel_Details.add(strcvPrescriberqlfrid2);
		expCoverageVerification_Panel_Details.add(strcvPharmacySvcType);
		expCoverageVerification_Panel_Details.add(strcvPharmacyAddressPart1);
		expCoverageVerification_Panel_Details.add(strcvPharmacyAddressPart2);
		expCoverageVerification_Panel_Details.add(strcvPharmacyAddressPart3);
		
		verifycoverage_selector.getTitle_For_CoverageVerification();
		verifycoverage_selector.getDrugName_Under_CoverageVerification();
		verifycoverage_selector.getTextFormPrescriberQualifier_Part1();
		verifycoverage_selector.getTextFormPrescriberQualifier_Part2();
		verifycoverage_selector.getValueFrom_PharmacySVCTypeList();
		verifycoverage_selector.verify_coverageVerification_Pharmacy_Address_part1(strcvPharmacyAddressPart1);
		verifycoverage_selector.getCoverageVerification_PharmacyAddressPart2();
		verifycoverage_selector.getCoverageVerification_PharmacyAddressPart3();
		
		for(int i=0;i<expCoverageVerification_Panel_Details.size()-1;i++)
		{
			CoverageVerificationPanel_Detailssoft.assertEquals(verifycoverage_selector.actCoverageVerificationPanelDetails.get(i), expCoverageVerification_Panel_Details.get(i));			
		}		
		CoverageVerificationPanel_Detailssoft.assertAll();				
	}
	public void coverageVerification_SearchInputs(Map<String,String> cv_SearchInputs) throws Throwable
	{
		String cvQuantity = cv_SearchInputs.get("cv_quantity");
		String cvDayaSupply = cv_SearchInputs.get("cv_daysSupplay");
		String cvDaw = cv_SearchInputs.get("cv_daw");
		String cvFillDate = cv_SearchInputs.get("cv_filldate");
		
		verifycoverage_selector.setTextIntoQuantity_TextBox(cvQuantity);
		verifycoverage_selector.setTextIntoDaysSupply_TextBox(cvDayaSupply);
		verifycoverage_selector.selectAnOptionFromDAWlist(cvDaw);
		verifycoverage_selector.setTextInEditFillDate_TextBox(cvFillDate);
			
	}
	public void coverageverification_Click_On_VerifyCoverage_Button() throws Throwable 
	{
		verifycoverage_selector.coverageVerification_ClickOnVerifyCoverageButton();	
	}
	public void coverageverification_GeneralTableDisplay() throws Throwable
	{
		verifycoverage_selector.coverageverification_generalTableDisplay();
	}
	
	// Under coverage Verification

	public void coverageVerification_GeneralTable_ResultsPanel_(Map<String,String> cv_generalTable_ResultsPanel) throws Throwable
	{
		String strclaimstatus = cv_generalTable_ResultsPanel.get("cv_claimStatus");
		String strndc = cv_generalTable_ResultsPanel.get("cv_ndc");
		String strlabelname = cv_generalTable_ResultsPanel.get("cv_labelname");
		String strquantity = cv_generalTable_ResultsPanel.get("cv_quantity");
		String strdayssupply = cv_generalTable_ResultsPanel.get("cv_daysSupply");
		String strpharmacy = cv_generalTable_ResultsPanel.get("cv_pharmacy");
		String strfilldate = cv_generalTable_ResultsPanel.get("cv_filldate");
		String strtierlevel = cv_generalTable_ResultsPanel.get("cv_tierLevel");
		String strformularyIndicator = cv_generalTable_ResultsPanel.get("cv_formularyIndicator");
		
		exp_C_V_GeneralTable.add(strclaimstatus);
		exp_C_V_GeneralTable.add(strndc);
		exp_C_V_GeneralTable.add(strlabelname);
		exp_C_V_GeneralTable.add(strquantity);
		exp_C_V_GeneralTable.add(strdayssupply);
		exp_C_V_GeneralTable.add(strpharmacy);
		exp_C_V_GeneralTable.add(strfilldate);
		exp_C_V_GeneralTable.add(strtierlevel);
		exp_C_V_GeneralTable.add(strformularyIndicator);
		
		verifycoverage_selector.coverageVerification_Results_General_ClaimStatus(strclaimstatus);
		verifycoverage_selector.coverageVerification_Results_General_NDC(strndc);
		verifycoverage_selector.coverageVerification_Results_General_LabelName(strlabelname);
		verifycoverage_selector.coverageVerification_Results_General_Quantity(strquantity);
		verifycoverage_selector.coverageVerification_Results_General_Days_Supply(strdayssupply);
		verifycoverage_selector.coverageVerification_Results_General_Pharmacy(strpharmacy);
		verifycoverage_selector.coverageVerification_Results_General_FillDate(strfilldate);
		verifycoverage_selector.coverageVerification_Results_General_TierLevel(strtierlevel);
		verifycoverage_selector.coverageVerification_Results_General_Formulary_Indicator(strformularyIndicator);
		
		for(int i=0;i<exp_C_V_GeneralTable.size()-1;i++)
		{
			C_V_GeneralTable_soft.assertEquals(verifycoverage_selector.act_C_V_GeneralTable.get(i), exp_C_V_GeneralTable.get(i));			
		}		
		C_V_GeneralTable_soft.assertAll();		
	}
    public void coverageVerification_ErrorsTable_ResultPanel(Map<String,String> cv_errorstable_ResultsPanel) throws Throwable
	{
		String errorsCode = cv_errorstable_ResultsPanel.get("cv_errorsCode");
		String errorsAction = cv_errorstable_ResultsPanel.get("cv_errorsAction");
		String errorsArgusErrorText = cv_errorstable_ResultsPanel.get("cv_errorsArgusErrorText");
		
		exp_C_V_ErrorsTable.add(errorsCode);
		exp_C_V_ErrorsTable.add(errorsAction);
		exp_C_V_ErrorsTable.add(errorsArgusErrorText);
		
		verifycoverage_selector.coverageVerification_Results_Errors_Code(errorsCode);
		verifycoverage_selector.coverageVerification_Results_Errors_Action(errorsAction);
		verifycoverage_selector.coverageVerification_Results_Errors_ArgusErrorText(errorsArgusErrorText);
		
		for(int i=0;i<exp_C_V_ErrorsTable.size()-1;i++)
		{
			C_V_ErrorsTable_soft.assertEquals(verifycoverage_selector.act_C_V_ErrorsTable_.get(i), exp_C_V_ErrorsTable.get(i));			
		}		
		C_V_ErrorsTable_soft.assertAll();	
	}
	public void coverageVerification_TotalRxCostTable_MemberCostPanel(Map<String,String> cv_totalrxCostTable) throws Throwable
	{
		String strTotalPatientPay = cv_totalrxCostTable.get("cv_totalpatientpay");
		String strTotalPlanPaid = cv_totalrxCostTable.get("cv_totalplanpaid");
		String strTotalOtherPayerPaid = cv_totalrxCostTable.get("cv_totalotherpayerpaid");
		String strTotalRxCost = cv_totalrxCostTable.get("cv_taotalrxcost");
		
		exp_C_V_TotalRxCostTable.add(strTotalPatientPay);
		exp_C_V_TotalRxCostTable.add(strTotalPlanPaid);
		exp_C_V_TotalRxCostTable.add(strTotalOtherPayerPaid);
		exp_C_V_TotalRxCostTable.add(strTotalRxCost);
		
		verifycoverage_selector.coverageVerification_membercost_TotalRxCost_TotalPatientPay(strTotalPatientPay);
		verifycoverage_selector.coverageVerification_membercost_TotalRxCost_TotalPlanPaid(strTotalPlanPaid);
		verifycoverage_selector.coverageVerification_membercost_TotalRxCost_TotalOtherPayerPaid(strTotalOtherPayerPaid);
		verifycoverage_selector.coverageVerification_membercost_TotalRxCost_TotalRxCost(strTotalRxCost);
		
		for(int i=0;i<exp_C_V_TotalRxCostTable.size()-1;i++)
		{
			C_V_TotalRxCostTable_soft.assertEquals(verifycoverage_selector.act_C_V_TotalRxCostTable.get(i), exp_C_V_TotalRxCostTable.get(i));			
		}		
		C_V_TotalRxCostTable_soft.assertAll();	
	}
	public void coverageVerification_PatientPayTable_MemberCostPanel(Map<String,String> cv_PatientPayTable) throws Throwable
	{
		String BaseCopayAmount = cv_PatientPayTable.get("cv_BaseCopayAmount");
		String BaseCoinsuranceAmount = cv_PatientPayTable.get("cv_BaseCoinsuranceAmount");
		String AmountAppliedToPeriodicDeductible = cv_PatientPayTable.get("cv_AmountAppliedToPeriodicDeductible");
		String AmountExceededProcessedBenefitMax = cv_PatientPayTable.get("cv_AmountExceededProcessedBenefitMax");
		String AmountAttributedToProcessorFee = cv_PatientPayTable.get("cv_AmountAttributedToProcessorFee");
		String AmountAttributedToSalesTax = cv_PatientPayTable.get("cv_AmountAttributedToSalesTax");
		String AmountAttributedToCoverageGap = cv_PatientPayTable.get("cv_AmountAttributedToCoverageGap");
		String HealthPlanFundedAmount = cv_PatientPayTable.get("cv_HealthPlanFundedAmount");
		String MemberPaidDifference = cv_PatientPayTable.get("cv_MemberPaidDifference");
		String AttributedToNetworkSelection = cv_PatientPayTable.get("cv_AttributedToNetworkSelection");
		String AttributedToBrandDrug = cv_PatientPayTable.get("cv_AttributedToBrandDrug");
		String AttributedToNonPreferredFormulary = cv_PatientPayTable.get("cv_AttributedToNonPreferredFormulary");
		String AttributedToNonPreferredFormularyBrand = cv_PatientPayTable.get("cv_AttributedToNonPreferredFormularyBrand");
		String TotalPatientPay = cv_PatientPayTable.get("cv_TotalPatientPay");
		String HRAAmount = cv_PatientPayTable.get("cv_HRAAmount");
		String FSAAmount = cv_PatientPayTable.get("cv_FSAAmount");
		String HSAAmount = cv_PatientPayTable.get("cv_HSAAmount");
		String ADJAmount = cv_PatientPayTable.get("cv_ADJAamount");
		String SPAPAmount = cv_PatientPayTable.get("cv_SPAPAmount");
		String TotalMemberPaidToPharmacy = cv_PatientPayTable.get("cv_TotalMemberPaidToPharmacy");
		
		exp_C_V_PatientPayTable.add(BaseCopayAmount);
		exp_C_V_PatientPayTable.add(BaseCoinsuranceAmount);
		exp_C_V_PatientPayTable.add(AmountAppliedToPeriodicDeductible);
		exp_C_V_PatientPayTable.add(AmountExceededProcessedBenefitMax);
		exp_C_V_PatientPayTable.add(AmountAttributedToProcessorFee);
		exp_C_V_PatientPayTable.add(AmountAttributedToSalesTax);
		exp_C_V_PatientPayTable.add(AmountAttributedToCoverageGap);
		exp_C_V_PatientPayTable.add(HealthPlanFundedAmount);
		exp_C_V_PatientPayTable.add(MemberPaidDifference);
		exp_C_V_PatientPayTable.add(AttributedToNetworkSelection);
		exp_C_V_PatientPayTable.add(AttributedToBrandDrug);
		exp_C_V_PatientPayTable.add(AttributedToNonPreferredFormulary);
		exp_C_V_PatientPayTable.add(AttributedToNonPreferredFormularyBrand);
		exp_C_V_PatientPayTable.add(TotalPatientPay);
		exp_C_V_PatientPayTable.add(HRAAmount);
		exp_C_V_PatientPayTable.add(FSAAmount);
		exp_C_V_PatientPayTable.add(HSAAmount);
		exp_C_V_PatientPayTable.add(ADJAmount);
		exp_C_V_PatientPayTable.add(SPAPAmount);
		exp_C_V_PatientPayTable.add(TotalMemberPaidToPharmacy);
		
		verifycoverage_selector.coverageVerification_patientpay_BaseCopayAmount(BaseCopayAmount);
		verifycoverage_selector.coverageVerification_patientpay_BaseCoinsuranceAmount(BaseCoinsuranceAmount);
		verifycoverage_selector.coverageVerification_patientpay_AmountAppliedToPeriodicDeductible(AmountAppliedToPeriodicDeductible);
		verifycoverage_selector.coverageVerification_patientpay_AmountExceededProcessedBenefitMax(AmountExceededProcessedBenefitMax);
		verifycoverage_selector.coverageVerification_patientpay_AmountAttributedToProcessorFee(AmountAttributedToProcessorFee);
		verifycoverage_selector.coverageVerification_patientpay_AmountAttributedToSalesTax(AmountAttributedToSalesTax);
		verifycoverage_selector.coverageVerification_patientpay_AmountAttributedToCoverageGap(AmountAttributedToCoverageGap);
		verifycoverage_selector.coverageVerification_patientpay_HealthPlanFundedAmount(HealthPlanFundedAmount);
		verifycoverage_selector.coverageVerification_patientpay_MemberPaidDifference(MemberPaidDifference);
		verifycoverage_selector.coverageVerification_patientpay_AttributedToNetworkSelection(AttributedToNetworkSelection);
		verifycoverage_selector.coverageVerification_patientpay_AttributedToBrandDrug(AttributedToBrandDrug);
		verifycoverage_selector.coverageVerification_patientpay_AttributedToNonPreferredFormulary(AttributedToNonPreferredFormulary);
		verifycoverage_selector.coverageVerification_patientpay_AttributedToNonPreferredFormularyBrand(AttributedToNonPreferredFormularyBrand);
		verifycoverage_selector.coverageVerification_patientpay_TotalPatientPay(TotalPatientPay);
		verifycoverage_selector.coverageVerification_patientpay_HRAAmount(HRAAmount);
		verifycoverage_selector.coverageVerification_patientpay_FSAAmount(FSAAmount);
		verifycoverage_selector.coverageVerification_patientpay_HSAAmount(HSAAmount);
		verifycoverage_selector.coverageVerification_patientpay_ADJAmount(ADJAmount);
		verifycoverage_selector.coverageVerification_patientpay_SPAPAmount(SPAPAmount);
		verifycoverage_selector.coverageVerification_patientpay_TotalMemberPaidToPharmacy(TotalMemberPaidToPharmacy);
		
		for(int i=0;i<exp_C_V_PatientPayTable.size()-1;i++)
		{
			C_V_PatientPayTable_soft.assertEquals(verifycoverage_selector.act_C_V_PatientPayTable.get(i), exp_C_V_PatientPayTable.get(i));			
		}		
		C_V_PatientPayTable_soft.assertAll();
	}	
	public void coverageVerification_AppliedAmountsTable_MemberCostPanel(Map<String,String> cv_AppliedAmountsTable) throws Throwable
	{
		String MemberDeductible = cv_AppliedAmountsTable.get("cv_memberDeductible");
		String PlanDeductible = cv_AppliedAmountsTable.get("cv_planDeductible");	
		String DeductibleExcluded = cv_AppliedAmountsTable.get("cv_deductibleExcluded");	
		String TROOP = cv_AppliedAmountsTable.get("cv_TROOP");	
		String NonTROOP = cv_AppliedAmountsTable.get("cv_NonTROOP");	
		String LICS = cv_AppliedAmountsTable.get("cv_LICS");	
		String OtherTROOP = cv_AppliedAmountsTable.get("cv_OtherTROOP");	
		String BenefitStageQualifier = cv_AppliedAmountsTable.get("cv_BenefitStageQualifier");	
		String BenefitStageAmount = cv_AppliedAmountsTable.get("cv_BenefitStageAmount");
		
		exp_C_V_AppliedAmountsTable.add(MemberDeductible);
		exp_C_V_AppliedAmountsTable.add(PlanDeductible);
		exp_C_V_AppliedAmountsTable.add(DeductibleExcluded);		
		exp_C_V_AppliedAmountsTable.add(TROOP);
		exp_C_V_AppliedAmountsTable.add(NonTROOP);
		exp_C_V_AppliedAmountsTable.add(LICS);		
		exp_C_V_AppliedAmountsTable.add(OtherTROOP);
		exp_C_V_AppliedAmountsTable.add(BenefitStageQualifier);
		exp_C_V_AppliedAmountsTable.add(BenefitStageAmount);
		
		verifycoverage_selector.coverageVerification_AppliedAmounts_MemberDeductible(MemberDeductible);
		verifycoverage_selector.coverageVerification_AppliedAmounts_PlanDeductible(PlanDeductible);
		verifycoverage_selector.coverageVerification_AppliedAmounts_DeductibleExcluded(DeductibleExcluded);
		verifycoverage_selector.coverageVerification_AppliedAmounts_TROOP(TROOP);
		verifycoverage_selector.coverageVerification_AppliedAmounts_NonTROOP(NonTROOP);
		verifycoverage_selector.coverageVerification_AppliedAmounts_LICS(LICS);
		verifycoverage_selector.coverageVerification_AppliedAmounts_OtherTROOP(OtherTROOP);
		verifycoverage_selector.coverageVerification_AppliedAmounts_BenefitStageQualifier(BenefitStageQualifier);
		verifycoverage_selector.coverageVerification_AppliedAmounts_BenefitStageAmount(BenefitStageAmount);
		
		for(int i=0;i<exp_C_V_AppliedAmountsTable.size()-1;i++)
		{
			C_V_AppliedAmountsTable_soft.assertEquals(verifycoverage_selector.act_C_V_AppliedAmountsTable.get(i), exp_C_V_AppliedAmountsTable.get(i));			
		}		
		C_V_AppliedAmountsTable_soft.assertAll();		
	}
	public void coverageVerification_BalancesTable_MemberCostPanel(Map<String,String> cv_BalancesTable) throws Throwable
	{
		String SpendingAccountRemaining = cv_BalancesTable.get("CV_SpendingAccountRemaining");
		String RemainingBenefit = cv_BalancesTable.get("CV_RemainingBenefit");
		String AccumulatedDeductible = cv_BalancesTable.get("CV_AccumulatedDeductible");
		String RemainingDeductible = cv_BalancesTable.get("CV_RemainingDeductible");
		
		exp_C_V_BalancesTable.add(SpendingAccountRemaining);
		exp_C_V_BalancesTable.add(RemainingBenefit);
		exp_C_V_BalancesTable.add(AccumulatedDeductible);
		exp_C_V_BalancesTable.add(RemainingDeductible);
		
		verifycoverage_selector.coverageVerification_Balances_SpendingAccountRemaining(SpendingAccountRemaining);
		verifycoverage_selector.coverageVerification_Balances_RemainingBenefit(RemainingBenefit);
		verifycoverage_selector.coverageVerification_Balances_AccumulatedDeductible(AccumulatedDeductible);
		verifycoverage_selector.coverageVerification_Balances_RemainingDeductible(RemainingDeductible);
		
		for(int i=0;i<exp_C_V_BalancesTable.size()-1;i++)
		{
			C_V_BalancesTable_soft.assertEquals(verifycoverage_selector.act_C_V_BalancesTable.get(i), exp_C_V_BalancesTable.get(i));			
		}		
		C_V_BalancesTable_soft.assertAll();
	}
	
	// End Of Class	
}
