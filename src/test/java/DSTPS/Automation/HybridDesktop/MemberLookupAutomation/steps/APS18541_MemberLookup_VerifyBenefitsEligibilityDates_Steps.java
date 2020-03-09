package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.APS18541_MemberLookup_VerifyBenefitsEligibilityDates_Selectors;

public class APS18541_MemberLookup_VerifyBenefitsEligibilityDates_Steps 
{
	private HybridDesktop_SharedResource SharedResource;
	private RxNova_Utlilty utils;
	public WebDriver driver;
	
	private APS18541_MemberLookup_VerifyBenefitsEligibilityDates_Selectors APS18541Selector;
	
	public ArrayList<String> expBenefitsEligibilityDetail = new ArrayList<String>();
	public ArrayList<String> expAdditionalEligibilityDates = new ArrayList<String>();
	public ArrayList<String> expEligiblityDates = new ArrayList<String>();
	
	
	public SoftAssert WarningMessageSoft = new SoftAssert();
	public SoftAssert benefitsEligibilityDetailSoft = new SoftAssert();
	public SoftAssert additionalEligibilityDatesSoft = new SoftAssert();
	public SoftAssert EligibilityDatesSoft = new SoftAssert();
	
	public APS18541_MemberLookup_VerifyBenefitsEligibilityDates_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable
	{
		this.SharedResource = SharedResource;
		driver = SharedResource.getDriver();	
		this.utils = utils;
		init();
	}
	public void init() throws Throwable
	{
		APS18541Selector = new APS18541_MemberLookup_VerifyBenefitsEligibilityDates_Selectors(SharedResource,utils);
	}
	public void verifyTheWarningMessage_At_NoEndDate(Map<String,String> WarningMessage) throws Throwable
	{
		String strExpectedWarningMessage = WarningMessage.get("WarningMessage");
		String strActualWarningMessage = APS18541Selector.getWarningMessageTitle();
		
		WarningMessageSoft.assertEquals(strExpectedWarningMessage, strActualWarningMessage);
		
	}
	public void performMemberLookUpSearch(Map<String,String> searchDetails)throws Throwable {
		String strCustomerSet = searchDetails.get("SearchCustomerSet");
		String strCustomer = searchDetails.get("SearchCustomer");
		String strFirstName = searchDetails.get("SearchFirstName");		
		String strLastName = searchDetails.get("SearchLastName");
		String strDOB = searchDetails.get("SearchDOB");
				
		APS18541Selector.MemberLookup_LandingPage_selectCustomerSet(strCustomerSet);
		APS18541Selector.MemberLookup_LandingPage_selectCustomer(strCustomer);
		APS18541Selector.MemberLookup_LandingPage_setTextIntoFirstName(strFirstName);		
		APS18541Selector.MemberLookup_LandingPage_setTextIntoLastName(strLastName);
		APS18541Selector.MemberLookup_LandingPage_setTextIntoDOB(strDOB);
		APS18541Selector.MemberLookup_LandingPage_clickOnSearchButton();
		Thread.sleep(2000);
	}
	public void clickOnBenefitsEligibility() throws Throwable
	{
		APS18541Selector.PharmacyLookup_clickOnBenefitsEligibilityLink();		
	}
	public void verifyBenefitsEligibility() throws Throwable
	{
		APS18541Selector.waitUntillBenefitsEligibilityDetail();
		APS18541Selector.verifyBenefitsEligibilityDetail();
	}
	
