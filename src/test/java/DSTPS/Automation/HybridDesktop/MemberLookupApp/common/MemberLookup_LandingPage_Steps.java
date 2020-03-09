package DSTPS.Automation.HybridDesktop.MemberLookupApp.common;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;

public class MemberLookup_LandingPage_Steps {

	MemberLookup_LandingPageSelector memberLookup_LandingPageSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expMemberDetails = new ArrayList<String>();
	public ArrayList<String> expMemberIDDetails = new ArrayList<String>();
	public ArrayList<String> expHeaderSummary = new ArrayList<String>();
	public SoftAssert memberDetailsSoft = new SoftAssert();
	public SoftAssert memberIDDetailsSoft = new SoftAssert();
	public SoftAssert headerSummarySoft = new SoftAssert();
	
	public MemberLookup_LandingPage_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		memberLookup_LandingPageSelector = new MemberLookup_LandingPageSelector(SharedResource,utils);
	}
	
	public void searchMemberLookUp(Map<String,String> searchDetails)throws Throwable {
		String strCustomerSet = searchDetails.get("SearchCustomerSet");
		String strCustomer = searchDetails.get("SearchCustomer");
		String strMemberID = searchDetails.get("SearchMemberID");
		String strAltID = searchDetails.get("SearchAltID");
		String strExactMatch = searchDetails.get("SearchExactMatch");
		String strFirstName = searchDetails.get("SearchFirstName");
		String strMI = searchDetails.get("SearchMI");
		String strLastName = searchDetails.get("SearchLastName");
		String strDOB = searchDetails.get("SearchDOB");
		String strClaimID = searchDetails.get("SearchClaimID");		
		
		memberLookup_LandingPageSelector.MemberLookup_LandingPage_selectCustomerSet(strCustomerSet);
		memberLookup_LandingPageSelector.MemberLookup_LandingPage_selectCustomer(strCustomer);
		memberLookup_LandingPageSelector.MemberLookup_LandingPage_enterMember_ID(strMemberID);
		memberLookup_LandingPageSelector.MemberLookup_LandingPage_enterAlt_ID(strAltID);
		memberLookup_LandingPageSelector.MemberLookup_LandingPage_selectExactMatch(strExactMatch);
		memberLookup_LandingPageSelector.MemberLookup_LandingPage_enterFirst_Name(strFirstName);
		memberLookup_LandingPageSelector.MemberLookup_LandingPage_enterMI(strMI);
		memberLookup_LandingPageSelector.MemberLookup_LandingPage_enterLast_Name(strLastName);
		memberLookup_LandingPageSelector.MemberLookup_LandingPage_enterDOB(strDOB);
		memberLookup_LandingPageSelector.MemberLookup_LandingPage_enterClaim_ID(strClaimID);
		memberLookup_LandingPageSelector.MemberLookup_LandingPage_clickOnSearchButton();
		Thread.sleep(2000);
	}
	
	public void verifyMemberSearchResults() throws Throwable {
		memberLookup_LandingPageSelector.waitUntillMemberSearchResults();
		memberLookup_LandingPageSelector.verifyMemberSearchResults();
	}
	
	public void verifyMemberDetails(Map<String,String> memberDetails) throws Throwable {
		String strCustomer = memberDetails.get("Customer");
		String strMemberID = memberDetails.get("MemberID");
		String strAltMemberID = memberDetails.get("AltMemberID");
		String strFirstName = memberDetails.get("FirstName");
		String strLastName = memberDetails.get("LastName");
		String strMI = memberDetails.get("MI");
		String strDOB = memberDetails.get("DOB");
		String strStartDate = memberDetails.get("StartDate");
		String strEndDate = memberDetails.get("EndDate");
		
		expMemberDetails.add(strCustomer);
		expMemberDetails.add(strMemberID);
		expMemberDetails.add(strAltMemberID);
		expMemberDetails.add(strFirstName);
		expMemberDetails.add(strLastName);
		expMemberDetails.add(strMI);
		expMemberDetails.add(strDOB);
		expMemberDetails.add(strStartDate);
		expMemberDetails.add(strEndDate);
		
		memberLookup_LandingPageSelector.waitUntillMemberSearchResults();
		memberLookup_LandingPageSelector.Member_Details_Customer(strCustomer);
		memberLookup_LandingPageSelector.Member_Details_MemberID(strMemberID);
		memberLookup_LandingPageSelector.Member_Details_AltMemberID(strAltMemberID);
		memberLookup_LandingPageSelector.Member_Details_FirstName(strFirstName);
		memberLookup_LandingPageSelector.Member_Details_LastName(strLastName);
		memberLookup_LandingPageSelector.Member_Details_MI(strMI);
		memberLookup_LandingPageSelector.Member_Details_DateOfBirth(strDOB);
		memberLookup_LandingPageSelector.Member_Details_StartDate(strStartDate);
		memberLookup_LandingPageSelector.Member_Details_EndDate(strEndDate);
		
		for(int i=0;i<expMemberDetails.size();i++)
		{
			memberDetailsSoft.assertEquals(memberLookup_LandingPageSelector.actMemberDetails.get(i), expMemberDetails.get(i));
		}		
		memberDetailsSoft.assertAll();
	}
	
	
	public void verifyMemberIDDetails(Map<String,String> memberIDDetails) throws Throwable {
		String strCustomerSet = memberIDDetails.get("CustomerSet");
		String strCustomer = memberIDDetails.get("Customer");
		String strClient = memberIDDetails.get("Client");
		String strGroup = memberIDDetails.get("Group");
		String strStartDate = memberIDDetails.get("StartDate");
		String strEndDate = memberIDDetails.get("EndDate");
		String strMemberID = memberIDDetails.get("MemberID");
		String strAltMemberID = memberIDDetails.get("AltMemberID");
		String strFirstName = memberIDDetails.get("FirstName");
		String strLastName = memberIDDetails.get("LastName");
		String strDOB = memberIDDetails.get("DOB");
		String strGender = memberIDDetails.get("Gender");
		String strRelationshipCode = memberIDDetails.get("RelationshipCode");
		String strLine1 = memberIDDetails.get("Line1");
		String strPhone = memberIDDetails.get("Phone");
		String strLine2 = memberIDDetails.get("Line2");
		String strCity = memberIDDetails.get("City");
		String strState = memberIDDetails.get("State");
		String strZIP = memberIDDetails.get("ZIP");
		
		expMemberIDDetails.add(strCustomerSet);
		expMemberIDDetails.add(strCustomer);
		expMemberIDDetails.add(strClient);
		expMemberIDDetails.add(strGroup);
		expMemberIDDetails.add(strStartDate);
		expMemberIDDetails.add(strEndDate);
		expMemberIDDetails.add(strMemberID);
		expMemberIDDetails.add(strAltMemberID);
		expMemberIDDetails.add(strFirstName);
		expMemberIDDetails.add(strLastName);
		expMemberIDDetails.add(strDOB);
		expMemberIDDetails.add(strGender);
		expMemberIDDetails.add(strRelationshipCode);
		expMemberIDDetails.add(strLine1);
		expMemberIDDetails.add(strPhone);
		expMemberIDDetails.add(strLine2);
		expMemberIDDetails.add(strCity);
		expMemberIDDetails.add(strState);
		expMemberIDDetails.add(strZIP);
		
		memberLookup_LandingPageSelector.Member_Details_ClickOnCustomer();
		memberLookup_LandingPageSelector.waitUntillCustomerSetDetails();
		memberLookup_LandingPageSelector.MemberID_Details_CustomerSet(strCustomerSet);
		memberLookup_LandingPageSelector.MemberID_Details_Customer(strCustomer);
		memberLookup_LandingPageSelector.MemberID_Details_Client(strClient);
		memberLookup_LandingPageSelector.MemberID_Details_Group(strGroup);
		memberLookup_LandingPageSelector.MemberID_Details_StartDate(strStartDate);
		memberLookup_LandingPageSelector.MemberID_Details_EndDate(strEndDate);
		memberLookup_LandingPageSelector.MemberID_Details_MemberID(strMemberID);
		memberLookup_LandingPageSelector.MemberID_Details_AltMemberID(strAltMemberID);
		memberLookup_LandingPageSelector.MemberID_Details_FirstName(strFirstName);
		memberLookup_LandingPageSelector.MemberID_Details_LastName(strLastName);
		memberLookup_LandingPageSelector.MemberID_Details_DateOfBirth(strDOB);
		memberLookup_LandingPageSelector.MemberID_Details_Gender(strGender);
		memberLookup_LandingPageSelector.MemberID_Details_RelationshipCode(strRelationshipCode);
		memberLookup_LandingPageSelector.Address_Details_Line1(strLine1);
		memberLookup_LandingPageSelector.Address_Details_Phone(strPhone);
		memberLookup_LandingPageSelector.Address_Details_Line2(strLine2);
		memberLookup_LandingPageSelector.Address_Details_City(strCity);
		memberLookup_LandingPageSelector.Address_Details_State(strState);
		memberLookup_LandingPageSelector.Address_Details_ZIP(strZIP);
		
		for(int i=0;i<expMemberIDDetails.size();i++)
		{
			memberIDDetailsSoft.assertEquals(memberLookup_LandingPageSelector.actMemberIDDetails.get(i), expMemberIDDetails.get(i));
		}		
		memberIDDetailsSoft.assertAll();
	}	
	
	public void clickOnCustomerLink() throws Throwable{
		memberLookup_LandingPageSelector.Member_Details_ClickOnCustomerLink();
		utils.GetBusyStatus();
	}
	
	public void verifyHeaderDetails(Map<String,String> headerDetails) throws Throwable {
		String strCustomerSet = headerDetails.get("CustomerSet");
		String strCustomer = headerDetails.get("Customer");
		String strClient = headerDetails.get("Client");
		String strGroup = headerDetails.get("Group");
		String strGender = headerDetails.get("Gender");
		String strMemberID = headerDetails.get("MemberID");
		String strAltMemberID = headerDetails.get("AltMemberID");
		String strFirstName = headerDetails.get("FirstName");
		String strLastName = headerDetails.get("LastName");
		String strDOB = headerDetails.get("DOB");
		
		expHeaderSummary.add(strCustomerSet);
		expHeaderSummary.add(strCustomer);
		expHeaderSummary.add(strClient);
		expHeaderSummary.add(strGroup);
		expHeaderSummary.add(strGender);
		expHeaderSummary.add(strMemberID);
		expHeaderSummary.add(strAltMemberID);
		expHeaderSummary.add(strFirstName);
		expHeaderSummary.add(strLastName);
		expHeaderSummary.add(strDOB);
		
		memberLookup_LandingPageSelector.waitUntillHeaderSummary();
		memberLookup_LandingPageSelector.Header_Summary_CustomerSet(strCustomerSet);
		memberLookup_LandingPageSelector.Header_Summary_Customer(strCustomer);
		memberLookup_LandingPageSelector.Header_Summary_Client(strClient);
		memberLookup_LandingPageSelector.Header_Summary_Group(strGroup);
		memberLookup_LandingPageSelector.Header_Summary_Gender(strGender);
		memberLookup_LandingPageSelector.Header_Summary_MemberID(strMemberID);
		memberLookup_LandingPageSelector.Header_Summary_AltMemberID(strAltMemberID);
		memberLookup_LandingPageSelector.Header_Summary_FirstName(strFirstName);
		memberLookup_LandingPageSelector.Header_Summary_LastName(strLastName);
		memberLookup_LandingPageSelector.Header_Summary_DOB(strDOB);
		
		for(int i=0;i<expHeaderSummary.size();i++)
		{
			headerSummarySoft.assertEquals(memberLookup_LandingPageSelector.actHeaderSummary.get(i), expHeaderSummary.get(i));
		}		
		headerSummarySoft.assertAll();
	}
	
	public void verifyMemberLookupDetail(){
		memberLookup_LandingPageSelector.verifyMemberLookupDetail();
	}
	
	public void verifyMemberLookupClaimDetail() throws Throwable {
		memberLookup_LandingPageSelector.verifyMemberLookupClaimDetail();
	}
	
	public void clickOnCallNotes() throws Throwable{
		memberLookup_LandingPageSelector.MemberLookup_clickOnCallNotesButton();		
	}
	
	public void verifyCallNotes() throws Throwable{
		memberLookup_LandingPageSelector.waitUntillCallNotesDetail();
		memberLookup_LandingPageSelector.verifyCallNotesDetail();		
	}
}

