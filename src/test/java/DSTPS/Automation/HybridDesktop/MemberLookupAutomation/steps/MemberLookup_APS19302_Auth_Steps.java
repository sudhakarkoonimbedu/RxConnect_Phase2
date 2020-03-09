package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.MemberLookup_APS19302_Auth_Selector;

public class MemberLookup_APS19302_Auth_Steps {

	MemberLookup_APS19302_Auth_Selector memberLookup_APS19302_Auth_Selector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
//	public SoftAssert verify_Auth_Results_Table_Soft = new SoftAssert();
//	public SoftAssert verify_Auth_Results_Table_Soft1 = new SoftAssert();
	
	public ArrayList<String> expAuthResults = new ArrayList<String>();
	public SoftAssert authResultsSoft = new SoftAssert();
	
	public SoftAssert verify_Auth_First_Screen_Results_Table_Soft = new SoftAssert();
	public SoftAssert verify_Auth_Second_Screen_Results_Table_Soft = new SoftAssert();
	public SoftAssert verify_Auth_Last_Screen_Results_Table_Soft = new SoftAssert();
	public SoftAssert verify_Auth_Restricted_Auth_Results_Table_Soft = new SoftAssert();
	public SoftAssert verify_Auth_Customized_Auth_Results_Table_Soft = new SoftAssert();
	public SoftAssert verify_Auth_PreAuth_First_Screen_Results_Table_Soft = new SoftAssert();
	public SoftAssert verify_Auth_PreAuth_Last_Screen_Results_Table_Soft = new SoftAssert();
	public SoftAssert verify_Auth_Type_And_Status_Search_Results_Table_Soft = new SoftAssert();
	public SoftAssert verify_Auth_RxNumber_Search_Results_Table_Soft = new SoftAssert();
	
	 
	 		 	
