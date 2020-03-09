package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.MemberLookup_CallNotesSelector;

public class MemberLookup_CallNotes_Steps {

	MemberLookup_CallNotesSelector memberLookup_CallNotesSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expCallNotesDetails = new ArrayList<String>();
	public SoftAssert authCallNotesResultSoft = new SoftAssert();
	public SoftAssert authPrevCallNotesSoft = new SoftAssert();
	public SoftAssert authCallNotesDetailsSoft = new SoftAssert();
	
	public MemberLookup_CallNotes_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		memberLookup_CallNotesSelector = new MemberLookup_CallNotesSelector(SharedResource,utils);
	}
	
	public void provideCallNotesDetails(Map<String,String> addCallNotesDetails)throws Throwable {
		String strAddNewType = addCallNotesDetails.get("AddNewType");
		String strAddNewStatus = addCallNotesDetails.get("AddNewStatus");
		String strAddNewComments = addCallNotesDetails.get("AddNewComments");
		
		memberLookup_CallNotesSelector.MemberLookup_CallNotes_selectType(strAddNewType);
		memberLookup_CallNotesSelector.MemberLookup_CallNotes_selectStatus(strAddNewStatus);
		memberLookup_CallNotesSelector.MemberLookup_CallNotes_enterComments(strAddNewComments);
	}
	
	public void addCallNotes() throws Throwable{
		
		String beforeTotalResults = memberLookup_CallNotesSelector.MemberLookup_CallNotes_getTotalResults();
		String arrBeforeTotalResults[] = beforeTotalResults.split("\\:");
		int beforeTotalResultsCount = Integer.valueOf(arrBeforeTotalResults[1].trim());
		memberLookup_CallNotesSelector.MemberLookup_CallNotes_clickOnSaveNotesButton();
		Thread.sleep(2000);
		String afterTotalResults = memberLookup_CallNotesSelector.MemberLookup_CallNotes_getTotalResults();
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
		
		authCallNotesResultSoft.assertEquals(afterTotalResultsCount, beforeTotalResultsCount+1);
		authCallNotesResultSoft.assertAll();
	}
	
	public void verifyPreviousCallNotesComments(Map<String,String> previousCallNotesComments)throws Throwable {
		String strExpPrevCallNotesComments = previousCallNotesComments.get("PrevCallNotesComment");
		String strActPrevCallNotes = memberLookup_CallNotesSelector.MemberLookup_CallNotes_getPreviousCallNotesComments();
		String arrActPrevCallNotes[] = strActPrevCallNotes.split("\\:");
		String strActPrevCallNotesComments = arrActPrevCallNotes[1];
		authPrevCallNotesSoft.assertEquals(strActPrevCallNotesComments, strExpPrevCallNotesComments);
		authPrevCallNotesSoft.assertAll();
	}
	
	public void verifyCallNotesDetails(Map<String,String> callNotesDetails) throws Throwable {
		String strType = callNotesDetails.get("Type");
		String strStatus = callNotesDetails.get("Status");
		
		expCallNotesDetails.add(strType);
		expCallNotesDetails.add(strStatus);
		
		memberLookup_CallNotesSelector.MemberLookup_CallNotes_CallNotesType(strType);
		memberLookup_CallNotesSelector.MemberLookup_CallNotes_CallNotesStatus(strStatus);
		
		for(int i=0;i<expCallNotesDetails.size();i++)
		{
			authCallNotesDetailsSoft.assertEquals(memberLookup_CallNotesSelector.actCallNotesDetails.get(i), expCallNotesDetails.get(i));
		}		
		authCallNotesDetailsSoft.assertAll();
	}
}

