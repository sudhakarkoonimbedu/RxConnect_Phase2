package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.MemberLookup_Claim_CompoundSelector;

public class MemberLookup_Claim_Compound_Steps {

	MemberLookup_Claim_CompoundSelector memberLookup_Claim_CompoundSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expCompound = new ArrayList<String>();
	public SoftAssert compoundSoft = new SoftAssert();
	
	
	public MemberLookup_Claim_Compound_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		memberLookup_Claim_CompoundSelector = new MemberLookup_Claim_CompoundSelector(SharedResource,utils);
	}
	
	public void clickOnCompound() throws Throwable{
		memberLookup_Claim_CompoundSelector.MemberLookup_Claim_clickOnCompound();
		memberLookup_Claim_CompoundSelector.waitUnitillCompoundDetails();
	}
	
	public void verifyCompound(Map<String,String> compound)throws Throwable {
		 
		String strCompoundCode = compound.get("CompoundCode");
		String strDispensingUnitFormIndicator  = compound.get("DispensingUnitFormIndicator");
		String strDosageFormDescriptionCode  = compound.get("DosageFormDescriptionCode");
		String strCompoundProductID  = compound.get("CompoundProductID");
		String strProductIDQualifier  = compound.get("ProductIDQualifier");
		String strCompoundIngredientQTY  = compound.get("CompoundIngredientQTY");
		String strSubmittedCompoundIngredientDrugCost  = compound.get("SubmittedCompoundIngredientDrugCost");
		String strPlanCompoundIngredientDrugCost  = compound.get("PlanCompoundIngredientDrugCost");
		String strCompoundIngreBasisCostDetermination  = compound.get("CompoundIngreBasisCostDetermination");
		String strPostPay3Indicator  = compound.get("PostPay3Indicator");
		String strPostPay4Indicator  = compound.get("PostPay4Indicator");
		 
		expCompound.add(strCompoundCode);
		expCompound.add(strDispensingUnitFormIndicator);
		expCompound.add(strDosageFormDescriptionCode);
		expCompound.add(strCompoundProductID);
		expCompound.add(strProductIDQualifier);
		expCompound.add(strCompoundIngredientQTY);
		expCompound.add(strSubmittedCompoundIngredientDrugCost);
		expCompound.add(strPlanCompoundIngredientDrugCost);
		expCompound.add(strCompoundIngreBasisCostDetermination);
		expCompound.add(strPostPay3Indicator);
		expCompound.add(strPostPay4Indicator);		  
		
		memberLookup_Claim_CompoundSelector.Claim_Compound_CompoundCode(strCompoundCode);
		memberLookup_Claim_CompoundSelector.Claim_Compound_DispensingUnitFormIndicator(strDispensingUnitFormIndicator);
		memberLookup_Claim_CompoundSelector.Claim_Compound_DosageFormDescriptionCode(strDosageFormDescriptionCode);
		memberLookup_Claim_CompoundSelector.Claim_Compound_CompoundProductID(strCompoundProductID);
		memberLookup_Claim_CompoundSelector.Claim_Compound_ProductIDQualifier(strProductIDQualifier);
		memberLookup_Claim_CompoundSelector.Claim_Compound_CompoundIngredientQTY(strCompoundIngredientQTY);
		memberLookup_Claim_CompoundSelector.Claim_Compound_SubmittedCompoundIngredientDrugCostCompound_(strSubmittedCompoundIngredientDrugCost);
		memberLookup_Claim_CompoundSelector.Claim_Compound_PlanCompoundIngredientDrugCost(strPlanCompoundIngredientDrugCost);
		memberLookup_Claim_CompoundSelector.Claim_Compound_CompoundIngreBasisCostDetermination(strCompoundIngreBasisCostDetermination);
		memberLookup_Claim_CompoundSelector.Claim_Compound_PostPay3Indicator(strPostPay3Indicator);		 
		memberLookup_Claim_CompoundSelector.Claim_Compound_PostPay4Indicator(strPostPay4Indicator);
		 
			
		for(int i=0;i<expCompound.size();i++)
		{
			compoundSoft.assertEquals(memberLookup_Claim_CompoundSelector.actCompound.get(i), expCompound.get(i));
		}		
		compoundSoft.assertAll();
		
	}	
	
	 
}

