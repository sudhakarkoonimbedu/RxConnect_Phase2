package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps.MemberLookup_Pharmacy_Results_Steps;
import cucumber.api.java.en.Then;

public class VerifyMemberLookUpPharmacyResults {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public MemberLookup_Details_Steps memberLookup_Details_Steps;
	public MemberLookup_Pharmacy_Results_Steps memberLookup_Pharmacy_Results_Steps;
	
	public VerifyMemberLookUpPharmacyResults(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		memberLookup_Details_Steps = new MemberLookup_Details_Steps(SharedResource,utils);
		memberLookup_Pharmacy_Results_Steps = new MemberLookup_Pharmacy_Results_Steps(SharedResource,utils);
	}	
	
	
	@Then("^User click on Pharmacy icon$")
	public void user_click_on_pharmacy() throws Throwable{
		memberLookup_Details_Steps.clickOnPharmacy();
	}
	
	@Then("^User provides details and click on Search button$")
	public void search_for_network_pharmacies(Map<String,String> pharmacySearchDetails) throws Throwable{
		memberLookup_Details_Steps.verifyPharmacyResults();
		memberLookup_Pharmacy_Results_Steps.searchPharmacy(pharmacySearchDetails);
	}
	
	@Then("^User verifies Pharmacy Results details$")
	public void verify_pharmacy_results_details(Map<String,String> pharmacyResultsDetails) throws Throwable{
		memberLookup_Pharmacy_Results_Steps.verifyPharmacyResultsDetails(pharmacyResultsDetails);
	}
}
