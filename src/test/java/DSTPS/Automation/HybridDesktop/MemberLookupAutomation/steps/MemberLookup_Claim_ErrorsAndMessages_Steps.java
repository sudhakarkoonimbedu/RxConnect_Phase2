package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.MemberLookup_Claim_ErrorsAndMessagesSelector;

public class MemberLookup_Claim_ErrorsAndMessages_Steps {

	MemberLookup_Claim_ErrorsAndMessagesSelector memberLookup_Claim_ErrorsAndMessagesSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expErrorsAndMessages = new ArrayList<String>();
	public SoftAssert errorsAndMessagesSoft = new SoftAssert();
	
	
	public MemberLookup_Claim_ErrorsAndMessages_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		memberLookup_Claim_ErrorsAndMessagesSelector = new MemberLookup_Claim_ErrorsAndMessagesSelector(SharedResource,utils);
	}
	
	public void verifyErrorsAndMessages(Map<String,String> errorsAndMessages)throws Throwable {
		String strNCPDP = errorsAndMessages.get("NCPDP");
		String strRejectField = errorsAndMessages.get("RejectField");
		String strArgus = errorsAndMessages.get("Argus");
		String strAction = errorsAndMessages.get("Action");
		String strArgusErrorText = errorsAndMessages.get("ArgusErrorText");
		String strQualifier = errorsAndMessages.get("Qualifier");
		String strContinue = errorsAndMessages.get("Continue");
		String strMessage = errorsAndMessages.get("Message");
		 		 			
		expErrorsAndMessages.add(strNCPDP);
		expErrorsAndMessages.add(strRejectField);
		expErrorsAndMessages.add(strArgus);
		expErrorsAndMessages.add(strAction);
		expErrorsAndMessages.add(strArgusErrorText);
		expErrorsAndMessages.add(strQualifier);
		expErrorsAndMessages.add(strContinue);
		expErrorsAndMessages.add(strMessage);
		  		
		memberLookup_Claim_ErrorsAndMessagesSelector.Claim_ErrorsAndMessages_NCPDP(strNCPDP);
		memberLookup_Claim_ErrorsAndMessagesSelector.Claim_ErrorsAndMessages_RejectField(strRejectField);
		memberLookup_Claim_ErrorsAndMessagesSelector.Claim_ErrorsAndMessages_Argus(strArgus);
		memberLookup_Claim_ErrorsAndMessagesSelector.Claim_ErrorsAndMessages_Action(strAction);
		memberLookup_Claim_ErrorsAndMessagesSelector.Claim_ErrorsAndMessages_ArgusErrorText(strArgusErrorText);
		memberLookup_Claim_ErrorsAndMessagesSelector.Claim_ErrorsAndMessages_Qualifier(strQualifier);
		memberLookup_Claim_ErrorsAndMessagesSelector.Claim_ErrorsAndMessages_Continue(strContinue);
		memberLookup_Claim_ErrorsAndMessagesSelector.Claim_ErrorsAndMessages_Message(strMessage);
		 				
			
		for(int i=0;i<expErrorsAndMessages.size();i++)
		{
			errorsAndMessagesSoft.assertEquals(memberLookup_Claim_ErrorsAndMessagesSelector.actErrorsAndMessages.get(i), expErrorsAndMessages.get(i));
		}		
		errorsAndMessagesSoft.assertAll();
		
	}	
	
	 
}

