package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps.MemberLookup_APS9554_Lock_In_Steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class VerifyMemberLookup_APS9554_Lock_In {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public MemberLookup_Details_Steps memberLookup_Details_Steps;
	public MemberLookup_APS9554_Lock_In_Steps memberLookup_APS9554_Lock_In_Steps;
	
	public VerifyMemberLookup_APS9554_Lock_In(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		memberLookup_Details_Steps = new MemberLookup_Details_Steps(SharedResource,utils);
		memberLookup_APS9554_Lock_In_Steps = new MemberLookup_APS9554_Lock_In_Steps(SharedResource,utils);
	}
	
	@Given("^User in Lock-in Information screen$")
	public void user_in_lock_in_information_screen() {
		memberLookup_APS9554_Lock_In_Steps.verifyLockinInformation();
	}
	
	@Then("^User click on View Lock-in Information$")
	public void user_click_on_view_lock_in_information() throws Throwable{
		memberLookup_APS9554_Lock_In_Steps.clickOnViewLockinInformationLink();
	}
	
	@And("^User verifies the Prescriber Lock-in details$")
	public void verify_prescriber_lock_in_details(Map<String,String> prescriberLockinDetails) throws Throwable{
		memberLookup_APS9554_Lock_In_Steps.verifyPrescriberLockinDetails(prescriberLockinDetails);
	}
	
	@And("^User verifies the Pharmacy Information details$")
	public void verify_pharmacy_information_details(Map<String,String> pharmacyInformation) throws Throwable{
		memberLookup_APS9554_Lock_In_Steps.verifyPharmacyInformation(pharmacyInformation);
	}
	
	@And("^User verifies below Pharmacy Information details are not displayed$")
	public void verify_below_pharmacy_information_details_are_not_displayed(Map<String,String> invalidPharmacyInformation) throws Throwable{
		memberLookup_APS9554_Lock_In_Steps.verifyInvalidPharmacyInformation(invalidPharmacyInformation);
	}
	
	@And("^User click on Close button$")
	public void user_click_on_close_button() throws Throwable{
		memberLookup_APS9554_Lock_In_Steps.clickOnCloseButton();
	}	
	
}
