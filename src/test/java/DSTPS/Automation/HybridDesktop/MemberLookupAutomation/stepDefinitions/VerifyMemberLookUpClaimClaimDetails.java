package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps.MemberLookup_Claim_ClaimDetails_Steps;
import cucumber.api.java.en.Then;

public class VerifyMemberLookUpClaimClaimDetails {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public MemberLookup_Details_Steps memberLookup_Details_Steps;
	public MemberLookup_Claim_ClaimDetails_Steps memberLookup_Claim_ClaimDetails_Steps;	 
	
	
	public VerifyMemberLookUpClaimClaimDetails(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();    
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		
		memberLookup_Details_Steps = new MemberLookup_Details_Steps(SharedResource,utils);
		memberLookup_Claim_ClaimDetails_Steps = new MemberLookup_Claim_ClaimDetails_Steps(SharedResource,utils);		 
	}	
	
	
	@Then("^User verifies the Claim details$")
	public void verify_the_claim_details(Map<String,String> claimDetails) throws Throwable{
		memberLookup_Claim_ClaimDetails_Steps.verifyClaimDetails(claimDetails);		
	}
	
	@Then("^User verifies the Claim Information details$")
	public void verify_the_claim_information(Map<String,String> claimInformation) throws Throwable{
		memberLookup_Claim_ClaimDetails_Steps.verifyClaimInformation(claimInformation);		
	}
	
	@Then("^User verifies the Drug Override Information details$")
	public void verify_the_drug_override_information(Map<String,String> drugOverride) throws Throwable{
		memberLookup_Claim_ClaimDetails_Steps.verifyDrugOverride(drugOverride);		
	}
	
	@Then("^User verifies the Pharmacy Prescriber Information details$")
	public void verify_the_pharmacy_prescriber_information(Map<String,String> pharPrescriber) throws Throwable{
		memberLookup_Claim_ClaimDetails_Steps.verifyPharPrescriber(pharPrescriber);		
	}
	
	@Then("^User verifies the Claim Pricing Information details$")
	public void verify_the_claim_pricing_information(Map<String,String> claimPricing) throws Throwable{
		memberLookup_Claim_ClaimDetails_Steps.verifyClaimPricing(claimPricing);		
	}
			
}
