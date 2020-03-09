package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps.MemberLookup_BenefitsEligibility_DeductibleAccumulator_Steps;
import cucumber.api.java.en.Then;

public class VerifyMemberLookUpBenefitsEligibilityDeductibleAccumulator {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public MemberLookup_Details_Steps memberLookup_Details_Steps;
	public MemberLookup_BenefitsEligibility_DeductibleAccumulator_Steps memberLookup_BenefitsEligibility_DeductibleAccumulator_Steps;
	
	public VerifyMemberLookUpBenefitsEligibilityDeductibleAccumulator(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		memberLookup_Details_Steps = new MemberLookup_Details_Steps(SharedResource,utils);
		memberLookup_BenefitsEligibility_DeductibleAccumulator_Steps = new MemberLookup_BenefitsEligibility_DeductibleAccumulator_Steps(SharedResource,utils);
	}	
	
	
	@Then("^User click on Deductible & Accumulators$")
	public void user_click_on_deductible_and_accumulators() throws Throwable{
		memberLookup_Details_Steps.verifyBenefitsEligibility();
		memberLookup_BenefitsEligibility_DeductibleAccumulator_Steps.clickOnDeductibleAccumulator();
	}
	
	@Then("^User verifies Deductible & Accumulators details$")
	public void verify_dual_coverage_details(Map<String,String> deductibleAccumulatorDetails) throws Throwable{
		memberLookup_BenefitsEligibility_DeductibleAccumulator_Steps.verifyDeductibleAccumulatorDetails(deductibleAccumulatorDetails);
	}	
}
