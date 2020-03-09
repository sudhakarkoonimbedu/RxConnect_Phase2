Feature: APS - 33512 - MemberLookup Search and verify Benefits and Eligibility Medical Benefit Tab

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
  Scenario Outline: Verify Benefits and Eligibility Medical Benefit
    Given User in Member Lookup details page    
    Then User click on Benefits Eligibility icon     
    Then User click on Medical Benefit     
    Then User verifies Medical Benefit HRA details     
      | HRA_StartDate        | <HRA_StartDate>        |         
      | HRA_EndDate          | <HRA_EndDate>          |
      | HRA_OriginalBalance  | <HRA_OriginalBalance>  |
      | HRA_AvailableBalance | <HRA_AvailableBalance> |
      | HRA_ProcessDate			 | <HRA_ProcessDate>			|
      | HRA_Radio						 | <Radio0>							  |
    Then User click on FSA radioButton and Verify FSA details
      | FSA_StartDate        | <FSA_StartDate>        |         
      | FSA_EndDate          | <FSA_EndDate>          |
      | FSA_OriginalBalance  | <FSA_OriginalBalance>  |
      | FSA_AvailableBalance | <FSA_AvailableBalance> |
      | FSA_ProcessDate			 | <FSA_ProcessDate>			|
      | FSA_Radio						 | <Radio1>							  |
    Then User click on HSA radioButton and Verify HSA details
      | HSA_StartDate        | <HSA_StartDate>        |         
      | HSA_EndDate          | <HSA_EndDate>          |
      | HSA_OriginalBalance  | <HSA_OriginalBalance>  |
      | HSA_AvailableBalance | <HSA_AvailableBalance> |
      | HSA_ProcessDate			 | <HSA_ProcessDate>			|
      | HSA_Radio						 | <Radio2>								|
    Then User click on ADJ radioButton and Verify ADJ details
      | ADJ_StartDate        | <ADJ_StartDate>        |         
      | ADJ_EndDate          | <ADJ_EndDate>          |
      | ADJ_OriginalBalance  | <ADJ_OriginalBalance>  |
      | ADJ_AvailableBalance | <ADJ_AvailableBalance> |
      | ADJ_ProcessDate			 | <ADJ_ProcessDate>			|
      | ADJ_Radio						 | <Radio3>							  |
    Then User click on SPAP radioButton and Verify SPAP details
      | SPAP_StartDate        | <SPAP_StartDate>        |         
      | SPAP_EndDate          | <SPAP_EndDate>          |
      | SPAP_OriginalBalance  | <SPAP_OriginalBalance>  |
      | SPAP_AvailableBalance | <SPAP_AvailableBalance> |
      | SPAP_ProcessDate			| <SPAP_ProcessDate>			|
      | SPAP_Radio						| <Radio4>								|
            
    Examples: 
      | HRA_StartDate | HRA_EndDate | HRA_OriginalBalance | HRA_AvailableBalance | HRA_ProcessDate | Radio0 | FSA_StartDate | FSA_EndDate | FSA_OriginalBalance | FSA_AvailableBalance | FSA_ProcessDate | Radio1 | HSA_StartDate | HSA_EndDate | HSA_OriginalBalance | HSA_AvailableBalance | HSA_ProcessDate | Radio2 | ADJ_StartDate | ADJ_EndDate | ADJ_OriginalBalance | ADJ_AvailableBalance | ADJ_ProcessDate | Radio3 | SPAP_StartDate | SPAP_EndDate | SPAP_OriginalBalance | SPAP_AvailableBalance | SPAP_ProcessDate | Radio4 |
      | Start Date^   | End Date^   | Original Balance^   | Available Balance^   | Process Date^   |	HRA		| Start Date^		|	End Date^		|	Original Balance^		|	Available Balance^	 | Process Date^   | FSA    | Start Date^   | End Date^   | Original Balance^   | Available Balance^   | Process Date^   | HSA    | Start Date^   | End Date^   | Original Balance^   | Available Balance^   | Process Date^   | ADJ    | Start Date^    | End Date^    | Original Balance^    | Available Balance^		 | Process Date^    | SPAP   |