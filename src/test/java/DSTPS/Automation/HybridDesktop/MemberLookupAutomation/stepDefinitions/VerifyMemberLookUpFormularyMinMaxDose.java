package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps.MemberLookup_Formulary_MinMaxDose_Steps;
import cucumber.api.java.en.Then;

public class VerifyMemberLookUpFormularyMinMaxDose {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public MemberLookup_Details_Steps memberLookup_Details_Steps;
	public MemberLookup_Formulary_MinMaxDose_Steps memberLookup_Formulary_MinMaxDose_Steps;
	
	public VerifyMemberLookUpFormularyMinMaxDose(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		memberLookup_Details_Steps = new MemberLookup_Details_Steps(SharedResource,utils);
		memberLookup_Formulary_MinMaxDose_Steps = new MemberLookup_Formulary_MinMaxDose_Steps(SharedResource,utils);
	}	
	
	
	@Then("^User click on Min Max Dose$")
	public void user_click_on_min_max_dose() throws Throwable{
		memberLookup_Details_Steps.verifyFormulary();
		memberLookup_Formulary_MinMaxDose_Steps.clickOnMinMaxDose();
	}
	
	@Then("^User verifies the Min Max Dose details$")
	public void verify_min_max_dose_details(Map<String,String> minMaxDoseDetails) throws Throwable{
		memberLookup_Formulary_MinMaxDose_Steps.verifyMinMaxDoseDetails(minMaxDoseDetails);
	}
}
