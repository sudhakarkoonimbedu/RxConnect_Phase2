package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.MemberLookup_Formulary_MinMaxDoseSelector;

public class MemberLookup_Formulary_MinMaxDose_Steps {

	MemberLookup_Formulary_MinMaxDoseSelector memberLookup_Formulary_MinMaxDoseSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expMinMaxDetails = new ArrayList<String>();
	public SoftAssert minMaxDoseSoft = new SoftAssert();
	
	public MemberLookup_Formulary_MinMaxDose_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		memberLookup_Formulary_MinMaxDoseSelector = new MemberLookup_Formulary_MinMaxDoseSelector(SharedResource,utils);
	}
	
	public void clickOnMinMaxDose() throws Throwable{
		memberLookup_Formulary_MinMaxDoseSelector.Formulary_clickOnMinMaxDose();
	}
	
	public void verifyMinMaxDoseDetails(Map<String,String> minMaxDoseDetails)throws Throwable {
		String strPedMinDailyDose = minMaxDoseDetails.get("MinDailyDose");
		String strPedMaxDailyDose = minMaxDoseDetails.get("MaxDailyDose");
		String strPedNotToExceedDailyDose = minMaxDoseDetails.get("NTExceedDailyDose");		
		String strAdultMinDailyDose = minMaxDoseDetails.get("AdultMinDailyDose");
		String strAdultMaxDailyDose = minMaxDoseDetails.get("AdultMaxDailyDose");
		String strGeriatricMinDailyDose = minMaxDoseDetails.get("GeriatricMinDDose");
		String strGeriatricMaxDailyDose = minMaxDoseDetails.get("GeriatricMaxDDose");
		
		expMinMaxDetails.add(strPedMinDailyDose);
		expMinMaxDetails.add(strPedMaxDailyDose);
		expMinMaxDetails.add(strPedNotToExceedDailyDose);
		expMinMaxDetails.add(strAdultMinDailyDose);
		expMinMaxDetails.add(strAdultMaxDailyDose);
		expMinMaxDetails.add(strGeriatricMinDailyDose);
		expMinMaxDetails.add(strGeriatricMaxDailyDose);
		
		memberLookup_Formulary_MinMaxDoseSelector.waitUntillPediatric();
		memberLookup_Formulary_MinMaxDoseSelector.Formulary_Pediatric_MinDailyDose(strPedMinDailyDose);
		memberLookup_Formulary_MinMaxDoseSelector.Formulary_Pediatric_MaxDailyDose(strPedMaxDailyDose);
		memberLookup_Formulary_MinMaxDoseSelector.Formulary_Pediatric_NotToExceedDailyDose(strPedNotToExceedDailyDose);
		memberLookup_Formulary_MinMaxDoseSelector.Formulary_Adult_MinDailyDose(strAdultMinDailyDose);
		memberLookup_Formulary_MinMaxDoseSelector.Formulary_Adult_MaxDailyDose(strAdultMaxDailyDose);
		memberLookup_Formulary_MinMaxDoseSelector.Formulary_Geriatric_MinDailyDose(strGeriatricMinDailyDose);
		memberLookup_Formulary_MinMaxDoseSelector.Formulary_Geriatric_MaxDailyDose(strGeriatricMaxDailyDose);
			
		for(int i=0;i<expMinMaxDetails.size();i++)
		{
			minMaxDoseSoft.assertEquals(memberLookup_Formulary_MinMaxDoseSelector.actMinMaxDetails.get(i), expMinMaxDetails.get(i));
		}		
		minMaxDoseSoft.assertAll();
	}
}

