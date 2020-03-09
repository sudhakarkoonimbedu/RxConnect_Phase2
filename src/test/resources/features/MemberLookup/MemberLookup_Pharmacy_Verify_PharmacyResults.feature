Feature: MemberLookup Search and verify Pharmacy Pharmacy Results

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
  Scenario Outline: Verify Pharmacy_Pharmacy Results 
    Given User in Member Lookup details page    
    Then User click on Pharmacy icon     
    Then User provides details and click on Search button     
      | City  | <City>  |         
      | State	| <State> |
      | Zip		| <Zip>   |     
      | NPI		| <NPI>   |     
    Then User verifies Pharmacy Results details       
      | PRPharmacyName		    | <PRPharmacyName>        |          
      | PRNPI								  | <PRNPI>   						  |
      | PRAddress						  | <PRAddress> 				    |
      | PRCity						    | <PRCity>       			    |         
      | PRState							  | <PRState>   					  |
      | PRZipCode						  | <PRZipCode>    			    |
      | PRGILegalBusinessName | <PRGILegalBusinessName> |         
      | PRGIName							| <PRGIName>   	          |
      | PRGINCPDPID						| <PRGINCPDPID>           |
      | PRGINPIID							| <PRGINPIID>             |         
      | PRGIMedicareID				| <PRGIMedicareID>   	    |
      | PRGIStoreNumber				| <PRGIStoreNumber>       |
      | PRGIDoctorsName				| <PRGIDoctorsName>       |         
      | PRGILanguageCodes			| <PRGILanguageCodes>   	|
      | PRGIDispenseClassCode	| <PRGIDispenseClassCode> |
      | PRGIPriProvTypeCode   | <PRGIPriProvTypeCode>   |         
      | PRGISecProvTypeCode		| <PRGISecProvTypeCode>   |
      | PRGITerProvTypeCode		| <PRGITerProvTypeCode>   |
      | LocationAddress1      | <LocationAddress1>      |         
      | LocationAddress2	    | <LocationAddress2>   	  |
      | LocationCity          | <LocationCity>          |
      | LocationState		      | <LocationState>         |         
      | LocationZIP     	    | <LocationZIP>   	      |
      | LocationPhone         | <LocationPhone>         |
      | LocationExtension     | <LocationExtension>     |         
      | LocationFax				    | <LocationFax>   	      |
      | LocationEmail			    | <LocationEmail>         |
      | LocationCrossStDir    | <LocationCrossStDir>    |         
      | PRS24HourOperation 	  | <PRS24HourOperation>   	|
      | PRSProvideHours       | <PRSProvideHours>       |
      | PRSAcceptsEPresc    	| <PRSAcceptsEPresc>   	  |
      | PRSDeliveryService    | <PRSDeliveryService>    |
      | PRSComService         | <PRSComService>   	    |
      | PRSDriveUpWindow      | <PRSDriveUpWindow>      |
      | PRSDurableMedEquip    | <PRSDurableMedEquip>   	|
      | PRSWalkInClinic       | <PRSWalkInClinic>       |
      | PRS24HourEmerService  | <PRS24HourEmerService>  |
      | PRSMultiDoseComPkg    | <PRSMultiDoseComPkg>    |
      | PRSImmunProvided      | <PRSImmunProvided>   	  |
      | PRSHandicappedAcces   | <PRSHandicappedAcces>   |
      | PRS340BStatus       	| <PRS340BStatus>   	    |
      | PRSCDoorFacility      | <PRSCDoorFacility>      |
       
    Examples: 
      | City | State | Zip | NPI        | PRPharmacyName               | PRNPI          | PRAddress               | PRCity      | PRState  | PRZipCode             | PRGILegalBusinessName                               | PRGIName            | PRGINCPDPID      | PRGINPIID         | PRGIMedicareID         | PRGIStoreNumber | PRGIDoctorsName | PRGILanguageCodes             | PRGIDispenseClassCode                         | PRGIPriProvTypeCode                                       | PRGISecProvTypeCode           | PRGITerProvTypeCode          | LocationAddress1          | LocationAddress2 | LocationCity | LocationState | LocationZIP      | LocationPhone          | LocationExtension | LocationFax          | LocationEmail | LocationCrossStDir     | PRS24HourOperation   | PRSProvideHours                                                                                                                               | PRSAcceptsEPresc         | PRSDeliveryService | PRSComService         | PRSDriveUpWindow  | PRSDurableMedEquip          | PRSWalkInClinic | PRS24HourEmerService       | PRSMultiDoseComPkg               | PRSImmunProvided        | PRSHandicappedAcces      | PRS340BStatus | PRSCDoorFacility      |    
      |      |       |     | 1477568087 | Pharmacy Name^LIMESTONE DRUG | NPI^1477568087 | Address^200 W MARKET ST | City^ATHENS | State^AL | Zip Code^35611 - 0709 | Legal business name^TENNESSEE VALLEY HEALTHCARE LLC | Name^LIMESTONE DRUG | NCPDP ID^0100886 | NPI ID^1477568087 | Medicare ID^4917380001 | Store number^   | Doctor's name^  | Language code(s)^en (English) | Dispense class code^01 (Independent Pharmacy) | Primary provider type code^01 (Community/Retail Pharmacy) | Secondary provider type code^ | Tertiary provider type code^ | Address 1^200 W MARKET ST | Address 2^       | City^ATHENS  | State^AL      | ZIP^35611 - 0709 | Phone^(256) 232 - 3811 | Extension^        | Fax^(256) 232 - 2422 | Email^        | Cross St / Directions^ | 24 hour operation^No | Provider hours^Sunday 0900-1700$Monday 0700-1900$Tuesday 0700-1900$Wednesday 0700-1900$Thursday 0700-1900$Friday 0700-1900$Saturday 0800-1700 | Accepts ePrescriptions^N | Delivery service^Y | Compounding service^Y | Drive-up window^Y | Durable medical equipment^Y | Walk-in clinic^ | 24-hour emergency service^ | Multi-dose compliance packaging^ | Immunizations provided^ | Handicapped accessible^Y | 340B status^  | Closed door facility^ |  

  
  
  
  
  
  
  
  
  
  
  
  
   