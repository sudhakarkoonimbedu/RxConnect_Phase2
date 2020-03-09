package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;


public class MemberLookup_APS19302_Auth_Selector {

	private By AUTH_ID,AUTH_TYPE,STATUS,RX_NUMBER,SEARCH_BUTTON,CLEAR_BUTTON,ADD_AUTH_BUTTON,AUTH_LINK;
	private By AUTH_RESULTS_TABLE,PREV_LINK,PREV_LINK_ENABLED,NEXT_LINK,NEXT_LINK_ENABLED,PREV_LINK_DISABLED,NEXT_LINK_DISABLED;
		
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> actAuthResults = new ArrayList<String>();
	
	public MemberLookup_APS19302_Auth_Selector(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) {
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		MemberLookup_PS19302_Auth_Objects();
	}
	
	private void MemberLookup_PS19302_Auth_Objects()
	{		
		AUTH_LINK = By.id("wheelForm:authLink");
		AUTH_ID = By.xpath("//input[@id='priorAuthForm:AuthID']");
		AUTH_TYPE = By.xpath("//select[@id='priorAuthForm:authType']");					 
		STATUS = By.xpath("//select[@id='priorAuthForm:authStatus']");
		RX_NUMBER = By.xpath("//input[@id='priorAuthForm:RxNumber']");
		
		SEARCH_BUTTON = By.id("priorAuthForm:btnSearch");				
		CLEAR_BUTTON = By.xpath("//span[text()='Clear']");
		ADD_AUTH_BUTTON = By.xpath("//span[contains(text(),'Add Auth')]");
		
		AUTH_RESULTS_TABLE = By.xpath("//div[@id='priorAuthForm:priorAuthResultTable']");
		
		PREV_LINK = By.xpath("//span[@id='priorAuthForm:linkPanel']/*[text()='<Prev']");
		PREV_LINK_ENABLED = By.linkText("<Prev");
		PREV_LINK_DISABLED = By.xpath("//span[@id='priorAuthForm:linkPanel']/span[@class='claim-result-paging-link']");
		NEXT_LINK = By.xpath("//span[@id='priorAuthForm:linkPanel']/*[text()='Next>']");
		NEXT_LINK_ENABLED = By.linkText("Next>");
		NEXT_LINK_DISABLED = By.xpath("//span[@id='priorAuthForm:linkPanel']/span[@class='ml10 claim-result-paging-link']");
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~PS19302_Auth Results Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
		// PS19302_Auth Results
		
	public void MemberLookup_PS19302_AuthResults_AuthID(String strAuthID) throws Throwable{
		actAuthResults.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AUTH_RESULTS_TABLE, strAuthID));			
	}
		
	public void MemberLookup_PS19302_AuthResults_AuthType(String strAuthType) throws Throwable{
		actAuthResults.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AUTH_RESULTS_TABLE, strAuthType));			
	} 
		
	public void MemberLookup_PS19302_AuthResults_Status(String strStatus) throws Throwable{
		actAuthResults.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AUTH_RESULTS_TABLE, strStatus));			
	}
		
	public void MemberLookup_PS19302_AuthResults_RxNumber(String strRxNumber) throws Throwable{
		actAuthResults.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AUTH_RESULTS_TABLE, strRxNumber));			
	}
		
	public void MemberLookup_PS19302_AuthResults_DrugName(String strDrugName) throws Throwable{
		actAuthResults.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AUTH_RESULTS_TABLE, strDrugName));			
	}
		
	public void MemberLookup_PS19302_AuthResults_EffDate(String strEffDate) throws Throwable{
		actAuthResults.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AUTH_RESULTS_TABLE, strEffDate));			
	}
		
	public void MemberLookup_PS19302_AuthResults_EndDate(String strEndDate) throws Throwable{
		actAuthResults.add(utils.RxNovaConnect_WebTable_VerifyColumnData(AUTH_RESULTS_TABLE, strEndDate));			
	}
			
	//~~~~~~~~~~~~~~~~~~~~~~~~~~PS19302_Auth_Objects Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	
	
	public void MemberLookup_PS19302_clickOnAuthIcon() throws Throwable{
		utils.ClickOnLink(AUTH_LINK);
		Thread.sleep(1000);
	}
	
	public void MemberLookup_PS19302_Auth_verifyPresenceOfAuthID() throws Throwable{
		utils.VerifyElementPresence(AUTH_ID);
		Thread.sleep(1000);
	}
	
	public void MemberLookup_PS19302_Auth_verifyPresenceOfAuthType() throws Throwable{
		utils.VerifyElementPresence(AUTH_TYPE);
		Thread.sleep(1000);
	}
	
	public void MemberLookup_PS19302_Auth_verifyPresenceOfStatus() throws Throwable{
		utils.VerifyElementPresence(STATUS);
		Thread.sleep(1000);
	}
	
	public void MemberLookup_PS19302_Auth_verifyPresenceOfRxNumber() throws Throwable{
		utils.VerifyElementPresence(RX_NUMBER);
		Thread.sleep(1000);
	}
	
	public String MemberLookup_PS19302_Auth_verifyEnableOfAddAuth() throws Throwable{
		return utils.VerifyButtonStatus(ADD_AUTH_BUTTON);
	}
	
	public int MemberLookup_PS19302_Auth_getRowCount() throws Throwable{
		return utils.RxNovaConnect_WebTable_GetRowCount(AUTH_RESULTS_TABLE);			 
	}
	
