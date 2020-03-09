package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class MemberLookup_Claim_ClaimHistorySelector {

	private By FILLDATE_FROM,FILLDATE_TO,CLIENT_ID,CLAIM_ID,RX_NUMBER,QTY,DAYS_SUPPLY,TYPE,CLAIM_STATUS,PHARMACY_NAME;
	private By CLAIM_HISTORY_MEMEBER_ID_LINK;	 
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actClaimHistory = new ArrayList<String>();
	
	public MemberLookup_Claim_ClaimHistorySelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		MemberLookup_Member_ClaimHistory_Objects();
	}
	
	private void MemberLookup_Member_ClaimHistory_Objects()
	{		
		FILLDATE_FROM = By.xpath("//input[@id='claimSelectionForm:claimFilterTable:fillFromDate']");
		FILLDATE_TO = By.xpath("//input[@id='claimSelectionForm:claimFilterTable:fillToDate']");					 
		CLIENT_ID = By.xpath("//input[@id='claimSelectionForm:claimFilterTable:clientId']");
		CLAIM_ID = By.xpath("//input[@id='claimSelectionForm:claimFilterTable:claimId']");
		RX_NUMBER = By.xpath("//input[@id='claimSelectionForm:claimFilterTable:rxNumber']");
		QTY = By.xpath("//input[@id='claimSelectionForm:claimFilterTable:ucfMetricQty']");
		DAYS_SUPPLY = By.xpath("//input[@id='claimSelectionForm:claimFilterTable:ucfDaysSupply']");
		TYPE = By.xpath("//select[@id='claimSelectionForm:claimFilterTable:type']");
		CLAIM_STATUS = By.xpath("//select[@id='claimSelectionForm:claimFilterTable:cliamStaus']");
		PHARMACY_NAME = By.xpath("//input[@id='claimSelectionForm:claimFilterTable:pharmacyName']");
		CLAIM_HISTORY_MEMEBER_ID_LINK = By.id("claimSelectionForm:claimResultTable:0:claimDetailLink");		
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Claim History Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	
	public void MemberLookup_Claim_verifyPresenceOfFillDateFrom() throws Throwable{
		utils.VerifyElementPresence(FILLDATE_FROM);
		Thread.sleep(1000);
	}
	
	public void MemberLookup_Claim_verifyPresenceOfFillDateTo() throws Throwable{
		utils.VerifyElementPresence(FILLDATE_TO);
		Thread.sleep(1000);
	}
	
	public void MemberLookup_Claim_verifyPresenceOfClientID() throws Throwable{
		utils.VerifyElementPresence(CLIENT_ID);
		Thread.sleep(1000);
	}
	
	public void MemberLookup_Claim_verifyPresenceOfClaimId() throws Throwable{
		utils.VerifyElementPresence(CLAIM_ID);
		Thread.sleep(1000);
	}
	
	public void MemberLookup_Claim_verifyPresenceOfRxNumber() throws Throwable{
		utils.VerifyElementPresence(RX_NUMBER);
		Thread.sleep(1000);
	}
	
	public void MemberLookup_Claim_verifyPresenceOfQty() throws Throwable{
		utils.VerifyElementPresence(QTY);
		Thread.sleep(1000);
	}
	
	public void MemberLookup_Claim_verifyPresenceOfDaysSupply() throws Throwable{
		utils.VerifyElementPresence(DAYS_SUPPLY);
		Thread.sleep(1000);
	}
	
	public void MemberLookup_Claim_verifyPresenceOfType() throws Throwable{
		utils.VerifyElementPresence(TYPE);
		Thread.sleep(1000);
	}
	
	public void MemberLookup_Claim_verifyPresenceOfClaimStatus() throws Throwable{
		utils.VerifyElementPresence(CLAIM_STATUS);
		Thread.sleep(1000);
	}
	
	public void MemberLookup_Claim_verifyPresenceOfPharmacyName() throws Throwable{
		utils.VerifyElementPresence(PHARMACY_NAME);
		Thread.sleep(1000);
	}
	
	public void MemberLookup_Claim_clickOnClaimHistoryMemberId() throws Throwable{
		utils.ClickOnLink(CLAIM_HISTORY_MEMEBER_ID_LINK);
		Thread.sleep(1000);
	}
	
	 
 	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Claim History Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