	public void verifyBenefitsEligibilityDetails(Map<String,String> benefitsEligibilityDetails)throws Throwable 
	{
		String strMemberID = benefitsEligibilityDetails.get("MemberID");
		String strAltMemberID = benefitsEligibilityDetails.get("AltMemberID");		
		String strFirstName = benefitsEligibilityDetails.get("FirstName");		
		String strLastName = benefitsEligibilityDetails.get("LastName");
		String strMI = benefitsEligibilityDetails.get("MI");
		String strCustomerSet = benefitsEligibilityDetails.get("CustomerSet");
		String strCustomer = benefitsEligibilityDetails.get("Customer");
		String strClient = benefitsEligibilityDetails.get("Client");
		String strGroup = benefitsEligibilityDetails.get("Group");
		String strEligibilityStatus = benefitsEligibilityDetails.get("EligibilityStatus");
		String strDOB = benefitsEligibilityDetails.get("DOB");
		String strDeceasedDate = benefitsEligibilityDetails.get("DeceasedDate");		
		String strGender = benefitsEligibilityDetails.get("Gender");		
		String strRelationship = benefitsEligibilityDetails.get("Relationship");
		String strMedicareBeneficiaryID = benefitsEligibilityDetails.get("MedicareBeneficiaryID");
		String strCaseID = benefitsEligibilityDetails.get("CaseId");
		String strUniquePersonID = benefitsEligibilityDetails.get("UniquePersonID");
		String strCardHolderFirstName = benefitsEligibilityDetails.get("CardHolderFirstName");		
		String strCardHolderLastName = benefitsEligibilityDetails.get("CardHolderLastName");
		String strCardHolderMI = benefitsEligibilityDetails.get("CardHolderMI");
		String strCardReissueDate = benefitsEligibilityDetails.get("CardReissueDate");
		String strCardReissueReason = benefitsEligibilityDetails.get("CardReissueReason");		
		String strLine1 = benefitsEligibilityDetails.get("Line1");		
		String strLine2 = benefitsEligibilityDetails.get("Line2");
		String strLine3 = benefitsEligibilityDetails.get("Line3");
		String strCity = benefitsEligibilityDetails.get("City");
		String strState = benefitsEligibilityDetails.get("State");
		String strZIP = benefitsEligibilityDetails.get("Zip");
		String strCountry = benefitsEligibilityDetails.get("Country");
		String strPhone = benefitsEligibilityDetails.get("Phone");
		String strEmail = benefitsEligibilityDetails.get("Email");		
		String strMiscData1 = benefitsEligibilityDetails.get("MiscData1");		
		String strMiscData2 = benefitsEligibilityDetails.get("MiscData2");
		String strMiscData3 = benefitsEligibilityDetails.get("MiscData3");
		String strDateTimeAdded = benefitsEligibilityDetails.get("DateTimeAdded");
		String strDeviceOperatorAdded = benefitsEligibilityDetails.get("DeviceOperatorAdded");
		String strDateTimeUpdated = benefitsEligibilityDetails.get("DateTimeUpdated");
		String strDeviceOperatorUpdated = benefitsEligibilityDetails.get("DeviceOperatorUpdated");
		
		expBenefitsEligibilityDetail.add(strMemberID);
		expBenefitsEligibilityDetail.add(strAltMemberID);
		expBenefitsEligibilityDetail.add(strFirstName);
		expBenefitsEligibilityDetail.add(strLastName);
		expBenefitsEligibilityDetail.add(strMI);
		expBenefitsEligibilityDetail.add(strCustomerSet);
		expBenefitsEligibilityDetail.add(strCustomer);
		expBenefitsEligibilityDetail.add(strClient);
		expBenefitsEligibilityDetail.add(strGroup);
		expBenefitsEligibilityDetail.add(strEligibilityStatus);
		expBenefitsEligibilityDetail.add(strDOB);
		expBenefitsEligibilityDetail.add(strDeceasedDate);
		expBenefitsEligibilityDetail.add(strGender);
		expBenefitsEligibilityDetail.add(strRelationship);
		expBenefitsEligibilityDetail.add(strMedicareBeneficiaryID);
		expBenefitsEligibilityDetail.add(strCaseID);
		expBenefitsEligibilityDetail.add(strUniquePersonID);
		expBenefitsEligibilityDetail.add(strCardHolderFirstName);
		expBenefitsEligibilityDetail.add(strCardHolderLastName);
		expBenefitsEligibilityDetail.add(strCardHolderMI);
		expBenefitsEligibilityDetail.add(strCardReissueDate);
		expBenefitsEligibilityDetail.add(strCardReissueReason);
		expBenefitsEligibilityDetail.add(strLine1);
		expBenefitsEligibilityDetail.add(strLine2);
		expBenefitsEligibilityDetail.add(strLine3);
		expBenefitsEligibilityDetail.add(strCity);
		expBenefitsEligibilityDetail.add(strState);
		expBenefitsEligibilityDetail.add(strZIP);
		expBenefitsEligibilityDetail.add(strCountry);
		expBenefitsEligibilityDetail.add(strPhone);
		expBenefitsEligibilityDetail.add(strEmail);
		expBenefitsEligibilityDetail.add(strMiscData1);
		expBenefitsEligibilityDetail.add(strMiscData2);
		expBenefitsEligibilityDetail.add(strMiscData3);
		
		expBenefitsEligibilityDetail.add(strDateTimeAdded);
		expBenefitsEligibilityDetail.add(strDeviceOperatorAdded);
		expBenefitsEligibilityDetail.add(strDateTimeUpdated);
		expBenefitsEligibilityDetail.add(strDeviceOperatorUpdated);
		
		
		
		APS18541Selector.BenefitsEligibility_BEDetail_MemberID(strMemberID);
		APS18541Selector.BenefitsEligibility_BEDetail_AltMemberID(strAltMemberID);
		APS18541Selector.BenefitsEligibility_BEDetail_FirstName(strFirstName);
		APS18541Selector.BenefitsEligibility_BEDetail_LastName(strLastName);
		APS18541Selector.BenefitsEligibility_BEDetail_MI(strMI);
		APS18541Selector.BenefitsEligibility_BEDetail_CustomerSet(strCustomerSet);
		APS18541Selector.BenefitsEligibility_BEDetail_Customer(strCustomer);
		APS18541Selector.BenefitsEligibility_BEDetail_Client(strClient);
		APS18541Selector.BenefitsEligibility_BEDetail_Group(strGroup);
		
		APS18541Selector.BenefitsEligibility_BEDetail_EligibilityStatus();
		
		APS18541Selector.BenefitsEligibility_BEDetail_DOB(strDOB);
		APS18541Selector.BenefitsEligibility_BEDetail_DeceasedDate(strDeceasedDate);
		APS18541Selector.BenefitsEligibility_BEDetail_Gender(strGender);
		APS18541Selector.BenefitsEligibility_BEDetail_Relationship(strRelationship);
		APS18541Selector.BenefitsEligibility_BEDetail_MedicareBeneficiaryID(strMedicareBeneficiaryID);
		APS18541Selector.BenefitsEligibility_BEDetail_CaseID(strCaseID);
		APS18541Selector.BenefitsEligibility_BEDetail_UniquePersonID(strUniquePersonID);
		APS18541Selector.BenefitsEligibility_BEDetail_CardHolderFirstName(strCardHolderFirstName);
		APS18541Selector.BenefitsEligibility_BEDetail_CardHolderLastName(strCardHolderLastName);
		APS18541Selector.BenefitsEligibility_BEDetail_CardHolderMI(strCardHolderMI);
		APS18541Selector.BenefitsEligibility_BEDetail_CardReissueDate(strCardReissueDate);
		APS18541Selector.BenefitsEligibility_BEDetail_CardReissueReason(strCardReissueReason);
		APS18541Selector.BenefitsEligibility_BEDetail_Line1(strLine1);
		APS18541Selector.BenefitsEligibility_BEDetail_Line2(strLine2);
		APS18541Selector.BenefitsEligibility_BEDetail_Line3(strLine3);
		APS18541Selector.BenefitsEligibility_BEDetail_City(strCity);
		APS18541Selector.BenefitsEligibility_BEDetail_State(strState);
		APS18541Selector.BenefitsEligibility_BEDetail_ZIP(strZIP);
		APS18541Selector.BenefitsEligibility_BEDetail_Country(strCountry);
		APS18541Selector.BenefitsEligibility_BEDetail_Phone(strPhone);
		APS18541Selector.BenefitsEligibility_BEDetail_Email(strEmail);
		APS18541Selector.BenefitsEligibility_BEDetail_MiscData1(strMiscData1);
		APS18541Selector.BenefitsEligibility_BEDetail_MiscData2(strMiscData2);
		APS18541Selector.BenefitsEligibility_BEDetail_MiscData3(strMiscData3);
		
		APS18541Selector.BenefitsEligibility_BEDetail_DateTimeAdded(strDateTimeAdded);
		APS18541Selector.BenefitsEligibility_BEDetail_DeviceOperatorAdded(strDeviceOperatorAdded);
		APS18541Selector.BenefitsEligibility_BEDetail_DateTimeUpdated(strDateTimeUpdated);
		APS18541Selector.BenefitsEligibility_BEDetail_DeviceOperatorUpdated(strDeviceOperatorUpdated);
			
		for(int i=0;i<expBenefitsEligibilityDetail.size();i++)
		{
			benefitsEligibilityDetailSoft.assertEquals(APS18541Selector.actBenefitsEligibilityDetail.get(i), expBenefitsEligibilityDetail.get(i));
		}		
		benefitsEligibilityDetailSoft.assertAll();
	}
	
