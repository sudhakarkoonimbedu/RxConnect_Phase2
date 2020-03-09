package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.MemberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector;

public class MemberLookup_Claim_DrugUtillizationReviewResponseDetails_Steps {

	MemberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expDrugUtillizationReviewResponseDetails = new ArrayList<String>();
	public SoftAssert drugUtillizationReviewResponseDetailsSoft = new SoftAssert();
	
	
	public MemberLookup_Claim_DrugUtillizationReviewResponseDetails_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector = new MemberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector(SharedResource,utils);
	}
	
	public void clickOnDrugUtillizationReviewResponseDetails() throws Throwable{
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.MemberLookup_Claim_clickOnDrugUtillizationReviewResponseDetails();
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.waitUnitillDURInfo();
	}
	
	public void verifyDrugUtillizationReviewResponseDetails(Map<String,String> drugUtillizationReviewResponseDetails)throws Throwable {
		 
		String strSeverityCode = drugUtillizationReviewResponseDetails.get("SeverityCode");
		String strMonograph = drugUtillizationReviewResponseDetails.get("Monograph");
		String strHansten = drugUtillizationReviewResponseDetails.get("Hansten");
		String strDif = drugUtillizationReviewResponseDetails.get("Dif");
		String strInteventionCode = drugUtillizationReviewResponseDetails.get("InteventionCode");
		String strOutcomeCode = drugUtillizationReviewResponseDetails.get("OutcomeCode");
		String strClaim = drugUtillizationReviewResponseDetails.get("Claim");
		String strDrugName = drugUtillizationReviewResponseDetails.get("DrugName");
		String strDateFilled = drugUtillizationReviewResponseDetails.get("DateFilled");
		String strMetricQuantity = drugUtillizationReviewResponseDetails.get("MetricQuantity");
		String strSafetyEditID = drugUtillizationReviewResponseDetails.get("SafetyEditID");
		String strDURProtocolID = drugUtillizationReviewResponseDetails.get("DURProtocolID");
		String strFreeformMessageID = drugUtillizationReviewResponseDetails.get("FreeformMessageID");
		String strPharmacyID = drugUtillizationReviewResponseDetails.get("PharmacyID");
		String strServProviderIDQlfr = drugUtillizationReviewResponseDetails.get("ServProviderIDQlfr");
		String strPharmacyNPI = drugUtillizationReviewResponseDetails.get("PharmacyNPI");
		String strPharmacyName = drugUtillizationReviewResponseDetails.get("PharmacyName");
		String strPrescriberID = drugUtillizationReviewResponseDetails.get("PrescriberID");
		String strPrescriberIDQlflr = drugUtillizationReviewResponseDetails.get("PrescriberIDQlflr");
		String strPrescriberNPI = drugUtillizationReviewResponseDetails.get("PrescriberNPI");
		String strPrescriberName = drugUtillizationReviewResponseDetails.get("PrescriberName");
		String strDURFreeTextMessage = drugUtillizationReviewResponseDetails.get("DURFreeTextMessage");
		String strDURAddTextMessage = drugUtillizationReviewResponseDetails.get("DURAddTextMessage");		 
		 		 
		expDrugUtillizationReviewResponseDetails.add(strSeverityCode);
		expDrugUtillizationReviewResponseDetails.add(strMonograph);
		expDrugUtillizationReviewResponseDetails.add(strHansten);
		expDrugUtillizationReviewResponseDetails.add(strDif);
		expDrugUtillizationReviewResponseDetails.add(strInteventionCode);
		expDrugUtillizationReviewResponseDetails.add(strOutcomeCode);
		expDrugUtillizationReviewResponseDetails.add(strClaim);
		expDrugUtillizationReviewResponseDetails.add(strDrugName);
		expDrugUtillizationReviewResponseDetails.add(strDateFilled);
		expDrugUtillizationReviewResponseDetails.add(strMetricQuantity);
		expDrugUtillizationReviewResponseDetails.add(strSafetyEditID);
		expDrugUtillizationReviewResponseDetails.add(strDURProtocolID);
		expDrugUtillizationReviewResponseDetails.add(strFreeformMessageID);
		expDrugUtillizationReviewResponseDetails.add(strPharmacyID);
		expDrugUtillizationReviewResponseDetails.add(strServProviderIDQlfr);
		expDrugUtillizationReviewResponseDetails.add(strPharmacyNPI);
		expDrugUtillizationReviewResponseDetails.add(strPharmacyName);
		expDrugUtillizationReviewResponseDetails.add(strPrescriberID);
		expDrugUtillizationReviewResponseDetails.add(strPrescriberIDQlflr);
		expDrugUtillizationReviewResponseDetails.add(strPrescriberNPI);
		expDrugUtillizationReviewResponseDetails.add(strPrescriberName);
		expDrugUtillizationReviewResponseDetails.add(strDURFreeTextMessage);
		expDrugUtillizationReviewResponseDetails.add(strDURAddTextMessage);		 
		
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.Claim_DrugUtillizationReviewResponseDetails_SeverityCode(strSeverityCode);
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.Claim_DrugUtillizationReviewResponseDetails_Monograph(strMonograph);
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.Claim_DrugUtillizationReviewResponseDetails_Hansten(strHansten);
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.Claim_DrugUtillizationReviewResponseDetails_Dif(strDif);
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.Claim_DrugUtillizationReviewResponseDetails_InteventionCode(strInteventionCode);
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.Claim_DrugUtillizationReviewResponseDetails_OutcomeCode(strOutcomeCode);
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.Claim_DrugUtillizationReviewResponseDetails_Claim(strClaim);
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.Claim_DrugUtillizationReviewResponseDetails_DrugName(strDrugName);
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.Claim_DrugUtillizationReviewResponseDetails_DateFilled(strDateFilled);
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.Claim_DrugUtillizationReviewResponseDetails_MetricQuantity(strMetricQuantity);
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.Claim_DrugUtillizationReviewResponseDetails_SafetyEditID(strSafetyEditID);
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.Claim_DrugUtillizationReviewResponseDetails_DURProtocolID(strDURProtocolID);
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.Claim_DrugUtillizationReviewResponseDetails_FreeformMessageID(strFreeformMessageID);
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.Claim_DrugUtillizationReviewResponseDetails_PharmacyID(strPharmacyID);
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.Claim_DrugUtillizationReviewResponseDetails_ServProviderIDQlfr(strServProviderIDQlfr);
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.Claim_DrugUtillizationReviewResponseDetails_PharmacyNPI(strPharmacyNPI);
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.Claim_DrugUtillizationReviewResponseDetails_PharmacyName(strPharmacyName);
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.Claim_DrugUtillizationReviewResponseDetails_PrescriberID(strPrescriberID);
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.Claim_DrugUtillizationReviewResponseDetails_PrescriberID(strPrescriberIDQlflr);
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.Claim_DrugUtillizationReviewResponseDetails_PrescriberNPI(strPrescriberNPI);
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.Claim_DrugUtillizationReviewResponseDetails_PrescriberName(strPrescriberName);
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.Claim_DrugUtillizationReviewResponseDetails_DURFreeTextMessage(strDURFreeTextMessage);
		memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.Claim_DrugUtillizationReviewResponseDetails_DURAddTextMessage(strDURAddTextMessage);
		 		 		 
			
		for(int i=0;i<expDrugUtillizationReviewResponseDetails.size();i++)
		{
			drugUtillizationReviewResponseDetailsSoft.assertEquals(memberLookup_Claim_DrugUtillizationReviewResponseDetailsSelector.actTransferRulesCCInfo.get(i), expDrugUtillizationReviewResponseDetails.get(i));
		}		
		drugUtillizationReviewResponseDetailsSoft.assertAll();
		
	}	
	
	 
}

