package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.APS11733_PharmacyLookUp_ClaimAndErrorVerification_Selector;

public class APS11733_PharmacyLookup_VerifyRawDataErrors_Steps 
{
	private HybridDesktop_SharedResource SharedResource;
	@SuppressWarnings("unused")
	private WebDriver driver;
	private RxNova_Utlilty utils;
	private APS11733_PharmacyLookUp_ClaimAndErrorVerification_Selector aps11733Selector;
	
	public ArrayList<String> expMemberDetails = new ArrayList<String>();
	public ArrayList<String> expClaimRawData = new ArrayList<String>();
	public ArrayList<String> expNcpdpMessage = new ArrayList<String>();
	public ArrayList<String> expRxNovaMessage = new ArrayList<String>();
	
	
	public SoftAssert memberDetailsSoft = new SoftAssert();
	public SoftAssert claimRawDataSoft = new SoftAssert();
	public SoftAssert NcpdpMessageSoft = new SoftAssert();
	public SoftAssert RxNovaMessageSoft = new SoftAssert();
	
	public APS11733_PharmacyLookup_VerifyRawDataErrors_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable
	{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		aps11733Selector = new APS11733_PharmacyLookUp_ClaimAndErrorVerification_Selector(SharedResource,utils);
	}
	public void perform_PharmacyLookup_Search(Map<String,String> searchInputs) throws Throwable
	{
		String sPharmacyNPI = searchInputs.get("PharmacyNPI");
		String sRxNumber = searchInputs.get("RxNumber");
		String sStartDate = searchInputs.get("Start_Date");
		
		aps11733Selector.PharmacyLookup_LandingPage_enterPharmacy_NPI(sPharmacyNPI);
		aps11733Selector.PharmacyLookup_LandingPage_enterRx_Number(sRxNumber);
		aps11733Selector.PharmacyLookup_LandingPage_enterStartDate(sStartDate);
		aps11733Selector.PharmacyLookup_LandingPage_clickOnSearchButton();
		aps11733Selector.waitUntillPharmacySearchResults();
		aps11733Selector.verifyPharmacySearchResults();
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
		
		expMemberDetails.add(strMemberID);
		expMemberDetails.add(strDateOfBirth);
		expMemberDetails.add(strMemberName);
		expMemberDetails.add(strError);
		expMemberDetails.add(strDate);
		expMemberDetails.add(strTime);
		expMemberDetails.add(strCICSStatus);
		expMemberDetails.add(strCustID);
		expMemberDetails.add(strClientID);
		expMemberDetails.add(strGroup);
		
		aps11733Selector.waitUntillPharmacySearchResults();
		aps11733Selector.Member_Details_MemberID(strMemberID);
		aps11733Selector.Member_Details_DateOfBirth(strDateOfBirth);
		aps11733Selector.Member_Details_MemberName(strMemberName);
		aps11733Selector.Member_Details_Error(strError);
		aps11733Selector.Member_Details_Date(strDate);
		aps11733Selector.Member_Details_Time(strTime);
		aps11733Selector.Member_Details_CICSStatus(strCICSStatus);
		aps11733Selector.Member_Details_CustID(strCustID);
		aps11733Selector.Member_Details_ClientID(strClientID);
		aps11733Selector.Member_Details_Group(strGroup);
		
		for(int i=0;i<expMemberDetails.size();i++)
		{
			memberDetailsSoft.assertEquals(aps11733Selector.actMemberDetails.get(i), expMemberDetails.get(i));
		}		
		memberDetailsSoft.assertAll();
		memberDetailsSoft = null;
	}
	public void perform_Click_On_PlayButton() throws Throwable
	{
		aps11733Selector.perform_Click_On_PlayButton();		
	}
	public void verify_POS_TransactionData() throws Throwable
	{
		aps11733Selector.waitUntillClaimRawDataTable();
		aps11733Selector.verifyClaimRawDataTable();
	}
	public void verifyOnClaimRawData(Map<String,String> dataLength) throws Throwable
	{
		String strDataLength = dataLength.get("DataLength");
		
		aps11733Selector.PharmacyLookup_Claim_verifyPresenceOfTransmittedData();
		aps11733Selector.PharmacyLookup_Claim_verifyPresenceOfResponseData();
		
		claimRawDataSoft.assertEquals(aps11733Selector.checkDataLenght(), strDataLength);
	}
	public void verify_NCPDP_ErrorMessageTableData(Map<String,String> ncpdpErrorMessage)
	{
		String strcode = ncpdpErrorMessage.get("code");
		String strocc = ncpdpErrorMessage.get("occ");
		String strncpdp_error_message = ncpdpErrorMessage.get("ncpdp_error_message");
		
		expNcpdpMessage.add(strcode);
		expNcpdpMessage.add(strocc);
		expNcpdpMessage.add(strncpdp_error_message);
		
		aps11733Selector.ncpdp_errorMessage_Code(strcode);
		aps11733Selector.ncpdp_errorMessage_Occ(strocc);
		aps11733Selector.ncpdp_errorMessage_ncpdpErrorMessage(strncpdp_error_message);
		
		for(int ncpdp=0;ncpdp<expNcpdpMessage.size();ncpdp++)
		{
			NcpdpMessageSoft.assertEquals(aps11733Selector.actNCPDPErrorMessage.get(ncpdp),expNcpdpMessage.get(ncpdp));
		}
	}
	public void verify_RxNova_ErrorMessage_TableData(Map<String,String> rxNovaErrorMessage)
	{
		String strcode_1 = rxNovaErrorMessage.get("code1");
		String strd_i_1 = rxNovaErrorMessage.get("di1"); 
		String strrxnova_error_message1 = rxNovaErrorMessage.get("rxnova_error_message1");
		
		String strcode_2 = rxNovaErrorMessage.get("code2");
		String strd_i_2 = rxNovaErrorMessage.get("di2"); 
		String strrxnova_error_message2 = rxNovaErrorMessage.get("rxnova_error_message2");
		
		expRxNovaMessage.add(strcode_1);
		expRxNovaMessage.add(strd_i_1);
		expRxNovaMessage.add(strrxnova_error_message1);
		
		expRxNovaMessage.add(strcode_2);
		expRxNovaMessage.add(strd_i_2);
		expRxNovaMessage.add(strrxnova_error_message2);
		
		aps11733Selector.ncpdp_rxnovaMessage_Code1(strcode_1);
		aps11733Selector.ncpdp_rxnovaMessage_DI1(strd_i_1);
		aps11733Selector.ncpdp_rxnovaMessage_RxNovaErrorMessage1(strrxnova_error_message1);
		
		aps11733Selector.ncpdp_rxnovaMessage_Code2(strcode_2);
		aps11733Selector.ncpdp_rxnovaMessage_DI2(strd_i_2);
		aps11733Selector.ncpdp_rxnovaMessage_RxNovaErrorMessage2(strrxnova_error_message2);
		
		for(int rxnova=0;rxnova<expRxNovaMessage.size();rxnova++)
		{
			RxNovaMessageSoft.assertEquals(aps11733Selector.actRxNovaErrorMessage.get(rxnova),expRxNovaMessage.get(rxnova));
		}
		
	}
	
// End Of Class	
}
