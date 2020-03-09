package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;

public class APS11733_PharmacyLookUp_ClaimAndErrorVerification_Selector 
{
	
	private HybridDesktop_SharedResource SharedResource;
	private RxNova_Utlilty utils;
	private WebDriver driver;
	
	private By SEARCH_PHARMACYLOOKUP_PHARMACYNPI;
	private By SEARCH_PHARMACYLOOKUP_RXNUMBER;
	private By SEARCH_PHARMACYLOOKUP_START_DATE;
	private By SEARCH_BUTTON;
	private By SEARCH_RESULTS_TABLE;
	private By SEARRCH_RESULT_TABLE_PLAYLINK;
	private By Link_POS_TRANSACTION_DATA;
	private By CLAIM_RAW_DATA_LINK,CLAIM_RAW_DATA_TABLE,TRANSMITTED_DATA,RESPONSE_DATA, DATA_LENGTH;
	private By ERROR_INFORMATION_TAB_TABLE1;
	private By ERROR_INFORMATION_TAB_TABLE2;
	private By ERROR_INFORMATION_TAB_TABLE3;
	private By ERROR_INFORMATION_TAB_TABLE4;
	
	public ArrayList<String> actMemberDetails = new ArrayList<String>();
	public ArrayList<String> actNCPDPErrorMessage = new ArrayList<String>();
	public ArrayList<String> actRxNovaErrorMessage = new ArrayList<String>();
	
	
	public APS11733_PharmacyLookUp_ClaimAndErrorVerification_Selector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils)
	{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;
		APS11733_PharmacyLookUp_Objects();
	}
	public void APS11733_PharmacyLookUp_Objects()
	{
		SEARCH_PHARMACYLOOKUP_PHARMACYNPI = By.id("pharmacyCallCenterSearchForm:pharmacyNPI");
		SEARCH_PHARMACYLOOKUP_RXNUMBER = By.id("pharmacyCallCenterSearchForm:rxNumber");
		SEARCH_PHARMACYLOOKUP_START_DATE = By.id("pharmacyCallCenterSearchForm:startDate");
		SEARCH_BUTTON =By.id("pharmacyCallCenterSearchForm:btnSearch");
		SEARCH_RESULTS_TABLE = By.id("pharmacySearchResultForm:pharmacySearchResultTable");
		SEARRCH_RESULT_TABLE_PLAYLINK = By.id("pharmacySearchResultForm:pharmacySearchResultTable:0:claimRawDataAndErrorInfoLink");
		
		Link_POS_TRANSACTION_DATA = By.xpath("//span[text()='POS Transaction Data']");
		CLAIM_RAW_DATA_LINK = By.linkText("Claim Raw Data");
		CLAIM_RAW_DATA_TABLE = By.xpath("//*[@class='ui-accordion-content ui-helper-reset ui-widget-content']");
		TRANSMITTED_DATA = By.xpath("//input[@type='radio']/following-sibling::label[contains(text(),'Transmitted Data')]"); 
		RESPONSE_DATA = By.xpath("//input[@type='radio']/following-sibling::label[contains(text(),'Response Data')]");
		DATA_LENGTH = By.xpath("//*[@class='claim-raw-data'][1]");
		ERROR_INFORMATION_TAB_TABLE1 = By.xpath("//div[contains(@id,'claimRawDataAndErrorInfoForm:claimDetailAccordionPanel')][2]/table[1]");
		ERROR_INFORMATION_TAB_TABLE2 = By.xpath("//div[contains(@id,'claimRawDataAndErrorInfoForm:claimDetailAccordionPanel')][2]/table[2]");
		ERROR_INFORMATION_TAB_TABLE3 = By.xpath("//div[contains(@id,'claimRawDataAndErrorInfoForm:claimDetailAccordionPanel')][2]/table[3]");
		ERROR_INFORMATION_TAB_TABLE4 = By.xpath("//div[contains(@id,'claimRawDataAndErrorInfoForm:claimDetailAccordionPanel')][2]/table[4]");
	}
	public void PharmacyLookup_LandingPage_enterPharmacy_NPI(String strPharmacyNPI) throws Throwable
	{
		if(!strPharmacyNPI.isEmpty())
		{
		utils.SetTextOnEdit(SEARCH_PHARMACYLOOKUP_PHARMACYNPI, strPharmacyNPI);
		}
	}
	public void PharmacyLookup_LandingPage_enterRx_Number(String strRxNumber) throws Throwable
	{
		if(!strRxNumber.isEmpty())
		{
		utils.SetTextOnEdit(SEARCH_PHARMACYLOOKUP_RXNUMBER, strRxNumber);
		}
	}
	public void PharmacyLookup_LandingPage_enterStartDate(String strStartDate) throws Throwable
	{
		if(!strStartDate.isEmpty())
		{
			utils.SetTextOnEdit(SEARCH_PHARMACYLOOKUP_START_DATE, strStartDate);
		}
	}
    public void PharmacyLookup_LandingPage_clickOnSearchButton() throws Throwable
    {
		utils.ClickOnButton(SEARCH_BUTTON);
		utils.GetBusyStatus();
		Thread.sleep(3000);
	}
    public void waitUntillPharmacySearchResults() throws Throwable
    {
		utils.CheckElementPresenceByLocator(SEARCH_RESULTS_TABLE);
		Thread.sleep(1000);
	}	
	public void verifyPharmacySearchResults() throws Throwable
	{
		utils.VerifyObjectIsDisplayed(SEARCH_RESULTS_TABLE);
	}
	public void Member_Details_MemberID(String strMemberID) throws Throwable
	{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strMemberID));
	}	
	public void Member_Details_DateOfBirth(String strDateOfBirth) throws Throwable
	{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strDateOfBirth));
	}	
	public void Member_Details_MemberName(String strMemberName) throws Throwable
	{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strMemberName));
	}	
	public void Member_Details_Error(String strError) throws Throwable
	{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strError));
	}	
	public void Member_Details_Date(String strDate) throws Throwable
	{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strDate));
	}	
	public void Member_Details_Time(String strTime) throws Throwable
	{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strTime));
	}	
	public void Member_Details_CICSStatus(String strCICSStatus) throws Throwable
	{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strCICSStatus));
	}	
	public void Member_Details_CustID(String strCustID) throws Throwable
	{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strCustID));
	}	
	public void Member_Details_ClientID(String strClientID) throws Throwable
	{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strClientID));
	}	
	public void Member_Details_Group(String strGroup) throws Throwable
	{
		actMemberDetails.add(utils.RxNovaConnect_WebTable_VerifyColumnData(SEARCH_RESULTS_TABLE,strGroup));
	}
	public void perform_Click_On_PlayButton() throws Throwable
	{
		utils.ClickOnLink(SEARRCH_RESULT_TABLE_PLAYLINK);
		utils.GetBusyStatus();
		Thread.sleep(3000);
	}
	public void waitUntilPosTransactionData() throws Throwable
	{
		utils.CheckElementPresenceByLocator(Link_POS_TRANSACTION_DATA);
	}
	public void verifyPosTransactionData() throws Throwable
	{
		utils.VerifyObjectIsDisplayed(Link_POS_TRANSACTION_DATA);
	}
	public void waitUntillClaimRawDataTable() throws Throwable
    {
		utils.CheckElementPresenceByLocator(CLAIM_RAW_DATA_TABLE);
		Thread.sleep(1000);
	}	
	public void verifyClaimRawDataTable() throws Throwable
	{
		utils.VerifyObjectIsDisplayed(CLAIM_RAW_DATA_TABLE);
	}
	public void PharmacyLookup_Claim_verifyPresenceOfTransmittedData() throws Throwable
	{
		utils.VerifyElementPresence(TRANSMITTED_DATA);
		Thread.sleep(1000);
	}
	public void PharmacyLookup_Claim_verifyPresenceOfResponseData() throws Throwable
	{
		utils.VerifyElementPresence(RESPONSE_DATA);
		Thread.sleep(1000);
	}	 
	public String checkDataLenght() throws Throwable
	{
		return utils.GetElementText(DATA_LENGTH);    		
	}
    
	// NCPDP Error Message
	public void ncpdp_errorMessage_Code(String strCode)
    {
    	actNCPDPErrorMessage.add(utils.RxNovaConnect_WebTable_ErrorInformation_TableDataVerification_NCPDP_ErrorMessage(ERROR_INFORMATION_TAB_TABLE1, ERROR_INFORMATION_TAB_TABLE2, strCode));
    }
    public void ncpdp_errorMessage_Occ(String strOcc)
    {
    	actNCPDPErrorMessage.add(utils.RxNovaConnect_WebTable_ErrorInformation_TableDataVerification_NCPDP_ErrorMessage(ERROR_INFORMATION_TAB_TABLE1, ERROR_INFORMATION_TAB_TABLE2, strOcc));
    }
    public void ncpdp_errorMessage_ncpdpErrorMessage(String strncpdpErrorMessage)
    {
    	actNCPDPErrorMessage.add(utils.RxNovaConnect_WebTable_ErrorInformation_TableDataVerification_NCPDP_ErrorMessage(ERROR_INFORMATION_TAB_TABLE1, ERROR_INFORMATION_TAB_TABLE2, strncpdpErrorMessage));
    }
    
    // RxNova Error Message 1
    public void ncpdp_rxnovaMessage_Code1(String strCode1)
    {
    	actRxNovaErrorMessage.add(utils.RxNovaConnect_WebTable_ErrorInformation_TableDataVerification_RxNovaErrorMessage(ERROR_INFORMATION_TAB_TABLE3, ERROR_INFORMATION_TAB_TABLE4, strCode1));
    }
    public void ncpdp_rxnovaMessage_DI1(String strDI1)
    {
    	actRxNovaErrorMessage.add(utils.RxNovaConnect_WebTable_ErrorInformation_TableDataVerification_RxNovaErrorMessage(ERROR_INFORMATION_TAB_TABLE3, ERROR_INFORMATION_TAB_TABLE4, strDI1));
    }
    public void ncpdp_rxnovaMessage_RxNovaErrorMessage1(String strRxNovaErrorMessage1)
    {
    	actRxNovaErrorMessage.add(utils.RxNovaConnect_WebTable_ErrorInformation_TableDataVerification_RxNovaErrorMessage(ERROR_INFORMATION_TAB_TABLE3, ERROR_INFORMATION_TAB_TABLE4, strRxNovaErrorMessage1));
    }

    // RxNova Error Message 1
    public void ncpdp_rxnovaMessage_Code2(String strCode2)
    {
    	actRxNovaErrorMessage.add(utils.RxNovaConnect_WebTable_ErrorInformation_TableDataVerification_RxNovaErrorMessage(ERROR_INFORMATION_TAB_TABLE3, ERROR_INFORMATION_TAB_TABLE4, strCode2));
    }
    public void ncpdp_rxnovaMessage_DI2(String strDI2)
    {
    	actRxNovaErrorMessage.add(utils.RxNovaConnect_WebTable_ErrorInformation_TableDataVerification_RxNovaErrorMessage(ERROR_INFORMATION_TAB_TABLE3, ERROR_INFORMATION_TAB_TABLE4, strDI2));
    }
    public void ncpdp_rxnovaMessage_RxNovaErrorMessage2(String strRxNovaErrorMessage2)
    {
    	actRxNovaErrorMessage.add(utils.RxNovaConnect_WebTable_ErrorInformation_TableDataVerification_RxNovaErrorMessage(ERROR_INFORMATION_TAB_TABLE3, ERROR_INFORMATION_TAB_TABLE4, strRxNovaErrorMessage2));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
// End Of Class
}
