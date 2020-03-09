package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.Apps.common.LaunchPage_Steps;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_LandingPage_Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SearchMemberLookUpAndVerifyMemberDetails {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public LaunchPage_Steps launchPage_Steps;
	public LandingPage_Steps landingPage_Steps;
	public MemberLookup_LandingPage_Steps memberLookup_LandingPage_Steps;
	
	public SearchMemberLookUpAndVerifyMemberDetails(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		launchPage_Steps = new LaunchPage_Steps(SharedResource,utils);
		landingPage_Steps = new LandingPage_Steps(SharedResource,utils);
		memberLookup_LandingPage_Steps = new MemberLookup_LandingPage_Steps(SharedResource,utils);
	}	
	
	
	@Given("^the user access the Hybrid Desktop Application$")
	public void user_can_access_the_Hybrid_desktop_application(Map<String,String> LoginDetails) throws Throwable{		
		if(SharedResource.performLaunchAndLoginAgain){
		launchPage_Steps.PerformLogin(LoginDetails);}
	}
	
	@Given("^User in Landing Page, he selects the application from menu$")
	public void the_user_selects_the_application_from_menu_options(Map<String,String> MenuDetails) throws Throwable{		
		landingPage_Steps.SelectApplication(MenuDetails);
	}
	
	@Then("^User search for existing member by entering details in Member Lookup$")
	public void the_user_search_for_the_existing_member(Map<String,String> searchDetails) throws Throwable{
		memberLookup_LandingPage_Steps.searchMemberLookUp(searchDetails);
	}
	
	@Then("^Member details should be displayed$")
	public void verify_member_details(Map<String,String> memberDetails) throws Throwable{
		memberLookup_LandingPage_Steps.verifyMemberDetails(memberDetails);
	}
	
	@Given("^User in Member Lookup Search Page$")
	public void verify_member_search_results( ) throws Throwable {
		memberLookup_LandingPage_Steps.verifyMemberSearchResults();
	}
	
	@Then("^User click on Customer Field and verifies the member id details$")
	public void verify_member_id_details(Map<String,String> memberIDDetails) throws Throwable{
		memberLookup_LandingPage_Steps.verifyMemberIDDetails(memberIDDetails);
	}
	
	@Given("^User in Member Lookup Search Page and click on Blue arrow at Customer Field$")
	public void click_on_customer_link( ) throws Throwable {
		memberLookup_LandingPage_Steps.verifyMemberSearchResults();
		memberLookup_LandingPage_Steps.clickOnCustomerLink();
	}
	
	@Then("^User verifies the header details$")
	public void verify_header_details(Map<String,String> headerDetails) throws Throwable{
		memberLookup_LandingPage_Steps.verifyHeaderDetails(headerDetails);
	}
	
	@Given("^User in Member Lookup details page$")
	public void verify_member_lookup_detail() throws Throwable {
		memberLookup_LandingPage_Steps.verifyMemberLookupDetail();
	}
	
	@Given("^User in Member Lookup Claim details page$")
	public void verify_member_lookup_claim_detail() throws Throwable {
		memberLookup_LandingPage_Steps.verifyMemberLookupClaimDetail();
	}
	
	
}
