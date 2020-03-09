package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps.MemberLookup_APS19302_Auth_Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class VerifyMemberLookUpAPS19302Auth {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public MemberLookup_Details_Steps memberLookup_Details_Steps;
	public MemberLookup_APS19302_Auth_Steps memberLookup_APS19302_Auth_Steps;	 
	
	
	public VerifyMemberLookUpAPS19302Auth(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();    
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		
		memberLookup_Details_Steps = new MemberLookup_Details_Steps(SharedResource,utils);
		memberLookup_APS19302_Auth_Steps = new MemberLookup_APS19302_Auth_Steps(SharedResource,utils);		 
	}	
	
	@Then("^User click on Auth icon$")
	public void user_click_on_Auth_icon() throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.clickOnAuthIcon();
	}
	
	@Then("^User verifies the Auth details$")
	public void user_verifies_the_Auth_details() throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyAPS19302_Auth();
	}
	
	@Then("^User verifies the Add Auth button is enabled$")
	public void user_verifies_the_Add_Auth_button_is_enabled(Map<String,String> addAuthDetails) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyAddAuth(addAuthDetails);
	}
	
	@Then("^User verifies the number of Auth results First Screen$")
	public void user_verifies_the_number_of_Auth_results_First_Screen(Map<String,String> addRowCount) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyAuthResultsFirstScreen(addRowCount);	 
	}
	
	@Then("^User verifies the Next link is enabled First Screen$")
	public void user_verifies_the_Next_link_is_enabled_First_Screen(Map<String,String> addNextEnabled) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyNextEnabledFirstScreen(addNextEnabled);		
	}
	
	@Then("^User verifies the Prev link is disabled First Screen$")
	public void user_verifies_the_Prev_link_is_disabled_First_Screen(Map<String,String> addPrevDisabled) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyPrevDisabledFirstScreen(addPrevDisabled);	
	} 
	
	
	
	@Then("^User verifies the number of Auth results Second Screen$")
	public void user_verifies_the_number_of_Auth_results_Second_Screen(Map<String,String> addRowCount) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyAuthResultsSecondScreen(addRowCount);
	}
	
	@Then("^User verifies the Next link is enabled Second Screen$")
	public void user_verifies_the_Next_link_is_enabled_Second_Screen(Map<String,String> addNextEnabled) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyNextEnabledSecondScreen(addNextEnabled);	
	}
	
	@Then("^User verifies the Prev link is enabled Second Screen$")
	public void user_verifies_the_Prev_link_is_enabled_Second_Screen(Map<String,String> addPrevEnabled) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyPrevEnabledSecondScreen(addPrevEnabled);
	}
	
	
	@Then("^User verifies the number of Auth results in Last Screen$")
	public void user_verifies_the_number_of_Auth_results_in_Last_Screen(Map<String,String> addRowCount) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyAuthResultsLastScreen(addRowCount);
	}
	
	@Then("^User verifies the Next link is disabled Last Screen$")
	public void user_verifies_the_Next_link_is_disabled_Last_Screen(Map<String,String> addNextDisabled) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyNextDisabledLastScreen(addNextDisabled);	
	}
	
	@Then("^User verifies the Prev link is enabled Last Screen$")
	public void user_verifies_the_Prev_link_is_enabled_Last_Screen(Map<String,String> addPrevEnabled) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyPrevEnabledLastScreen(addPrevEnabled);
	}
	
	
	
	@Then("^User verifies the number of Auth results for Restricted Auth$")
	public void user_verifies_the_number_of_Auth_results_for_Restricted_Auth(Map<String,String> addRowCount) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyAuthResultsRestrictedAuth(addRowCount);
	}
	
	@Then("^User verifies the Next link is disabled for Restricted Auth$")
	public void user_verifies_the_Next_link_is_disabled_for_Restricted_Auth(Map<String,String> addNextDisabled) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyNextDisabledRestrictedAuth(addNextDisabled);
	}
	
	@Then("^User verifies the Prev link is disabled for Restricted Auth$")
	public void user_verifies_the_Prev_link_is_disabled_for_Restricted_Auth(Map<String,String> addPrevDisabled) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyPrevDisabledRestrictedAuth(addPrevDisabled);	
	}
	
	
	@Then("^User verifies the number of Auth results for Customized Auth$")
	public void user_verifies_the_number_of_Auth_results_for_Customized_Auth(Map<String,String> addRowCount) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyAuthResultsCustomizedAuth(addRowCount);
	}
	
	@Then("^User verifies the Next link is disabled for Customized Auth$")
	public void user_verifies_the_Next_link_is_disabled_for_Customized_Auth(Map<String,String> addNextDisabled) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyNextDisabledCustomizedAuth(addNextDisabled);
	}
	
	@Then("^User verifies the Prev link is disabled for Customized Auth$")
	public void user_verifies_the_Prev_link_is_disabled_for_Customized_Auth(Map<String,String> addPrevDisabled) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyPrevDisabledCustomizedAuth(addPrevDisabled);
	}
	
	
	@Then("^User verifies the number of Auth results for Preauth First Screen$")
	public void user_verifies_the_number_of_Auth_results_for_Preauth_First_Screen(Map<String,String> addRowCount) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyAuthResultsPreAuthFirstScreen(addRowCount);
	}
	
	@Then("^User verifies the Next link is enabled for Preauth First Screen$")
	public void user_verifies_the_Next_link_is_enabled_for_Preauth_First_Screen(Map<String,String> addNextEnabled) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyNextEnabledPreAuthFirstScreen(addNextEnabled);
	}
	
	@Then("^User verifies the Prev link is disabled for Preauth First Screen$")
	public void user_verifies_the_Prev_link_is_disabled_for_Preauth_First_Screen(Map<String,String> addPrevDisabled) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyPrevDisabledPreAuthFirstScreen(addPrevDisabled);
	}
	
	
	@Then("^User verifies the number of Auth results for Preauth Last Screen$")
	public void user_verifies_the_number_of_Auth_results_for_Preauth_Last_Screen(Map<String,String> addRowCount) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyAuthResultsPreAuthLastScreen(addRowCount);
	}
	
	@Then("^User verifies the Next link is disabled for Preauth Last Screen$")
	public void user_verifies_the_Next_link_is_disabled_for_Preauth_Last_Screen(Map<String,String> addNextDisabled) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyNextDisabledPreAuthLastScreen(addNextDisabled);
	}
	
	@Then("^User verifies the Prev link is enabled for Preauth Last Screen$")
	public void user_verifies_the_Prev_link_is_enabled_for_Preauth_Last_Screen(Map<String,String> addPrevEnabled) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyPrevEnabledPreAuthLastScreen(addPrevEnabled);
	}	
	
	
	@Then("^User verifies the number of Auth results for Auth Type and Status$")
	public void user_verifies_the_number_of_Auth_results_for_Auth_Type_and_Status(Map<String,String> addRowCount) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyAuthResultsForAuthTypeAndStatusSearch(addRowCount);
	}
	
	@Then("^User verifies the Next link is disabled for Auth Type and Status$")
	public void user_verifies_the_Next_link_is_disabled_for_Auth_Type_and_Status(Map<String,String> addNextDisabled) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyNextDisabledForAuthTypeAndStatusSearch(addNextDisabled);
	}
	
	@Then("^User verifies the Prev link is disabled for Auth Type and Status$")
	public void user_verifies_the_Prev_link_is_disabled_for_Auth_Type_and_Status(Map<String,String> addPrevDisabled) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyPrevDisabledForAuthTypeAndStatusSearch(addPrevDisabled);
	}	
	
	
	@Then("^User verifies the number of Auth results for RxNumber Search$")
	public void user_verifies_the_number_of_Auth_results_for_RxNumber_Search(Map<String,String> addRowCount) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyAuthResultsForAuthTypeAndStatusSearch(addRowCount);
	}
	
	@Then("^User verifies the Next link is disabled for RxNumber Search$")
	public void user_verifies_the_Next_link_is_disabled_for_RxNumber_Search(Map<String,String> addNextDisabled) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyNextDisabledForAuthTypeAndStatusSearch(addNextDisabled);
	}
	
	@Then("^User verifies the Prev link is disabled for RxNumber Search$")
	public void user_verifies_the_Prev_link_is_disabled_for_RxNumber_Search(Map<String,String> addPrevDisabled) throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.verifyPrevDisabledForAuthTypeAndStatusSearch(addPrevDisabled);
	}
	
	
	
	@Given("^User in Auth details page$")
	public void user_in_Auth_details_page() throws Throwable {
		memberLookup_APS19302_Auth_Steps.verifyAPS19302_Auth();
	}
	
	@Then("^User click on Next link$")
	public void user_click_on_Next_link() throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.clickOnNextLink();
	}
	
	@Then("^User click on Prev link$")
	public void user_click_on_Prev_link() throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.clickOnPrevLink();
	}
	
	@Then("^User click on Clear$")
	public void user_click_on_Clear() throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.clickOnClearButton();
	}
	
	@Then("^User click on Search$")
	public void user_click_on_Search() throws Throwable{		 
		memberLookup_APS19302_Auth_Steps.clickOnSearchButton();
	}
	
	@Then("^User provides Auth type and click on Search$")
	public void user_provides_Auth_type_and_click_on_Search(Map<String,String> addAuthType) throws Throwable{	
		memberLookup_APS19302_Auth_Steps.selectAuthType(addAuthType);
		Thread.sleep(1000);
		memberLookup_APS19302_Auth_Steps.clickOnSearchButton();
	}
	
	
	@Then("^User provides Auth type and Status and click on Search$")
	public void user_provides_Auth_type_Status_and_click_on_Search(Map<String,String> authstatusDetails) throws Throwable{
		memberLookup_APS19302_Auth_Steps.searchAuthStatusLookUp(authstatusDetails);		
	}
	
	
	@Then("^User provides RxNumber and click on Search$")
	public void user_provides_RxNumber_and_click_on_Search(Map<String,String> addRxNumber) throws Throwable{	
		memberLookup_APS19302_Auth_Steps.enterRxNumber(addRxNumber);
		Thread.sleep(1000);
		memberLookup_APS19302_Auth_Steps.clickOnSearchButton();
	}
	
	@Then("^User verifies the Auth results$")
	public void verify_the_auth_results(Map<String,String> authResults) throws Throwable{
		memberLookup_APS19302_Auth_Steps.verifyActualAuthResultsAuthTypeAndStatusSearch(authResults);
	}
	

	
	
	
 		
}
