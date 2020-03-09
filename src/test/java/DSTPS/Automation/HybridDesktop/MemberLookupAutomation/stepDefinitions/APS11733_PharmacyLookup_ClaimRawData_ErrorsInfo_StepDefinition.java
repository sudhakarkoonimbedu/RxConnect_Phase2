package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.stepDefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.Apps.common.LaunchPage_Steps;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps.APS11733_PharmacyLookup_VerifyRawDataErrors_Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class APS11733_PharmacyLookup_ClaimRawData_ErrorsInfo_StepDefinition 
{
	private HybridDesktop_SharedResource SharedResource;
	@SuppressWarnings("unused")
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private LaunchPage_Steps launchPage_Steps;
	private LandingPage_Steps landingPage_Steps;
	private APS11733_PharmacyLookup_VerifyRawDataErrors_Steps APS11733Steps;
	
	public APS11733_PharmacyLookup_ClaimRawData_ErrorsInfo_StepDefinition (HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable
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
		APS11733Steps = new APS11733_PharmacyLookup_VerifyRawDataErrors_Steps(SharedResource,utils);
			
	}
	@Given("^Access the Hybrid Desktop Application$")
	public void Access_the_Hybrid_Desktop_Application(Map<String,String> LoginDetails)	throws Throwable
	{
		if(HybridDesktop_SharedResource.performLaunchAndLoginAgain)
		{
			launchPage_Steps.PerformLogin(LoginDetails);
		}
	}
	@Given("^Ensure user is in Landing Page and he selects the application from menu$")
	public void Ensure_user_is_in_Landing_Page_and_he_selects_the_application_from_menu(Map<String,String> MenuDetails) throws Throwable
	{
		landingPage_Steps.SelectApplication(MenuDetails);
	}
	@Then("^Perform search operation by entering details in Pharmacy Lookup screen$")
	public void Perform_search_operation_by_entering_details_in_Pharmacy_Lookup_screen(Map<String,String> searchDetails) throws Throwable
	{
		APS11733Steps.perform_PharmacyLookup_Search(searchDetails);
	}
	@Then("^Member details should be displayed at Pharmacy Lookup Screen$")
	public void Member_details_should_be_displayed_at_Pharmacy_Lookup_Screen(Map<String,String> memberDetails) throws Throwable
	{
		APS11733Steps.verifyMemberDetails(memberDetails);
	}
	@Then("^Click on PlayButton at PharmacyLookup screen$")
	public void Click_on_PlayButton_at_PharmacyLookup_screen() throws Throwable
	{
		APS11733Steps.perform_Click_On_PlayButton();
	}
	@Then("^POS Transaction Data should be displayed$")
	public void POS_Transaction_Data_should_be_displayed() throws Throwable
	{
		APS11733Steps.verify_POS_TransactionData();
	}
	@Given("^Ensure user is in POS Transaction Data page$")
	public void Ensure_user_is_in_Pharmacy_Lookup_details_page() throws Throwable
	{
		APS11733Steps.verify_POS_TransactionData();
	}
	@Then("^Verify Claim Raw Data is displayed$")
	public void Verify_Claim_Raw_Data_is_displayed(Map<String,String> dataLength) throws Throwable
	{
		APS11733Steps.verifyOnClaimRawData(dataLength);
	}
	@Then("^Verify Error Information for NCPDP Error Message Table Data$")
	public void Verify_Error_Information_for_NCPDP_Error_Message_Table_Data(Map<String,String> ncpdp_ErrorMessage) throws Throwable
	{
		APS11733Steps.verify_NCPDP_ErrorMessageTableData(ncpdp_ErrorMessage);
	}
	@Then("^Verify Error Information for RxNova Error Message Table Data$")
	public void Verify_Error_Information_for_RxNova_Error_Message_Table_Data(Map<String,String> rxnova_ErrorMessage) throws Throwable
	{
		APS11733Steps.verify_RxNova_ErrorMessage_TableData(rxnova_ErrorMessage);
	}
}
