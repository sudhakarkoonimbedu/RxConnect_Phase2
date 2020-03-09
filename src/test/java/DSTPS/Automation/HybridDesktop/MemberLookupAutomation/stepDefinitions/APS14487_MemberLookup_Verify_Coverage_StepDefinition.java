package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.Apps.common.LaunchPage_Steps;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps.APS14487_MemberLookup_VerifyCoverage_Steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class APS14487_MemberLookup_Verify_Coverage_StepDefinition
{
	private HybridDesktop_SharedResource SharedResource;
	@SuppressWarnings("unused")
	private WebDriver driver;
	private RxNova_Utlilty utils;
	public LaunchPage_Steps launchPage_Steps;
	public LandingPage_Steps landingPage_Steps;
	public APS14487_MemberLookup_VerifyCoverage_Steps verifycoverage_steps;
	
	
	public APS14487_MemberLookup_Verify_Coverage_StepDefinition(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable
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
		verifycoverage_steps = new APS14487_MemberLookup_VerifyCoverage_Steps(SharedResource,utils);	
	}	

	@Given("^Ensure User is in Select a call category page$") 
	  public void Ensure_User_is_in_Select_a_call_category_page() throws Throwable 
	  {
		  verifycoverage_steps.verifyMemberLookupDetail(); 
	  }
	 
	@When("^User click on Claim icon in Select a call category page$")
	public void user_click_on_claim_icon_in_Select_a_call_category_page() throws Throwable
	{
		verifycoverage_steps.clickOnClaimLink();
	}
	@Then("^Claim History Page should be displayed$")
	public void Claim_History_Page_should_be_displayed() throws Throwable
	{		 
		verifycoverage_steps.verifyClaimHistory();	
	}
	@And("^User click on Blue arrow at claim table in Claim History page$") //  
	public void User_click_on_Blue_arrow_at_claim_table_in_Claim_History_page(Map<String,String> claiminputLink) throws Throwable{
		verifycoverage_steps.claimhistory_ClickOnCliamBlueArrowLink(claiminputLink);		
	}
	@Then("^Claim details Page should be displayed$")
	public void Claim_details_Page_should_be_displayed() throws Throwable
	{
		verifycoverage_steps.verifyClaimDetails();
	}
	@Then("^User navigates to Verify Coverage page by clicking the VerifyCoverage button$")
	public void User_navigates_to_Verify_Coverage_page_by_clicking_the_VerifyCoverage_button() throws Throwable
	{
		verifycoverage_steps.naigateToVerifyCoveragePage();		
	}
	@Then("^Verify Coverage Page Should be displayed$")
	public void Verify_Coverage_Page_Should_be_displayed() throws Throwable
	{
		verifycoverage_steps.verify_VerifyCoverage_Page();
	}
	@Given("^Ensure user is in Verify Coverage Page$")
	public void Ensure_user_is_in_Verify_Coverage_Page() throws Throwable
	{
		verifycoverage_steps.verify_VerifyCoverage_Page();
	}
	@Then("^Verify the Calim Drug Deatails$")
	public void Verify_the_Calim_Drug_Deatails(Map<String,String> Claim_Drug_Details) throws Throwable
	{
		verifycoverage_steps.verifyClaim_Drug_Details(Claim_Drug_Details);
	}
	@Then("^Verify General Table Values Under Results Panel$")
	public void Verify_General_Table_Values_Under_Results_Panel(Map<String,String> General_Table_Results_Panel) throws Throwable
	{
		verifycoverage_steps.verify_ValuesFor_GeneralTable_ResultsPanel_(General_Table_Results_Panel);
	}
	@Then("^Verify Error Table Values Under Results Panel$")
	public void Verify_Error_Table_Values_Under_Results_Panel(Map<String,String> Errors_Table_Results_Panel) throws Throwable
	{
		verifycoverage_steps.verify_ValuesFor_ErrorsTable_ResultPanel(Errors_Table_Results_Panel);
	}
	@Then("^Verify TotalRxCost Table Values Under MemberCost Panel$")
	public void Verify_TotalRxCost_Table_Values_Under_MemberCost_Panel(Map<String,String> TotalRxCost) throws Throwable
	{
		verifycoverage_steps.verify_ValuesFor_TotalRxCostTable_MemberCostPanel(TotalRxCost);
	}
	@Then("^Verify PatientPay Table Values Under MemberCost Panel$")
	public void Verify_PatientPay_Table_Values_Under_MemberCost_Panel(Map<String,String> PatientPay) throws Throwable
	{
		verifycoverage_steps.verify_ValueFor_PatientPayTable_MemberCostPanel(PatientPay);
	}
	@Then("^Verify AppliedAmounts Table Values Under MemberCost Panel$")
	public void Verify_Applied_Amounts_Table_Values_Under_MemberCost_Panel(Map<String,String> AppliedAmounts) throws Throwable
	{
		verifycoverage_steps.verify_ValueFor_AppliedAmountsTable_MemberCostPanel(AppliedAmounts);
	}
	@Then("^Verify Balances Table Values Under MemberCost Panel$")
	public void Verify_Balances_Table_Values_Under_MemberCost_Panel(Map<String,String> Balances) throws Throwable
	{
		verifycoverage_steps.verify_ValueFor_BalancesTable_MemberCostPanel(Balances);
	}
	@Then("^User should verify the Drug,Prescriber,Pharmacy details$")
	public void User_should_verify_the_Drug_Prescriber_Pharmacy_details(Map<String,String>cv_panel_Validation) throws Throwable
	{
		verifycoverage_steps.verify_ValuesFor_CoverageVerification_DefaultPanel(cv_panel_Validation);
	}
	@Then("^Input the required quantity details$")
	public void Input_the_required_quantity_details(Map<String,String> cv_Search_Inputs) throws Throwable
	{
		verifycoverage_steps.coverageVerification_SearchInputs(cv_Search_Inputs);
	}
	@Then("^click on Verify Coverage button in Coverage Verification Panel$") 
	public void click_on_Verify_Coverage_button_in_Coverage_Verification_Panel() throws Throwable
	{
		verifycoverage_steps.coverageverification_Click_On_VerifyCoverage_Button();
	}
	@Then("^Coverage Verification Details should be displayed$")
	public void Coverage_Verification_Details_should_be_displayed() throws Throwable
	{
		verifycoverage_steps.coverageverification_GeneralTableDisplay();
	}
	@Then("^Verify General Table Values for Coverage Verification$")
	public void Verify_General_Table_Values_for_Coverage_Verification(Map<String,String> cv_generalTableValues) throws Throwable
	{
		verifycoverage_steps.coverageVerification_GeneralTable_ResultsPanel_(cv_generalTableValues);
	}
	@Then("^Verify Error Table Values for Coverage Verification$")
	public void Verify_Error_Table_Values_for_Coverage_Verification(Map<String,String> cv_errorTableValues) throws Throwable
	{
		verifycoverage_steps.coverageVerification_ErrorsTable_ResultPanel(cv_errorTableValues);
	}
	@Then("^Verify TotalRxCost Table Values for Coverage Verification$")
	public void Verify_TotalRxCost_Table_Values_for_Coverage_Verification(Map<String,String> cv_totalrxcostTableValues) throws Throwable
	{
		verifycoverage_steps.coverageVerification_TotalRxCostTable_MemberCostPanel(cv_totalrxcostTableValues);
	}
	@Then("^Verify PatientPay Table Values for Coverage Verification$")
	public void Verify_PatientPay_Table_Values_for_Coverage_Verification(Map<String,String> cv_patientpayTableValues) throws Throwable
	{
		verifycoverage_steps.coverageVerification_PatientPayTable_MemberCostPanel(cv_patientpayTableValues);
	}
	@Then("^Verify AppliedAmounts Table Values for Coverage Verification$")
	public void Verify_AppliedAmounts_Table_Values_for_Coverage_Verification(Map<String,String> cvappliedAmountsTableValues) throws Throwable
	{
		verifycoverage_steps.coverageVerification_AppliedAmountsTable_MemberCostPanel(cvappliedAmountsTableValues);
	}
	@Then("^Verify Balances Table Values for Coverage Verification$")
	public void Verify_Balances_Table_Values_for_Coverage_Verification(Map<String,String> cv_BalanceTableValues) throws Throwable
	{
		verifycoverage_steps.coverageVerification_BalancesTable_MemberCostPanel(cv_BalanceTableValues);
	}
}
