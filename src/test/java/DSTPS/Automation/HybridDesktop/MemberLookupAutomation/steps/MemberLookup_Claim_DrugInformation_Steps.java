package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupApp.common.MemberLookup_LandingPage_Steps;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.MemberLookup_Claim_DrugInformationSelector;

public class MemberLookup_Claim_DrugInformation_Steps {

	MemberLookup_Claim_DrugInformationSelector memberLookup_Claim_DrugInformationSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expDrugInformation = new ArrayList<String>();
	public SoftAssert drugInformationSoft = new SoftAssert();
	
	
	public MemberLookup_Claim_DrugInformation_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		memberLookup_Claim_DrugInformationSelector = new MemberLookup_Claim_DrugInformationSelector(SharedResource,utils);
	}
	
	public void clickOnDrugInformation() throws Throwable{
		memberLookup_Claim_DrugInformationSelector.MemberLookup_Claim_clickOnDrugInformation();
		memberLookup_Claim_DrugInformationSelector.waitUnitillDrugInformationDetails();
	}
	
	public void verifyDrugInformation(Map<String,String> drugInformation)throws Throwable {
		 
		String strGenericIndicator = drugInformation.get("GenericIndicator");
		String strGenericPriceInedicator = drugInformation.get("GenericPriceInedicator");
		String strGCN = drugInformation.get("GCN");
		String strGCNSequenceNumber = drugInformation.get("GCNSequenceNumber");
		String strMEDID = drugInformation.get("MEDID");
		String strHICLSequenceNumber = drugInformation.get("HICLSequenceNumber");
		String strAHFSCode = drugInformation.get("AHFSCode");
		String strDEACode = drugInformation.get("DEACode");
		String strManufacturer = drugInformation.get("Manufacturer");
		String strGenericTherapeuticClass = drugInformation.get("GenericTherapeuticClass");
		String strStandardTherapeuticClass = drugInformation.get("StandardTherapeuticClass");
		String strSpecificTherapeuticClass = drugInformation.get("SpecificTherapeuticClass");
		String strEnhancedTherapeuticClass = drugInformation.get("EnhancedTherapeuticClass");
		String strDrugClass = drugInformation.get("DrugClass");
		String strDrugCategory = drugInformation.get("DrugCategory");
		String strRxCUI = drugInformation.get("RxCUI");
		String strOrangeBookIndicator = drugInformation.get("OrangeBookIndicator");
		String strNDCMaintenanceIndicator = drugInformation.get("NDCMaintenanceIndicator");
		String strDosageStrength = drugInformation.get("DosageStrength");
		String strDosageFormCode = drugInformation.get("DosageFormCode");
		String strUnitOfMeasure = drugInformation.get("UnitOfMeasure");
		String strPackageSize = drugInformation.get("PackageSize");
		String strRouteCode = drugInformation.get("RouteCode");
		  		 		 
		expDrugInformation.add(strGenericIndicator);
		expDrugInformation.add(strGenericPriceInedicator);
		expDrugInformation.add(strGCN);
		expDrugInformation.add(strGCNSequenceNumber);
		expDrugInformation.add(strMEDID);
		expDrugInformation.add(strHICLSequenceNumber);
		expDrugInformation.add(strAHFSCode);
		expDrugInformation.add(strDEACode);
		expDrugInformation.add(strManufacturer);
		expDrugInformation.add(strGenericTherapeuticClass);
		expDrugInformation.add(strStandardTherapeuticClass);
		expDrugInformation.add(strSpecificTherapeuticClass);
		expDrugInformation.add(strEnhancedTherapeuticClass);
		expDrugInformation.add(strDrugClass);
		expDrugInformation.add(strDrugCategory);
		expDrugInformation.add(strRxCUI);
		expDrugInformation.add(strOrangeBookIndicator);
		expDrugInformation.add(strNDCMaintenanceIndicator);		 
		expDrugInformation.add(strDosageStrength);
		expDrugInformation.add(strDosageFormCode);
		expDrugInformation.add(strUnitOfMeasure);
		expDrugInformation.add(strPackageSize);
		expDrugInformation.add(strRouteCode);		 
		
		memberLookup_Claim_DrugInformationSelector.Claim_DrugInformation_GenericIndicator(strGenericIndicator);
		memberLookup_Claim_DrugInformationSelector.Claim_DrugInformation_GenericPriceInedicator(strGenericPriceInedicator);
		memberLookup_Claim_DrugInformationSelector.Claim_DrugInformation_GCN(strGCN);
		memberLookup_Claim_DrugInformationSelector.Claim_DrugInformation_GCNSequenceNumber(strGCNSequenceNumber);
		memberLookup_Claim_DrugInformationSelector.Claim_DrugInformation_MEDID(strMEDID);
		memberLookup_Claim_DrugInformationSelector.Claim_DrugInformation_HICLSequenceNumber(strHICLSequenceNumber);
		memberLookup_Claim_DrugInformationSelector.Claim_DrugInformation_AHFSCode(strAHFSCode);
		memberLookup_Claim_DrugInformationSelector.Claim_DrugInformation_DEACode(strDEACode);
		memberLookup_Claim_DrugInformationSelector.Claim_DrugInformation_Manufacturer(strManufacturer);
		memberLookup_Claim_DrugInformationSelector.Claim_DrugInformation_GenericTherapeuticClass(strGenericTherapeuticClass);
		memberLookup_Claim_DrugInformationSelector.Claim_DrugInformation_StandardTherapeuticClass(strStandardTherapeuticClass);
		memberLookup_Claim_DrugInformationSelector.Claim_DrugInformation_SpecificTherapeuticClass(strSpecificTherapeuticClass);
		memberLookup_Claim_DrugInformationSelector.Claim_DrugInformation_EnhancedTherapeuticClass(strEnhancedTherapeuticClass);
		memberLookup_Claim_DrugInformationSelector.Claim_DrugInformation_DrugClass(strDrugClass);
		memberLookup_Claim_DrugInformationSelector.Claim_DrugInformation_DrugCategory(strDrugCategory);
		memberLookup_Claim_DrugInformationSelector.Claim_DrugInformation_RxCUI(strRxCUI);
		memberLookup_Claim_DrugInformationSelector.Claim_DrugInformation_OrangeBookIndicator(strOrangeBookIndicator);
		memberLookup_Claim_DrugInformationSelector.Claim_DrugInformation_NDCMaintenanceIndicator(strNDCMaintenanceIndicator);
		memberLookup_Claim_DrugInformationSelector.Claim_DrugInformation_DosageStrength(strDosageStrength);
		memberLookup_Claim_DrugInformationSelector.Claim_DrugInformation_DosageFormCode(strDosageFormCode);
		memberLookup_Claim_DrugInformationSelector.Claim_DrugInformation_UnitOfMeasure(strUnitOfMeasure);
		memberLookup_Claim_DrugInformationSelector.Claim_DrugInformation_PackageSize(strPackageSize);
		memberLookup_Claim_DrugInformationSelector.Claim_DrugInformation_RouteCode(strRouteCode);		 
			
		for(int i=0;i<expDrugInformation.size();i++)
		{
			drugInformationSoft.assertEquals(memberLookup_Claim_DrugInformationSelector.actDrugInformation.get(i), expDrugInformation.get(i));
		}		
		drugInformationSoft.assertAll();
		
	}	
	
	 
}

