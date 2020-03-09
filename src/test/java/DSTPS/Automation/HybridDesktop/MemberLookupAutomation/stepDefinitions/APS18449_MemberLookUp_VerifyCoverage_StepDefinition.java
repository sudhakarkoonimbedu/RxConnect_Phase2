package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.stepDefinitions;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.Apps.common.LaunchPage_Steps;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps.APS18449_MemberLookUp_VerifyCoverage_Steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class APS18449_MemberLookUp_VerifyCoverage_StepDefinition 
{
	private HybridDesktop_SharedResource SharedResource;	
	private WebDriver driver;
	private RxNova_Utlilty utils;
	public LaunchPage_Steps launchPage_Steps;
	public LandingPage_Steps landingPage_Steps;
	public APS18449_MemberLookUp_VerifyCoverage_Steps verifycoverage_steps;
	
	public APS18449_MemberLookUp_VerifyCoverage_StepDefinition(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable
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
		verifycoverage_steps = new APS18449_MemberLookUp_VerifyCoverage_Steps(SharedResource,utils);	
	}
	
	@When("^User click on Formulary icon in Select a call category page$")
	public void User_click_on_Formulary_icon_in_Select_a_call_category_page() throws Throwable
	{
		verifycoverage_steps.click_on_FormularyLink();
	}
	@Then("^Drug Results Page should be displayed$")
	public void Drug_Results_Page_should_be_displayed() throws Throwable
	{
		verifycoverage_steps.drugResultsPageVerification();
	}
	@And("^Input the required search text and click on search button$") 
	public void Input_the_required_search_text_and_click_on_search_button(Map<String,String> searchDrug) throws Throwable
	{
		verifycoverage_steps.perform_Drug_Search(searchDrug);
	}
	@Then("^Showing drugs with brand name as xanax$")
	public void Showing_drugs_with_brand_name_as_xanax() throws Throwable
	{ 	
		verifycoverage_steps.perform_showingDrugsWithBrandGeneric();		
	}
	@And("^Select the required NDC record$")
	public void Select_the_required_NDC_record(Map<String,String> searchNDC) throws Throwable
	{
		verifycoverage_steps.perform_NDC_Record_Search_Selection(searchNDC);
	}
	@Then("^Click on Verify Coverage button$")
	public void Click_on_Verify_Coverage_button() throws Throwable
	{
		verifycoverage_steps.click_on_verifyCoverage_Button();
	}
	@Then("^Verify Coverage Page should be displayed$")
	public void Verify_Coverage_Page_should_be_displayed() throws Throwable
	{
		verifycoverage_steps.perform_VerifyCoverageVerification();
	}
	@Then("^User should verify the formulary category Drug,Prescriber,Pharmacy details$")
	public void User_should_verify_the_formulary_category_Drug_Prescriber_Pharmacy_details(Map<String,String> formulary_category_DrugValues) throws Throwable
	{
		verifycoverage_steps.verify_ValuesFor_CoverageVerification_DefaultPanel(formulary_category_DrugValues);
	}
	@Then("^Input the required quantity values$")
	public void Input_the_required_quantity_values(Map<String,String> searchInputs) throws Throwable
	{
		verifycoverage_steps.coverageVerification_SearchInputs(searchInputs);
	}
	@Then("^click on Verify Coverage button in Coverage Verification Page$")
	public void click_on_Verify_Coverage_button_in_Coverage_Verification_Page() throws Throwable
	{
		verifycoverage_steps.coverageverification_Click_On_VerifyCoverage_Button();
	}
	@Then("^Coverage Verification Details results should be displayed$")
	public void Coverage_Verification_Details_results_should_be_displayed() throws Throwable
	{
		verifycoverage_steps.coverageverification_GeneralTableDisplay();
	}
	@Then("^Verify General Table Values Under Result Panel$")
	public void Verify_General_Table_Values_Under_Result_Panel(Map<String,String> generalTableValues) throws Throwable
	{
		verifycoverage_steps.coverageVerification_GeneralTable_ResultsPanel(generalTableValues);
	}
	@Then("^Verify Error Table Values in Results Panel$")
	public void Verify_Error_Table_Values_in_Results_Panel(Map<String,String> errorTableValues) throws Throwable
	{
		verifycoverage_steps.coverageVerification_ErrorsTable_ResultPanel(errorTableValues);
	}
	@Then("^Verify TotalRxCost Table Values in MemberCost Panel$")
	public void Verify_TotalRxCost_Table_Values_in_MemberCost_Panel(Map<String,String> totalRxCostTableValues) throws Throwable
	{
		verifycoverage_steps.coverageVerification_TotalRxCostTable_MemberCostPanel(totalRxCostTableValues);
	}
	@Then("^Verify PatientPay Table Values in Member Cost Panel$")
	public void Verify_PatientPay_Table_Values_in_Member_Cost_Panel(Map<String,String> patientPayTableValues) throws Throwable
	{
		verifycoverage_steps.coverageVerification_PatientPayTable_MemberCostPanel(patientPayTableValues);
	}
	@Then("^Verify AppliedAmounts Table Values in Member Cost Panel$")
	public void Verify_AppliedAmounts_Table_Values_in_Member_Cost_Panel(Map<String,String> AppliedAmountsTableValues) throws Throwable
	{
		verifycoverage_steps.coverageVerification_AppliedAmountsTable_MemberCostPanel(AppliedAmountsTableValues);
	}
	@Then("Verify Balances Table Values in Member Cost Panel$")
	public void Verify_Balances_Table_Values_in_Member_Cost_Panel(Map<String,String> BalancesTableValues) throws Throwable
	{
		verifycoverage_steps.coverageVerification_BalancesTable_MemberCostPanel(BalancesTableValues);
	}
}
