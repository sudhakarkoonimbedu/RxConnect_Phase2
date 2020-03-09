Feature: MemberLookup Search and verify Benefits and Eligibility Coverage & Copay

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
  Scenario Outline: Verify Benefits and Eligibility Coverage & Copay
    Given User in Member Lookup details page   
    Then User click on Benefits Eligibility icon     
    Then User click on Coverage & Copay     
    Then User verifies Coverage & Copay details     
      | CoverageCode1 	     | <CoverageCode1>        |         
      | CoverageCode2 		   | <CoverageCode2>        |
      | Description   		   | <Description>          |
      | StartDate				     | <StartDate>            |         
      | CoverageFlag  		   | <CoverageFlag>   	    |
      | Priority					   | <Priority>             |
      | ConditionDescription | <ConditionDescription> |         
      | CopayField     			 | <CopayField>   	      |
      | CopayValues1		  	 | <CopayValues1>         |         
      | CopayValues2			 	 | <CopayValues2>   	    |
      | CopayValues3			 	 | <CopayValues3>   	    |
      | CopayValues4			 	 | <CopayValues4>   	    |        
      | CopayValues5			 	 | <CopayValues5>   	    |
      | CopayValues6			 	 | <CopayValues6>   	    |
      | CopayValues7			 	 | <CopayValues7>   	    |
      | CopayValues8			 	 | <CopayValues8>   	    |  
       
    Examples: 
      | CoverageCode1          | CoverageCode2          | Description  | StartDate             | CoverageFlag                       | Priority  | ConditionDescription   | CopayField   | CopayValues1                                                                    | CopayValues2                                                                       | CopayValues3                                                                    | CopayValues4                                                                       | CopayValues5                                                 | CopayValues6                                                 | CopayValues7                                                 | CopayValues8                                                  |
      | Coverage Code 1^RXCON1 | Coverage Code 2^RXCON2 | Description^ | Start Date^01/01/2015 | Coverage Flag^R - Indicates RxNova | Priority^ | Condition Description^ | Copay Field^ | Default mail-order brand^Mail Order Brand^$12.00^0.00%^A - Copay + Coinsurance^ | Default mail-order generic^Mail Order Generic^$8.00^0.00%^A - Copay + Coinsurance^ | Default non-mail-order brand^Retail Brand^$10.00^0.00%^A - Copay + Coinsurance^ | Default non-mail-order generic^Retail Generic^$6.00^0.00%^A - Copay + Coinsurance^ | 1^Part D DD1 costshare^$30.00^0.00%^A - Copay + Coinsurance^ | 2^Part D IC1 costshare^$30.00^0.00%^A - Copay + Coinsurance^ | 3^Part D CG1 costshare^$30.00^0.00%^A - Copay + Coinsurance^ | 4^Part D CAT costshare^$6.35^+ 5.00%^A - Copay + Coinsurance^ | 
  
  
  
  
  
  
  
  
  
  
   