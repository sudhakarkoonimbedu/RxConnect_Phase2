package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps.MemberLookup_CallNotes_Steps;
import cucumber.api.java.en.Then;

public class VerifyMemberLookUpCallNotes {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public MemberLookup_LandingPage_Steps memberLookup_LandingPage_Steps;
	public MemberLookup_CallNotes_Steps memberLookup_CallNotes_Steps;
	
	public VerifyMemberLookUpCallNotes(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		memberLookup_LandingPage_Steps = new MemberLookup_LandingPage_Steps(SharedResource,utils);
		memberLookup_CallNotes_Steps = new MemberLookup_CallNotes_Steps(SharedResource,utils);
	}	
	
	
	@Then("^User click on Call Notes button$")
	public void user_click_on_call_notes() throws Throwable{
		memberLookup_LandingPage_Steps.clickOnCallNotes();
	}
	
	@Then("^User provides details in Add New Call Notes screen and click on Save Notes button$")
	public void add_call_notes(Map<String,String> addCallNotesDetails) throws Throwable{
		memberLookup_LandingPage_Steps.verifyCallNotes();
		memberLookup_CallNotes_Steps.provideCallNotesDetails(addCallNotesDetails);
		memberLookup_CallNotes_Steps.addCallNotes();
	}
	
	@Then("^User verifies Previous Call Notes Comments$") //
	public void verify_previous_call_notes_comments(Map<String,String> previousCallNotesComments) throws Throwable{
		memberLookup_CallNotes_Steps.verifyPreviousCallNotesComments(previousCallNotesComments);
	}
	
	@Then("^User verify Previous Call Notes details$") //
	public void verify_call_notes_details(Map<String,String> callNotesDetails) throws Throwable{
		memberLookup_CallNotes_Steps.verifyCallNotesDetails(callNotesDetails);
	}
}
