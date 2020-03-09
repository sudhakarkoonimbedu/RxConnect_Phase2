package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.MemberLookup_Formulary_DrugResultsSelector;

public class MemberLookup_Formulary_DrugResults_Steps {

	MemberLookup_Formulary_DrugResultsSelector memberLookup_Formulary_DrugResultsSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expDrugResults = new ArrayList<String>();
	public ArrayList<String> expClaimTestSummary = new ArrayList<String>();
	public SoftAssert drugResultsSoft = new SoftAssert();
	public SoftAssert claimTestSoft = new SoftAssert();
	
	public MemberLookup_Formulary_DrugResults_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		memberLookup_Formulary_DrugResultsSelector = new MemberLookup_Formulary_DrugResultsSelector(SharedResource,utils);
	}
	
	public void verifyDrugResults(Map<String,String> drugResultsDetails)throws Throwable {
		String strNDC = drugResultsDetails.get("NDC");
		String strBrandName = drugResultsDetails.get("BrandName");		
		String strGenericName = drugResultsDetails.get("GenericName");		
		String strGCN = drugResultsDetails.get("GCN");
		String strDrugName = drugResultsDetails.get("DrugName");
		String strGI = drugResultsDetails.get("GI");
		String strGPI = drugResultsDetails.get("GPI");
		String strPkgSize = drugResultsDetails.get("PkgSize");		
		
		expDrugResults.add(strNDC);
		expDrugResults.add(strBrandName);
		expDrugResults.add(strGenericName);
		expDrugResults.add(strGCN);
		expDrugResults.add(strDrugName);
		expDrugResults.add(strGI);
		expDrugResults.add(strGPI);
		expDrugResults.add(strPkgSize);
		
		memberLookup_Formulary_DrugResultsSelector.Formulary_DrugResults_NDC(strNDC);
		memberLookup_Formulary_DrugResultsSelector.Formulary_DrugResults_BrandName(strBrandName);
		memberLookup_Formulary_DrugResultsSelector.Formulary_DrugResults_GenericName(strGenericName);
		memberLookup_Formulary_DrugResultsSelector.Formulary_DrugResults_GCN(strGCN);
		memberLookup_Formulary_DrugResultsSelector.Formulary_DrugResults_DrugName(strDrugName);
		memberLookup_Formulary_DrugResultsSelector.Formulary_DrugResults_GI(strGI);
		memberLookup_Formulary_DrugResultsSelector.Formulary_DrugResults_GPI(strGPI);
		memberLookup_Formulary_DrugResultsSelector.Formulary_DrugResults_PkgSize(strPkgSize);
		
		for(int i=0;i<expDrugResults.size();i++)
		{
			drugResultsSoft.assertEquals(memberLookup_Formulary_DrugResultsSelector.actDrugResults.get(i), expDrugResults.get(i));
		}		
		drugResultsSoft.assertAll();
	}
	
	public void verifyClaimTestDetails(Map<String,String> claimTestDetails) throws Throwable{
		String strType = claimTestDetails.get("Type");
		String strTransactionType = claimTestDetails.get("TransactionType");		
		String strPrevClaimID = claimTestDetails.get("PreviousClaimID");		
		
		expClaimTestSummary.add(strType);
		expClaimTestSummary.add(strTransactionType);
		expClaimTestSummary.add(strPrevClaimID);
		
		memberLookup_Formulary_DrugResultsSelector.Formulary_DrugResults_clickOnClaimTestButton();		
		memberLookup_Formulary_DrugResultsSelector.verifyClaimTest();
		memberLookup_Formulary_DrugResultsSelector.ClaimTest_Type(strType);
		memberLookup_Formulary_DrugResultsSelector.ClaimTest_TransactionType(strTransactionType);
		memberLookup_Formulary_DrugResultsSelector.ClaimTest_PrevClaimID(strPrevClaimID);
		memberLookup_Formulary_DrugResultsSelector.closeRxNovaClaim();
		
		for(int i=0;i<expClaimTestSummary.size();i++)
		{
			claimTestSoft.assertEquals(memberLookup_Formulary_DrugResultsSelector.actClaimTestSummary.get(i), expClaimTestSummary.get(i));
		}		
		claimTestSoft.assertAll();
	}
}

