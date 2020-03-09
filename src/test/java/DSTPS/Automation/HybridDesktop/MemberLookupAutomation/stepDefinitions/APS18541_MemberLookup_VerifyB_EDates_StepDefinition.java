package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.stepDefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps.APS18541_MemberLookup_VerifyBenefitsEligibilityDates_Steps;

public class APS18541_MemberLookup_VerifyB_EDates_StepDefinition 
{
	private HybridDesktop_SharedResource SharedResource;
	private RxNova_Utlilty utils;
	public WebDriver driver;
	
	private APS18541_MemberLookup_VerifyBenefitsEligibilityDates_Steps APS18541Steps;

	public APS18541_MemberLookup_VerifyB_EDates_StepDefinition(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable
	{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;
		init();
	}
	public void init() throws Throwable 
	{
		APS18541Steps = new APS18541_MemberLookup_VerifyBenefitsEligibilityDates_Steps(SharedResource,utils);
		
	}
	@Then("^Verify the End Date Warning Message$")
	public void Verify_the_End_Date_Warning_Message(Map<String,String> warningMessage) throws Throwable
	{
		APS18541Steps.verifyTheWarningMessage_At_NoEndDate(warningMessage);
	}
	@Then("^Perform MemberLookup Search with valid inputs$")
	public void Perform_MemberLookup_Search_with_valid_inputs(Map<String,String> memberSearchInputs) throws Throwable
	{
		APS18541Steps.performMemberLookUpSearch(memberSearchInputs);
	}
//	@Then("^User click on Benefits Eligibility icon$")
//	public void user_click_on_benefits_eligibility() throws Throwable
//	{
//		APS18541Steps.clickOnBenefitsEligibility();
//	}
	@Then("^User verifies Benefits and Eligibility details$")
	public void verify_benefits_eligibility_details(Map<String,String> benefitsEligibilityDetails) throws Throwable
	{
		APS18541Steps.verifyBenefitsEligibility();
		APS18541Steps.verifyBenefitsEligibilityDetails(benefitsEligibilityDetails);
	}
//	@Given("^User in Benefits & Eligibility Details page$")
//	public void user_in_benefits_eligibility_details_page() throws Throwable
//	{
//		APS18541Steps.verifyBenefitsEligibility();
//	}
//	@Then("^User click on View Additional Eligibility Dates icon and verifies Additional Eligibility Dates$")
//	public void verify_additional_eligibility_dates_details(Map<String,String> addEligblDatesDetails) throws Throwable
//	{
//		APS18541Steps.verifyAdditionalEligibilityDatesDetails(addEligblDatesDetails);
//	}
	@Then("^Verify Eligibility Dates table values$")
	public void Verify_Eligibility_Dates_table_values(Map<String,String> elegibilityTableValues) throws Throwable
	{
		APS18541Steps.verifyEligibilityDatesTableValues(elegibilityTableValues);
	}
}
