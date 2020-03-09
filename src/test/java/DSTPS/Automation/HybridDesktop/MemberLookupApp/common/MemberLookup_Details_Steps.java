package DSTPS.Automation.HybridDesktop.MemberLookupApp.common;

import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;

public class MemberLookup_Details_Steps {

	MemberLookup_DetailsSelector memberLookup_DetailsSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public static ArrayList<String> expMemberDetails = new ArrayList<String>();
	public static ArrayList<String> expSubmittedInformation = new ArrayList<String>();
	public static ArrayList<String> expHeaderSummary = new ArrayList<String>();
	public static SoftAssert soft = new SoftAssert();
	
	public MemberLookup_Details_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		memberLookup_DetailsSelector = new MemberLookup_DetailsSelector(SharedResource,utils);
	}
	
	public void clickOnBenefitsEligibility() throws Throwable{
		memberLookup_DetailsSelector.PharmacyLookup_clickOnBenefitsEligibilityLink();		
	}
	
	public void verifyBenefitsEligibility() throws Throwable{
		memberLookup_DetailsSelector.waitUntillBenefitsEligibilityDetail();
		memberLookup_DetailsSelector.verifyBenefitsEligibilityDetail();
	}
	
	public void clickOnClaim() throws Throwable{
		memberLookup_DetailsSelector.PharmacyLookup_clickOnClaimLink();		
	}
	
	public void verifyClaim() throws Throwable{
		memberLookup_DetailsSelector.waitUntillClaimHistory();
		memberLookup_DetailsSelector.verifyClaimHistory();
	}
	
	public void clickOnFormulary() throws Throwable{
		memberLookup_DetailsSelector.PharmacyLookup_clickOnFormularyLink();		
	}
	
	public void verifyFormulary() throws Throwable{
		memberLookup_DetailsSelector.waitUntillDrugResults();
		memberLookup_DetailsSelector.verifyDrugResults();
	}
	
	public void clickOnPharmacy() throws Throwable{
		memberLookup_DetailsSelector.PharmacyLookup_clickOnPharmacyLink();		
	}
	
	public void verifyPharmacyResults() throws Throwable{
		memberLookup_DetailsSelector.waitUntillPharmacyResults();
		memberLookup_DetailsSelector.verifyPharmacyResults();
	}	
	
	public void clickOnAuthorization() throws Throwable{
		memberLookup_DetailsSelector.PharmacyLookup_clickOnAuthorizationLink();		
	}
	
	public void verifyAuthorization() throws Throwable{
		memberLookup_DetailsSelector.waitUntillAuthResults();
		memberLookup_DetailsSelector.verifyAuthResults();
	}
	
	public void clickOnReimbursement() throws Throwable{
		memberLookup_DetailsSelector.PharmacyLookup_clickOnReimbursementLink();		
	}
	
	public void verifyReimbursement() throws Throwable{
		memberLookup_DetailsSelector.waitUntillReimbursementResults();
		memberLookup_DetailsSelector.verifyReimbursementResults();		
	}	

}

