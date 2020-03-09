package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.MemberLookup_Claim_CallNotesSelector;


public class MemberLookup_Claim_CallNotes_Steps {

	MemberLookup_Claim_CallNotesSelector memberLookup_Claim_CallNotesSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expCallNotesDetails = new ArrayList<String>();
	public SoftAssert claimCallNotesResultSoft = new SoftAssert();
	public SoftAssert claimPrevCallNotesSoft = new SoftAssert();
	public SoftAssert claimCallNotesDetailsSoft = new SoftAssert();
	
	public MemberLookup_Claim_CallNotes_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		memberLookup_Claim_CallNotesSelector = new MemberLookup_Claim_CallNotesSelector(SharedResource,utils);
	}
	
	public void clickOnCallNotes() throws Throwable{
		memberLookup_Claim_CallNotesSelector.MemberLookup_Claim_clickOnCallNotes();
	}
	
	public void provideCallNotesDetails(Map<String,String> addCallNotesDetails)throws Throwable {
		String strAddNewType = addCallNotesDetails.get("AddNewType");
		String strAddNewStatus = addCallNotesDetails.get("AddNewStatus");
		String strAddNewComments = addCallNotesDetails.get("AddNewComments");
		
		memberLookup_Claim_CallNotesSelector.waitUnitillCallNotesDetails();
		memberLookup_Claim_CallNotesSelector.MemberLookup_Claim_selectType(strAddNewType);
		memberLookup_Claim_CallNotesSelector.MemberLookup_Claim_selectStatus(strAddNewStatus);
		memberLookup_Claim_CallNotesSelector.MemberLookup_Claim_enterComments(strAddNewComments);
	}
	
	public void addCallNotes() throws Throwable{
		
		String beforeTotalResults = memberLookup_Claim_CallNotesSelector.MemberLookup_Claim_getTotalResults();
		String arrBeforeTotalResults[] = beforeTotalResults.split("\\:");
		int beforeTotalResultsCount = Integer.valueOf(arrBeforeTotalResults[1].trim());
		memberLookup_Claim_CallNotesSelector.MemberLookup_Claim_clickOnSaveNotesButton();
		Thread.sleep(2000);
		String afterTotalResults = memberLookup_Claim_CallNotesSelector.MemberLookup_Claim_getTotalResults();
		String arrAfterTotalResults[] = afterTotalResults.split("\\:");
		int afterTotalResultsCount = Integer.valueOf(arrAfterTotalResults[1].trim());
		if(afterTotalResultsCount>beforeTotalResultsCount)
		  {
			System.out.println("The Call Notes details added successfully");
		  }
		else
		 {
			System.out.println("The Call Notes details are not added");
		 }
		
		claimCallNotesResultSoft.assertEquals(afterTotalResultsCount, beforeTotalResultsCount+1);
		claimCallNotesResultSoft.assertAll();
		claimCallNotesResultSoft = null;
	}
	
	public void verifyPreviousCallNotesComments(Map<String,String> previousCallNotesComments)throws Throwable {
		String strExpPrevCallNotesComments = previousCallNotesComments.get("PrevCallNotesComment");
		String strActPrevCallNotes = memberLookup_Claim_CallNotesSelector.MemberLookup_Claim_getPreviousCallNotesComments();
		String arrActPrevCallNotes[] = strActPrevCallNotes.split("\\:");
		String strActPrevCallNotesComments = arrActPrevCallNotes[1];
		claimPrevCallNotesSoft.assertEquals(strActPrevCallNotesComments, strExpPrevCallNotesComments);
		claimPrevCallNotesSoft.assertAll();
		
	}
	
	public void verifyCallNotesDetails(Map<String,String> callNotesDetails) throws Throwable {
		String strType = callNotesDetails.get("Type");
		String strStatus = callNotesDetails.get("Status");
		
		expCallNotesDetails.add(strType);
		expCallNotesDetails.add(strStatus);
		
		memberLookup_Claim_CallNotesSelector.MemberLookup_Claim_CallNotesType(strType);
		memberLookup_Claim_CallNotesSelector.MemberLookup_Claim_CallNotesStatus(strStatus);
		
		for(int i=0;i<expCallNotesDetails.size();i++)
		{
			claimCallNotesDetailsSoft.assertEquals(memberLookup_Claim_CallNotesSelector.actCallNotesDetails.get(i), expCallNotesDetails.get(i));
		}		
		claimCallNotesDetailsSoft.assertAll();
		
	}
}

