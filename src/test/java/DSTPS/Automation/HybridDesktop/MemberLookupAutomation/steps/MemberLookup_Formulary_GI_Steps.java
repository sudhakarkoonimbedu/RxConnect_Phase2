package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.MemberLookup_Formulary_GISelector;

public class MemberLookup_Formulary_GI_Steps {

	MemberLookup_Formulary_GISelector memberLookup_Formulary_GISelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expFormularyGenInfoDetails = new ArrayList<String>();
	public SoftAssert formularyGenInfoSoft = new SoftAssert();
	
	public MemberLookup_Formulary_GI_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		memberLookup_Formulary_GISelector = new MemberLookup_Formulary_GISelector(SharedResource,utils);
	}
	
	public void clickOnGeneralInformation() throws Throwable{
		memberLookup_Formulary_GISelector.Formulary_clickOnGeneralInformation();
	}
	
	public void verifyGeneralInformationDetails(Map<String,String> genInfoDetails)throws Throwable {
		String strNDC = genInfoDetails.get("NDC");
		String strLabelName = genInfoDetails.get("LabelName");
		String strBrandName = genInfoDetails.get("BrandName");		
		String strGenericName = genInfoDetails.get("GenericName");
		String strStrength = genInfoDetails.get("Strength");
		String strDosageForm = genInfoDetails.get("DosageForm");
		String strMEDID = genInfoDetails.get("MEDID");
		String strRoute = genInfoDetails.get("Route");
		String strDrugForm = genInfoDetails.get("DrugForm");
		String strDrugClass = genInfoDetails.get("GenericName");
		String strDEACode = genInfoDetails.get("DEACode");
		String strDesiDrug = genInfoDetails.get("DESIDrug");
		String strGenderSpecific = genInfoDetails.get("GenderSpecific");
		String strGCN = genInfoDetails.get("GCN");
		String strGCNSeqNumber = genInfoDetails.get("GCNSequenceNumber");
		String strHICLSeqNumber = genInfoDetails.get("HICLSequenceNumber");
		String strManufacturer = genInfoDetails.get("Manufacturer");
		String strMaintenanceDrug = genInfoDetails.get("MaintenanceDrug");
		String strGI = genInfoDetails.get("GI");
		String strGPI = genInfoDetails.get("GPI");
		String strGenericAvailable = genInfoDetails.get("GenericAvailable");
		String strOTCAvailable = genInfoDetails.get("OTCAvailable");
		String strGenManufacturer = genInfoDetails.get("GenManufacturer");
		String strFDAListed = genInfoDetails.get("FDAListed");
		String strFDA = genInfoDetails.get("FDA");
		String strUnitDose = genInfoDetails.get("UnitDose");
		String strUnitDoseOnly = genInfoDetails.get("UnitDoseOnly");
		String strPkgSize = genInfoDetails.get("PackageSize");
		String strSmallPkgGCN = genInfoDetails.get("SmallestPkgGCN");
		String strSmallPkgCore9 = genInfoDetails.get("SmallestPkgCore9");
		String strRePackaged = genInfoDetails.get("RePackaged");
		String strInstProduct = genInfoDetails.get("InstPoduct");
		String strCaseSize = genInfoDetails.get("CaseSize");
		String strAddDate = genInfoDetails.get("AddDate");
		String strObsoleteDate = genInfoDetails.get("ObsoleteDate");
		String strDeleteDate = genInfoDetails.get("DeleteDate");
		String strMrktgEndDate = genInfoDetails.get("MarketingEndDate");
		String strSpecificTPClass = genInfoDetails.get("SpecificTherClass");
		String strStandardTPClass = genInfoDetails.get("StandardTherCalss");
		String strGenericTPClass = genInfoDetails.get("GenericTherCalss");
		String strDrugCategory = genInfoDetails.get("DrugCategory");
		String strAHFSTCCode = genInfoDetails.get("AHFSTCCode");
		String strAHFSTCDescription = genInfoDetails.get("AHFSTCDescription");
		String strETCCode = genInfoDetails.get("ETCCode");
		String strETCName = genInfoDetails.get("ETCName");
		String strETCDefaultUse = genInfoDetails.get("ETCDefaultUse");
		
		expFormularyGenInfoDetails.add(strNDC);
		expFormularyGenInfoDetails.add(strLabelName);
		expFormularyGenInfoDetails.add(strBrandName);
		expFormularyGenInfoDetails.add(strGenericName);
		expFormularyGenInfoDetails.add(strStrength);
		expFormularyGenInfoDetails.add(strDosageForm);
		expFormularyGenInfoDetails.add(strMEDID);
		expFormularyGenInfoDetails.add(strRoute);
		expFormularyGenInfoDetails.add(strDrugForm);
		expFormularyGenInfoDetails.add(strDrugClass);
		expFormularyGenInfoDetails.add(strDEACode);
		expFormularyGenInfoDetails.add(strDesiDrug);
		expFormularyGenInfoDetails.add(strGenderSpecific);
		expFormularyGenInfoDetails.add(strGCN);
		expFormularyGenInfoDetails.add(strGCNSeqNumber);
		expFormularyGenInfoDetails.add(strHICLSeqNumber);
		expFormularyGenInfoDetails.add(strManufacturer);
		expFormularyGenInfoDetails.add(strMaintenanceDrug);
		expFormularyGenInfoDetails.add(strGI);
		expFormularyGenInfoDetails.add(strGPI);
		expFormularyGenInfoDetails.add(strGenericAvailable);
		expFormularyGenInfoDetails.add(strOTCAvailable);
		expFormularyGenInfoDetails.add(strGenManufacturer);
		expFormularyGenInfoDetails.add(strFDAListed);
		expFormularyGenInfoDetails.add(strFDA);
		expFormularyGenInfoDetails.add(strUnitDose);
		expFormularyGenInfoDetails.add(strUnitDoseOnly);
		expFormularyGenInfoDetails.add(strPkgSize);
		expFormularyGenInfoDetails.add(strSmallPkgGCN);
		expFormularyGenInfoDetails.add(strSmallPkgCore9);
		expFormularyGenInfoDetails.add(strRePackaged);
		expFormularyGenInfoDetails.add(strInstProduct);
		expFormularyGenInfoDetails.add(strCaseSize);
		expFormularyGenInfoDetails.add(strAddDate);
		expFormularyGenInfoDetails.add(strObsoleteDate);
		expFormularyGenInfoDetails.add(strDeleteDate);
		expFormularyGenInfoDetails.add(strMrktgEndDate);
		expFormularyGenInfoDetails.add(strSpecificTPClass);
		expFormularyGenInfoDetails.add(strStandardTPClass);
		expFormularyGenInfoDetails.add(strGenericTPClass);
		expFormularyGenInfoDetails.add(strDrugCategory);
		expFormularyGenInfoDetails.add(strAHFSTCCode);
		expFormularyGenInfoDetails.add(strAHFSTCDescription);
		expFormularyGenInfoDetails.add(strETCCode);
		expFormularyGenInfoDetails.add(strETCName);
		expFormularyGenInfoDetails.add(strETCDefaultUse);
		
		memberLookup_Formulary_GISelector.waitUntillGeneralInformation();
		memberLookup_Formulary_GISelector.Formulary_GI_NDC(strNDC);
		memberLookup_Formulary_GISelector.Formulary_GI_LabelName(strLabelName);
		memberLookup_Formulary_GISelector.Formulary_GI_BrandName(strBrandName);
		memberLookup_Formulary_GISelector.Formulary_GI_GenericName(strGenericName);
		memberLookup_Formulary_GISelector.Formulary_GI_Strength(strStrength);
		memberLookup_Formulary_GISelector.Formulary_GI_DosageForm(strDosageForm);
		memberLookup_Formulary_GISelector.Formulary_GI_MEDID(strMEDID);
		memberLookup_Formulary_GISelector.Formulary_GI_Route(strRoute);
		memberLookup_Formulary_GISelector.Formulary_GI_DrugForm(strDrugForm);
		memberLookup_Formulary_GISelector.Formulary_GI_DrugClass(strDrugClass);
		memberLookup_Formulary_GISelector.Formulary_GI_DEACode(strDEACode);
		memberLookup_Formulary_GISelector.Formulary_GI_DesiDrug(strDesiDrug);
		memberLookup_Formulary_GISelector.Formulary_GI_GenderSpecific(strGenderSpecific);
		memberLookup_Formulary_GISelector.Formulary_GI_GCN(strGCN);
		memberLookup_Formulary_GISelector.Formulary_GI_GCNSeqNumber(strGCNSeqNumber);
		memberLookup_Formulary_GISelector.Formulary_GI_HICLSeqNumber(strHICLSeqNumber);
		memberLookup_Formulary_GISelector.Formulary_GI_Manufacturer(strManufacturer);
		memberLookup_Formulary_GISelector.Formulary_GI_MaintenanceDrug(strMaintenanceDrug);
		memberLookup_Formulary_GISelector.Formulary_GI_GI(strGI);
		memberLookup_Formulary_GISelector.Formulary_GI_GPI(strGPI);
		memberLookup_Formulary_GISelector.Formulary_GI_GenericAvailable(strGenericAvailable);
		memberLookup_Formulary_GISelector.Formulary_GI_OTCAvailable(strOTCAvailable);
		memberLookup_Formulary_GISelector.Formulary_GI_GenManufacturer(strGenManufacturer);
		memberLookup_Formulary_GISelector.Formulary_GI_FDAListed(strFDAListed);
		memberLookup_Formulary_GISelector.Formulary_GI_FDA(strFDA);
		memberLookup_Formulary_GISelector.Formulary_GI_UnitDose(strUnitDose);
		memberLookup_Formulary_GISelector.Formulary_GI_UnitDoseOnly(strUnitDoseOnly);
		memberLookup_Formulary_GISelector.Formulary_GI_PkgSize(strPkgSize);
		memberLookup_Formulary_GISelector.Formulary_GI_SmallPkgGCN(strSmallPkgGCN);
		memberLookup_Formulary_GISelector.Formulary_GI_SmallPkgCore9(strSmallPkgCore9);
		memberLookup_Formulary_GISelector.Formulary_GI_RePackaged(strRePackaged);
		memberLookup_Formulary_GISelector.Formulary_GI_InstProduct(strInstProduct);
		memberLookup_Formulary_GISelector.Formulary_GI_CaseSize(strCaseSize);
		memberLookup_Formulary_GISelector.Formulary_GI_AddDate(strAddDate);
		memberLookup_Formulary_GISelector.Formulary_GI_ObsoleteDate(strObsoleteDate);
		memberLookup_Formulary_GISelector.Formulary_GI_DeleteDate(strDeleteDate);
		memberLookup_Formulary_GISelector.Formulary_GI_MrktgEndDate(strMrktgEndDate);
		memberLookup_Formulary_GISelector.Formulary_GI_TC_SpecificTPClass(strSpecificTPClass);
		memberLookup_Formulary_GISelector.Formulary_GI_TC_StandardTPClass(strStandardTPClass);
		memberLookup_Formulary_GISelector.Formulary_GI_TC_GenericTPClass(strGenericTPClass);
		memberLookup_Formulary_GISelector.Formulary_GI_TC_DrugCategory(strDrugCategory);
		memberLookup_Formulary_GISelector.Formulary_GI_AHFSTC_Code(strAHFSTCCode);
		memberLookup_Formulary_GISelector.Formulary_GI_AHFSTC_Description(strAHFSTCDescription);
		memberLookup_Formulary_GISelector.Formulary_GI_ETC_Code(strETCCode);
		memberLookup_Formulary_GISelector.Formulary_GI_ETC_Name(strETCName);
		memberLookup_Formulary_GISelector.Formulary_GI_ETC_DefaultUse(strETCDefaultUse);
		
		for(int i=0;i<expFormularyGenInfoDetails.size();i++)
		{
			formularyGenInfoSoft.assertEquals(memberLookup_Formulary_GISelector.actFormularyGenInfoDetails.get(i), expFormularyGenInfoDetails.get(i));
		}		
		formularyGenInfoSoft.assertAll();
	}
}

