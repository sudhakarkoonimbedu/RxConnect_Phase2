package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps.MemberLookup_Claim_Pricing_Steps;
import cucumber.api.java.en.Then;

public class VerifyMemberLookUpClaimPricing {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public MemberLookup_Details_Steps memberLookup_Details_Steps;
	public MemberLookup_Claim_Pricing_Steps memberLookup_Claim_Pricing_Steps;	 
	
	
	public VerifyMemberLookUpClaimPricing(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();    
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		
		memberLookup_Details_Steps = new MemberLookup_Details_Steps(SharedResource,utils);
		memberLookup_Claim_Pricing_Steps = new MemberLookup_Claim_Pricing_Steps(SharedResource,utils);		 
	}	
	
	 
	@Then("^User click on Pricing in Claim screen$")
	public void user_click_on_Pricing() throws Throwable{
		//pharmacyLookup_Details_Steps.verifyClaim();
		memberLookup_Claim_Pricing_Steps.clickOnPricing();	
	}
	
	
	@Then("^User verifies Pricing$")
	public void verify_the_pricing(Map<String,String> pricing) throws Throwable{
		memberLookup_Claim_Pricing_Steps.verifyPricing(pricing);		
	}
			
}
