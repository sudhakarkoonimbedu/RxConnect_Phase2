package DSTPS.Automation.HybridDesktop.MemberLookupApp.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class MemberLookup_DetailsSelector {

	private By BENEFITSELIGIBILITY_LINK,CLAIM_LINK,FORMULARY_LINK;
	private By PHARMACY_LINK,AUTHORIZATION_LINK,REIMBURSEMENT_LINK;
	private By BENEFITSELIGIBILITY_DETAIL,CLAIM_HISTORY,FORMULARY_DRUGRESULTS;
	private By PHARMACY_RESULTS,AUTHORIZATION_RESULTS,REIMBURSEMENT_RESULTS;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public MemberLookup_DetailsSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		MemberLookup_Details_Objects();
	}
	
	private void MemberLookup_Details_Objects()
	{		
		BENEFITSELIGIBILITY_LINK = By.id("wheelForm:benefitLink");
		CLAIM_LINK = By.id("wheelForm:claimLink");
		FORMULARY_LINK = By.id("wheelForm:formularyLink");
		PHARMACY_LINK = By.id("wheelForm:pharmacyLink");
		AUTHORIZATION_LINK = By.id("wheelForm:authLink");
		REIMBURSEMENT_LINK = By.id("wheelForm:reimbLink");
		BENEFITSELIGIBILITY_DETAIL = By.id("benefitsSelectionForm:benefits");
		CLAIM_HISTORY = By.id("claimSelectionForm:claim-history");
		FORMULARY_DRUGRESULTS = By.id("formularyForm:searchCriteriaValue_input");
		PHARMACY_RESULTS = By.id("pharmacyForm:city");
		AUTHORIZATION_RESULTS = By.id("priorAuthForm:AuthID");
		REIMBURSEMENT_RESULTS = By.id("reimbursementForm:reimbursementAccordionPanel");		
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Member Lookup Select a call category Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void PharmacyLookup_clickOnBenefitsEligibilityLink() throws Throwable{
		utils.ClickOnLink(BENEFITSELIGIBILITY_LINK);
		Thread.sleep(1000);
	}
	
	public void waitUntillBenefitsEligibilityDetail() throws Throwable{
		utils.CheckElementPresenceByLocator(BENEFITSELIGIBILITY_DETAIL);
		Thread.sleep(1000);
	}
	
	public void verifyBenefitsEligibilityDetail(){
		utils.VerifyObjectIsDisplayed(BENEFITSELIGIBILITY_DETAIL);
	}
	
	public void PharmacyLookup_clickOnClaimLink() throws Throwable{
		utils.ClickOnLink(CLAIM_LINK);
		Thread.sleep(1000);
	}
	
	public void waitUntillClaimHistory() throws Throwable{
		utils.CheckElementPresenceByLocator(CLAIM_HISTORY);
		Thread.sleep(1000);
	}
	
	public void verifyClaimHistory(){
		utils.VerifyObjectIsDisplayed(CLAIM_HISTORY);
	}
	
	public void PharmacyLookup_clickOnFormularyLink() throws Throwable{
		utils.ClickOnLink(FORMULARY_LINK);
		Thread.sleep(1000);
	}
	
	public void waitUntillDrugResults() throws Throwable{
		utils.CheckElementPresenceByLocator(FORMULARY_DRUGRESULTS);
		Thread.sleep(1000);
	}
	
	public void verifyDrugResults(){
		utils.VerifyObjectIsDisplayed(FORMULARY_DRUGRESULTS);
	}
	
	public void PharmacyLookup_clickOnPharmacyLink() throws Throwable{
		utils.ClickOnLink(PHARMACY_LINK);
		Thread.sleep(1000);
	}
	
	public void waitUntillPharmacyResults() throws Throwable{
		utils.CheckElementPresenceByLocator(PHARMACY_RESULTS);
		Thread.sleep(1000);
	}
	
	public void verifyPharmacyResults(){
		utils.VerifyObjectIsDisplayed(PHARMACY_RESULTS);
	}
	
	public void PharmacyLookup_clickOnAuthorizationLink() throws Throwable{
		utils.ClickOnLink(AUTHORIZATION_LINK);
		Thread.sleep(1000);
	}
	
	public void waitUntillAuthResults() throws Throwable{
		utils.CheckElementPresenceByLocator(AUTHORIZATION_RESULTS);
		Thread.sleep(1000);
	}
	
	public void verifyAuthResults(){
		utils.VerifyObjectIsDisplayed(AUTHORIZATION_RESULTS);
	}
	
	public void PharmacyLookup_clickOnReimbursementLink() throws Throwable{
		utils.ClickOnLink(REIMBURSEMENT_LINK);
		Thread.sleep(1000);
	}
	
	public void waitUntillReimbursementResults() throws Throwable{
		utils.CheckElementPresenceByLocator(REIMBURSEMENT_RESULTS);
		Thread.sleep(1000);
	}
	
	public void verifyReimbursementResults(){
		utils.VerifyObjectIsDisplayed(REIMBURSEMENT_RESULTS);
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Member Lookup Select a call category Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
