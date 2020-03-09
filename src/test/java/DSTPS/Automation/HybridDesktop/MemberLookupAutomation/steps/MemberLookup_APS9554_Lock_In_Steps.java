package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.MemberLookup_APS9554_Lock_InSelector;

public class MemberLookup_APS9554_Lock_In_Steps {

	MemberLookup_APS9554_Lock_InSelector memberLookup_APS9554_Lock_InSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expPrescriberLockinDetails = new ArrayList<String>();
	public ArrayList<String> expPharmacyInformation = new ArrayList<String>();
	//public ArrayList<String> expInvalidPharmacyInformation = new ArrayList<String>();
	public SoftAssert prescriberLockinSoft = new SoftAssert();
	public SoftAssert pharmacyInformationSoft = new SoftAssert();
	//public SoftAssert invalidPharmacyInformationSoft = new SoftAssert();
	
	public MemberLookup_APS9554_Lock_In_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		memberLookup_APS9554_Lock_InSelector = new MemberLookup_APS9554_Lock_InSelector(SharedResource,utils);
	}
	
	public void clickOnViewLockinInformationLink() throws Throwable {
		memberLookup_APS9554_Lock_InSelector.BenefitsEligibility_BEDetail_clickOnViewLockInInformationLink();
	}
	
	public void verifyLockinInformation() {
		memberLookup_APS9554_Lock_InSelector.verifyLockinInformation();
	}
	
	public void verifyPrescriberLockinDetails(Map<String,String> prescriberLockinDetails)throws Throwable {
		String strPrescriberID = prescriberLockinDetails.get("PrescriberID");
		String strBeginDate = prescriberLockinDetails.get("BeginDate");		
		String strEndDate = prescriberLockinDetails.get("EndDate");		
		String strProcessDate = prescriberLockinDetails.get("ProcessDate");
		
		expPrescriberLockinDetails.add(strPrescriberID);
		expPrescriberLockinDetails.add(strBeginDate);
		expPrescriberLockinDetails.add(strEndDate);
		expPrescriberLockinDetails.add(strProcessDate);	
		
		memberLookup_APS9554_Lock_InSelector.waitUntillLockinInformation();
		memberLookup_APS9554_Lock_InSelector.BenefitsEligibility_LIPL_PrescriberID(strPrescriberID);
		memberLookup_APS9554_Lock_InSelector.BenefitsEligibility_LIPL_BeginDate(strBeginDate);
		memberLookup_APS9554_Lock_InSelector.BenefitsEligibility_LIPL_EndDate(strEndDate);
		memberLookup_APS9554_Lock_InSelector.BenefitsEligibility_LIPL_ProcessDate(strProcessDate);		
			
		for(int i=0;i<expPrescriberLockinDetails.size();i++)
		{
			prescriberLockinSoft.assertEquals(memberLookup_APS9554_Lock_InSelector.actPrescriberLockinDetails.get(i), expPrescriberLockinDetails.get(i));
		}		
		prescriberLockinSoft.assertAll();
	}
	
	public void verifyPharmacyInformation(Map<String,String> pharmacyInformation)throws Throwable {
		String strPharmacyID = pharmacyInformation.get("PharmacyID");
		String strPharmacyNPI = pharmacyInformation.get("PharmacyNPI");
		String strBeginDate = pharmacyInformation.get("BeginDate");
		String strEndDate = pharmacyInformation.get("EndDate");		
		String strProcessDate = pharmacyInformation.get("ProcessDate");	
		
		expPharmacyInformation.add(strPharmacyID);
		expPharmacyInformation.add(strPharmacyNPI);
		expPharmacyInformation.add(strBeginDate);
		expPharmacyInformation.add(strEndDate);
		expPharmacyInformation.add(strProcessDate);
		
		memberLookup_APS9554_Lock_InSelector.BenefitsEligibility_LIPI_PharmacyID(strPharmacyID);
		memberLookup_APS9554_Lock_InSelector.BenefitsEligibility_LIPI_PharmacyNPI(strPharmacyNPI);
		memberLookup_APS9554_Lock_InSelector.BenefitsEligibility_LIPI_BeginDate(strBeginDate);
		memberLookup_APS9554_Lock_InSelector.BenefitsEligibility_LIPI_EndDate(strEndDate);
		memberLookup_APS9554_Lock_InSelector.BenefitsEligibility_LIPI_ProcessDate(strProcessDate);
			
		for(int i=0;i<expPharmacyInformation.size();i++)
		{
			pharmacyInformationSoft.assertEquals(memberLookup_APS9554_Lock_InSelector.actPharmacyInformation.get(i), expPharmacyInformation.get(i));
		}		
		pharmacyInformationSoft.assertAll();
	}
	
	public void verifyInvalidPharmacyInformation(Map<String,String> invalidPharmacyInformation)throws Throwable {
		String strPharmacyID = invalidPharmacyInformation.get("PharmacyID");
		String strPharmacyNPI = invalidPharmacyInformation.get("PharmacyNPI");
		String strBeginDate = invalidPharmacyInformation.get("BeginDate");
		String strEndDate = invalidPharmacyInformation.get("EndDate");		
		String strProcessDate = invalidPharmacyInformation.get("ProcessDate");	
		
		expPharmacyInformation.add(strPharmacyID);
		expPharmacyInformation.add(strPharmacyNPI);
		expPharmacyInformation.add(strBeginDate);
		expPharmacyInformation.add(strEndDate);
		expPharmacyInformation.add(strProcessDate);
		
		memberLookup_APS9554_Lock_InSelector.BenefitsEligibility_LIPI_PharmacyID(strPharmacyID);
		memberLookup_APS9554_Lock_InSelector.BenefitsEligibility_LIPI_PharmacyNPI(strPharmacyNPI);
		memberLookup_APS9554_Lock_InSelector.BenefitsEligibility_LIPI_BeginDate(strBeginDate);
		memberLookup_APS9554_Lock_InSelector.BenefitsEligibility_LIPI_EndDate(strEndDate);
		memberLookup_APS9554_Lock_InSelector.BenefitsEligibility_LIPI_ProcessDate(strProcessDate);		
			
		for(int i=0;i<expPharmacyInformation.size();i++)
		{
			pharmacyInformationSoft.assertNotEquals(memberLookup_APS9554_Lock_InSelector.actPharmacyInformation.get(i), expPharmacyInformation.get(i));
		}		
		pharmacyInformationSoft.assertAll();
	}
	
	public void clickOnCloseButton() throws Throwable {
		memberLookup_APS9554_Lock_InSelector.BenefitsEligibility_LI_clickOnCloseButton();
	}
}

