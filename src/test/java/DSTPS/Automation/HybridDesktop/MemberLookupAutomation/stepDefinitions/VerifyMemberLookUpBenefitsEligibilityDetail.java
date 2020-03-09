package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps.MemberLookup_BenefitsEligibility_Detail_Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class VerifyMemberLookUpBenefitsEligibilityDetail {
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public MemberLookup_Details_Steps memberLookup_Details_Steps;
	public MemberLookup_BenefitsEligibility_Detail_Steps memberLookup_BenefitsEligibility_Detail_Steps;
	
	public VerifyMemberLookUpBenefitsEligibilityDetail(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize the step classes here
		memberLookup_Details_Steps = new MemberLookup_Details_Steps(SharedResource,utils);
		memberLookup_BenefitsEligibility_Detail_Steps = new MemberLookup_BenefitsEligibility_Detail_Steps(SharedResource,utils);
	}	
	
	
	@Then("^User click on Benefits Eligibility icon$")
	public void user_click_on_benefits_eligibility() throws Throwable{
		memberLookup_Details_Steps.clickOnBenefitsEligibility();
	}
	
	@Then("^User verifies Benefits & Elegibility details$")
	public void verify_benefits_eligibility_details(Map<String,String> benefitsEligibilityDetails) throws Throwable{
		memberLookup_Details_Steps.verifyBenefitsEligibility();
		memberLookup_BenefitsEligibility_Detail_Steps.verifyBenefitsEligibilityDetails(benefitsEligibilityDetails);
	}
	
	@Given("^User in Benefits & Eligibility Details page$")
	public void user_in_benefits_eligibility_details_page() throws Throwable{
		memberLookup_Details_Steps.verifyBenefitsEligibility();
	}
	
	@Then("^User click on View Additional Eligibility Dates icon and verifies Additional Eligibility Dates$")
	public void verify_additional_eligibility_dates_details(Map<String,String> addEligblDatesDetails) throws Throwable{
		memberLookup_BenefitsEligibility_Detail_Steps.verifyAdditionalEligibilityDatesDetails(addEligblDatesDetails);
	}
	
	@Then("^User click on MemberID details link and verifies the Member details in Member Home Screen$")
	public void verify_member_id_details(Map<String,String> memberIDDetails) throws Throwable{
		memberLookup_BenefitsEligibility_Detail_Steps.verifyMemberIDDetails(memberIDDetails);
	}
	
	
}
