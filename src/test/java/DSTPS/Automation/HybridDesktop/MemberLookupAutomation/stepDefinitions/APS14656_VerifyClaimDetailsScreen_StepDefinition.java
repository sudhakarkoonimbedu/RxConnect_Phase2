package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.stepDefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.Apps.common.LaunchPage_Steps;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps.APS14656_VerifyClaimDetailsScreen_Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class APS14656_VerifyClaimDetailsScreen_StepDefinition 
{
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	private LaunchPage_Steps launchPage_Steps;
	private LandingPage_Steps landingPage_Steps;
	private APS14656_VerifyClaimDetailsScreen_Steps APS14656steps;
	
	public APS14656_VerifyClaimDetailsScreen_StepDefinition(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable
	{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	public void init() throws Throwable
	{
		launchPage_Steps = new LaunchPage_Steps(SharedResource,utils);
		landingPage_Steps = new LandingPage_Steps(SharedResource,utils);
		APS14656steps = new APS14656_VerifyClaimDetailsScreen_Steps(SharedResource,utils);
	}
	@Given("^Login Into Hybrid Desktop Application$")
	public void Login_Into_Hybrid_Desktop_Application(Map<String,String> LoginDetails)	throws Throwable
	{
		if(HybridDesktop_SharedResource.performLaunchAndLoginAgain)
		{
			launchPage_Steps.PerformLogin(LoginDetails);
		}
	}
	@Given("^Verify the user is in Hybrid Desktop Landing Page and select the application from menu$")
	public void Verify_the_user_is_in_Hybrid_Desktop_Landing_Page_and_select_the_application_from_menu(Map<String,String> MenuDetails) throws Throwable
	{
		landingPage_Steps.SelectApplication(MenuDetails);
	}
	@When("^Perform search operation by giving valid inputs at Pharmacy Lookup screen$")
	public void Perform_search_operation_by_giving_valid_inputs_at_Pharmacy_Lookup_screen(Map<String,String> searchDetails) throws Throwable
	{
		APS14656steps.perform_PharmacyLookup_Search(searchDetails);
	}
	@Then("^MemberDetails should be displayed at Pharmacy Lookup Screen$")
	public void MemberDetails_should_be_displayed_at_Pharmacy_Lookup_Screen(Map<String,String> memberDetails) throws Throwable
	{
		APS14656steps.verifyMemberDetails(memberDetails);
	}
	@Given("^Ensure user is in RxNova Connect Page$")
	public void Ensure_user_is_in_RxNova_Connect_Page() throws Throwable
	{
		APS14656steps.verifyMemberLookupScreen();
	}
	@When("^Perform search operation by giving valid inputs at Member Lookup Screen$")
	public void Perform_search_operation_by_giving_valid_inputs_at_Member_Lookup_Screen(Map<String,String> validMemberDetails) throws Throwable
	{
		APS14656steps.performMemberSearchAtMemberLookupScreen(validMemberDetails);
		APS14656steps.verifyMemberSearchResults();
	}
	@Then("^Member Lookup details should be displayed$")
	public void Member_Lookup_details_should_be_displayed(Map<String,String>memberDetailsAtMemberLookup) throws Throwable
	{
		APS14656steps.verifyMemberDetails_AT_MemberLookupScreen(memberDetailsAtMemberLookup);
	}
	@Then("^Click on PlayButton at Pharmacy Lookup MemberId section$")
	public void Click_on_PlayButton_at_Pharmacy_Lookup_MemberId_section() throws Throwable
	{
		APS14656steps.perform_ClickOperationOnMemberID_AT_PharmacyLookup();
	}
	@Then("^Claim Details Page Should be displayed$")
	public void Claim_Details_Page_Should_be_displayed()
	{
		
	}
	
	
// End Of Class	
}
