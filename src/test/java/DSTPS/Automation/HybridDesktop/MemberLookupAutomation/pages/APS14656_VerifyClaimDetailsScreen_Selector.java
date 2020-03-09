package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;

public class APS14656_VerifyClaimDetailsScreen_Selector 
{
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	private By SEARCH_PHARMACYLOOKUP_PHARMACYNPI;
	private By SEARCH_PHARMACYLOOKUP_RXNUMBER;
	private By SEARCH_PHARMACYLOOKUP_START_DATE;
	private By SEARCH_BUTTON;
	private By SEARCH_RESULTS_TABLE;
	private By SEARRCH_RESULT_TABLE_PLAYLINK;
	private By PLAY_BUTTON_ON_MEMBERID_AT_PHARMACYLOOKUP;
	private By HEADER_TITLE_CLAIMDETAIL;//h2[@class='center title' and text()='Claim Detail']
	
	
	public ArrayList<String> actMemberDetails = new ArrayList<String>();
	
	public APS14656_VerifyClaimDetailsScreen_Selector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable
	{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	public void init() throws Throwable
	{
		SEARCH_PHARMACYLOOKUP_PHARMACYNPI = By.id("pharmacyCallCenterSearchForm:pharmacyNPI");
		SEARCH_PHARMACYLOOKUP_RXNUMBER = By.id("pharmacyCallCenterSearchForm:rxNumber");
		SEARCH_PHARMACYLOOKUP_START_DATE = By.id("pharmacyCallCenterSearchForm:startDate");
		SEARCH_BUTTON =By.id("pharmacyCallCenterSearchForm:btnSearch");
		SEARCH_RESULTS_TABLE = By.id("pharmacySearchResultForm:pharmacySearchResultTable");
		SEARRCH_RESULT_TABLE_PLAYLINK = By.id("pharmacySearchResultForm:pharmacySearchResultTable:0:claimRawDataAndErrorInfoLink");
		PLAY_BUTTON_ON_MEMBERID_AT_PHARMACYLOOKUP = By.id("pharmacySearchResultForm:pharmacySearchResultTable:3:claimDetailLink");
		HEADER_TITLE_CLAIMDETAIL= By.xpath("h2[@class='center title' and text()='Claim Detail']");
	}
	
	public void PharmacyLookup_LandingPage_enterPharmacy_NPI(String strPharmacyNPI) throws Throwable
	{
		if(!strPharmacyNPI.isEmpty())
		{
		utils.SetTextOnEdit(SEARCH_PHARMACYLOOKUP_PHARMACYNPI, strPharmacyNPI);
		}
	}
	public void PharmacyLookup_LandingPage_enterRx_Number(String strRxNumber) throws Throwable
	{
		if(!strRxNumber.isEmpty())
		{
		utils.SetTextOnEdit(SEARCH_PHARMACYLOOKUP_RXNUMBER, strRxNumber);
		}
	}
	public void PharmacyLookup_LandingPage_enterStartDate(String strStartDate) throws Throwable
	{
		if(!strStartDate.isEmpty())
		{
			utils.SetTextOnEdit(SEARCH_PHARMACYLOOKUP_START_DATE, strStartDate);
		}
	}
    public void PharmacyLookup_LandingPage_clickOnSearchButton() throws Throwable
    {
		utils.ClickOnButton(SEARCH_BUTTON);
		utils.GetBusyStatus();
		Thread.sleep(3000);
	}
    public void waitUntillPharmacySearchResults() throws Throwable
    {
		utils.CheckElementPresenceByLocator(SEARCH_RESULTS_TABLE);
		Thread.sleep(1000);
	}	
	public void verifyPharmacySearchResults() throws Throwable
	{
		utils.VerifyObjectIsDisplayed(SEARCH_RESULTS_TABLE);
	}
	public void Member_Details_MemberID(String strMemberID) throws Throwable
	{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strMemberID));
	}	
	public void Member_Details_DateOfBirth(String strDateOfBirth) throws Throwable
	{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strDateOfBirth));
	}	
	public void Member_Details_MemberName(String strMemberName) throws Throwable
	{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strMemberName));
	}	
	public void Member_Details_Error(String strError) throws Throwable
	{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strError));
	}	
	public void Member_Details_Date(String strDate) throws Throwable
	{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strDate));
	}	
	public void Member_Details_Time(String strTime) throws Throwable
	{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strTime));
	}	
	public void Member_Details_CICSStatus(String strCICSStatus) throws Throwable
	{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strCICSStatus));
	}	
	public void Member_Details_CustID(String strCustID) throws Throwable
	{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strCustID));
	}	
	public void Member_Details_ClientID(String strClientID) throws Throwable
	{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strClientID));
	}	
	public void Member_Details_Group(String strGroup) throws Throwable
	{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strGroup));
	}
	public void perform_Click_On_PlayButton() throws Throwable
	{
		utils.ClickOnLink(SEARRCH_RESULT_TABLE_PLAYLINK);
		utils.GetBusyStatus();
		Thread.sleep(3000);
	}
	public void perform_Click_On_PlayButton_On_MembeID_At_PharmacyLookup() throws Throwable
	{
		utils.ClickOnLink(PLAY_BUTTON_ON_MEMBERID_AT_PHARMACYLOOKUP);
		utils.GetBusyStatus();
		Thread.sleep(3000);
	}
	public void verify_ClaimDetailsPage() throws Throwable
	{
		utils.CheckElementPresenceByLocator(HEADER_TITLE_CLAIMDETAIL);
		utils.GetBusyStatus();
		Thread.sleep(3000);
	}
}
