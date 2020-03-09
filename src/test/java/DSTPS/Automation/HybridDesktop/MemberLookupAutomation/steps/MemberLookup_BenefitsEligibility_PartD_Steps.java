package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.MemberLookup_BenefitsEligibility_PartDSelector;

public class MemberLookup_BenefitsEligibility_PartD_Steps {

	MemberLookup_BenefitsEligibility_PartDSelector memberLookup_BenefitsEligibility_PartDSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expBEPartDDetails = new ArrayList<String>();
	public SoftAssert partDDetailsSoft = new SoftAssert();
	
	public MemberLookup_BenefitsEligibility_PartD_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		memberLookup_BenefitsEligibility_PartDSelector = new MemberLookup_BenefitsEligibility_PartDSelector(SharedResource,utils);
	}
	
	public void clickOnPartD() throws Throwable{
		memberLookup_BenefitsEligibility_PartDSelector.clickOnPartDLink();
	}
	
	public void verifyPartDDetails(Map<String,String> partDDetails)throws Throwable {
		String strCMSMemberSSN = partDDetails.get("CMSMemberSSN");
		String strCMSSpouseSSN = partDDetails.get("CMSSpouseSSN");		
		String strCMSHealthInsClaimNo = partDDetails.get("CMSHealthInsClaimNo");
		String strCMSRRBenefitNumber = partDDetails.get("CMSRRBenefitNumber");
		String strCMSMaritalStatus = partDDetails.get("CMSMaritalStatus");		
		String strCMSIncome = partDDetails.get("CMSIncome");
		String strCMSMedicaidID = partDDetails.get("CMSMedicaidID");
		String strCMSDatesStart = partDDetails.get("CMSDatesStart");		
		String strCMSDatesEnd = partDDetails.get("CMSDatesEnd");
		String strPartDProgramType = partDDetails.get("PartDProgramType");
		String strPartDProgramValue = partDDetails.get("PartDProgramValue");		
		String strPartDProgramStatus = partDDetails.get("PartDProgramStatus");
		String strPartDProgramConractID = partDDetails.get("PartDProgramConractID");
		String strPartDProgramIndicator = partDDetails.get("PartDProgramIndicator");		
		String strPartDProgramStart = partDDetails.get("PartDProgramStart");
		String strPartDProgramEnd = partDDetails.get("PartDProgramEnd");
		String strPartDProgramPorcDate = partDDetails.get("PartDProgramPorcDate");		
		String strPartDSType = partDDetails.get("PartDSType");
		String strPartDSRxTypeCode = partDDetails.get("PartDSRxTypeCode");
		String strPartDSRxGroupID = partDDetails.get("PartDSRxGroupID");		
		String strPartDSRxBIN = partDDetails.get("PartDSRxBIN");
		String strPartDSRxPCN = partDDetails.get("PartDSRxPCN");
		String strPartDSRxMemberID = partDDetails.get("PartDSRxMemberID");		
		String strPartDSRxPersonCode = partDDetails.get("PartDSRxPersonCode");
		String strPartDSRxHelpDesk = partDDetails.get("PartDSRxHelpDesk");		
		String strPartDSStart = partDDetails.get("PartDSStart");
		String strPartDSEnd = partDDetails.get("PartDSEnd");
				
		expBEPartDDetails.add(strCMSMemberSSN);
		expBEPartDDetails.add(strCMSSpouseSSN);
		expBEPartDDetails.add(strCMSHealthInsClaimNo);
		expBEPartDDetails.add(strCMSRRBenefitNumber);
		expBEPartDDetails.add(strCMSMaritalStatus);
		expBEPartDDetails.add(strCMSIncome);
		expBEPartDDetails.add(strCMSMedicaidID);
		expBEPartDDetails.add(strCMSDatesStart);
		expBEPartDDetails.add(strCMSDatesEnd);
		expBEPartDDetails.add(strPartDProgramType);
		expBEPartDDetails.add(strPartDProgramValue);
		expBEPartDDetails.add(strPartDProgramStatus);
		expBEPartDDetails.add(strPartDProgramConractID);
		expBEPartDDetails.add(strPartDProgramIndicator);
		expBEPartDDetails.add(strPartDProgramStart);
		expBEPartDDetails.add(strPartDProgramEnd);
		expBEPartDDetails.add(strPartDProgramPorcDate);
		expBEPartDDetails.add(strPartDSType);
		expBEPartDDetails.add(strPartDSRxTypeCode);
		expBEPartDDetails.add(strPartDSRxGroupID);
		expBEPartDDetails.add(strPartDSRxBIN);
		expBEPartDDetails.add(strPartDSRxPCN);
		expBEPartDDetails.add(strPartDSRxMemberID);
		expBEPartDDetails.add(strPartDSRxPersonCode);
		expBEPartDDetails.add(strPartDSRxHelpDesk);
		expBEPartDDetails.add(strPartDSStart);
		expBEPartDDetails.add(strPartDSEnd);
		
		memberLookup_BenefitsEligibility_PartDSelector.waitUntillPartD();
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_MemberSSN(strCMSMemberSSN);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_SpouseSSN(strCMSSpouseSSN);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_HealthInsuranceClaimNo(strCMSHealthInsClaimNo);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_RailroadBenefitNumber(strCMSRRBenefitNumber);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_MaritalStatus(strCMSMaritalStatus);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_Income(strCMSIncome);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_MedicaidID(strCMSMedicaidID);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_CMSDatesStart(strCMSDatesStart);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_CMSDatesEnd(strCMSDatesEnd);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDProgramType(strPartDProgramType);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDProgramValue(strPartDProgramValue);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDProgramStatus(strPartDProgramStatus);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDProgramConractID(strPartDProgramConractID);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDProgramIndicator(strPartDProgramIndicator);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDProgramStart(strPartDProgramStart);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDProgramEnd(strPartDProgramEnd);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDProgramPorcDate(strPartDProgramPorcDate);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDSType(strPartDSType);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDSRxTypeCode(strPartDSRxTypeCode);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDSRxGroupID(strPartDSRxGroupID);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDSRxBIN(strPartDSRxBIN);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDSRxPCN(strPartDSRxPCN);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDSRxMemberID(strPartDSRxMemberID);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDSRxPersonCode(strPartDSRxPersonCode);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDSRxHelpDesk(strPartDSRxHelpDesk);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDSStart(strPartDSStart);
		memberLookup_BenefitsEligibility_PartDSelector.BenefitsEligibility_PartD_PartDSEnd(strPartDSEnd);
					
		for(int i=0;i<expBEPartDDetails.size();i++)
		{
			partDDetailsSoft.assertEquals(memberLookup_BenefitsEligibility_PartDSelector.actBEPartDDetails.get(i), expBEPartDDetails.get(i));
		}		
		partDDetailsSoft.assertAll();
	}
}

