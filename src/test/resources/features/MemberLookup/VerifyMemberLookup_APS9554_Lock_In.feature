Feature: APS 9554 - MemberLookup Search and verify Benefits and Eligibility B&E Detail

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
      | ApplicationMenu               | SearchCustomerSet | SearchCustomer    | SearchMemberID | SearchAltID | SearchExactMatch | SearchFirstName | SearchMI | SearchLastName | SearchDOB | SearchClaimID | Customer                   | MemberID                     | AltMemberID    | FirstName         | LastName                   | MI  | DOB            | StartDate             | EndDate              |
      | Miscellaneous->RxNova Connect | Humana            | 0319 - 0319HUMANA | 90718000102    |             | checked          |                 |          |                |           |               | Customer^0319 - 0319HUMANA | Member ID^000000090718000102 | Alt Member ID^ | First Name^SPOUSE | Last Name^MBRNONBRIDGECUST | MI^ | DOB^01/15/1964 | Start Date^01/01/2019 | End Date^No end date |
      
     
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
      | CustomerSet          | Customer                    | Client                     | Group            | Gender    | MemberID                      | AltMemberID     | FirstName          | LastName                    | DOB             |
      | Customer Set:^Humana | Customer:^0319 - 0319HUMANA | Client:^9007 - NBRG--CLNT1 | Group:^RXCONNECT | Gender:^M | Member ID:^000000090718000102 | Alt Member ID:^ | First Name:^SPOUSE | Last Name:^MBRNONBRIDGECUST | DOB:^01/15/1964 |    
          
  @Functional
  Scenario Outline: Verify Prescriber Lock-in Details
    Given User in Member Lookup details page    
    Then User click on Benefits Eligibility icon
    Then User click on View Lock-in Information       
    And User verifies the Prescriber Lock-in details     
      | PrescriberID | <PrescriberID> |         
      | BeginDate		 | <BeginDate>    |
      | EndDate			 | <EndDate>      |
      | ProcessDate	 | <ProcessDate>  |
      
    Examples:       
      | PrescriberID           | BeginDate	           | EndDate	           | ProcessDate             |
      | Prescriber ID^AW170732 | Begin Date^01/01/2019 | End Date^12/31/2019 | Process Date^03/05/2019 |
      
  @Functional
  Scenario Outline: Verify Pharmacy Information Details
    Given User in Lock-in Information screen    
    Then User verifies the Pharmacy Information details 
      | PharmacyID  | <PharmacyID>  |
      | PharmacyNPI | <PharmacyNPI> |
      | BeginDate   | <BeginDate>   |
      | EndDate     | <EndDate>     |
      | ProcessDate | <ProcessDate> |
      
    Examples:       
      | PharmacyID          | PharmacyNPI             | BeginDate             | EndDate	            | ProcessDate             |
      | Pharmacy ID^0587177 | Pharmacy NPI^1821030446 | Begin Date^01/01/2019 | End Date^12/31/2019 | Process Date^03/05/2019 |
      
  @Functional
  Scenario Outline: Verify Pharmacy Information details are not displayed
    Given User in Lock-in Information screen    
    Then User verifies below Pharmacy Information details are not displayed
      | PharmacyID  | <PharmacyID>  |
      | PharmacyNPI | <PharmacyNPI> |
      | BeginDate   | <BeginDate>   |
      | EndDate     | <EndDate>     |
      | ProcessDate | <ProcessDate> |
    And User click on Close button   
      
    Examples:       
      | PharmacyID         | PharmacyNPI             | BeginDate             | EndDate             | ProcessDate             |
      | Pharmacy ID^010000 | Pharmacy NPI^1699726257 | Begin Date^02/02/2019 | End Date^12/30/2019 | Process Date^04/04/2019 | 
  
  
  
  
   