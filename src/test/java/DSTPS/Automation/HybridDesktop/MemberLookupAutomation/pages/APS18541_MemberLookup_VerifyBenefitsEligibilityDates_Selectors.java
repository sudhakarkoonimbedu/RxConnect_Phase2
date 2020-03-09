package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;

public class APS18541_MemberLookup_VerifyBenefitsEligibilityDates_Selectors 
{
	private By WARNING_MESSAGE_AT_NOENDDATE;
	private By CUSTOMERSET,CUSTOMER;
	private By FIRSTNAME,LASTNAME,DOB;
	private By SEARCH_BUTTON;
	private By BENEFITSELIGIBILITY_LINK,BENEFITSELIGIBILITY_DETAIL,BEDETAIL_TABLE,BEDETAIL_MEMBER_TABLE;
	private By BEDETAIL_CARDREISSUE_TABLE,BEDETAIL_ADDRESS_TABLE,BEDETAIL_MISCINFO_TABLE;
	private By BEDETAIL_MAINTENANCE_INFORMATION,BEDETAIL_ELIGIBILITYSTATUS;
	private By BEDETAIL_VIEWADDELIGBLDATES_LINK,AED_MEMBERELIGIBILITYDATES_TABLE;
	private By AED_GROUPELIGIBILITYDATES_TABLE,AED_CLIENTELIGIBILITYDATES_TABLE;
	private By AED_CUSTOMERELIGIBILITYDATES_TABLE,AED_CLOSE_BUTTON;
	private By BED_ELIGIBILITY_DATES;
	
	
	private HybridDesktop_SharedResource SharedResource;
	private RxNova_Utlilty utils;
	public WebDriver driver = null;
	
	public ArrayList<String> actBenefitsEligibilityDetail = new ArrayList<String>();
	public ArrayList<String> actAdditionalEligibilityDates = new ArrayList<String>();
	public ArrayList<String> actEligibilityDates = new ArrayList<String>();
	
