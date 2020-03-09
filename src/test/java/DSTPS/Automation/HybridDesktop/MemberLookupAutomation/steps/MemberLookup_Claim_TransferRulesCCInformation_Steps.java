package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.MemberLookup_Claim_TransferRulesCCInformationSelector;

public class MemberLookup_Claim_TransferRulesCCInformation_Steps {

	MemberLookup_Claim_TransferRulesCCInformationSelector memberLookup_Claim_TransferRulesCCInformationSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expTransferRulesCCInfo = new ArrayList<String>();
	public SoftAssert transferRulesCCInfoSoft = new SoftAssert();
	
	
	public MemberLookup_Claim_TransferRulesCCInformation_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		memberLookup_Claim_TransferRulesCCInformationSelector = new MemberLookup_Claim_TransferRulesCCInformationSelector(SharedResource,utils);
	}
	
	public void clickOnTransferRulesCCInfo() throws Throwable{
		memberLookup_Claim_TransferRulesCCInformationSelector.MemberLookup_Claim_clickOnTransferRulesCCInfo();
		memberLookup_Claim_TransferRulesCCInformationSelector.waitUnitillTransferRulesCCInfoDetails();
	}
	
	public void verifyTransferRulesCCInfo(Map<String,String> transferRulesCCInfo)throws Throwable {
		 
		String strCustomerNumber = transferRulesCCInfo.get("CustomerNumber");
		String strCustomerName = transferRulesCCInfo.get("CustomerName");
		String strClientNumber = transferRulesCCInfo.get("ClientNumber");
		String strClientName = transferRulesCCInfo.get("ClientName");
		String strGroupNumber = transferRulesCCInfo.get("GroupNumber");
		String strGroupName = transferRulesCCInfo.get("GroupName");
		String strDateTermed = transferRulesCCInfo.get("DateTermed");
		String strAffiliateCustNo = transferRulesCCInfo.get("AffiliateCustNo");
		String strTFNMain = transferRulesCCInfo.get("TFNMain");
		String strTFNMember = transferRulesCCInfo.get("TFNMember");
		String strTFNPreAuth = transferRulesCCInfo.get("TFNPreAuth");
		String strTFNMailOrder = transferRulesCCInfo.get("TFNMailOrder");
		String strTFNContracting = transferRulesCCInfo.get("TFNContracting");		 
		String strTimeZone = transferRulesCCInfo.get("TimeZone");
		String strBusnessHours = transferRulesCCInfo.get("BusnessHours");
		//String strComments = transferRulesCCInfo.get("Comments");
		 		 
		expTransferRulesCCInfo.add(strCustomerNumber);
		expTransferRulesCCInfo.add(strCustomerName);
		expTransferRulesCCInfo.add(strClientNumber);
		expTransferRulesCCInfo.add(strClientName);
		expTransferRulesCCInfo.add(strGroupNumber);
		expTransferRulesCCInfo.add(strGroupName);
		expTransferRulesCCInfo.add(strDateTermed);
		expTransferRulesCCInfo.add(strAffiliateCustNo);
		expTransferRulesCCInfo.add(strTFNMain);
		expTransferRulesCCInfo.add(strTFNMember);
		expTransferRulesCCInfo.add(strTFNPreAuth);
		expTransferRulesCCInfo.add(strTFNMailOrder);
		expTransferRulesCCInfo.add(strTFNContracting);		 
		expTransferRulesCCInfo.add(strTimeZone);
		expTransferRulesCCInfo.add(strBusnessHours);
		//expTransferRulesCCInfo.add(strComments);		 
		
		memberLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_CustomerNumber(strCustomerNumber);
		memberLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_CustomerName(strCustomerName);
		memberLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_ClientNumber(strClientNumber);
		memberLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_ClientName(strClientName);
		memberLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_GroupNumber(strGroupNumber);
		memberLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_GroupName(strGroupName);
		memberLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_DateTermed(strDateTermed);
		memberLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_AffiliateCustNo(strAffiliateCustNo);
		memberLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_TFNMain(strTFNMain);
		memberLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_TFNMember(strTFNMember);
		memberLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_TFNPreAuth(strTFNPreAuth);
		memberLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_TFNMailOrder(strTFNMailOrder);
		memberLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_TFNContracting(strTFNContracting);
		memberLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_TimeZone(strTimeZone);
		memberLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_BusnessHours(strBusnessHours);
		//memberLookup_Claim_TransferRulesCCInformationSelector.Claim_TransferRulesCCInfo_Comments(strComments);
		 		 
			
		for(int i=0;i<expTransferRulesCCInfo.size();i++)
		{
			transferRulesCCInfoSoft.assertEquals(memberLookup_Claim_TransferRulesCCInformationSelector.actTransferRulesCCInfo.get(i), expTransferRulesCCInfo.get(i));
		}		
		transferRulesCCInfoSoft.assertAll();
		
	}	
	
	 
}

