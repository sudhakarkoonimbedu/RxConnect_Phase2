Feature: MemberLookup Search verify Transfer Rules CC Information

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
  Scenario Outline: Verify Transfer Rules CC Information
    Given User in Member Lookup Claim details page
    Then User click on Transfer Rules CC Information in Claim screen  
    Then User verifies the Transfer Rules CC Information            
      | CustomerNumber     | <CustomerNumber>    |
      | CustomerName       | <CustomerName>      |
      | ClientNumber       | <ClientNumber>  	   |
      | ClientName         | <ClientName>        | 
      | GroupNumber        | <GroupNumber>       |
      | GroupName          | <GroupName>         |
      | DateTermed         | <DateTermed>        |
      | AffiliateCustNo    | <AffiliateCustNo>   |
      | TFNMain            | <TFNMain>           |
      | TFNMember          | <TFNMember>         |
      | TFNPreAuth         | <TFNPreAuth>        |
      | TFNMailOrder       | <TFNMailOrder>      |
      | TFNContracting     | <TFNContracting>    |      
      | TimeZone           | <TimeZone>          |
      | BusnessHours       | <BusnessHours>      |
      | Comments           | <Comments>          |
             
    Examples: 
      | CustomerNumber       | CustomerName              | ClientNumber        | ClientName                                    | GroupNumber     | GroupName             | DateTermed    | AffiliateCustNo                | TFNMain             | TFNMember            | TFNPreAuth            | TFNMailOrder             | TFNContracting            |  TimeZone       | BusnessHours            | Comments                           |
      | Customer number:^319 | Customer name:^0319HUMANA | Client number:^9007 | Client name:^NBRG--CLNT1 - NONBRG CLIENT--PDP | Group number:^6 | Group name:^RX CONN 2 | Date termed:^ | Affiliate Customer number:^320 | Main:^800-448-6262  | Member:^800-448-6262 | PreAuth:^800-555-2546 | Mail Order:^800-379-0092 | Contracting:^888-204-8349 |  Time Zone:^EST | Business Hours:^8am-8pm | Hours listed are Member Time Zone  |   

  
  
  
  
  
  
  
  
  
  
  
  
   