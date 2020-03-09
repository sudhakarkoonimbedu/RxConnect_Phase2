package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps.MemberLookup_Formulary_DrugResults_Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class VerifyMemberLookUpFormularyDrugResults {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public MemberLookup_Details_Steps memberLookup_Details_Steps;
	public MemberLookup_Formulary_DrugResults_Steps memberLookup_Formulary_DrugResults_Steps;
	
	public VerifyMemberLookUpFormularyDrugResults(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		memberLookup_Details_Steps = new MemberLookup_Details_Steps(SharedResource,utils);
		memberLookup_Formulary_DrugResults_Steps = new MemberLookup_Formulary_DrugResults_Steps(SharedResource,utils);
	}	
	
	
	@Then("^User click on Formulary icon$")
	public void user_click_on_formulary() throws Throwable{
		memberLookup_Details_Steps.clickOnFormulary();
	}
	
	@Then("^User verifies Drug Results details$")
	public void verify_drug_results_details(Map<String,String> drugResultsDetails) throws Throwable{
		memberLookup_Details_Steps.verifyFormulary();
		memberLookup_Formulary_DrugResults_Steps.verifyDrugResults(drugResultsDetails);
	}
	
	@Given("^User in Formulary Details page$")
	public void user_in_formulary_details_page() throws Throwable{
		memberLookup_Details_Steps.verifyFormulary();
	}
	
	@Then("^User click on Claim Test button verifies the Claim Test Entry details in Claim Home Screen$")
	public void verify_test_entry_details(Map<String,String> claimTestDetails) throws Throwable{
		memberLookup_Formulary_DrugResults_Steps.verifyClaimTestDetails(claimTestDetails);
	}
	
	
}
