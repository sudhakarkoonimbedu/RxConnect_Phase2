package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.MemberLookup_Authorization_AuthResultsSelector;

public class MemberLookup_Authorization_AuthResults_Steps {

	MemberLookup_Authorization_AuthResultsSelector memberLookup_Authorization_AuthResultsSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expAuthResults = new ArrayList<String>();
	public SoftAssert authResultsSoft = new SoftAssert();
	
	public MemberLookup_Authorization_AuthResults_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		memberLookup_Authorization_AuthResultsSelector = new MemberLookup_Authorization_AuthResultsSelector(SharedResource,utils);
	}
	
	public void verifyAuthResults(Map<String,String> authResultsDetails)throws Throwable {
		String strAuthID = authResultsDetails.get("AuthID");
		String strAuthType = authResultsDetails.get("AuthType");		
		String strStatus = authResultsDetails.get("Status");		
		String strRxNumber = authResultsDetails.get("RxNumber");
		String strDrugName = authResultsDetails.get("DrugName");
		String strEffectiveDate = authResultsDetails.get("EffectiveDate");
		String strEndDate = authResultsDetails.get("EndDate");
		
		expAuthResults.add(strAuthID);
		expAuthResults.add(strAuthType);
		expAuthResults.add(strStatus);
		expAuthResults.add(strRxNumber);
		expAuthResults.add(strDrugName);
		expAuthResults.add(strEffectiveDate);
		expAuthResults.add(strEndDate);
		
		memberLookup_Authorization_AuthResultsSelector.Authorization_AuthResults_AuthID(strAuthID);
		memberLookup_Authorization_AuthResultsSelector.Authorization_AuthResults_AuthType(strAuthType);
		memberLookup_Authorization_AuthResultsSelector.Authorization_AuthResults_Status(strStatus);
		memberLookup_Authorization_AuthResultsSelector.Authorization_AuthResults_RxNumber(strRxNumber);
		memberLookup_Authorization_AuthResultsSelector.Authorization_AuthResults_DrugName(strDrugName);
		memberLookup_Authorization_AuthResultsSelector.Authorization_AuthResults_EffectiveDate(strEffectiveDate);
		memberLookup_Authorization_AuthResultsSelector.Authorization_AuthResults_EndDate(strEndDate);
		
		for(int i=0;i<expAuthResults.size();i++)
		{
			authResultsSoft.assertEquals(memberLookup_Authorization_AuthResultsSelector.actAuthResults.get(i), expAuthResults.get(i));
		}		
		authResultsSoft.assertAll();
	}	
}

