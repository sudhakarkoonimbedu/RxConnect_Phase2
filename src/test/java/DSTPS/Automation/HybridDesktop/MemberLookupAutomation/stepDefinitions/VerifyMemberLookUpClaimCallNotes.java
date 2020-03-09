package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps.MemberLookup_Claim_CallNotes_Steps;
import cucumber.api.java.en.Then;

public class VerifyMemberLookUpClaimCallNotes {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public MemberLookup_Details_Steps memberLookup_Details_Steps;
	public MemberLookup_Claim_CallNotes_Steps memberLookup_Claim_CallNotes_Steps;
	
	public VerifyMemberLookUpClaimCallNotes(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		memberLookup_Details_Steps = new MemberLookup_Details_Steps(SharedResource,utils);
		memberLookup_Claim_CallNotes_Steps = new MemberLookup_Claim_CallNotes_Steps(SharedResource,utils);
	}	
	
	@Then("^User click on Claim icon$")
	public void user_click_on_claim() throws Throwable{
		memberLookup_Details_Steps.clickOnClaim();
		//Thread.sleep(5000);
	}
	

	@Then("^User click on Call Notes in Claim screen$")
	public void user_click_on_call_notes() throws Throwable{
		memberLookup_Details_Steps.verifyClaim();
		memberLookup_Claim_CallNotes_Steps.clickOnCallNotes();
	}
	
	@Then("^User provides details in Claim Add New Call Notes screen and click on Save Notes button$")
	public void add_call_notes(Map<String,String> addCallNotesDetails) throws Throwable{
		memberLookup_Claim_CallNotes_Steps.provideCallNotesDetails(addCallNotesDetails);
		memberLookup_Claim_CallNotes_Steps.addCallNotes();
	}
	
	@Then("^User verifies Claim Previous Call Notes Comments$") //
	public void verify_previous_call_notes_comments(Map<String,String> previousCallNotesComments) throws Throwable{
		memberLookup_Claim_CallNotes_Steps.verifyPreviousCallNotesComments(previousCallNotesComments);
	}
	
	@Then("^User verify Claim Previous Call Notes details$") //
	public void verify_call_notes_details(Map<String,String> callNotesDetails) throws Throwable{
		memberLookup_Claim_CallNotes_Steps.verifyCallNotesDetails(callNotesDetails);
	}
}
