package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.MemberLookup_Claim_ClaimRawDataSelector;

public class MemberLookup_Claim_ClaimRawData_Steps {

	MemberLookup_Claim_ClaimRawDataSelector memberLookup_Claim_ClaimRawDataSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expClaimRawData = new ArrayList<String>();
	public SoftAssert claimRawDataSoft = new SoftAssert();
	
	public MemberLookup_Claim_ClaimRawData_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		memberLookup_Claim_ClaimRawDataSelector = new MemberLookup_Claim_ClaimRawDataSelector(SharedResource,utils);
	}
	
	public void clickOnClaimRawData() throws Throwable{
		memberLookup_Claim_ClaimRawDataSelector.MemberLookup_Claim_clickOnClaimRawData();
		memberLookup_Claim_ClaimRawDataSelector.waitUnitillClaimRawData();
	}
	
	public void verifyClaimRawData() throws Throwable{
		memberLookup_Claim_ClaimRawDataSelector.MemberLookup_Claim_verifyPresenceOfTransmittedData();
		memberLookup_Claim_ClaimRawDataSelector.MemberLookup_Claim_verifyPresenceOfResponseData();
	}	
	
	public void verifyDataLength(Map<String,String> dataLength)throws Throwable {
		String strDataLength = dataLength.get("DataLength");		 
		 
		claimRawDataSoft.assertEquals(memberLookup_Claim_ClaimRawDataSelector.checkDataLenght(), strDataLength);		
		//claimRawDataSoft.assertAll();
		
	}
	 	 	 
}

