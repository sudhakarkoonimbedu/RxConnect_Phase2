package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps.MemberLookup_Claim_ClaimHistory_Steps;
import cucumber.api.java.en.Then;

public class VerifyMemberLookUpClaimClaimHistory {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public MemberLookup_Details_Steps memberLookup_Details_Steps;
	public MemberLookup_Claim_ClaimHistory_Steps memberLookup_Claim_ClaimHistory_Steps;	 
	
	
	public VerifyMemberLookUpClaimClaimHistory(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();    
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		
		memberLookup_Details_Steps = new MemberLookup_Details_Steps(SharedResource,utils);
		memberLookup_Claim_ClaimHistory_Steps = new MemberLookup_Claim_ClaimHistory_Steps(SharedResource,utils);		 
	}	
	

	@Then("^User verifies Claim History details$")
	public void user_verify_Claim_History_Details() throws Throwable{		 
		memberLookup_Claim_ClaimHistory_Steps.verifyClaimHistory();	
	}
	
	@Then("^User click on Blue arrow in Claim History details$")
	public void click_on_Blue_arrow_in_Claim_History() throws Throwable{
		memberLookup_Claim_ClaimHistory_Steps.clickOnClaimHistoryMemberId();		
	}
			
}
