package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.stepDefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_Details_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps.APS33512_MemberLookup_Verify_BenefitsAndEligibility_MedicalBenefit_Steps;
import cucumber.api.java.en.Then;

public class APS33512_MemberLookup_Verify_BAE_MedicalBenefit_StepDefinition 
{
	private HybridDesktop_SharedResource SharedResource;
	private RxNova_Utlilty utils;
	private WebDriver driver;
	
	public MemberLookup_Details_Steps memberLookup_Details_Steps;
	public APS33512_MemberLookup_Verify_BenefitsAndEligibility_MedicalBenefit_Steps medicalbenefit_Steps;
	
	public APS33512_MemberLookup_Verify_BAE_MedicalBenefit_StepDefinition(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable
	{
		this.SharedResource = SharedResource;
		this.utils = utils;
		driver = SharedResource.getDriver();
		init();
	}
	public void init() throws Throwable
	{
		memberLookup_Details_Steps = new MemberLookup_Details_Steps(SharedResource,utils);
		medicalbenefit_Steps = new APS33512_MemberLookup_Verify_BenefitsAndEligibility_MedicalBenefit_Steps(SharedResource,utils);
	}
	
	@Then("^User click on Medical Benefit$")
	public void user_click_on_medical_benefit_tab() throws Throwable
	{
		memberLookup_Details_Steps.verifyBenefitsEligibility();		
		medicalbenefit_Steps.clickOnMedicalBenefit();		
	}
	
	@Then("^User verifies Medical Benefit HRA details$")
	public void user_verifies_medical_benefit_hra_details(Map<String,String> HRADetails) throws Throwable
	{
		medicalbenefit_Steps.verifyMedicalBenefitDetails(HRADetails);
	}
	
	@Then("^User click on FSA radioButton and Verify FSA details$") 
	public void user_click_on_fsa_radiobutton_and_verify_fsa_details(Map<String,String> FSADetails) throws Throwable
	{
		medicalbenefit_Steps.verifyMedicalBenefitDetails(FSADetails);
	}
	
	@Then("^User click on HSA radioButton and Verify HSA details$") 
	public void user_click_on_hsa_radiobutton_and_verify_hsa_details(Map<String,String> HSADetails) throws Throwable
	{
		medicalbenefit_Steps.verifyMedicalBenefitDetails(HSADetails);
	}
	
	@Then("User click on ADJ radioButton and Verify ADJ details$") 
	public void user_click_on_adj_radiobutton_and_verify_adj_details(Map<String,String> ADJDetails) throws Throwable
	{
		medicalbenefit_Steps.verifyMedicalBenefitDetails(ADJDetails);
	}
	
	@Then("^User click on SPAP radioButton and Verify SPAP details$") 
	public void user_click_on_spap_radiobutton_and_verify_spap_details(Map<String,String> SPAPDetails) throws Throwable
	{
		medicalbenefit_Steps.verifyMedicalBenefitDetails(SPAPDetails);
	}
			
}
