package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps.MemberLookup_BenefitsEligibility_CoverageCopay_Steps;
import cucumber.api.java.en.Then;

public class VerifyMemberLookUpBenefitsEligibilityCoverageCopay {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public MemberLookup_Details_Steps memberLookup_Details_Steps;
	public MemberLookup_BenefitsEligibility_CoverageCopay_Steps memberLookup_BenefitsEligibility_CoverageCopay_Steps;
	
	public VerifyMemberLookUpBenefitsEligibilityCoverageCopay(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		memberLookup_Details_Steps = new MemberLookup_Details_Steps(SharedResource,utils);
		memberLookup_BenefitsEligibility_CoverageCopay_Steps = new MemberLookup_BenefitsEligibility_CoverageCopay_Steps(SharedResource,utils);
	}	
	
	
	@Then("^User click on Coverage & Copay$")
	public void user_click_on_coverage_and_copay() throws Throwable{
		memberLookup_Details_Steps.verifyBenefitsEligibility();
		memberLookup_BenefitsEligibility_CoverageCopay_Steps.clickOnCoverageCopay();
	}
	
	@Then("^User verifies Coverage & Copay details$")
	public void verify_coverage_copay_details(Map<String,String> coverageCopayDetails) throws Throwable{
		memberLookup_BenefitsEligibility_CoverageCopay_Steps.verifyCoverageCopayDetails(coverageCopayDetails);
	}	
}