//	public String MemberLookup_PS19302_Auth_verifyPrevLink() throws Throwable{
//		return utils.VerifyLinkStatus(PREV_LINK,PREV_LINK_ENABLED);				 
//    }	
//	
//	public String MemberLookup_PS19302_Auth_verifyNextLink() throws Throwable{
//		return utils.VerifyLinkStatus(NEXT_LINK,NEXT_LINK_ENABLED);		 
//	}
	
	public String MemberLookup_PS19302_Auth_verifyPrevLinkEnabled() throws Throwable{
		return utils.RxConnect_Member_VerifyLinkEnabled(PREV_LINK_ENABLED);				 
    }	
	
	public String MemberLookup_PS19302_Auth_verifyNextLinkEnabled() throws Throwable{
		return utils.RxConnect_Member_VerifyLinkEnabled(NEXT_LINK_ENABLED);		 
	}
	
	public String MemberLookup_PS19302_Auth_verifyPrevLinkDisabled() throws Throwable{
		return utils.RxConnect_Member_VerifyLinkDisabled(PREV_LINK_DISABLED);				 
	}	
		
    public String MemberLookup_PS19302_Auth_verifyNextLinkDisabled() throws Throwable{
		return utils.RxConnect_Member_VerifyLinkDisabled(NEXT_LINK_DISABLED);		 
    }	
	
	public void MemberLookup_PS19302_Auth_clickOnPrev() throws Throwable{
		utils.ClickOnLink(PREV_LINK);
		Thread.sleep(1000);
	}
	
	public void MemberLookup_PS19302_Auth_clickOnNext() throws Throwable{
		utils.ClickOnLink(NEXT_LINK);
		Thread.sleep(1000);
	}	

	public void MemberLookup_PS19302_Auth_clickOnClear() throws Throwable{
		utils.ClickOnButton(CLEAR_BUTTON);
		Thread.sleep(1000);
	}
	
	public void MemberLookup_PS19302_Auth_clickOnSearch() throws Throwable{
		utils.ClickOnButton(SEARCH_BUTTON);
		Thread.sleep(1000);
	}
	
	public void MemberLookup_PS19302_Auth_selectAuthType(String strAuthType) throws Throwable{		
		utils.SelectItemFromWebList(AUTH_TYPE,strAuthType);
		Thread.sleep(1000);		
	}
	
	public void MemberLookup_PS19302_Auth_selectStatus(String strStatus) throws Throwable{		
		utils.SelectItemFromWebList(STATUS,strStatus);
		Thread.sleep(1000);		
	}
	
	public void MemberLookup_PS19302_Auth_enterRxNumber(String strAddNewRxNumber) throws Throwable{
		utils.SetTextOnEdit(RX_NUMBER, strAddNewRxNumber);
		Thread.sleep(1000);
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~PS19302_Auth_Objects Operations~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
