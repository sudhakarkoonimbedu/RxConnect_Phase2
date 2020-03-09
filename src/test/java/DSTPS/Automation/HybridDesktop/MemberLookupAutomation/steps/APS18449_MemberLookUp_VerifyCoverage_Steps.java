package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.APS18449_MemberLookUp_VerifyCoverage_Selector;

public class APS18449_MemberLookUp_VerifyCoverage_Steps 
{
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private APS18449_MemberLookUp_VerifyCoverage_Selector verifycoverage_selector;
	
	public ArrayList<String> expCoverageVerification_Panel_Details = new ArrayList<String>();
	public SoftAssert CoverageVerificationPanel_Detailssoft = new SoftAssert();
	
	public ArrayList<String> exp_C_V_GeneralTable = new ArrayList<String>();
	public ArrayList<String> exp_C_V_ErrorsTable = new ArrayList<String>();
	public ArrayList<String> exp_C_V_TotalRxCostTable = new ArrayList<String>();
	public ArrayList<String> exp_C_V_PatientPayTable = new ArrayList<String>();
	public ArrayList<String> exp_C_V_AppliedAmountsTable = new ArrayList<String>();
	public ArrayList<String> exp_C_V_BalancesTable = new ArrayList<String>();
	
	public SoftAssert C_V_GeneralTable_soft = new SoftAssert();
	public SoftAssert C_V_ErrorsTable_soft = new SoftAssert();
	public SoftAssert C_V_TotalRxCostTable_soft = new SoftAssert();
	public SoftAssert C_V_PatientPayTable_soft = new SoftAssert();
	public SoftAssert C_V_AppliedAmountsTable_soft = new SoftAssert();
	public SoftAssert C_V_BalancesTable_soft = new SoftAssert();
	
	public APS18449_MemberLookUp_VerifyCoverage_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable
	{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		verifycoverage_selector = new APS18449_MemberLookUp_VerifyCoverage_Selector(SharedResource,utils);
	}
	public void click_on_FormularyLink() throws Throwable
	{
		verifycoverage_selector.select_a_call_category_FORMULARYLink_Selection();
	}
	public void drugResultsPageVerification() throws Throwable
	{
		verifycoverage_selector.waitUntillDrugResultsPage();
		verifycoverage_selector.verifyDrugResultsPage();
	}
	public void perform_Drug_Search(Map<String,String> Drugsearch) throws Throwable
	{
		String strNDCvalue = Drugsearch.get("search_Input_text");
		verifycoverage_selector.drugResults_setTextIntoSearchCriteriaInputEdit(strNDCvalue);
		verifycoverage_selector.drugResults_clickOnSearchButton();
	}
	public void perform_showingDrugsWithBrandGeneric() throws Throwable
	{
		verifycoverage_selector.showingDrugsWithBrandGeneric();
	}
	public void perform_NDC_Record_Search_Selection(Map<String,String> NDCrecordSearchAndSelection) throws Throwable
	{
		String strNDCValue = NDCrecordSearchAndSelection.get("requiredNDC");
		verifycoverage_selector.drugResults_performNDCsearch(strNDCValue);
		utils.GetBusyStatus();
		Thread.sleep(1000);
		verifycoverage_selector.drugResults_SelectFirstNDCRecord();
		utils.GetBusyStatus();
		Thread.sleep(1000);
	}
	public void click_on_verifyCoverage_Button() throws Throwable
	{
		verifycoverage_selector.DrugResults_clickOnVerifyCoverage_Button();
	}
	public void perform_VerifyCoverageVerification() throws Throwable
	{
		verifycoverage_selector.waitUntillVerifyCoveragePage();
		verifycoverage_selector.verify_VerifyCoverage_PageExistOrNot();
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
		utils.GetBusyStatus();
	}
	
	public void coverageverification_Click_On_VerifyCoverage_Button() throws Throwable 
	{
		verifycoverage_selector.coverageVerification_ClickOnVerifyCoverageButton();	
	}
	public void coverageverification_GeneralTableDisplay() throws Throwable
	{
		verifycoverage_selector.coverageverification_generalTableDisplay();
	}
	public void coverageVerification_GeneralTable_ResultsPanel(Map<String,String> cv_generalTable_ResultsPanel) throws Throwable
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
		
		String errorsCode1 = cv_errorstable_ResultsPanel.get("cv_errorsCode1");
		String errorsAction1 = cv_errorstable_ResultsPanel.get("cv_errorsAction1");
		String errorsArgusErrorText1 = cv_errorstable_ResultsPanel.get("cv_errorsArgusErrorText1");
		
		exp_C_V_ErrorsTable.add(errorsCode);
		exp_C_V_ErrorsTable.add(errorsAction);
		exp_C_V_ErrorsTable.add(errorsArgusErrorText);
		
		exp_C_V_ErrorsTable.add(errorsCode1);
		exp_C_V_ErrorsTable.add(errorsAction1);
		exp_C_V_ErrorsTable.add(errorsArgusErrorText1);
		
		verifycoverage_selector.coverageVerification_Results_Errors_Code(errorsCode);
		verifycoverage_selector.coverageVerification_Results_Errors_Action(errorsAction);
		verifycoverage_selector.coverageVerification_Results_Errors_ArgusErrorText(errorsArgusErrorText);
		
		verifycoverage_selector.coverageVerification_Results_Errors_Code1(errorsCode1);
		verifycoverage_selector.coverageVerification_Results_Errors_Action1(errorsAction1);
		verifycoverage_selector.coverageVerification_Results_Errors_ArgusErrorText1(errorsArgusErrorText1);
		
		for(int i=0;i<exp_C_V_ErrorsTable.size();i++)
		{
			C_V_ErrorsTable_soft.assertEquals(verifycoverage_selector.act_C_V_ErrorsTable.get(i), exp_C_V_ErrorsTable.get(i));			
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
}
