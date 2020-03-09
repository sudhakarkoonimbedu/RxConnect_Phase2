package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps.MemberLookup_Claim_ClaimRawData_Steps;
import cucumber.api.java.en.Then;

public class VerifyMemberLookUpClaimClaimRawData {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public MemberLookup_Details_Steps memberLookup_Details_Steps;
	public MemberLookup_Claim_ClaimRawData_Steps memberLookup_Claim_ClaimRawData_Steps;	 
	
	
	public VerifyMemberLookUpClaimClaimRawData(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();    
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		
		memberLookup_Details_Steps = new MemberLookup_Details_Steps(SharedResource,utils);
		memberLookup_Claim_ClaimRawData_Steps = new MemberLookup_Claim_ClaimRawData_Steps(SharedResource,utils);		 
	}	
	

	@Then("^User click on Claim Raw Data in Claim screen$")
	public void user_click_on_Claim_Raw_Data() throws Throwable{		 
		memberLookup_Claim_ClaimRawData_Steps.clickOnClaimRawData();	
	}
	
	@Then("^User verifies Claim Raw Data is displayed$")
	public void verify_the_Claim_Raw_Data(Map<String,String> dataLength) throws Throwable{
		memberLookup_Claim_ClaimRawData_Steps.verifyClaimRawData();	
		memberLookup_Claim_ClaimRawData_Steps.verifyDataLength(dataLength);
	}
			
}