	public APS18541_MemberLookup_VerifyBenefitsEligibilityDates_Selectors(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable
	{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;
		init();
	}
	public void init()
	{
		CUSTOMERSET = By.id("memberCallCenterSearchForm:customerSet");
		CUSTOMER = By.id("memberCallCenterSearchForm:customer");
		FIRSTNAME = By.id("memberCallCenterSearchForm:firstName");
		LASTNAME = By.id("memberCallCenterSearchForm:lastName");
		DOB = By.id("memberCallCenterSearchForm:dateOfBirth");
		SEARCH_BUTTON =By.id("memberCallCenterSearchForm:btnSearch");
		WARNING_MESSAGE_AT_NOENDDATE = By.xpath("//div[@id='memberCallCenterSearchResultForm:memberCallCenterSearchResultTable']/table/tbody/tr[1]/td[10]/div/img");
		BENEFITSELIGIBILITY_LINK = By.id("wheelForm:benefitLink");
		BENEFITSELIGIBILITY_DETAIL = By.id("benefitsSelectionForm:benefits");
		BEDETAIL_TABLE = By.xpath("//table[@class='word-break-tbl benefits-member-tbl']");												   
		BEDETAIL_MEMBER_TABLE = By.xpath("//table[@class='word-break-tbl benefits-detail-tbl-col2']");
		BEDETAIL_CARDREISSUE_TABLE = By.xpath("//table[@class='word-break-tbl benefits-detail-tbl-col4']");
		BEDETAIL_ADDRESS_TABLE = By.xpath("//table[@class='word-break-tbl benefits-detail-tbl-col3']");
		BEDETAIL_MISCINFO_TABLE = By.xpath("//table[@class='fl word-break-tbl benefits-detail-tbl-col5']");
		BEDETAIL_MAINTENANCE_INFORMATION = By.xpath("//table[@class='fl clearfix word-break-tbl benefits-detail-tbl-col6']");
		BEDETAIL_ELIGIBILITYSTATUS = By.xpath("//div[@class='benefits-detail-tbl-container clearfix']/div/div");
		BEDETAIL_VIEWADDELIGBLDATES_LINK = By.linkText("View Additional Eligibility Dates");
		AED_MEMBERELIGIBILITYDATES_TABLE = By.id("benefitsSelectionForm:addtionalMemberDateRanges");
		AED_GROUPELIGIBILITYDATES_TABLE = By.id("benefitsSelectionForm:addtionalGroupDateRanges");
		AED_CLIENTELIGIBILITYDATES_TABLE = By.id("benefitsSelectionForm:addtionalClientDateRanges");
		AED_CUSTOMERELIGIBILITYDATES_TABLE = By.id("benefitsSelectionForm:addtionalCustomerDateRanges");
		AED_CLOSE_BUTTON = By.id("benefitsSelectionForm:closeBtn");
		BED_ELIGIBILITY_DATES = By.id("benefitsSelectionForm:eligibilityStatusTable");
	}
	public String getWarningMessageTitle() throws Throwable
	{
		return utils.GetElementTitle(WARNING_MESSAGE_AT_NOENDDATE);
	}
	public void waitUntillCustomerSetDisplayed() throws Throwable
	{
		utils.CheckElementPresenceByLocator(CUSTOMERSET);
		Thread.sleep(1000);
	}
	public void MemberLookup_LandingPage_selectCustomerSet(String strCustomerSet) throws Throwable
	{
		if(!strCustomerSet.isEmpty())
		{
		utils.SelectItemFromWebList(CUSTOMERSET,strCustomerSet);
		Thread.sleep(1000);
		}
	}
	public void MemberLookup_LandingPage_selectCustomer(String strCustomer) throws Throwable
	{
		if(!strCustomer.isEmpty())
		{
		utils.SelectItemFromWebList(CUSTOMER,strCustomer);
		Thread.sleep(1000);
		}
	}
	public void MemberLookup_LandingPage_setTextIntoFirstName(String strFirstName) throws Throwable
	{
		if(!strFirstName.isEmpty())
		{
			utils.SetTextOnEdit(FIRSTNAME, strFirstName);
		}
	}
	public void MemberLookup_LandingPage_setTextIntoLastName(String strLastName) throws Throwable
	{
		if(!strLastName.isEmpty())
		{
			utils.SetTextOnEdit(LASTNAME, strLastName);
		}
	}
	public void MemberLookup_LandingPage_setTextIntoDOB(String strDOB) throws Throwable
	{
		if(!strDOB.isEmpty())
		{
			utils.SetTextOnEdit(DOB, strDOB);
		}
	}
	public void MemberLookup_LandingPage_clickOnSearchButton() throws Throwable
	{
		utils.ClickOnButton(SEARCH_BUTTON);
		utils.GetBusyStatus();
	}
	public void PharmacyLookup_clickOnBenefitsEligibilityLink() throws Throwable
	{
		utils.ClickOnLink(BENEFITSELIGIBILITY_LINK);
		Thread.sleep(1000);
	}
	public void waitUntillBenefitsEligibilityDetail() throws Throwable
	{
		utils.CheckElementPresenceByLocator(BENEFITSELIGIBILITY_DETAIL);
		Thread.sleep(1000);
	}
	public void verifyBenefitsEligibilityDetail()
	{
		utils.VerifyObjectIsDisplayed(BENEFITSELIGIBILITY_DETAIL);
	}
	// =====================================================================================================================
	// Benefits & Eligibility Details Member ID Table
	// =====================================================================================================================
	public void BenefitsEligibility_BEDetail_MemberID(String strMemberID) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strMemberID));
	}
	public void BenefitsEligibility_BEDetail_AltMemberID(String strAltMemberID) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strAltMemberID));
	}
	public void BenefitsEligibility_BEDetail_FirstName(String strFirstName) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strFirstName));
	}
	public void BenefitsEligibility_BEDetail_LastName(String strLastName) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strLastName));
	}
	public void BenefitsEligibility_BEDetail_MI(String strMI) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strMI));
	}
	public void BenefitsEligibility_BEDetail_CustomerSet(String strCustomerSet) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strCustomerSet));
	}
	public void BenefitsEligibility_BEDetail_Customer(String strCustomer) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strCustomer));
	}
	public void BenefitsEligibility_BEDetail_Client(String strClient) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strClient));
	}
	public void BenefitsEligibility_BEDetail_Group(String strGroup) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strGroup));
	}
	
	// =====================================================================================================================
	// Date of Birth Table
	// =====================================================================================================================
	public void BenefitsEligibility_BEDetail_EligibilityStatus() throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.GetElementText(BEDETAIL_ELIGIBILITYSTATUS));
	}
	public void BenefitsEligibility_BEDetail_DOB(String strDOB) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MEMBER_TABLE,strDOB));
	}
	
	public void BenefitsEligibility_BEDetail_DeceasedDate(String strDeceasedDate) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MEMBER_TABLE,strDeceasedDate));
	}
	
	public void BenefitsEligibility_BEDetail_Gender(String strGender) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MEMBER_TABLE,strGender));
	}
	
	public void BenefitsEligibility_BEDetail_Relationship(String strRelationship) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MEMBER_TABLE,strRelationship));
	}
	
	public void BenefitsEligibility_BEDetail_MedicareBeneficiaryID(String strMedicareBeneficiaryID) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MEMBER_TABLE,strMedicareBeneficiaryID));
	}
	
	public void BenefitsEligibility_BEDetail_CaseID(String strCaseID) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MEMBER_TABLE,strCaseID));
	}
	
	public void BenefitsEligibility_BEDetail_UniquePersonID(String strUniquePersonID) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MEMBER_TABLE,strUniquePersonID));
	}
	// Cardholder Information
	
	public void BenefitsEligibility_BEDetail_CardHolderFirstName(String strCardHolderFirstName) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MEMBER_TABLE,strCardHolderFirstName));
	}
	
	public void BenefitsEligibility_BEDetail_CardHolderLastName(String strCardHolderLastName) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MEMBER_TABLE,strCardHolderLastName));
	}
	
	public void BenefitsEligibility_BEDetail_CardHolderMI(String strCardHolderMI) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MEMBER_TABLE,strCardHolderMI));
	}
	
	public void BenefitsEligibility_BEDetail_CardReissueDate(String strCardReissueDate) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_CARDREISSUE_TABLE,strCardReissueDate));
	}
	
	public void BenefitsEligibility_BEDetail_CardReissueReason(String strCardReissueReason) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_CARDREISSUE_TABLE,strCardReissueReason));
	}
	// ================================================================================================================================
	// Address
	// ================================================================================================================================
	public void BenefitsEligibility_BEDetail_Line1(String strLine1) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_ADDRESS_TABLE,strLine1));
	}
	public void BenefitsEligibility_BEDetail_Line2(String strLine2) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_ADDRESS_TABLE,strLine2));
	}
	public void BenefitsEligibility_BEDetail_Line3(String strLine3) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_ADDRESS_TABLE,strLine3));
	}
	public void BenefitsEligibility_BEDetail_City(String strCity) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_ADDRESS_TABLE,strCity));
	}
	public void BenefitsEligibility_BEDetail_State(String strState) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_ADDRESS_TABLE,strState));
	}
	public void BenefitsEligibility_BEDetail_ZIP(String strZIP) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_ADDRESS_TABLE,strZIP));
	}
	public void BenefitsEligibility_BEDetail_Country(String strCountry) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_ADDRESS_TABLE,strCountry));
	}
	public void BenefitsEligibility_BEDetail_Phone(String strPhone) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_ADDRESS_TABLE,strPhone));
	}
	public void BenefitsEligibility_BEDetail_Email(String strEmail) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_ADDRESS_TABLE,strEmail));
	}
	// ================================================================================================================================
	// Miscellaneous Information
	// ================================================================================================================================
	public void BenefitsEligibility_BEDetail_MiscData1(String strMiscData1) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MISCINFO_TABLE,strMiscData1));
	}
	public void BenefitsEligibility_BEDetail_MiscData2(String strMiscData2) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MISCINFO_TABLE,strMiscData2));
	}
	public void BenefitsEligibility_BEDetail_MiscData3(String strMiscData3) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MISCINFO_TABLE,strMiscData3));
	}
	// ================================================================================================================================
	// Miscellaneous Information
	// ================================================================================================================================
	public void BenefitsEligibility_BEDetail_DateTimeAdded(String strDateTimeAdded) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MAINTENANCE_INFORMATION, strDateTimeAdded));
	}
	public void BenefitsEligibility_BEDetail_DeviceOperatorAdded(String strDeviceOperatorAdded) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MAINTENANCE_INFORMATION, strDeviceOperatorAdded));
	}
	public void BenefitsEligibility_BEDetail_DateTimeUpdated(String strDateTimeUpdated) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MAINTENANCE_INFORMATION, strDateTimeUpdated));
	}
	public void BenefitsEligibility_BEDetail_DeviceOperatorUpdated(String strDeviceOperatorUpdated) throws Throwable
	{
		actBenefitsEligibilityDetail.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_MAINTENANCE_INFORMATION, strDeviceOperatorUpdated));
	}
	
	// ================================================================================================================================
	// View Additional Eligibility Dates
	// ================================================================================================================================
	public void BenefitsEligibility_BEDetail_clickOnViewAdditionalEligibilityDatesLink() throws Throwable
	{
		utils.ClickOnLink(BEDETAIL_VIEWADDELIGBLDATES_LINK);
		utils.GetBusyStatus();
	}
	public void waitUntillAdditionalEligibilityDates() throws Throwable
	{
		utils.CheckElementPresenceByLocator(AED_MEMBERELIGIBILITYDATES_TABLE);
		Thread.sleep(1000);
	}
	public void BenefitsEligibility_AED_MemberID(String strMemberID) throws Throwable
	{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strMemberID));
	}
	public void BenefitsEligibility_AED_AltMemberID(String strAltMemberID) throws Throwable
	{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strAltMemberID));
	}
	public void BenefitsEligibility_AED_FirstName(String strFirstName) throws Throwable
	{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strFirstName));
	}
	public void BenefitsEligibility_AED_LastName(String strLastName) throws Throwable
	{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strLastName));
	}
	public void BenefitsEligibility_AED_MI(String strMI) throws Throwable
	{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strMI));
	}
	public void BenefitsEligibility_AED_CustomerSet(String strCustomerSet) throws Throwable
	{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strCustomerSet));
	}
	public void BenefitsEligibility_AED_Customer(String strCustomer) throws Throwable
	{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strCustomer));
	}
	public void BenefitsEligibility_AED_Client(String strClient) throws Throwable
	{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strClient));
	}
	public void BenefitsEligibility_AED_Group(String strGroup) throws Throwable
	{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyRowData(BEDETAIL_TABLE,strGroup));
	}
	
	// Member Eligibility Dates
	
	public void BenefitsEligibility_AED_MemberStartDate(String strMemberStartDate) throws Throwable
	{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_MEMBERELIGIBILITYDATES_TABLE,strMemberStartDate));
	}
	public void BenefitsEligibility_AED_MemberEndDate(String strMemberEndDate) throws Throwable
	{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_MEMBERELIGIBILITYDATES_TABLE,strMemberEndDate));
	}
	public void BenefitsEligibility_AED_MemberProcessDate(String strMemberProcessDate) throws Throwable
	{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_MEMBERELIGIBILITYDATES_TABLE,strMemberProcessDate));
	}
	public void BenefitsEligibility_AED_MemberStartDate1(String strMemberStartDate1) throws Throwable
	{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_MEMBERELIGIBILITYDATES_TABLE,strMemberStartDate1));
	}
	public void BenefitsEligibility_AED_MemberEndDate1(String strMemberEndDate1) throws Throwable
	{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_MEMBERELIGIBILITYDATES_TABLE,strMemberEndDate1));
	}
	public void BenefitsEligibility_AED_MemberProcessDate1(String strMemberProcessDate1) throws Throwable
	{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_MEMBERELIGIBILITYDATES_TABLE,strMemberProcessDate1));
	}
	
	// Group Eligibility Dates
	
	public void BenefitsEligibility_AED_GroupStartDate(String strGroupStartDate) throws Throwable
	{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_GROUPELIGIBILITYDATES_TABLE,strGroupStartDate));
	}
	public void BenefitsEligibility_AED_GroupEndDate(String strGroupEndDate) throws Throwable
	{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_GROUPELIGIBILITYDATES_TABLE,strGroupEndDate));
	}
	public void BenefitsEligibility_AED_GroupProcessDate(String strGroupProcessDate) throws Throwable
	{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_GROUPELIGIBILITYDATES_TABLE,strGroupProcessDate));
	}
	
	// Client Eligibility Dates
	
	public void BenefitsEligibility_AED_ClientStartDate(String strClientStartDate) throws Throwable
	{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_CLIENTELIGIBILITYDATES_TABLE,strClientStartDate));
	}
	public void BenefitsEligibility_AED_ClientEndDate(String strClientEndDate) throws Throwable
	{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_CLIENTELIGIBILITYDATES_TABLE,strClientEndDate));
	}
	public void BenefitsEligibility_AED_ClientProcessDate(String strClientProcessDate) throws Throwable
	{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_CLIENTELIGIBILITYDATES_TABLE,strClientProcessDate));
	}
	
	// Customer Eligibility Dates
	
	public void BenefitsEligibility_AED_CustomerStartDate(String strCustomerStartDate) throws Throwable
	{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_CUSTOMERELIGIBILITYDATES_TABLE,strCustomerStartDate));
	}
	public void BenefitsEligibility_AED_CustomerEndDate(String strCustomerEndDate) throws Throwable
	{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_CUSTOMERELIGIBILITYDATES_TABLE,strCustomerEndDate));
	}
	public void BenefitsEligibility_AED_CustomerProcessDate(String strCustomerProcessDate) throws Throwable
	{
		actAdditionalEligibilityDates.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AED_CUSTOMERELIGIBILITYDATES_TABLE,strCustomerProcessDate));
	}
	
	public void BenefitsEligibility_AED_clickOnCloseButton() throws Throwable
	{
		utils.ClickOnButton(AED_CLOSE_BUTTON);
		utils.GetBusyStatus();
	}
	
	// Additional Eligibility Dates
	
	
	// Member
	
	public void BED_EligibilityDates_MemberStartDate(String strMemberStartDate) throws Throwable
	{
		actEligibilityDates.add(utils.RxNovaConnect_WebTable_BenefitsEligibilityDetail_EligibilityDatesValidation(BED_ELIGIBILITY_DATES,strMemberStartDate));
	}
	public void BED_EligibilityDates_MemberEndDate(String strMemberEndDate) throws Throwable
	{
		actEligibilityDates.add(utils.RxNovaConnect_WebTable_BenefitsEligibilityDetail_EligibilityDatesValidation(BED_ELIGIBILITY_DATES,strMemberEndDate));
	}
	public void BED_EligibilityDates_MemberProcessDate(String strMemberProcessDate) throws Throwable
	{
		actEligibilityDates.add(utils.RxNovaConnect_WebTable_BenefitsEligibilityDetail_EligibilityDatesValidation(BED_ELIGIBILITY_DATES,strMemberProcessDate));
	}
	
	// Group
	
	public void BED_EligibilityDates_GroupStartDate(String strGroupStartDate) throws Throwable
	{
		actEligibilityDates.add(utils.RxNovaConnect_WebTable_BenefitsEligibilityDetail_EligibilityDatesValidation(BED_ELIGIBILITY_DATES,strGroupStartDate));
	}
	public void BED_EligibilityDates_GroupEndDate(String strGroupEndDate) throws Throwable
	{
		actEligibilityDates.add(utils.RxNovaConnect_WebTable_BenefitsEligibilityDetail_EligibilityDatesValidation(BED_ELIGIBILITY_DATES,strGroupEndDate));
	}
	public void BED_EligibilityDates_GroupProcessDate(String strGroupProcessDate) throws Throwable
	{
		actEligibilityDates.add(utils.RxNovaConnect_WebTable_BenefitsEligibilityDetail_EligibilityDatesValidation(BED_ELIGIBILITY_DATES,strGroupProcessDate));
	}
	
	// Client 
	
	public void BED_EligibilityDates_ClientStartDate(String strClientStartDate) throws Throwable
	{
		actEligibilityDates.add(utils.RxNovaConnect_WebTable_BenefitsEligibilityDetail_EligibilityDatesValidation(BED_ELIGIBILITY_DATES,strClientStartDate));
	}
	public void BED_EligibilityDates_ClientEndDate(String strClientEndDate) throws Throwable
	{
		actEligibilityDates.add(utils.RxNovaConnect_WebTable_BenefitsEligibilityDetail_EligibilityDatesValidation(BED_ELIGIBILITY_DATES,strClientEndDate));
	}
	public void BED_EligibilityDates_ClientProcessDate(String strClientProcessDate) throws Throwable
	{
		actEligibilityDates.add(utils.RxNovaConnect_WebTable_BenefitsEligibilityDetail_EligibilityDatesValidation(BED_ELIGIBILITY_DATES,strClientProcessDate));
	}
	
	// Customer
	
	public void BED_EligibilityDates_CustomerStartDate(String strCustomerStartDate) throws Throwable
	{
		actEligibilityDates.add(utils.RxNovaConnect_WebTable_BenefitsEligibilityDetail_EligibilityDatesValidation(BED_ELIGIBILITY_DATES,strCustomerStartDate));
	}
	public void BED_EligibilityDates_CustomerEndDate(String strCustomerEndDate) throws Throwable
	{
		actEligibilityDates.add(utils.RxNovaConnect_WebTable_BenefitsEligibilityDetail_EligibilityDatesValidation(BED_ELIGIBILITY_DATES,strCustomerEndDate));
	}
	public void BED_EligibilityDates_CustomerProcessDate(String strCustomerProcessDate) throws Throwable
	{
		actEligibilityDates.add(utils.RxNovaConnect_WebTable_BenefitsEligibilityDetail_EligibilityDatesValidation(BED_ELIGIBILITY_DATES,strCustomerProcessDate));
	}
}
