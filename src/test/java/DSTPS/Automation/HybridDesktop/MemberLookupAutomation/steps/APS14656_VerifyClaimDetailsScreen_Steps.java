package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_LandingPageSelector;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.APS14656_VerifyClaimDetailsScreen_Selector;

public class APS14656_VerifyClaimDetailsScreen_Steps 
{
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils; 
	private APS14656_VerifyClaimDetailsScreen_Selector APS14656selector;
	private MemberLookup_LandingPageSelector memberlookup_landingSelector;
	
	public ArrayList<String> expMemberDetails_at_PharmacyLookup = new ArrayList<String>();
	public ArrayList<String> expMemberDetails_at_MemberLookup = new ArrayList<String>();
	public SoftAssert memberDetailsSoft_at_PharmacyLookup = new SoftAssert();
	public SoftAssert memberDetailsSoft_at_MemberLookup = new SoftAssert();
	
	public APS14656_VerifyClaimDetailsScreen_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable
	{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	public void init() throws Throwable
	{
		APS14656selector = new APS14656_VerifyClaimDetailsScreen_Selector(SharedResource,utils);
		memberlookup_landingSelector = new MemberLookup_LandingPageSelector(SharedResource,utils);
	}
	public void perform_PharmacyLookup_Search(Map<String,String> searchInputs) throws Throwable
	{
		String sPharmacyNPI = searchInputs.get("PharmacyNPI");
		String sRxNumber = searchInputs.get("RxNumber");
		String sStartDate = searchInputs.get("Start_Date");
		
		APS14656selector.PharmacyLookup_LandingPage_enterPharmacy_NPI(sPharmacyNPI);
		APS14656selector.PharmacyLookup_LandingPage_enterRx_Number(sRxNumber);
		APS14656selector.PharmacyLookup_LandingPage_enterStartDate(sStartDate);
		APS14656selector.PharmacyLookup_LandingPage_clickOnSearchButton();
		APS14656selector.waitUntillPharmacySearchResults();
		APS14656selector.verifyPharmacySearchResults();
	}
	public void verifyMemberDetails(Map<String,String> memberDetails) throws Throwable 
	{
		String strMemberID = memberDetails.get("Member_ID");
		String strDateOfBirth = memberDetails.get("Date_Of_Birth");
		String strMemberName = memberDetails.get("Member_Name");
		String strError = memberDetails.get("Error");
		String strDate = memberDetails.get("Date");
		String strTime = memberDetails.get("Time");
		String strCICSStatus = memberDetails.get("CICS_Status");
		String strCustID = memberDetails.get("Cust_ID");
		String strClientID = memberDetails.get("Client_ID");
		String strGroup = memberDetails.get("Group");
		
		expMemberDetails_at_PharmacyLookup.add(strMemberID);
		expMemberDetails_at_PharmacyLookup.add(strDateOfBirth);
		expMemberDetails_at_PharmacyLookup.add(strMemberName);
		expMemberDetails_at_PharmacyLookup.add(strError);
		expMemberDetails_at_PharmacyLookup.add(strDate);
		expMemberDetails_at_PharmacyLookup.add(strTime);
		expMemberDetails_at_PharmacyLookup.add(strCICSStatus);
		expMemberDetails_at_PharmacyLookup.add(strCustID);
		expMemberDetails_at_PharmacyLookup.add(strClientID);
		expMemberDetails_at_PharmacyLookup.add(strGroup);
		
		APS14656selector.waitUntillPharmacySearchResults();
		APS14656selector.Member_Details_MemberID(strMemberID);
		APS14656selector.Member_Details_DateOfBirth(strDateOfBirth);
		APS14656selector.Member_Details_MemberName(strMemberName);
		APS14656selector.Member_Details_Error(strError);
		APS14656selector.Member_Details_Date(strDate);
		APS14656selector.Member_Details_Time(strTime);
		APS14656selector.Member_Details_CICSStatus(strCICSStatus);
		APS14656selector.Member_Details_CustID(strCustID);
		APS14656selector.Member_Details_ClientID(strClientID);
		APS14656selector.Member_Details_Group(strGroup);
		
		for(int i=0;i<expMemberDetails_at_PharmacyLookup.size();i++)
		{
			memberDetailsSoft_at_PharmacyLookup.assertEquals(APS14656selector.actMemberDetails.get(i), expMemberDetails_at_PharmacyLookup.get(i));
		}		
		memberDetailsSoft_at_PharmacyLookup.assertAll();
		memberDetailsSoft_at_PharmacyLookup = null;
	}
	public void verifyMemberLookupScreen() throws Throwable
	{
		memberlookup_landingSelector.waitUntillCustomerSetDisplayed();
	}
	public void performMemberSearchAtMemberLookupScreen(Map<String,String> memberLookupSearch) throws Throwable 
	{
		String strCustomerSet = memberLookupSearch.get("customerSet");
		String strCustomerID = memberLookupSearch.get("customer");
		String strMemberID = memberLookupSearch.get("memberid");
		String strExactMatch = memberLookupSearch.get("exactMatch");
		
		memberlookup_landingSelector.MemberLookup_LandingPage_selectCustomerSet(strCustomerSet);
		memberlookup_landingSelector.MemberLookup_LandingPage_selectCustomer(strCustomerID);
		memberlookup_landingSelector.MemberLookup_LandingPage_enterMember_ID(strMemberID);
		memberlookup_landingSelector.MemberLookup_LandingPage_selectExactMatch(strExactMatch);
		memberlookup_landingSelector.MemberLookup_LandingPage_clickOnSearchButton();
	}
	
	public void verifyMemberSearchResults() throws Throwable {
		memberlookup_landingSelector.waitUntillMemberSearchResults();
		memberlookup_landingSelector.verifyMemberSearchResults();
	}
	public void verifyMemberDetails_AT_MemberLookupScreen(Map<String,String> memberDetailsAT_MemberLookup) throws Throwable
	{
		String strCustomer = memberDetailsAT_MemberLookup.get("customer");
		String strMemberID = memberDetailsAT_MemberLookup.get("memberid");
		String strAltMemberID = memberDetailsAT_MemberLookup.get("altmemberid");
		String strFirstName = memberDetailsAT_MemberLookup.get("firstname");
		String strLastName = memberDetailsAT_MemberLookup.get("lastname");
		String strMI = memberDetailsAT_MemberLookup.get("mi");
		String strDOB = memberDetailsAT_MemberLookup.get("dob");
		String strStartDate = memberDetailsAT_MemberLookup.get("startdate");
		String strEndDate = memberDetailsAT_MemberLookup.get("enddate");
		
		expMemberDetails_at_MemberLookup.add(strCustomer);
		expMemberDetails_at_MemberLookup.add(strMemberID);
		expMemberDetails_at_MemberLookup.add(strAltMemberID);
		expMemberDetails_at_MemberLookup.add(strFirstName);
		expMemberDetails_at_MemberLookup.add(strLastName);
		expMemberDetails_at_MemberLookup.add(strMI);
		expMemberDetails_at_MemberLookup.add(strDOB);
		expMemberDetails_at_MemberLookup.add(strStartDate);
		expMemberDetails_at_MemberLookup.add(strEndDate);
		
		memberlookup_landingSelector.waitUntillMemberSearchResults();
		memberlookup_landingSelector.Member_Details_Customer(strCustomer);
		memberlookup_landingSelector.Member_Details_MemberID(strMemberID);
		memberlookup_landingSelector.Member_Details_AltMemberID(strAltMemberID);
		memberlookup_landingSelector.Member_Details_FirstName(strFirstName);
		memberlookup_landingSelector.Member_Details_LastName(strLastName);
		memberlookup_landingSelector.Member_Details_MI(strMI);
		memberlookup_landingSelector.Member_Details_DateOfBirth(strDOB);
		memberlookup_landingSelector.Member_Details_StartDate(strStartDate);
		memberlookup_landingSelector.Member_Details_EndDate(strEndDate);
		
		for(int i=0;i<expMemberDetails_at_MemberLookup.size();i++)
		{
			memberDetailsSoft_at_MemberLookup.assertEquals(memberlookup_landingSelector.actMemberDetails.get(i), expMemberDetails_at_MemberLookup.get(i));
		}		
		memberDetailsSoft_at_MemberLookup.assertAll();
	}
	public void perform_ClickOperationOnMemberID_AT_PharmacyLookup() throws Throwable
	{
		APS14656selector.perform_Click_On_PlayButton_On_MembeID_At_PharmacyLookup();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
