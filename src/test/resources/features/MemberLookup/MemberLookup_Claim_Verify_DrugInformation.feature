Feature: MemberLookup search verify Drug Information

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
  Scenario Outline: Verify Claim Claim_History 
    Given User in Member Lookup details page    
    Then User click on Claim icon      
    Then User verifies Claim History details       
    Then User click on Blue arrow in Claim History details        
    Then User verifies the Claim details    
    	| MemberID    | <MemberID>    |         
      | DateOfBirth	| <DateOfBirth> |
      | Gender      | <Gender>      |
      | Customer    | <Customer>  	|
      | Client      | <Client>      | 
      | Group       | <Group>       |
      
    Examples: 
      | MemberID           						 | DateOfBirth     | Gender    | Customer                 | Client                                        | Group               |  
      | Member ID:^000000090818000101  | DOB:^01/15/1964 | Gender:^M | Customer:^319 0319HUMANA | Client:^9007 NBRG--CLNT1 - NONBRG CLIENT--PDP | Group:^6/RXCONNECT2 |     
      
  @Functional
  Scenario Outline: Verify Drug Information
    Given User in Member Lookup Claim details page
    Then User click on Drug Information in Claim screen
    Then User verifies Drug Information    
    	| GenericIndicator         | <GenericIndicator>         |         
      | GenericPriceInedicator   | <GenericPriceInedicator>   |
      | GCN                      | <GCN>                      |
      | GCNSequenceNumber        | <GCNSequenceNumber>        |
      | MEDID                    | <MEDID>                    | 
      | HICLSequenceNumber       | <HICLSequenceNumber>       |
      | AHFSCode                 | <AHFSCode>                 |
      | DEACode                  | <DEACode>                  |
      | Manufacturer             | <Manufacturer>             |
      | GenericTherapeuticClass  | <GenericTherapeuticClass>  |
      | StandardTherapeuticClass | <StandardTherapeuticClass> |
      | SpecificTherapeuticClass | <SpecificTherapeuticClass> |
      | EnhancedTherapeuticClass | <EnhancedTherapeuticClass> |
      | DrugClass                | <DrugClass>                |
      | DrugCategory             | <DrugCategory>             |
      | RxCUI                    | <RxCUI>                    |
      | OrangeBookIndicator      | <OrangeBookIndicator>      |
      | NDCMaintenanceIndicator  | <NDCMaintenanceIndicator>  |
      | DosageStrength           | <DosageStrength>           |
      | DosageFormCode           | <DosageFormCode>           |
      | UnitOfMeasure            | <UnitOfMeasure>            |
      | PackageSize              | <PackageSize>              |
      | RouteCode                | <RouteCode>                |       
       
    Examples: 
      | GenericIndicator         | GenericPriceInedicator          | GCN       | GCNSequenceNumber          | MEDID         | HICLSequenceNumber         | AHFSCode         | DEACode    | Manufacturer             | GenericTherapeuticClass      | StandardTherapeuticClass      | SpecificTherapeuticClass             | EnhancedTherapeuticClass    | DrugClass    | DrugCategory    | RxCUI          | OrangeBookIndicator      | NDCMaintenanceIndicator     | DosageStrength        | DosageFormCode      | UnitOfMeasure      | PackageSize         | RouteCode    |             
      | Generic indicator (GI)^1 | Generic price indicator (GPI)^2 | GCN^73441 | GCN sequence number^043706 | MED ID^204519 | HICL sequence number^20607 | AHFS code^081828 | DEA code^0 | Manufacturer^ROCHE LABS. | Generic therapeutic class^21 | Standard therapeutic class^33 | Specific therapeutic class (STC)^W5A | Enhanced therapeutic class^ | Drug class^F | Drug category^0 | RxCUI^00261315 | Orange Book indicator^AB | NDC maintenance indicator^N | Dosage strength^75 MG | Dosage form code^CA | Unit of measure^EA | Package size^10.000 | Route code^1 |

  
  
  
  
  
  
  
  
  
  
  
  
   