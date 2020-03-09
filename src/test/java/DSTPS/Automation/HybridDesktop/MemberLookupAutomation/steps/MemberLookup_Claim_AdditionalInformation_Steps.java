package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.MemberLookup_Claim_AdditionalInformationSelector;

public class MemberLookup_Claim_AdditionalInformation_Steps {

	MemberLookup_Claim_AdditionalInformationSelector memberLookup_Claim_AdditionalInformationSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expAdditionalInformation = new ArrayList<String>();
	public SoftAssert additionalInformationSoft = new SoftAssert();
	
	
	public MemberLookup_Claim_AdditionalInformation_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		memberLookup_Claim_AdditionalInformationSelector = new MemberLookup_Claim_AdditionalInformationSelector(SharedResource,utils);
	}
	
	public void clickOnAdditionalInformation() throws Throwable{
		memberLookup_Claim_AdditionalInformationSelector.MemberLookup_Claim_clickOnAdditionalInformation();
		memberLookup_Claim_AdditionalInformationSelector.waitUnitillAdditionalInformation();
	}
	
	public void verifyAdditionalInformation(Map<String,String> additionalInformation)throws Throwable {
		 
		String strCategory = additionalInformation.get("Category");	
		String strResult = additionalInformation.get("Result");
		
		memberLookup_Claim_AdditionalInformationSelector.MemberLookup_Claim_selectCategoryItem(strCategory);
		Thread.sleep(1000);
		
		expAdditionalInformation.add(strResult);
		  
		memberLookup_Claim_AdditionalInformationSelector.Claim_AdditionalInformation_Result(strResult);
		
		 	
		for(int i=0;i<expAdditionalInformation.size();i++)
		{
			additionalInformationSoft.assertEquals(memberLookup_Claim_AdditionalInformationSelector.actAdditionalInformation.get(i), expAdditionalInformation.get(i));
		}		
		additionalInformationSoft.assertAll();
		
	}	
	
} 





