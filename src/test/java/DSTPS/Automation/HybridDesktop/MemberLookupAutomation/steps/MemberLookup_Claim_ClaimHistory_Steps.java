package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.MemberLookup_Claim_ClaimHistorySelector;

public class MemberLookup_Claim_ClaimHistory_Steps {

	MemberLookup_Claim_ClaimHistorySelector memberLookup_Claim_ClaimHistorySelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	 	
	public MemberLookup_Claim_ClaimHistory_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		memberLookup_Claim_ClaimHistorySelector = new MemberLookup_Claim_ClaimHistorySelector(SharedResource,utils);
	}
	
		
	public void verifyClaimHistory() throws Throwable{
		memberLookup_Claim_ClaimHistorySelector.MemberLookup_Claim_verifyPresenceOfFillDateFrom();
		memberLookup_Claim_ClaimHistorySelector.MemberLookup_Claim_verifyPresenceOfFillDateTo();
		memberLookup_Claim_ClaimHistorySelector.MemberLookup_Claim_verifyPresenceOfClientID();
		memberLookup_Claim_ClaimHistorySelector.MemberLookup_Claim_verifyPresenceOfClaimId();
		memberLookup_Claim_ClaimHistorySelector.MemberLookup_Claim_verifyPresenceOfRxNumber();
		memberLookup_Claim_ClaimHistorySelector.MemberLookup_Claim_verifyPresenceOfQty();
		memberLookup_Claim_ClaimHistorySelector.MemberLookup_Claim_verifyPresenceOfDaysSupply();
		memberLookup_Claim_ClaimHistorySelector.MemberLookup_Claim_verifyPresenceOfType();
		memberLookup_Claim_ClaimHistorySelector.MemberLookup_Claim_verifyPresenceOfClaimStatus();
		memberLookup_Claim_ClaimHistorySelector.MemberLookup_Claim_verifyPresenceOfPharmacyName();		
	}
	
	public void clickOnClaimHistoryMemberId() throws Throwable{
		memberLookup_Claim_ClaimHistorySelector.MemberLookup_Claim_clickOnClaimHistoryMemberId();
//		pharmacyLookup_Claim_ClaimRawDataSelector.waitUnitillClaimRawData();
	}
	 	 	 
}

