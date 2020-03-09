package DSTPS.Automation.HybridDesktop.MemberLookupApp.common;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class MemberLookup_LandingPageSelector {

	private By SEARCH_MEMBERLOOKUP_CUSTOMERSET,SEARCH_MEMBERLOOKUP_CUSTOMER;
	private By SEARCH_MEMBERLOOKUP_MEMBERID,SEARCH_MEMBERLOOKUP_ALTID;
	private By SEARCH_MEMBERLOOKUP_EXACTMATCH,SEARCH_MEMBERLOOKUP_FIRSTNAME;
	private By SEARCH_MEMBERLOOKUP_MI,SEARCH_MEMBERLOOKUP_LASTNAME,SEARCH_MEMBERLOOKUP_DOB;
	private By SEARCH_MEMBERLOOKUP_CLAIMID,SEARCH_BUTTON;
	private By CALLNOTES_BUTTON,CALLNOTES_DETAIL;
	private By SEARCH_RESULTS_TABLE,CUSTOMER_ID,CUSTOMERSET_DETAILS_TABLE;
	private By MEMBER_DETAILS_TABLE,RELATIONSHIPCODE_DETAILS_TABLE,ADDRESS_DETAILS_TABLE;
	private By CITY_DETAILS_TABLE,CUSTOMER_LINK,HEADER_SUMMARY;
	private By CLAIMTEST_BUTTON,CUSTOMERSET;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actMemberDetails = new ArrayList<String>();
	public ArrayList<String> actMemberIDDetails = new ArrayList<String>();
	public ArrayList<String> actHeaderSummary = new ArrayList<String>();
	
	public MemberLookup_LandingPageSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		MemberLookup_LandingPage_Objects();
	}
	
	private void MemberLookup_LandingPage_Objects()
	{		
		SEARCH_MEMBERLOOKUP_CUSTOMERSET = By.id("memberCallCenterSearchForm:customerSet");
		SEARCH_MEMBERLOOKUP_CUSTOMER = By.id("memberCallCenterSearchForm:customer");
		SEARCH_MEMBERLOOKUP_MEMBERID = By.id("memberCallCenterSearchForm:memberId");
		SEARCH_MEMBERLOOKUP_ALTID = By.id("memberCallCenterSearchForm:altId");
		SEARCH_MEMBERLOOKUP_EXACTMATCH = By.id("memberCallCenterSearchForm:exactMatch");
		SEARCH_MEMBERLOOKUP_FIRSTNAME = By.id("memberCallCenterSearchForm:firstName");
		SEARCH_MEMBERLOOKUP_MI = By.id("memberCallCenterSearchForm:mi");
		SEARCH_MEMBERLOOKUP_LASTNAME = By.id("memberCallCenterSearchForm:lastName");
		SEARCH_MEMBERLOOKUP_DOB = By.id("memberCallCenterSearchForm:dateOfBirth");
		SEARCH_MEMBERLOOKUP_CLAIMID = By.id("memberCallCenterSearchForm:claimId");
		SEARCH_BUTTON =By.id("memberCallCenterSearchForm:btnSearch");
		CALLNOTES_BUTTON = By.xpath("//div[@id='memberCallCenterSearchResultForm:memberCallCenterSearchResultTable']//tbody/tr[1]/td[11]//button");
		CALLNOTES_DETAIL = By.id("callNotesForm:callNotesTable");
		SEARCH_RESULTS_TABLE = By.id("memberCallCenterSearchResultForm:memberCallCenterSearchResultTable");
		CUSTOMER_ID = By.xpath("//div[@id='memberCallCenterSearchResultForm:memberCallCenterSearchResultTable']//tbody/tr[1]/td[2]");
		CUSTOMERSET_DETAILS_TABLE = By.xpath("//table[@class='search-result-tbl-r1 word-break-tbl']");
		MEMBER_DETAILS_TABLE = By.xpath("//table[@class='search-result-tbl-r2 word-break-tbl']");
		RELATIONSHIPCODE_DETAILS_TABLE = By.xpath("//table[@class='search-result-tbl-r3 word-break-tbl']");
		ADDRESS_DETAILS_TABLE = By.xpath("//table[@class='search-result-addr-tbl-r1 word-break-tbl']");
		CITY_DETAILS_TABLE = By.xpath("//table[@class='search-result-addr-tbl-r2 word-break-tbl']");
		CUSTOMER_LINK = By.xpath("//div[@id='memberCallCenterSearchResultForm:memberCallCenterSearchResultTable']//tbody/tr[1]/td[1]");
		HEADER_SUMMARY = By.xpath("//table[@class='fl docked-info-tbl word-break-tbl']");
		CLAIMTEST_BUTTON = By.xpath("//span[text()='Claim History']");
		CUSTOMERSET = By.id("memberCallCenterSearchForm:customerSet");
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Member Lookup Landing Page Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void MemberLookup_LandingPage_selectCustomerSet(String strCustomerSet) throws Throwable{
		if(!strCustomerSet.isEmpty())
		{
		utils.SelectItemFromWebList(SEARCH_MEMBERLOOKUP_CUSTOMERSET,strCustomerSet);
		Thread.sleep(1000);
		}
	}
	
	public void MemberLookup_LandingPage_selectCustomer(String strCustomer) throws Throwable{
		if(!strCustomer.isEmpty())
		{
		utils.SelectItemFromWebList(SEARCH_MEMBERLOOKUP_CUSTOMER,strCustomer);
		Thread.sleep(1000);
		}
	}
	
	public void MemberLookup_LandingPage_enterMember_ID(String strMemberID) throws Throwable{
		if(!strMemberID.isEmpty())
		{
		utils.SetTextOnEdit(SEARCH_MEMBERLOOKUP_MEMBERID,strMemberID);
		Thread.sleep(1000);
		}
	}
	
	public void MemberLookup_LandingPage_enterAlt_ID(String strAltID) throws Throwable{
		if(!strAltID.isEmpty())
		{
		utils.SetTextOnEdit(SEARCH_MEMBERLOOKUP_ALTID,strAltID);
		Thread.sleep(1000);
		}
	}
	
	public void MemberLookup_LandingPage_selectExactMatch(String strExactMatch) throws Throwable{
		if(!strExactMatch.isEmpty())
		{
		utils.SelectCheckBox(SEARCH_MEMBERLOOKUP_EXACTMATCH);
		Thread.sleep(1000);
		}
	}
	
	public void MemberLookup_LandingPage_enterFirst_Name(String strFirstName) throws Throwable{
		if(!strFirstName.isEmpty())
		{
		utils.SetTextOnEdit(SEARCH_MEMBERLOOKUP_FIRSTNAME,strFirstName);
		Thread.sleep(1000);
		}
	}
	
	public void MemberLookup_LandingPage_enterMI(String strMI) throws Throwable{
		if(!strMI.isEmpty())
		{
		utils.SetTextOnEdit(SEARCH_MEMBERLOOKUP_MI,strMI);
		Thread.sleep(1000);
		}
	}
	
	public void MemberLookup_LandingPage_enterLast_Name(String strLastName) throws Throwable{
		if(!strLastName.isEmpty())
		{
		utils.SetTextOnEdit(SEARCH_MEMBERLOOKUP_LASTNAME,strLastName);
		Thread.sleep(1000);
		}
	}
	
	public void MemberLookup_LandingPage_enterDOB(String strDOB) throws Throwable{
		if(!strDOB.isEmpty())
		{
		utils.SetTextOnEdit(SEARCH_MEMBERLOOKUP_DOB,strDOB);
		Thread.sleep(1000);
		}
	}
	
	public void MemberLookup_LandingPage_enterClaim_ID(String strClaimID) throws Throwable{
		if(!strClaimID.isEmpty())
		{
		utils.SetTextOnEdit(SEARCH_MEMBERLOOKUP_CLAIMID,strClaimID);
		Thread.sleep(1000);
		}
	}
	
    public void MemberLookup_LandingPage_clickOnSearchButton() throws Throwable{
		utils.ClickOnButton(SEARCH_BUTTON);
		utils.GetBusyStatus();
	}
    
	public void waitUntillMemberSearchResults() throws Throwable{
		utils.CheckElementPresenceByLocator(SEARCH_RESULTS_TABLE);
		Thread.sleep(1000);
	}
	
	public void verifyMemberSearchResults() throws Throwable{
		utils.VerifyObjectIsDisplayed(SEARCH_RESULTS_TABLE);
	}
	
	public void Member_Details_Customer(String strCustomer) throws Throwable{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strCustomer));
	}
	
	public void Member_Details_MemberID(String strMemberID) throws Throwable{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strMemberID));
	}
	
	public void Member_Details_AltMemberID(String strAltMemberID) throws Throwable{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strAltMemberID));
	}
	
	public void Member_Details_FirstName(String strFirstName) throws Throwable{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strFirstName));
	}
	
	public void Member_Details_LastName(String strLastName) throws Throwable{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strLastName));
	}
	
	public void Member_Details_MI(String strMI) throws Throwable{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strMI));
	}
	
	public void Member_Details_DateOfBirth(String strDOB) throws Throwable{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strDOB));
	}
	
	public void Member_Details_StartDate(String strStartDate) throws Throwable{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strStartDate));
	}
	
	public void Member_Details_EndDate(String strEndDate) throws Throwable{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strEndDate));
	}
	
	public void Member_Details_ClickOnCustomer() throws Throwable{
		utils.ClickOnButton(CUSTOMER_ID);
		utils.GetBusyStatus();
	}
	
	public void waitUntillCustomerSetDetails() throws Throwable{
		utils.CheckElementPresenceByLocator(CUSTOMERSET_DETAILS_TABLE);
		Thread.sleep(1000);
	}
	
	public void MemberID_Details_CustomerSet(String strCustomerSet) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(CUSTOMERSET_DETAILS_TABLE,strCustomerSet));
	}
	
	public void MemberID_Details_Customer(String strCustomer) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(CUSTOMERSET_DETAILS_TABLE,strCustomer));
	}
	
	public void MemberID_Details_Client(String strClient) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(CUSTOMERSET_DETAILS_TABLE,strClient));
	}
	
	public void MemberID_Details_Group(String strGroup) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(CUSTOMERSET_DETAILS_TABLE,strGroup));
	}
	
	public void MemberID_Details_StartDate(String strStartDate) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(CUSTOMERSET_DETAILS_TABLE,strStartDate));
	}
	
	public void MemberID_Details_EndDate(String strEndDate) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(CUSTOMERSET_DETAILS_TABLE,strEndDate));
	}
	
	public void MemberID_Details_MemberID(String strMemberID) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEMBER_DETAILS_TABLE,strMemberID));
	}
	
	public void MemberID_Details_AltMemberID(String strAltMemberID) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEMBER_DETAILS_TABLE,strAltMemberID));
	}
	
	public void MemberID_Details_FirstName(String strFirstName) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEMBER_DETAILS_TABLE,strFirstName));
	}
	
	public void MemberID_Details_LastName(String strLastName) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEMBER_DETAILS_TABLE,strLastName));
	}
	
	public void MemberID_Details_DateOfBirth(String strDOB) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEMBER_DETAILS_TABLE,strDOB));
	}
	
	public void MemberID_Details_Gender(String strGender) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(MEMBER_DETAILS_TABLE,strGender));
	}
	
	public void MemberID_Details_RelationshipCode(String strRelationshipCode) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(RELATIONSHIPCODE_DETAILS_TABLE,strRelationshipCode));
	}
	
	public void Address_Details_Line1(String strLine1) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(ADDRESS_DETAILS_TABLE,strLine1));
	}
	
	public void Address_Details_Phone(String strPhone) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(ADDRESS_DETAILS_TABLE,strPhone));
	}
	
	public void Address_Details_Line2(String strLine2) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(ADDRESS_DETAILS_TABLE,strLine2));
	}
	
	public void Address_Details_City(String strCity) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(CITY_DETAILS_TABLE,strCity));
	}
	
	public void Address_Details_State(String strState) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(CITY_DETAILS_TABLE,strState));
	}
	
	public void Address_Details_ZIP(String strZIP) throws Throwable{
		actMemberIDDetails.add(utils.RxNovaConnect_WebTable_VerifyRowData(CITY_DETAILS_TABLE,strZIP));
	}
		
	public void Member_Details_ClickOnCustomerLink() throws Throwable{
		utils.ClickOnLink(CUSTOMER_LINK);
		utils.GetBusyStatus();
	}
	
	public void waitUntillHeaderSummary() throws Throwable{
		utils.CheckElementPresenceByLocator(HEADER_SUMMARY);
		Thread.sleep(1000);
	}
	
	public void Header_Summary_CustomerSet(String strCustomerSet) throws Throwable{
		actHeaderSummary.add(utils.RxNovaConnect_WebTable_VerifyRowData(HEADER_SUMMARY,strCustomerSet));
	}
	
	public void Header_Summary_Customer(String strCustomer) throws Throwable{
		actHeaderSummary.add(utils.RxNovaConnect_WebTable_VerifyRowData(HEADER_SUMMARY,strCustomer));
	}
	
	public void Header_Summary_Client(String strClient) throws Throwable{
		actHeaderSummary.add(utils.RxNovaConnect_WebTable_VerifyRowData(HEADER_SUMMARY,strClient));
	}
	
	public void Header_Summary_Group(String strGroup) throws Throwable{
		actHeaderSummary.add(utils.RxNovaConnect_WebTable_VerifyRowData(HEADER_SUMMARY,strGroup));
	}
	
	public void Header_Summary_Gender(String strGender) throws Throwable{
		actHeaderSummary.add(utils.RxNovaConnect_WebTable_VerifyRowData(HEADER_SUMMARY,strGender));
	}
	
	public void Header_Summary_MemberID(String strMemberID) throws Throwable{
		actHeaderSummary.add(utils.RxNovaConnect_WebTable_VerifyRowData(HEADER_SUMMARY,strMemberID));
	}
	
	public void Header_Summary_AltMemberID(String strAltMemberID) throws Throwable{
		actHeaderSummary.add(utils.RxNovaConnect_WebTable_VerifyRowData(HEADER_SUMMARY,strAltMemberID));
	}
	
	public void Header_Summary_FirstName(String strFirstName) throws Throwable{
		actHeaderSummary.add(utils.RxNovaConnect_WebTable_VerifyRowData(HEADER_SUMMARY,strFirstName));
	}
	
	public void Header_Summary_LastName(String strLastName) throws Throwable{
		actHeaderSummary.add(utils.RxNovaConnect_WebTable_VerifyRowData(HEADER_SUMMARY,strLastName));
	}
	
	public void Header_Summary_DOB(String strDOB) throws Throwable{
		actHeaderSummary.add(utils.RxNovaConnect_WebTable_VerifyRowData(HEADER_SUMMARY,strDOB));
	}
	
	public void verifyMemberLookupDetail(){
		utils.VerifyObjectIsDisplayed(HEADER_SUMMARY);
	}
	
	public void verifyMemberLookupClaimDetail() throws Throwable {
		utils.CheckElementPresenceByLocator(CLAIMTEST_BUTTON);
	}
	
	public void MemberLookup_clickOnCallNotesButton() throws Throwable{
	utils.ClickOnButton(CALLNOTES_BUTTON);
	Thread.sleep(1000);
    }

	public void waitUntillCallNotesDetail() throws Throwable{
		utils.CheckElementPresenceByLocator(CALLNOTES_DETAIL);
		Thread.sleep(1000);
	}
	
	public void verifyCallNotesDetail(){
		utils.VerifyObjectIsDisplayed(CALLNOTES_DETAIL);
	}
	
	public void waitUntillCustomerSetDisplayed() throws Throwable{
	utils.CheckElementPresenceByLocator(CUSTOMERSET);
	Thread.sleep(1000);
	}	
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Member Lookup Landing Page Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
