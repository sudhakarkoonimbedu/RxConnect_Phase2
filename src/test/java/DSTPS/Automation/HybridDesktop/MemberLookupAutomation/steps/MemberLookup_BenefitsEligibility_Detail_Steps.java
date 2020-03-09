package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.MemberLookup_BenefitsEligibility_DetailSelector;

public class MemberLookup_BenefitsEligibility_Detail_Steps {

	MemberLookup_BenefitsEligibility_DetailSelector memberLookup_BenefitsEligibility_DetailSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expBenefitsEligibilityDetail = new ArrayList<String>();
	public ArrayList<String> expAdditionalEligibilityDates = new ArrayList<String>();
	public ArrayList<String> expMemberIDDetails = new ArrayList<String>();	
	public SoftAssert benefitsEligibilityDetailSoft = new SoftAssert();
	public SoftAssert additionalEligibilityDatesSoft = new SoftAssert();
	public SoftAssert memberIDDetailsSoft = new SoftAssert();
	
	public MemberLookup_BenefitsEligibility_Detail_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		memberLookup_BenefitsEligibility_DetailSelector = new MemberLookup_BenefitsEligibility_DetailSelector(SharedResource,utils);
	}
	
	public void verifyBenefitsEligibilityDetails(Map<String,String> benefitsEligibilityDetails)throws Throwable {
		String strMemberID = benefitsEligibilityDetails.get("MemberID");
		String strAltMemberID = benefitsEligibilityDetails.get("AltMemberID");		
		String strFirstName = benefitsEligibilityDetails.get("FirstName");		
		String strLastName = benefitsEligibilityDetails.get("LastName");
		String strMI = benefitsEligibilityDetails.get("MI");
		String strCustomerSet = benefitsEligibilityDetails.get("CustomerSet");
		String strCustomer = benefitsEligibilityDetails.get("Customer");
		String strClient = benefitsEligibilityDetails.get("Client");
		String strGroup = benefitsEligibilityDetails.get("Group");
		String strDOB = benefitsEligibilityDetails.get("DOB");
		String strDeceasedDate = benefitsEligibilityDetails.get("DeceasedDate");		
		String strGender = benefitsEligibilityDetails.get("Gender");		
		String strRelationship = benefitsEligibilityDetails.get("Relationship");
		String strMedicareBeneficiaryID = benefitsEligibilityDetails.get("MedicareBeneficiaryID");
		String strCaseID = benefitsEligibilityDetails.get("CaseId");
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
		
		expBenefitsEligibilityDetail.add(strMemberID);
		expBenefitsEligibilityDetail.add(strAltMemberID);
		expBenefitsEligibilityDetail.add(strFirstName);
		expBenefitsEligibilityDetail.add(strLastName);
		expBenefitsEligibilityDetail.add(strMI);
		expBenefitsEligibilityDetail.add(strCustomerSet);
		expBenefitsEligibilityDetail.add(strCustomer);
		expBenefitsEligibilityDetail.add(strClient);
		expBenefitsEligibilityDetail.add(strGroup);
		expBenefitsEligibilityDetail.add(strDOB);
		expBenefitsEligibilityDetail.add(strDeceasedDate);
		expBenefitsEligibilityDetail.add(strGender);
		expBenefitsEligibilityDetail.add(strRelationship);
		expBenefitsEligibilityDetail.add(strMedicareBeneficiaryID);
		expBenefitsEligibilityDetail.add(strCaseID);
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
		
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_MemberID(strMemberID);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_AltMemberID(strAltMemberID);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_FirstName(strFirstName);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_LastName(strLastName);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_MI(strMI);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_CustomerSet(strCustomerSet);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_Customer(strCustomer);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_Client(strClient);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_Group(strGroup);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_DOB(strDOB);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_DeceasedDate(strDeceasedDate);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_Gender(strGender);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_Relationship(strRelationship);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_MedicareBeneficiaryID(strMedicareBeneficiaryID);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_CaseID(strCaseID);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_CardHolderFirstName(strCardHolderFirstName);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_CardHolderLastName(strCardHolderLastName);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_CardHolderMI(strCardHolderMI);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_CardReissueDate(strCardReissueDate);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_CardReissueReason(strCardReissueReason);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_Line1(strLine1);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_Line2(strLine2);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_Line3(strLine3);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_City(strCity);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_State(strState);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_ZIP(strZIP);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_Country(strCountry);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_Phone(strPhone);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_Email(strEmail);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_MiscData1(strMiscData1);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_MiscData2(strMiscData2);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_MiscData3(strMiscData3);
			
		for(int i=0;i<expBenefitsEligibilityDetail.size();i++)
		{
			benefitsEligibilityDetailSoft.assertEquals(memberLookup_BenefitsEligibility_DetailSelector.actBenefitsEligibilityDetail.get(i), expBenefitsEligibilityDetail.get(i));
		}		
		benefitsEligibilityDetailSoft.assertAll();
	}
	
	
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
		expAdditionalEligibilityDates.add(strGroupStartDate);
		expAdditionalEligibilityDates.add(strGroupEndDate);
		expAdditionalEligibilityDates.add(strGroupProcessDate);
		expAdditionalEligibilityDates.add(strClientStartDate);
		expAdditionalEligibilityDates.add(strClientEndDate);
		expAdditionalEligibilityDates.add(strClientProcessDate);
		expAdditionalEligibilityDates.add(strCustomerStartDate);
		expAdditionalEligibilityDates.add(strCustomerEndDate);
		expAdditionalEligibilityDates.add(strCustomerProcessDate);
		
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_clickOnViewAdditionalEligibilityDatesLink();
		memberLookup_BenefitsEligibility_DetailSelector.waitUntillAdditionalEligibilityDates();
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_MemberID(strMemberID);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_AltMemberID(strAltMemberID);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_FirstName(strFirstName);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_LastName(strLastName);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_MI(strMI);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_CustomerSet(strCustomerSet);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_Customer(strCustomer);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_Client(strClient);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_Group(strGroup);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_MemberStartDate(strMemberStartDate);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_MemberEndDate(strMemberEndDate);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_MemberProcessDate(strMemberProcessDate);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_GroupStartDate(strGroupStartDate);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_GroupEndDate(strGroupEndDate);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_GroupProcessDate(strGroupProcessDate);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_ClientStartDate(strClientStartDate);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_ClientEndDate(strClientEndDate);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_ClientProcessDate(strClientProcessDate);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_CustomerStartDate(strCustomerStartDate);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_CustomerEndDate(strCustomerEndDate);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_CustomerProcessDate(strCustomerProcessDate);
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_AED_clickOnCloseButton();
		
		for(int i=0;i<expAdditionalEligibilityDates.size();i++)
		{
			additionalEligibilityDatesSoft.assertEquals(memberLookup_BenefitsEligibility_DetailSelector.actAdditionalEligibilityDates.get(i), expAdditionalEligibilityDates.get(i));
		}		
		additionalEligibilityDatesSoft.assertAll();
	}
	
	
	public void verifyMemberIDDetails(Map<String,String> memberIDDetails) throws Throwable{
		String strMCS = memberIDDetails.get("MasterCustomerSet");
		String strCustomerName = memberIDDetails.get("CustomerName");		
		String strClientName = memberIDDetails.get("ClientName");		
		String strExternalGroupID = memberIDDetails.get("ExternalGroupID");
		String strInternalGroupID = memberIDDetails.get("InternalGroupID");
		String strMemberID = memberIDDetails.get("MemberID");
		String strMemberLastFirst = memberIDDetails.get("MemberLastFirstName");		
		String strDOB = memberIDDetails.get("DateOfBirth");		
		String strGender = memberIDDetails.get("Gender");
		String strActiveEffDateRange = memberIDDetails.get("ActiveEffDateRange");
		String strTest = memberIDDetails.get("Test");
		
		expMemberIDDetails.add(strMCS);
		expMemberIDDetails.add(strCustomerName);
		expMemberIDDetails.add(strClientName);
		expMemberIDDetails.add(strExternalGroupID);
		expMemberIDDetails.add(strInternalGroupID);
		expMemberIDDetails.add(strMemberID);
		expMemberIDDetails.add(strMemberLastFirst);
		expMemberIDDetails.add(strDOB);
		expMemberIDDetails.add(strGender);
		expMemberIDDetails.add(strActiveEffDateRange);
		expMemberIDDetails.add(strTest);		
		
		memberLookup_BenefitsEligibility_DetailSelector.BenefitsEligibility_BEDetail_clickOnMemberIDLink();
		memberLookup_BenefitsEligibility_DetailSelector.verifyMemberIDDetails();
		memberLookup_BenefitsEligibility_DetailSelector.Member_MasterCustomerSet(strMCS);
		memberLookup_BenefitsEligibility_DetailSelector.Member_CustomerName(strCustomerName);
		memberLookup_BenefitsEligibility_DetailSelector.Member_ClientName(strClientName);
		memberLookup_BenefitsEligibility_DetailSelector.Member_ExternalGroupID(strExternalGroupID);
		memberLookup_BenefitsEligibility_DetailSelector.Member_InternalGroupID(strInternalGroupID);
		memberLookup_BenefitsEligibility_DetailSelector.Member_MemberID(strMemberID);
		memberLookup_BenefitsEligibility_DetailSelector.Member_MemberLastFirst(strMemberLastFirst);
		memberLookup_BenefitsEligibility_DetailSelector.Member_DOB(strDOB);
		memberLookup_BenefitsEligibility_DetailSelector.Member_Gender(strGender);
		memberLookup_BenefitsEligibility_DetailSelector.Member_ActiveEffDateRange(strActiveEffDateRange);
		memberLookup_BenefitsEligibility_DetailSelector.Member_Test(strTest);
		memberLookup_BenefitsEligibility_DetailSelector.closeRxNovaMember();
		
		for(int i=0;i<expMemberIDDetails.size();i++)
		{
			memberIDDetailsSoft.assertEquals(memberLookup_BenefitsEligibility_DetailSelector.actMemberIDDetails.get(i), expMemberIDDetails.get(i));
		}		
		memberIDDetailsSoft.assertAll();
	}
}

