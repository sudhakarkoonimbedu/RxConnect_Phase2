package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.MemberLookup_Claim_PricingSelector;

public class MemberLookup_Claim_Pricing_Steps {

	MemberLookup_Claim_PricingSelector memberLookup_Claim_PricingSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expPricing = new ArrayList<String>();
	public SoftAssert pricingSoft = new SoftAssert();
	
	
	public MemberLookup_Claim_Pricing_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		memberLookup_Claim_PricingSelector = new MemberLookup_Claim_PricingSelector(SharedResource,utils);
	}
	
	public void clickOnPricing() throws Throwable{
		memberLookup_Claim_PricingSelector.MemberLookup_Claim_clickOnPricing();
		memberLookup_Claim_PricingSelector.waitUnitillPricingDetails();
	}
	
	public void verifyPricing(Map<String,String> princing)throws Throwable {
		String strBaseCopayAmt = princing.get("BaseCopayAmt");
		String strBaseCoinsAmt = princing.get("BaseCoinsAmt");
		String strAmtAppliedToPeriodicDed = princing.get("AmtAppliedToPeriodicDed");
		String strAmtExceededProcBenefitMax = princing.get("AmtExceededProcBenefitMax");
		String strAmtAttributedToProcssorFee = princing.get("AmtAttributedToProcssorFee");
		String strAmtAttributedToSalesTax = princing.get("AmtAttributedToSalesTax");
		String strAmtAttributedToCoverageGap = princing.get("AmtAttributedToCoverageGap");
		String strHealthPlanFundedAmt = princing.get("HealthPlanFundedAmt");
		String strMemberPaidDifference = princing.get("MemberPaidDifference");
		String strAttrToNetSelection = princing.get("AttrToNetSelection");
		String strAttrToBrandDrug = princing.get("AttrToBrandDrug");
		String strAttrToNonPrefFormulary = princing.get("AttrToNonPrefFormulary");
		String strAttrToNonPrefFormularyBrand = princing.get("AttrToNonPrefFormularyBrand");
		String strTotalPatientPay = princing.get("TotalPatientPay");
		String strHRAAmount = princing.get("HRAAmount");
		String strFSAAmount = princing.get("FSAAmount");
		String strHSAAmount = princing.get("HSAAmount");
		String strADJAmount = princing.get("ADJAmount");
		String strSPAPAmount = princing.get("SPAPAmount");
		String strTotalMemberPaidToPharmacy = princing.get("TotalMemberPaidToPharmacy");
		String strIngredientCost = princing.get("IngredientCost");
		String strDispenseFee = princing.get("DispenseFee");
		String strIncentiveAmount = princing.get("IncentiveAmount");
		String strOtherAmountPaid = princing.get("OtherAmountPaid");
		String strFlatSalesTax = princing.get("FlatSalesTax");
		String strPercentageSalesTax = princing.get("PercentageSalesTax");
		String strPPTotalPatientPay = princing.get("PPTotalPatientPay");
		String strTotalOtherPayerAmount = princing.get("TotalOtherPayerAmount");
		String strOtherPayer = princing.get("OtherPayer");
		String strRxCostIngredientCost = princing.get("RxCostIngredientCost");
		String strRxCostDispenseFee = princing.get("RxCostDispenseFee");
		String strRxCostIncentiveAmount = princing.get("RxCostIncentiveAmount");
		String strRxCostOtherAmountPaid = princing.get("RxCostOtherAmountPaid");
		String strRxCostFlatSalesTax = princing.get("RxCostFlatSalesTax");
		String strRxCostPercentageSalesTax = princing.get("RxCostPercentageSalesTax");
		String strTotalPlanPaid = princing.get("TotalPlanPaid");
		String strTotalOtherPayer = princing.get("TotalOtherPayer");
		String strTotalRxCost = princing.get("TotalRxCost");
		 			
		expPricing.add(strBaseCopayAmt);
		expPricing.add(strBaseCoinsAmt);
		expPricing.add(strAmtAppliedToPeriodicDed);
		expPricing.add(strAmtExceededProcBenefitMax);
		expPricing.add(strAmtAttributedToProcssorFee);
		expPricing.add(strAmtAttributedToSalesTax);
		expPricing.add(strAmtAttributedToCoverageGap);
		expPricing.add(strHealthPlanFundedAmt);
		expPricing.add(strMemberPaidDifference);
		expPricing.add(strAttrToNetSelection);
		expPricing.add(strAttrToBrandDrug);
		expPricing.add(strAttrToNonPrefFormulary);
		expPricing.add(strAttrToNonPrefFormularyBrand);
		expPricing.add(strTotalPatientPay);
		expPricing.add(strHRAAmount);
		expPricing.add(strFSAAmount);
		expPricing.add(strHSAAmount);
		expPricing.add(strADJAmount);
		expPricing.add(strSPAPAmount);
		expPricing.add(strTotalMemberPaidToPharmacy);
		expPricing.add(strIngredientCost);
		expPricing.add(strDispenseFee);
		expPricing.add(strIncentiveAmount);
		expPricing.add(strOtherAmountPaid);
		expPricing.add(strFlatSalesTax);
		expPricing.add(strPercentageSalesTax);
		expPricing.add(strPPTotalPatientPay);
		expPricing.add(strTotalOtherPayerAmount);
		expPricing.add(strOtherPayer);
		expPricing.add(strRxCostIngredientCost);
		expPricing.add(strRxCostDispenseFee);
		expPricing.add(strRxCostIncentiveAmount);
		expPricing.add(strRxCostOtherAmountPaid);
		expPricing.add(strRxCostFlatSalesTax);
		expPricing.add(strRxCostPercentageSalesTax);
		expPricing.add(strTotalPlanPaid);
		expPricing.add(strTotalOtherPayer);
		expPricing.add(strTotalRxCost);		 
		
		memberLookup_Claim_PricingSelector.Claim_Pricing_BaseCopayAmt(strBaseCopayAmt);
		memberLookup_Claim_PricingSelector.Claim_Pricing_BaseCoinsAmt(strBaseCoinsAmt);
		memberLookup_Claim_PricingSelector.Claim_Pricing_AmtAppliedToPeriodicDed(strAmtAppliedToPeriodicDed);
		memberLookup_Claim_PricingSelector.Claim_Pricing_AmtExceededProcBenefitMax(strAmtExceededProcBenefitMax);
		memberLookup_Claim_PricingSelector.Claim_Pricing_AmtAttributedToProcssorFee(strAmtAttributedToProcssorFee);
		memberLookup_Claim_PricingSelector.Claim_Pricing_AmtAttributedToSalesTax(strAmtAttributedToSalesTax);
		memberLookup_Claim_PricingSelector.Claim_Pricing_AmtAttributedToCoverageGap(strAmtAttributedToCoverageGap);
		memberLookup_Claim_PricingSelector.Claim_Pricing_HealthPlanFundedAmt(strHealthPlanFundedAmt);
		memberLookup_Claim_PricingSelector.Claim_Pricing_MemberPaidDifference(strMemberPaidDifference);
		memberLookup_Claim_PricingSelector.Claim_Pricing_AttrToNetSelection(strAttrToNetSelection);
		memberLookup_Claim_PricingSelector.Claim_Pricing_AttrToBrandDrug(strAttrToBrandDrug);
		memberLookup_Claim_PricingSelector.Claim_Pricing_AttrToNonPrefFormulary(strAttrToNonPrefFormulary);
		memberLookup_Claim_PricingSelector.Claim_Pricing_AttrToNonPrefFormularyBrand(strAttrToNonPrefFormularyBrand);
		memberLookup_Claim_PricingSelector.Claim_Pricing_TotalPatientPay(strTotalPatientPay);
		memberLookup_Claim_PricingSelector.Claim_Pricing_HRAAmount(strHRAAmount);
		memberLookup_Claim_PricingSelector.Claim_Pricing_FSAAmount(strFSAAmount);
		memberLookup_Claim_PricingSelector.Claim_Pricing_HSAAmount(strHSAAmount);
		memberLookup_Claim_PricingSelector.Claim_Pricing_ADJAmount(strADJAmount);
		memberLookup_Claim_PricingSelector.Claim_Pricing_SPAPAmount(strSPAPAmount);
		memberLookup_Claim_PricingSelector.Claim_Pricing_TotalMemberPaidToPharmacy(strTotalMemberPaidToPharmacy);
		memberLookup_Claim_PricingSelector.Claim_Pricing_IngredientCost(strIngredientCost);
		memberLookup_Claim_PricingSelector.Claim_Pricing_DispenseFee(strDispenseFee);
		memberLookup_Claim_PricingSelector.Claim_Pricing_IncentiveAmount(strIncentiveAmount);
		memberLookup_Claim_PricingSelector.Claim_Pricing_OtherAmountPaid(strOtherAmountPaid);
		memberLookup_Claim_PricingSelector.Claim_Pricing_FlatSalesTax(strFlatSalesTax);
		memberLookup_Claim_PricingSelector.Claim_Pricing_PercentageSalesTax(strPercentageSalesTax);		
		memberLookup_Claim_PricingSelector.Claim_Pricing_PPTotalPatientPay(strPPTotalPatientPay);
		memberLookup_Claim_PricingSelector.Claim_Pricing_TotalOtherPayerAmount(strTotalOtherPayerAmount);
		memberLookup_Claim_PricingSelector.Claim_Pricing_OtherPayer(strOtherPayer);
		memberLookup_Claim_PricingSelector.Claim_Pricing_RxCostIngredientCost(strRxCostIngredientCost);
		memberLookup_Claim_PricingSelector.Claim_Pricing_RxCostDispenseFee(strRxCostDispenseFee);
		memberLookup_Claim_PricingSelector.Claim_Pricing_RxCostIncentiveAmount(strRxCostIncentiveAmount);
		memberLookup_Claim_PricingSelector.Claim_Pricing_RxCostOtherAmountPaid(strRxCostOtherAmountPaid);
		memberLookup_Claim_PricingSelector.Claim_Pricing_RxCostFlatSalesTax(strRxCostFlatSalesTax);
		memberLookup_Claim_PricingSelector.Claim_Pricing_RxCostPercentageSalesTax(strRxCostPercentageSalesTax);
		memberLookup_Claim_PricingSelector.Claim_Pricing_TotalPlanPaid(strTotalPlanPaid);
		memberLookup_Claim_PricingSelector.Claim_Pricing_TotalOtherPayer(strTotalOtherPayer);
		memberLookup_Claim_PricingSelector.Claim_Pricing_TotalRxCost(strTotalRxCost);		
		
			
		for(int i=0;i<expPricing.size();i++)
		{
			pricingSoft.assertEquals(memberLookup_Claim_PricingSelector.actPricing.get(i), expPricing.get(i));
		}		
		pricingSoft.assertAll();
		
	}	
	
	 
}

