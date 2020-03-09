Feature: MemberLookup search verify Drug Utilization Review Response Details

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
  Scenario Outline: Verify Drug Utilization Review Response Details
    Given User in Member Lookup Claim details page
    Then User click on Drug Utilization Review Response Details in Claim screen
    Then User verifies Drug Utilization Review Response Details    
    	| SeverityCode    	 | <SeverityCode>      |         
      | Monograph          | <Monograph>         |
      | Hansten            | <Hansten>           |
      | Dif                | <Dif>  	           |
      | InteventionCode    | <InteventionCode>   | 
      | OutcomeCode        | <OutcomeCode>       |
      | Claim              | <Claim>             |
      | DrugName           | <DrugName>          |
      | DateFilled         | <DateFilled>        |
      | MetricQuantity     | <MetricQuantity>    |
      | SafetyEditID       | <SafetyEditID>      |
      | DURProtocolID      | <DURProtocolID>     |
      | FreeformMessageID  | <FreeformMessageID> |
      | PharmacyID         | <PharmacyID>        |
      | ServProviderIDQlfr | <ServProviderIDQlfr>|
      | PharmacyNPI        | <PharmacyNPI>       |
      | PharmacyName       | <PharmacyName>      |
      | PrescriberID       | <PrescriberID>      |
      | PrescriberIDQlflr  | <PrescriberIDQlflr> |
      | PrescriberNPI      | <PrescriberNPI>     |
      | PrescriberName     | <PrescriberName>    |
      | DURFreeTextMessage | <DURFreeTextMessage>|
      | DURAddTextMessage  | <DURAddTextMessage> |
             
    Examples: 
      | SeverityCode   | Monograph  | Hansten  | Dif  | InteventionCode   | OutcomeCode   | Claim  | DrugName   | DateFilled   | MetricQuantity   | SafetyEditID    | DURProtocolID    | FreeformMessageID    | PharmacyID   | ServProviderIDQlfr          | PharmacyNPI   | PharmacyName   | PrescriberID   | PrescriberIDQlflr        | PrescriberNPI   | PrescriberName   | DURFreeTextMessage     | DURAddTextMessage            |   
      |	Severity Code^ | Monograph^ | Hansten^ | Dif^ | Intevention Code^ | Outcome Code^ | Claim^ | Drug Name^ | Date Filled^ | Metric Quantity^ | Safety Edit ID^ | DUR Protocol ID^ | Freeform Message ID^ | Pharmacy ID^ | Serv Provider ID Qualifier^ | Pharmacy NPI^ | Pharmacy Name^ | Prescriber ID^ | Prescriber ID Qualifier^ | Prescriber NPI^ | Prescriber Name^ | DUR Free Text Message^ | DUR Additional Text Message^ |                                                                                                                                           

  
  
  
  
  
  
  
  
  
  
  
  
   