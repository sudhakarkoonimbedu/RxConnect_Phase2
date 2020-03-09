package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps;

import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import DSTPS.Automation.HybridDesktop.Apps.common.HybridDesktop_SharedResource;
import DSTPS.Automation.HybridDesktop.Apps.common.RxNova_Utlilty;
import DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages.MemberLookup_Pharmacy_ResultsSelector;

public class MemberLookup_Pharmacy_Results_Steps {

	MemberLookup_Pharmacy_ResultsSelector memberLookup_Pharmacy_ResultsSelector;
	
	private HybridDesktop_SharedResource SharedResource;
	private WebDriver driver;
	private RxNova_Utlilty utils;
	
	public ArrayList<String> expPharmacyResults = new ArrayList<String>();
	public SoftAssert pharmacyResultsSoft = new SoftAssert();
	
	public MemberLookup_Pharmacy_Results_Steps(HybridDesktop_SharedResource SharedResource, RxNova_Utlilty utils) throws Throwable{
		this.SharedResource = SharedResource;
		this.driver = SharedResource.getDriver();	
		this.utils = utils;	
		init();
	}
	
	public void init() throws Throwable
	{
		// Initialize all the pages you are handling 
		memberLookup_Pharmacy_ResultsSelector = new MemberLookup_Pharmacy_ResultsSelector(SharedResource,utils);
	}
	
	
	public void searchPharmacy(Map<String,String> pharmacySearchDetails) throws Throwable{
		String strCity = pharmacySearchDetails.get("City");
		String strState = pharmacySearchDetails.get("State");
		String strZip = pharmacySearchDetails.get("Zip");
		String strNPI = pharmacySearchDetails.get("NPI");		
		
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_enterCity(strCity);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_selectState(strState);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_enterZip(strZip);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_enterNPI(strNPI);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_clickOnSearchButton();
		Thread.sleep(2000);
	}
	
