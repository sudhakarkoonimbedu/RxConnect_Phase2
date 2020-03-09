Feature: MemberLookup Search and verify Formulary General Information

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   | |
      | password | |
      | region   | |

  @Functional
  Scenario Outline: Member Lookup search with valid data
    Given User in Landing Page, he selects the application from menu    
      | menu | <ApplicationMenu> |      
    Then User search for existing member by entering details in Member Lookup    
      | SearchCustomerSet | <SearchCustomerSet> |
      | SearchCustomer    | <SearchCustomer>    |
      | SearchMemberID    | <SearchMemberID>    |
      | SearchAltID       | <SearchAltID>       |
      | SearchExactMatch  | <SearchExactMatch>  |
      | SearchFirstName   | <SearchFirstName>   |
      | SearchMI          | <SearchMI>          |
      | SearchLastName    | <SearchLastName>    |
      | SearchDOB         | <SearchDOB>         |
      | SearchClaimID     | <SearchClaimID>     |     	
    Then Member details should be displayed    
      | Customer      | <Customer>    |
      | MemberID      | <MemberID>    |
      | AltMemberID   | <AltMemberID> |
      | FirstName     | <FirstName>   |
      | LastName      | <LastName>    |
      | MI            | <MI>          |      
      | DOB           | <DOB>         |
      | StartDate     | <StartDate>   |
      | EndDate       | <EndDate>     |
            
    Examples: 
      | ApplicationMenu               | SearchCustomerSet | SearchCustomer    | SearchMemberID | SearchAltID | SearchExactMatch | SearchFirstName | SearchMI | SearchLastName | SearchDOB | SearchClaimID | Customer                   | MemberID                     | AltMemberID    | FirstName       | LastName                   | MI  | DOB            | StartDate             | EndDate              |
      | Miscellaneous->RxNova Connect | Humana            | 0319 - 0319HUMANA | 90818000101    |             | checked          |                 |          |                |           |               | Customer^0319 - 0319HUMANA | Member ID^000000090818000101 | Alt Member ID^ | First Name^MBR1 | Last Name^MBRNONBRIDGECUST | MI^ | DOB^01/15/1964 | Start Date^01/01/2015 | End Date^No end date |
      
     
  @Functional
  Scenario Outline: Verify Header details
    Given User in Member Lookup Search Page and click on Blue arrow at Customer Field         
    Then User verifies the header details     
      | CustomerSet | <CustomerSet> |         
      | Customer		| <Customer>    |
      | Client      | <Client>      |
      | Group      	| <Group>  	    |
      | Gender			| <Gender>      |
      | MemberID    | <MemberID>    | 
      | AltMemberID | <AltMemberID> |
      | FirstName   | <FirstName>   |
      | LastName    | <LastName>    |
      | DOB         | <DOB>         |      
      
    Examples: 
      | CustomerSet          | Customer                    | Client                     | Group             | Gender    | MemberID                      | AltMemberID     | FirstName        | LastName                    | DOB             |
      | Customer Set:^Humana | Customer:^0319 - 0319HUMANA | Client:^9007 - NBRG--CLNT1 | Group:^RXCONNECT2 | Gender:^M | Member ID:^000000090818000101 | Alt Member ID:^ | First Name:^MBR1 | Last Name:^MBRNONBRIDGECUST | DOB:^01/15/1964 | 
          
  @Functional
  Scenario Outline: Verify Formulary General Information 
    Given User in Member Lookup details page    
    Then User click on Formulary icon     
    Then User click on General Information in Formulary screen     
    Then User verifies Formulary General Information details     
      | NDC			           | <NDC>                |         
      | LabelName			     | <LabelName>      	  |
      | BrandName 		     | <BrandName>          |
      | GenericName        | <GenericName>        |
      | Strength           | <Strength>           |
      | DosageForm         | <DosageForm>         |
      | MEDID				       | <MEDID>              |
      | Route					     | <Route>              |
      | DrugForm           | <DrugForm>           |         
      | DrugClass			     | <DrugClass>      	  |
      | DEACode   		     | <DEACode>            |
      | DESIDrug           | <DESIDrug>           |
      | GenderSpecific     | <GenderSpecific>     |
      | GCN						     | <GCN>                |
      | GCNSequenceNumber  | <GCNSequenceNumber>  |
      | HICLSequenceNumber | <HICLSequenceNumber> |
      | Manufacturer			 | <Manufacturer>       |         
      | MaintenanceDrug		 | <MaintenanceDrug>    |
      | GI				 		     | <GI>       				  |
      | GPI                | <GPI>                |
      | GenericAvailable   | <GenericAvailable>   |
      | OTCAvailable		   | <OTCAvailable>       |
      | GenManufacturer    | <GenManufacturer>    |
      | FDAListed					 | <FDAListed>          |
      | FDA								 | <FDA>                |
      | UnitDose					 | <UnitDose>           |         
      | UnitDoseOnly			 | <UnitDoseOnly>       |
      | PackageSize				 | <PackageSize>        |
      | SmallestPkgGCN		 | <SmallestPkgGCN>     |
      | SmallestPkgCore9	 | <SmallestPkgCore9>   |
      | RePackaged 				 | <RePackaged>         |
      | InstPoduct         | <InstPoduct>         |
      | CaseSize					 | <CaseSize>           |
      | AddDate						 | <AddDate>            |         
      | ObsoleteDate			 | <ObsoleteDate>       |
      | DeleteDate				 | <DeleteDate>         |
      | MarketingEndDate	 | <MarketingEndDate>   |
      | SpecificTherClass  | <SpecificTherClass>  |
      | StandardTherCalss  | <StandardTherCalss>  |
      | GenericTherCalss   | <GenericTherCalss>   |
      | DrugCategory			 | <DrugCategory>       |         
      | AHFSTCCode				 | <AHFSTCCode>      	  |
      | AHFSTCDescription  | <AHFSTCDescription>  |
      | ETCCode						 | <ETCCode>            | 
      | ETCName						 | <ETCName>            |
      | ETCDefaultUse		   | <ETCDefaultUse>      |
          
    Examples: 
      | NDC  | LabelName   | BrandName   | GenericName   | Strength  | DosageForm   | MEDID   | Route	 | DrugForm   | DrugClass	  | DEACode   | DESIDrug   | GenderSpecific   | GCN  | GCNSequenceNumber    | HICLSequenceNumber    | Manufacturer	| MaintenanceDrug   | GI  | GPI  | GenericAvailable   | OTCAvailable   | GenManufacturer       | FDAListed   | FDA	| UnitDose   | UnitDoseOnly	   | PackageSize   | SmallestPkgGCN	     | SmallestPkgCore9	     | RePackaged   | InstPoduct             | CaseSize   | AddDate	  | ObsoleteDate	 | DeleteDate   | MarketingEndDate    | SpecificTherClass           | StandardTherCalss           | GenericTherCalss           | DrugCategory   | AHFSTCCode  | AHFSTCDescription  | ETCCode  | ETCName  | ETCDefaultUse  |
      | NDC^ | Label name^ | Brand name^ | Generic name^ | Strength^ | Dosage form^ | MED ID^ | Route^ | Drug form^ | Drug class^ | DEA code^ | DESI drug^ | Gender-specific^ | GCN^ | GCN sequence number^ | HICL sequence number^ | Manufacturer^ | Maintenance drug^ | GI^ | GPI^ | Generic available^ | OTC available^ | Generic manufacturer^ | FDA listed^ | FDA^ | Unit dose^ | Unit dose only^ | Package size^ | Smallest pkg - GCN^ | Smallest pkg - Core9^ | Re-packaged^ | Institutional product^ | Case size^ | Add date^ | Obsolete date^ | Delete date^ | Marketing end date^ | Specific therapeutic class^ | Standard therapeutic class^ | Generic therapeutic class^ | Drug category^ | Code^       | Description^       | Code^    | Name^    | Default Use^   |
  
  
  
  
  
  
  
  
  
  
   