	public MemberLookup_APS19302_Auth_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		memberLookup_APS19302_Auth_Selector = new MemberLookup_APS19302_Auth_Selector(SharedResource,utils);	
	}
	
	public void clickOnAuthIcon() throws Throwable{
		memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_clickOnAuthIcon();
	}	
		
	public void verifyAPS19302_Auth() throws Throwable{
		memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_verifyPresenceOfAuthID();
		memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_verifyPresenceOfAuthType();
		memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_verifyPresenceOfStatus();
		memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_verifyPresenceOfRxNumber();
	}
	
	
	// ***********************************Auth Results First Screen Validations ********************************************	
	
	public void verifyAddAuth(Map<String,String> addAuthDetails) throws Throwable{
		String strAddAuth = addAuthDetails.get("AddAuth");
		 
		verify_Auth_First_Screen_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_verifyEnableOfAddAuth(), strAddAuth);		 		 		 
	}	
	
	public void verifyAuthResultsFirstScreen(Map<String,String> addRowCount) throws Throwable{
		String strRowCount = addRowCount.get("Results1");
		int strRowCount1 = Integer.parseInt(strRowCount);
		 
		verify_Auth_First_Screen_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_getRowCount(), strRowCount1);		
	}
	
	public void verifyNextEnabledFirstScreen(Map<String,String> addNextEnabledStatus) throws Throwable{
		String strNextEnabledFirstScreen = addNextEnabledStatus.get("NextEnabled");		 
		 
		verify_Auth_First_Screen_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_verifyNextLinkEnabled(), strNextEnabledFirstScreen);				 			 
	}
	
	public void verifyPrevDisabledFirstScreen(Map<String,String> addPrevDisablesdStatus) throws Throwable{
		String strPrevDisabledFirstScreen = addPrevDisablesdStatus.get("PrevDisabled");		 
		 
		verify_Auth_First_Screen_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_verifyPrevLinkDisabled(), strPrevDisabledFirstScreen);
		verify_Auth_First_Screen_Results_Table_Soft.assertAll();
	}	
	
	// ***********************************Auth Results Second Screen Validations ********************************************	
	
	public void verifyAuthResultsSecondScreen(Map<String,String> addRowCount) throws Throwable{
		String strRowCount = addRowCount.get("Results1");
		int strRowCount1 = Integer.parseInt(strRowCount);
		 
		verify_Auth_Second_Screen_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_getRowCount(), strRowCount1);		
	}
	
	public void verifyNextEnabledSecondScreen(Map<String,String> addNextEnabledStatus) throws Throwable{
		String strNextEnabledFirstScreen = addNextEnabledStatus.get("NextEnabled");		 
		 
		verify_Auth_Second_Screen_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_verifyNextLinkEnabled(), strNextEnabledFirstScreen);				 			 
	}
	
	public void verifyPrevEnabledSecondScreen(Map<String,String> addPrevEnabledStatus) throws Throwable{
		String strPrevEnabled = addPrevEnabledStatus.get("PrevEnabled");		 
		 
		verify_Auth_Second_Screen_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_verifyPrevLinkEnabled(), strPrevEnabled);
		verify_Auth_Second_Screen_Results_Table_Soft.assertAll();
	}
	
	// ***********************************Auth Results Last Screen Validations ********************************************
	
	public void verifyAuthResultsLastScreen(Map<String,String> addRowCountLast) throws Throwable{
		String strRowCountLast = addRowCountLast.get("LastResults");
		int strRowCountLast1 = Integer.parseInt(strRowCountLast);
		 
		verify_Auth_Last_Screen_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_getRowCount(), strRowCountLast1);		
	}
	
	public void verifyNextDisabledLastScreen(Map<String,String> addNextDisabledStatus) throws Throwable{
		String strNextDisabled = addNextDisabledStatus.get("NextDisabled");		 
		 
		verify_Auth_Last_Screen_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_verifyNextLinkDisabled(), strNextDisabled);		 
	}
	
	public void verifyPrevEnabledLastScreen(Map<String,String> addPrevEnabledStatus) throws Throwable{
		String strPrevEnabled = addPrevEnabledStatus.get("PrevEnabled");		 
		 
		verify_Auth_Last_Screen_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_verifyPrevLinkEnabled(), strPrevEnabled);
		verify_Auth_Last_Screen_Results_Table_Soft.assertAll();
	}
	
	// ***********************************Auth Type Restricted Results Validations ********************************************
	
	public void verifyAuthResultsRestrictedAuth(Map<String,String> addRowCount) throws Throwable{
		String strRowCount = addRowCount.get("AuthResults");
		int strRowCount1 = Integer.parseInt(strRowCount);
		 
		verify_Auth_Restricted_Auth_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_getRowCount(), strRowCount1);		
	}
	
	public void verifyNextDisabledRestrictedAuth(Map<String,String> addNextDisabledStatus) throws Throwable{
		String strNextDisabled = addNextDisabledStatus.get("NextDisabled");		 
		 
		verify_Auth_Restricted_Auth_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_verifyNextLinkDisabled(), strNextDisabled);		 
	}
	
	public void verifyPrevDisabledRestrictedAuth(Map<String,String> addPrevDisabledStatus) throws Throwable{
		String strPrevDisabled = addPrevDisabledStatus.get("PrevDisabled");		 
		 
		verify_Auth_Restricted_Auth_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_verifyPrevLinkDisabled(), strPrevDisabled);
		verify_Auth_Restricted_Auth_Results_Table_Soft.assertAll();
	}
	
	// ***********************************Auth Type Customized Results Validations ********************************************
	
	public void verifyAuthResultsCustomizedAuth(Map<String,String> addRowCount) throws Throwable{
		String strRowCount = addRowCount.get("AuthResults");
		int strRowCount1 = Integer.parseInt(strRowCount);
			 
		verify_Auth_Customized_Auth_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_getRowCount(), strRowCount1);		
	}
		
	public void verifyNextDisabledCustomizedAuth(Map<String,String> addNextDisabledStatus) throws Throwable{
		String strNextDisabled = addNextDisabledStatus.get("NextDisabled");		 
			 
		verify_Auth_Customized_Auth_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_verifyNextLinkDisabled(), strNextDisabled);		 
	}
		
	public void verifyPrevDisabledCustomizedAuth(Map<String,String> addPrevDisabledStatus) throws Throwable{
		String strPrevDisabled = addPrevDisabledStatus.get("PrevDisabled");		 
			 
		verify_Auth_Customized_Auth_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_verifyPrevLinkDisabled(), strPrevDisabled);
		verify_Auth_Customized_Auth_Results_Table_Soft.assertAll();
	}
	
	// ***********************************Auth Type Preauth First Screen Results Validations ********************************************
		
	public void verifyAuthResultsPreAuthFirstScreen(Map<String,String> addRowCount) throws Throwable{
		String strRowCount = addRowCount.get("AuthResults");
		int strRowCount1 = Integer.parseInt(strRowCount);
				 
		verify_Auth_PreAuth_First_Screen_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_getRowCount(), strRowCount1);		
	}
			
	public void verifyNextEnabledPreAuthFirstScreen(Map<String,String> addNextEnabledStatus) throws Throwable{
		String strNextEnabled = addNextEnabledStatus.get("NextEnabled");		 
				 
		verify_Auth_PreAuth_First_Screen_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_verifyNextLinkEnabled(), strNextEnabled);		 
	}
		
	public void verifyPrevDisabledPreAuthFirstScreen(Map<String,String> addPrevDisabledStatus) throws Throwable{
		String strPrevDisabled = addPrevDisabledStatus.get("PrevDisabled");		 
				 
		verify_Auth_PreAuth_First_Screen_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_verifyPrevLinkDisabled(), strPrevDisabled);
		verify_Auth_PreAuth_First_Screen_Results_Table_Soft.assertAll();
	}   
	
	// ***********************************Auth Type Preauth Last Screen Results Validations ********************************************
			
	public void verifyAuthResultsPreAuthLastScreen(Map<String,String> addRowCount) throws Throwable{
		String strRowCount = addRowCount.get("AuthResults");
		int strRowCount1 = Integer.parseInt(strRowCount);
					 
		verify_Auth_PreAuth_Last_Screen_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_getRowCount(), strRowCount1);		
	}
				
	public void verifyNextDisabledPreAuthLastScreen(Map<String,String> addNextDisabledStatus) throws Throwable{
		String strNextDisabled = addNextDisabledStatus.get("NextDisabled");		 
					 
		verify_Auth_PreAuth_Last_Screen_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_verifyNextLinkDisabled(), strNextDisabled);		 
	}
				
	public void verifyPrevEnabledPreAuthLastScreen(Map<String,String> addPrevEnabledStatus) throws Throwable{
		String strPrevEnabled = addPrevEnabledStatus.get("PrevEnabled");		 
				 
		verify_Auth_PreAuth_Last_Screen_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_verifyPrevLinkEnabled(), strPrevEnabled);
		verify_Auth_PreAuth_Last_Screen_Results_Table_Soft.assertAll();
	}   
			
	
	// ***********************************Auth Type and Status Search Results Validations ********************************************
			
	public void verifyAuthResultsForAuthTypeAndStatusSearch(Map<String,String> addRowCount) throws Throwable{
		String strRowCount = addRowCount.get("AuthResults");
		int strRowCount1 = Integer.parseInt(strRowCount);
							 
		verify_Auth_Type_And_Status_Search_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_getRowCount(), strRowCount1);		
	}
							
	public void verifyNextDisabledForAuthTypeAndStatusSearch(Map<String,String> addNextDisabledStatus) throws Throwable{
		String strNextDisabled = addNextDisabledStatus.get("NextDisabled");		 
								 
		verify_Auth_Type_And_Status_Search_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_verifyNextLinkDisabled(), strNextDisabled);		 
	}
							
	public void verifyPrevDisabledForAuthTypeAndStatusSearch(Map<String,String> addPrevDisabledStatus) throws Throwable{
		String strPrevDisabled = addPrevDisabledStatus.get("PrevDisabled");		 
			 
		verify_Auth_Type_And_Status_Search_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_verifyPrevLinkDisabled(), strPrevDisabled);
		//verify_Auth_Type_And_Status_Search_Results_Table_Soft.assertAll();
	} 
								
	// ***********************************Auth Type RxNumber Search Results Validations ********************************************
			
	public void verifyAuthResultsForRxNumberSearch(Map<String,String> addRowCount) throws Throwable{
		String strRowCount = addRowCount.get("AuthResults");
		int strRowCount1 = Integer.parseInt(strRowCount);
											 
		verify_Auth_RxNumber_Search_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_getRowCount(), strRowCount1);		
	}
										
	public void verifyNextDisabledForRxNumberSearch(Map<String,String> addNextDisabledStatus) throws Throwable{
		String strNextDisabled = addNextDisabledStatus.get("NextDisabled");		 
											 
		verify_Auth_RxNumber_Search_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_verifyNextLinkDisabled(), strNextDisabled);		 
	}
										
	public void verifyPrevDisabledForRxNumberSearch(Map<String,String> addPrevDisabledStatus) throws Throwable{
		String strPrevDisabled = addPrevDisabledStatus.get("PrevDisabled");		 
							 
		verify_Auth_RxNumber_Search_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_verifyPrevLinkDisabled(), strPrevDisabled);
		verify_Auth_RxNumber_Search_Results_Table_Soft.assertAll();
	}			
			
	
 
	
	public void clickOnNextLink() throws Throwable{
		memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_clickOnNext();
	}
	
	public void clickOnPrevLink() throws Throwable{
		memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_clickOnPrev();
    }
	
	public void clickOnClearButton() throws Throwable{
		memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_clickOnClear();
    }

    public void clickOnSearchButton() throws Throwable{
    	memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_clickOnSearch();
    }
    
    public void selectAuthType(Map<String,String> addAuthType) throws Throwable{
		String strAuthType = addAuthType.get("AuthType");		 
		memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_selectAuthType(strAuthType);		 		 		 
	}
    
    public void searchAuthStatusLookUp(Map<String,String> addAuthStatus) throws Throwable{
    	String strAuthType = addAuthStatus.get("AuthType");
		String strStatus = addAuthStatus.get("Status");		 
		memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_selectAuthType(strAuthType);
		Thread.sleep(2000);
		memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_selectStatus(strStatus);	
		Thread.sleep(2000);
		memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_clickOnSearch();
	}   
    
    public void enterRxNumber(Map<String,String> addRxNumber) throws Throwable{
		String strRxNumber = addRxNumber.get("RxNumber");		 
		memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_Auth_enterRxNumber(strRxNumber);		 		 
	}	
    
    public void verifyActualAuthResultsAuthTypeAndStatusSearch(Map<String,String> authResults)throws Throwable {
		String strAuthID = authResults.get("AuthIDResult");
		String strAuthType = authResults.get("AuthTypeResult");		
		String strStatus = authResults.get("StatusResult");		
		String strRxNumber = authResults.get("RxNumberResult");
		String strDrugName = authResults.get("DrugNameResult");
		String strEffDate = authResults.get("EffDateResult");
		String strEndDate = authResults.get("EndDateResult");
		
		expAuthResults.add(strAuthID);
		expAuthResults.add(strAuthType);
		expAuthResults.add(strStatus);
		expAuthResults.add(strRxNumber);
		expAuthResults.add(strDrugName);
		expAuthResults.add(strEffDate);
		expAuthResults.add(strEndDate);
		
		memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_AuthResults_AuthID(strAuthID);
		memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_AuthResults_AuthType(strAuthType);
		memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_AuthResults_Status(strStatus);
		memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_AuthResults_RxNumber(strRxNumber);
		memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_AuthResults_DrugName(strDrugName);
		memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_AuthResults_EffDate(strEffDate);
		memberLookup_APS19302_Auth_Selector.MemberLookup_PS19302_AuthResults_EndDate(strEndDate);		 
			
		for(int i=0;i<expAuthResults.size();i++)
		{
			verify_Auth_Type_And_Status_Search_Results_Table_Soft.assertEquals(memberLookup_APS19302_Auth_Selector.actAuthResults.get(i), expAuthResults.get(i));
		}		
		verify_Auth_Type_And_Status_Search_Results_Table_Soft.assertAll();
		 
	}	
    
    
    
}