	public void verifyPharmacyResultsDetails(Map<String,String> pharmacyResultsDetails)throws Throwable {
		String strPRPharmacyName = pharmacyResultsDetails.get("PRPharmacyName");
		String strPRNPI = pharmacyResultsDetails.get("PRNPI");		
		String strPRAddress = pharmacyResultsDetails.get("PRAddress");		
		String strPRCity = pharmacyResultsDetails.get("PRCity");
		String strPRState = pharmacyResultsDetails.get("PRState");
		String strPRZipCode = pharmacyResultsDetails.get("PRZipCode");
		String strPRGILegalBusinessName = pharmacyResultsDetails.get("PRGILegalBusinessName");
		String strPRGIName = pharmacyResultsDetails.get("PRGIName");
		String strPRGINCPDPID = pharmacyResultsDetails.get("PRGINCPDPID");
		String strPRGINPIID = pharmacyResultsDetails.get("PRGINPIID");
		String strPRGIMedicareID = pharmacyResultsDetails.get("PRGIMedicareID");
		String strPRGIStoreNumber = pharmacyResultsDetails.get("PRGIStoreNumber");
		String strPRGIDoctorsName = pharmacyResultsDetails.get("PRGIDoctorsName");
		String strPRGILanguageCodes = pharmacyResultsDetails.get("PRGILanguageCodes");
		String strPRGIDispenseClassCode = pharmacyResultsDetails.get("PRGIDispenseClassCode");
		String strPRGIPriProvTypeCode = pharmacyResultsDetails.get("PRGIPriProvTypeCode");
		String strPRGISecProvTypeCode = pharmacyResultsDetails.get("PRGISecProvTypeCode");
		String strPRGITerProvTypeCode = pharmacyResultsDetails.get("PRGITerProvTypeCode");
		String strLocationAddress1 = pharmacyResultsDetails.get("LocationAddress1");
		String strLocationAddress2 = pharmacyResultsDetails.get("LocationAddress2");
		String strLocationCity = pharmacyResultsDetails.get("LocationCity");
		String strLocationState = pharmacyResultsDetails.get("LocationState");
		String strLocationZIP = pharmacyResultsDetails.get("LocationZIP");
		String strLocationPhone = pharmacyResultsDetails.get("LocationPhone");
		String strLocationExtension = pharmacyResultsDetails.get("LocationExtension");
		String strLocationFax = pharmacyResultsDetails.get("LocationFax");
		String strLocationEmail = pharmacyResultsDetails.get("LocationEmail");
		String strLocationCrossStDir = pharmacyResultsDetails.get("LocationCrossStDir");
		String strPRS24HourOperation = pharmacyResultsDetails.get("PRS24HourOperation");
		String strPRSProvideHours = pharmacyResultsDetails.get("PRSProvideHours");
		String strPRSAcceptsEPresc = pharmacyResultsDetails.get("PRSAcceptsEPresc");
		String strPRSDeliveryService = pharmacyResultsDetails.get("PRSDeliveryService");
		String strPRSComService = pharmacyResultsDetails.get("PRSComService");
		String strPRSDriveUpWindow = pharmacyResultsDetails.get("PRSDriveUpWindow");
		String strPRSDurableMedEquip = pharmacyResultsDetails.get("PRSDurableMedEquip");
		String strPRSWalkInClinic = pharmacyResultsDetails.get("PRSWalkInClinic");
		String strPRS24HourEmerService = pharmacyResultsDetails.get("PRS24HourEmerService");
		String strPRSMultiDoseComPkg = pharmacyResultsDetails.get("PRSMultiDoseComPkg");
		String strPRSImmunProvided = pharmacyResultsDetails.get("PRSImmunProvided");
		String strPRSHandicappedAcces = pharmacyResultsDetails.get("PRSHandicappedAcces");
		String strPRS340BStatus = pharmacyResultsDetails.get("PRS340BStatus");
		String strPRSCDoorFacility = pharmacyResultsDetails.get("PRSCDoorFacility");
		
		expPharmacyResults.add(strPRPharmacyName);
		expPharmacyResults.add(strPRNPI);
		expPharmacyResults.add(strPRAddress);
		expPharmacyResults.add(strPRCity);
		expPharmacyResults.add(strPRState);
		expPharmacyResults.add(strPRZipCode);
		expPharmacyResults.add(strPRGILegalBusinessName);
		expPharmacyResults.add(strPRGIName);
		expPharmacyResults.add(strPRGINCPDPID);
		expPharmacyResults.add(strPRGINPIID);
		expPharmacyResults.add(strPRGIMedicareID);
		expPharmacyResults.add(strPRGIStoreNumber);
		expPharmacyResults.add(strPRGIDoctorsName);
		expPharmacyResults.add(strPRGILanguageCodes);
		expPharmacyResults.add(strPRGIDispenseClassCode);
		expPharmacyResults.add(strPRGIPriProvTypeCode);
		expPharmacyResults.add(strPRGISecProvTypeCode);
		expPharmacyResults.add(strPRGITerProvTypeCode);
		expPharmacyResults.add(strLocationAddress1);
		expPharmacyResults.add(strLocationAddress2);
		expPharmacyResults.add(strLocationCity);
		expPharmacyResults.add(strLocationState);
		expPharmacyResults.add(strLocationZIP);
		expPharmacyResults.add(strLocationPhone);
		expPharmacyResults.add(strLocationExtension);
		expPharmacyResults.add(strLocationFax);
		expPharmacyResults.add(strLocationEmail);
		expPharmacyResults.add(strLocationCrossStDir);
		expPharmacyResults.add(strPRS24HourOperation);
		expPharmacyResults.add(strPRSProvideHours);
		expPharmacyResults.add(strPRSAcceptsEPresc);
		expPharmacyResults.add(strPRSDeliveryService);
		expPharmacyResults.add(strPRSComService);
		expPharmacyResults.add(strPRSDriveUpWindow);
		expPharmacyResults.add(strPRSDurableMedEquip);
		expPharmacyResults.add(strPRSWalkInClinic);
		expPharmacyResults.add(strPRS24HourEmerService);
		expPharmacyResults.add(strPRSMultiDoseComPkg);
		expPharmacyResults.add(strPRSImmunProvided);
		expPharmacyResults.add(strPRSHandicappedAcces);
		expPharmacyResults.add(strPRS340BStatus);
		expPharmacyResults.add(strPRSCDoorFacility);
		
		memberLookup_Pharmacy_ResultsSelector.waitUntillPharmacyResultsTable();
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_PharmacyName(strPRPharmacyName);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_NPI(strPRNPI);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_Address(strPRAddress);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_City(strPRCity);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_State(strPRState);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_ZipCode(strPRZipCode);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_GI_LegalBusinessName(strPRGILegalBusinessName);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_GI_Name(strPRGIName);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_GI_NCPDPID(strPRGINCPDPID);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_GI_NPIID(strPRGINPIID);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_GI_MedicareID(strPRGIMedicareID);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_GI_StoreNumber(strPRGIStoreNumber);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_GI_DoctorsName(strPRGIDoctorsName);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_GI_LanguageCodes(strPRGILanguageCodes);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_GI_DispenseClassCode(strPRGIDispenseClassCode);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_GI_PriProvTypeCode(strPRGIPriProvTypeCode);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_GI_SecProvTypeCode(strPRGISecProvTypeCode);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_GI_TerProvTypeCode(strPRGITerProvTypeCode);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_Location_Address1(strLocationAddress1);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_Location_Address2(strLocationAddress2);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_Location_City(strLocationCity);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_Location_State(strLocationState);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_Location_Zip(strLocationZIP);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_Location_Phone(strLocationPhone);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_Location_Extension(strLocationExtension);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_Location_Fax(strLocationFax);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_Location_Email(strLocationEmail);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_Location_CrossStDirection(strLocationCrossStDir);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_Services_24HrOperation(strPRS24HourOperation);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_Services_ProvideHours(strPRSProvideHours);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_Services_AcceptsePrescriptions(strPRSAcceptsEPresc);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_Services_DeliveryService(strPRSDeliveryService);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_Services_CompoundService(strPRSComService);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_Services_DriveUpWindow(strPRSDriveUpWindow);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_Services_DurableMedEquipment(strPRSDurableMedEquip);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_Services_WalkInClinic(strPRSWalkInClinic);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_Services_24HrEmergencyService(strPRS24HourEmerService);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_Services_MultiDoseComPkg(strPRSMultiDoseComPkg);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_Services_ImmunProvided(strPRSImmunProvided);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_Services_HandicappedAcces(strPRSHandicappedAcces);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_Services_340BStatus(strPRS340BStatus);
		memberLookup_Pharmacy_ResultsSelector.Pharmacy_Results_Services_ClosedDoorFacility(strPRSCDoorFacility);
		
		for(int i=0;i<expPharmacyResults.size();i++)
		{
			pharmacyResultsSoft.assertEquals(memberLookup_Pharmacy_ResultsSelector.actPharmacyResults.get(i), expPharmacyResults.get(i));
		}		
		pharmacyResultsSoft.assertAll();
	}	
}

