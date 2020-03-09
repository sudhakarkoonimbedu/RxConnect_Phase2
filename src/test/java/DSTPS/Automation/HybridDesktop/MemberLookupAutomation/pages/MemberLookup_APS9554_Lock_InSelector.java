package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class MemberLookup_APS9554_Lock_InSelector {

	private By BEDETAIL_VIEWLOCKININFORMATION_LINK,BEDETAIL_PRESCRIBERLOCKIN_TABLE;
	private By BEDETAIL_PHARMACYINFORMATION_TABLE,BEDETAIL_LOCKININFO_CLOSE_BUTTON;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actPrescriberLockinDetails = new ArrayList<String>();
	public ArrayList<String> actPharmacyInformation = new ArrayList<String>();
		
	public MemberLookup_APS9554_Lock_InSelector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		MemberLookup_APS9554_Lock_In_Objects();
	}
	
	private void  MemberLookup_APS9554_Lock_In_Objects()
	{		
		BEDETAIL_VIEWLOCKININFORMATION_LINK = By.linkText("View Lock-in Information");
		BEDETAIL_PRESCRIBERLOCKIN_TABLE = By.id("benefitsSelectionForm:prescriberLockInDataTable");
		BEDETAIL_PHARMACYINFORMATION_TABLE = By.id("benefitsSelectionForm:pharmacyInformationDataTable");
		BEDETAIL_LOCKININFO_CLOSE_BUTTON = By.id("benefitsSelectionForm:closeLockInInformationBtn");
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Benefits & Eligibility Lock-in Information Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public void BenefitsEligibility_BEDetail_clickOnViewLockInInformationLink() throws Throwable{
		utils.ClickOnLink(BEDETAIL_VIEWLOCKININFORMATION_LINK);
		utils.GetBusyStatus();
	}
	
	public void waitUntillLockinInformation() throws Throwable{
		utils.CheckElementPresenceByLocator(BEDETAIL_PRESCRIBERLOCKIN_TABLE);
		Thread.sleep(1000);
	}
	
	public void verifyLockinInformation(){
		utils.VerifyObjectIsDisplayed(BEDETAIL_PRESCRIBERLOCKIN_TABLE);
	}
	
	// Prescriber Lock-in
	
	public void BenefitsEligibility_LIPL_PrescriberID(String strPrescriberID) throws Throwable{
		actPrescriberLockinDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(BEDETAIL_PRESCRIBERLOCKIN_TABLE,strPrescriberID));
	}
	
	public void BenefitsEligibility_LIPL_BeginDate(String strBeginDate) throws Throwable{
		actPrescriberLockinDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(BEDETAIL_PRESCRIBERLOCKIN_TABLE,strBeginDate));
	}
	
	public void BenefitsEligibility_LIPL_EndDate(String strEndDate) throws Throwable{
		actPrescriberLockinDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(BEDETAIL_PRESCRIBERLOCKIN_TABLE,strEndDate));
	}
	
	public void BenefitsEligibility_LIPL_ProcessDate(String strProcessDate) throws Throwable{
		actPrescriberLockinDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(BEDETAIL_PRESCRIBERLOCKIN_TABLE,strProcessDate));
	}
	
	// Pharmacy Information
	
	public void BenefitsEligibility_LIPI_PharmacyID(String strPharmacyID) throws Throwable{
		actPharmacyInformation.add(utils.RxNovaConnect_WebTable_VerifyColumnData(BEDETAIL_PHARMACYINFORMATION_TABLE,strPharmacyID));
	}
	
	public void BenefitsEligibility_LIPI_PharmacyNPI(String strPharmacyNPI) throws Throwable{
		actPharmacyInformation.add(utils.RxNovaConnect_WebTable_VerifyColumnData(BEDETAIL_PHARMACYINFORMATION_TABLE,strPharmacyNPI));
	}
	
	public void BenefitsEligibility_LIPI_BeginDate(String strBeginDate) throws Throwable{
		actPharmacyInformation.add(utils.RxNovaConnect_WebTable_VerifyColumnData(BEDETAIL_PHARMACYINFORMATION_TABLE,strBeginDate));
	}
	
	public void BenefitsEligibility_LIPI_EndDate(String strEndDate) throws Throwable{
		actPharmacyInformation.add(utils.RxNovaConnect_WebTable_VerifyColumnData(BEDETAIL_PHARMACYINFORMATION_TABLE,strEndDate));
	}
	
	public void BenefitsEligibility_LIPI_ProcessDate(String strProcessDate) throws Throwable{
		actPharmacyInformation.add(utils.RxNovaConnect_WebTable_VerifyColumnData(BEDETAIL_PHARMACYINFORMATION_TABLE,strProcessDate));
	}
	
	public void BenefitsEligibility_LI_clickOnCloseButton() throws Throwable{
		utils.ClickOnButton(BEDETAIL_LOCKININFO_CLOSE_BUTTON);
		utils.GetBusyStatus();
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~Benefits & Eligibility Lock-in Information Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
}
