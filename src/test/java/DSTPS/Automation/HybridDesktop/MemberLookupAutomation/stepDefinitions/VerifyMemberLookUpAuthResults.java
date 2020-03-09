package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps.MemberLookup_Authorization_AuthResults_Steps;
import cucumber.api.java.en.Then;

public class VerifyMemberLookUpAuthResults {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public MemberLookup_Details_Steps memberLookup_Details_Steps;
	public MemberLookup_Authorization_AuthResults_Steps memberLookup_Authorization_AuthResults_Steps;
	
	public VerifyMemberLookUpAuthResults(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		memberLookup_Details_Steps = new MemberLookup_Details_Steps(SharedResource,utils);
		memberLookup_Authorization_AuthResults_Steps = new MemberLookup_Authorization_AuthResults_Steps(SharedResource,utils);
	}	
	
	
	@Then("^User click on Authorization icon$")
	public void user_click_on_authorization() throws Throwable{
		memberLookup_Details_Steps.clickOnAuthorization();
	}
	
	@Then("^User verifies the Auth Results details$")
	public void verify_auth_results_details(Map<String,String> authResultsDetails) throws Throwable{
		memberLookup_Details_Steps.verifyAuthorization();
		memberLookup_Authorization_AuthResults_Steps.verifyAuthResults(authResultsDetails);
	}
}