	//=================================================================================================================================
	
	public void verifyAdditionalEligibilityDatesDetails(Map<String,String> addEligblDatesDetails) throws Throwable{
		String strMemberID = addEligblDatesDetails.get("MemberID");
		String strAltMemberID = addEligblDatesDetails.get("AltMemberID");		
		String strFirstName = addEligblDatesDetails.get("FirstName");		
		String strLastName = addEligblDatesDetails.get("LastName");
		String strMI = addEligblDatesDetails.get("MI");
		String strCustomerSet = addEligblDatesDetails.get("CustomerSet");
		String strCustomer = addEligblDatesDetails.get("Customer");
		String strClient = addEligblDatesDetails.get("Client");
		String strGroup = addEligblDatesDetails.get("Group");
		String strMemberStartDate = addEligblDatesDetails.get("MemEligbilityStart");
		String strMemberEndDate = addEligblDatesDetails.get("MemEligbilityEnd");		
		String strMemberProcessDate = addEligblDatesDetails.get("MemEligbilityProcess");
		String strMemberStartDate1 = addEligblDatesDetails.get("MemEligbilityStart1");
		String strMemberEndDate1 = addEligblDatesDetails.get("MemEligbilityEnd1");		
		String strMemberProcessDate1 = addEligblDatesDetails.get("MemEligbilityProcess1");
		String strGroupStartDate = addEligblDatesDetails.get("GrpEligbilityStart");
		String strGroupEndDate = addEligblDatesDetails.get("GrpEligbilityEnd");
		String strGroupProcessDate = addEligblDatesDetails.get("GrpEligbilityProcess");
		String strClientStartDate = addEligblDatesDetails.get("CliEligbilityStart");		
		String strClientEndDate = addEligblDatesDetails.get("CliEligbilityEnd");		
		String strClientProcessDate = addEligblDatesDetails.get("CliEligbilityProcess");
		String strCustomerStartDate = addEligblDatesDetails.get("CusEligbilityStart");
		String strCustomerEndDate = addEligblDatesDetails.get("CusEligbilityEnd");
		String strCustomerProcessDate = addEligblDatesDetails.get("CusEligbilityProcess");
		
		expAdditionalEligibilityDates.add(strMemberID);
		expAdditionalEligibilityDates.add(strAltMemberID);
		expAdditionalEligibilityDates.add(strFirstName);
		expAdditionalEligibilityDates.add(strLastName);
		expAdditionalEligibilityDates.add(strMI);
		expAdditionalEligibilityDates.add(strCustomerSet);
		expAdditionalEligibilityDates.add(strCustomer);
		expAdditionalEligibilityDates.add(strClient);
		expAdditionalEligibilityDates.add(strGroup);		
		expAdditionalEligibilityDates.add(strMemberStartDate);
		expAdditionalEligibilityDates.add(strMemberEndDate);
		expAdditionalEligibilityDates.add(strMemberProcessDate);
		expAdditionalEligibilityDates.add(strMemberStartDate1);
		expAdditionalEligibilityDates.add(strMemberEndDate1);
		expAdditionalEligibilityDates.add(strMemberProcessDate1);
		expAdditionalEligibilityDates.add(strGroupStartDate);
		expAdditionalEligibilityDates.add(strGroupEndDate);
		expAdditionalEligibilityDates.add(strGroupProcessDate);
		expAdditionalEligibilityDates.add(strClientStartDate);
		expAdditionalEligibilityDates.add(strClientEndDate);
		expAdditionalEligibilityDates.add(strClientProcessDate);
		expAdditionalEligibilityDates.add(strCustomerStartDate);
		expAdditionalEligibilityDates.add(strCustomerEndDate);
		expAdditionalEligibilityDates.add(strCustomerProcessDate);
		
		APS18541Selector.BenefitsEligibility_BEDetail_clickOnViewAdditionalEligibilityDatesLink();
		APS18541Selector.waitUntillAdditionalEligibilityDates();
		APS18541Selector.BenefitsEligibility_AED_MemberID(strMemberID);
		APS18541Selector.BenefitsEligibility_AED_AltMemberID(strAltMemberID);
		APS18541Selector.BenefitsEligibility_AED_FirstName(strFirstName);
		APS18541Selector.BenefitsEligibility_AED_LastName(strLastName);
		APS18541Selector.BenefitsEligibility_AED_MI(strMI);
		APS18541Selector.BenefitsEligibility_AED_CustomerSet(strCustomerSet);
		APS18541Selector.BenefitsEligibility_AED_Customer(strCustomer);
		APS18541Selector.BenefitsEligibility_AED_Client(strClient);
		APS18541Selector.BenefitsEligibility_AED_Group(strGroup);
		APS18541Selector.BenefitsEligibility_AED_MemberStartDate(strMemberStartDate);
		APS18541Selector.BenefitsEligibility_AED_MemberEndDate(strMemberEndDate);
		APS18541Selector.BenefitsEligibility_AED_MemberProcessDate(strMemberProcessDate);
		APS18541Selector.BenefitsEligibility_AED_MemberStartDate1(strMemberStartDate1);
		APS18541Selector.BenefitsEligibility_AED_MemberEndDate1(strMemberEndDate1);
		APS18541Selector.BenefitsEligibility_AED_MemberProcessDate1(strMemberProcessDate1);
		APS18541Selector.BenefitsEligibility_AED_GroupStartDate(strGroupStartDate);
		APS18541Selector.BenefitsEligibility_AED_GroupEndDate(strGroupEndDate);
		APS18541Selector.BenefitsEligibility_AED_GroupProcessDate(strGroupProcessDate);
		APS18541Selector.BenefitsEligibility_AED_ClientStartDate(strClientStartDate);
		APS18541Selector.BenefitsEligibility_AED_ClientEndDate(strClientEndDate);
		APS18541Selector.BenefitsEligibility_AED_ClientProcessDate(strClientProcessDate);
		APS18541Selector.BenefitsEligibility_AED_CustomerStartDate(strCustomerStartDate);
		APS18541Selector.BenefitsEligibility_AED_CustomerEndDate(strCustomerEndDate);
		APS18541Selector.BenefitsEligibility_AED_CustomerProcessDate(strCustomerProcessDate);
		APS18541Selector.BenefitsEligibility_AED_clickOnCloseButton();
		
		for(int i=0;i<expAdditionalEligibilityDates.size();i++)
		{
			additionalEligibilityDatesSoft.assertEquals(APS18541Selector.actAdditionalEligibilityDates.get(i), expAdditionalEligibilityDates.get(i));
		}		
		additionalEligibilityDatesSoft.assertAll();
	}
	public void verifyEligibilityDatesTableValues(Map<String,String> Eligibility_Table_Values) throws Throwable
	{
		String strMemberStartDate = Eligibility_Table_Values.get("EligibilityDates_Member_StartDate");
		String strMemberEndDate = Eligibility_Table_Values.get("EligibilityDates_Member_EndDate");
		String strMemberProcessDate = Eligibility_Table_Values.get("EligibilityDates_Member_ProcessDate");
		
		String strGroupStartDate = Eligibility_Table_Values.get("EligibilityDates_Group_StartDate");
		String strGroupEndDate = Eligibility_Table_Values.get("EligibilityDates_Group_EndDate");
		String strGroupProcessDate = Eligibility_Table_Values.get("EligibilityDates_Group_ProcessDate");
		
		String strClientStartDate = Eligibility_Table_Values.get("EligibilityDates_Client_StartDate");
		String strClientEndDate = Eligibility_Table_Values.get("EligibilityDates_Client_EndDate");
		String strClientProcessDate = Eligibility_Table_Values.get("EligibilityDates_Client_ProcessDate");
		
		String strCustomerStartDate = Eligibility_Table_Values.get("EligibilityDates_Customer_StartDate");
		String strCustomerEndDate = Eligibility_Table_Values.get("EligibilityDates_Customer_EndDate");
		String strCustomerProcessDate = Eligibility_Table_Values.get("EligibilityDates_Customer_ProcessDate");
		
		expEligiblityDates.add(strMemberStartDate);
		expEligiblityDates.add(strMemberEndDate);
		expEligiblityDates.add(strMemberProcessDate);
		
		expEligiblityDates.add(strGroupStartDate);
		expEligiblityDates.add(strClientEndDate);
		expEligiblityDates.add(strClientProcessDate);
		
		expEligiblityDates.add(strClientStartDate);
		expEligiblityDates.add(strClientEndDate);
		expEligiblityDates.add(strClientProcessDate);
		
		expEligiblityDates.add(strCustomerStartDate);
		expEligiblityDates.add(strCustomerEndDate);
		expEligiblityDates.add(strCustomerProcessDate);
		
		APS18541Selector.BED_EligibilityDates_MemberStartDate(strMemberStartDate);
		APS18541Selector.BED_EligibilityDates_MemberEndDate(strMemberEndDate);
		APS18541Selector.BED_EligibilityDates_MemberProcessDate(strMemberProcessDate);
		
		APS18541Selector.BED_EligibilityDates_GroupStartDate(strGroupStartDate);
		APS18541Selector.BED_EligibilityDates_GroupEndDate(strGroupEndDate);
		APS18541Selector.BED_EligibilityDates_GroupProcessDate(strGroupProcessDate);
		
		APS18541Selector.BED_EligibilityDates_ClientStartDate(strClientStartDate);
		APS18541Selector.BED_EligibilityDates_ClientEndDate(strClientEndDate);
		APS18541Selector.BED_EligibilityDates_ClientProcessDate(strClientProcessDate);
		
		APS18541Selector.BED_EligibilityDates_CustomerStartDate(strCustomerStartDate);
		APS18541Selector.BED_EligibilityDates_CustomerEndDate(strCustomerEndDate);
		APS18541Selector.BED_EligibilityDates_CustomerProcessDate(strCustomerProcessDate);
		
		for(int i=0;i<expAdditionalEligibilityDates.size();i++)
		{
			EligibilityDatesSoft.assertEquals(APS18541Selector.actEligibilityDates.get(i), expEligiblityDates.get(i));
		}		
		EligibilityDatesSoft.assertAll();	
	}





// End of the class
}
