package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps.MemberLookup_Reimbursement_Results_Steps;
import cucumber.api.java.en.Then;

public class VerifyMemberLookUpReimbursementResults {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public MemberLookup_Details_Steps memberLookup_Details_Steps;
	public MemberLookup_Reimbursement_Results_Steps memberLookup_Reimbursement_Results_Steps;
	
	public VerifyMemberLookUpReimbursementResults(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		memberLookup_Details_Steps = new MemberLookup_Details_Steps(SharedResource,utils);
		memberLookup_Reimbursement_Results_Steps = new MemberLookup_Reimbursement_Results_Steps(SharedResource,utils);
	}	
	
	
	@Then("^User click on Reimbursement icon$")
	public void user_click_on_reimbursement() throws Throwable{
		memberLookup_Details_Steps.clickOnReimbursement();
	}
	
	@Then("^User verifies Reimbursement Results details$")
	public void verify_reimbursement_results_details(Map<String,String> reimbursementDetails) throws Throwable{
		memberLookup_Details_Steps.verifyReimbursement();
		memberLookup_Reimbursement_Results_Steps.verifyReimbursementResults(reimbursementDetails);
	}
}
