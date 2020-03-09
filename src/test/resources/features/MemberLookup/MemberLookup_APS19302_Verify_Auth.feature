Feature: APS 19302 - MemberLookup Search verify Claim Claim History

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
      | CustomerSet          | Customer                    | Client                     | Group             | Gender    | MemberID                      | AltMemberID     | FirstName          | LastName                    | DOB             |
      | Customer Set:^Humana | Customer:^0319 - 0319HUMANA | Client:^9007 - NBRG--CLNT1 | Group:^RXCONNECT  | Gender:^M | Member ID:^000000090718000102 | Alt Member ID:^ | First Name:^SPOUSE | Last Name:^MBRNONBRIDGECUST | DOB:^01/15/1964 |    
            
  @Functional
  Scenario Outline: Verify APS19302 Auth details First Screen
    Given User in Member Lookup details page    
    Then User click on Auth icon   
    Then User verifies the Auth details     
    Then User verifies the Add Auth button is enabled  
       | AddAuth      | <AddAuth>     | 
    Then User verifies the number of Auth results First Screen
       | Results1     | <Results1>    |
    Then User verifies the Next link is enabled First Screen
       | NextEnabled  | <NextEnabled> |      
    Then User verifies the Prev link is disabled First Screen
       | PrevDisabled | <PrevDisabled>| 
    Then User click on Next link    
    
    Examples: 
      | MemberID           						 | DateOfBirth     | Gender    | Customer                 | Client                                        | Group               | AddAuth  | Results1 | NextEnabled | PrevDisabled |  
      | Member ID:^000000090818000101  | DOB:^01/15/1964 | Gender:^M | Customer:^319 0319HUMANA | Client:^9007 NBRG--CLNT1 - NONBRG CLIENT--PDP | Group:^6/RXCONNECT2 | enabled  | 15       | enabled     | disabled     |  
     
  @Functional
  Scenario Outline: Verify APS19302 Auth details Second Screen
    Given User in Auth details page   
    Then User verifies the number of Auth results Second Screen
       | Results1     | <Results1>    |       
    Then User verifies the Next link is enabled Second Screen
       | NextEnabled  | <NextEnabled> |     
    Then User verifies the Prev link is enabled Second Screen
       | PrevEnabled  | <PrevEnabled> |
    Then User click on Next link  
    
    Examples: 
      | Results1 | NextEnabled | PrevEnabled |
      | 15       | enabled     | enabled     |    
    
  @Functional
  Scenario Outline: Verify APS19302 Auth details Last Screen
    Given User in Auth details page  
    Then User verifies the number of Auth results in Last Screen
       | LastResults  | <LastResults> |
    Then User verifies the Next link is disabled Last Screen
       | NextDisabled | <NextDisabled>|      
    Then User verifies the Prev link is enabled Last Screen
       | PrevEnabled  | <PrevEnabled> |
    Then User click on Prev link
    Then User click on Prev link 
    
    Examples: 
      | LastResults | NextDisabled | PrevEnabled |
      | 11          | disabled     | enabled     |
    
  @Functional
  Scenario Outline: Verify APS19302 Auth Type Restricted
    Given User in Auth details page       
    Then User provides Auth type and click on Search 
      | AuthType     | <AuthType>    |       
    Then User verifies the number of Auth results for Restricted Auth
      | AuthResults  | <AuthResults> |
    Then User verifies the Next link is disabled for Restricted Auth 
      | NextDisabled | <NextDisabled>|    
    Then User verifies the Prev link is disabled for Restricted Auth
      | PrevDisabled | <PrevDisabled>|
    Then User click on Clear
    Then User click on Search
    
    Examples: 
      | AuthType   | AuthResults | NextDisabled | PrevDisabled |
      | RESTRICTED | 3           | disabled     | disabled     |    
    
  @Functional
  Scenario Outline: Verify APS19302 Auth Type Customized Search
    Given User in Auth details page    
    Then User provides Auth type and click on Search 
      | AuthType    | <AuthType>    | 
    Then User verifies the number of Auth results for Customized Auth
      | AuthResults  | <AuthResults> |
    Then User verifies the Next link is disabled for Customized Auth
      | NextDisabled | <NextDisabled>|      
    Then User verifies the Prev link is disabled for Customized Auth
      | PrevDisabled | <PrevDisabled>|
    Then User click on Clear
    Then User click on Search
    
    Examples: 
      | AuthType   | AuthResults | NextDisabled | PrevDisabled |
      | CUSTOMIZED | 15          | disabled     | disabled     | 
    
  @Functional
  Scenario Outline: Verify APS19302 Auth Type Preauth Search First Screen
    Given User in Auth details page     
    Then User provides Auth type and click on Search 
      | AuthType    | <AuthType>    |       
    Then User verifies the number of Auth results for Preauth First Screen
      | AuthResults  | <AuthResults> |
    Then User verifies the Next link is enabled for Preauth First Screen  
      | NextEnabled  | <NextEnabled> |    
    Then User verifies the Prev link is disabled for Preauth First Screen
      | PrevDisabled | <PrevDisabled>|
    Then User click on Next link
    
    Examples: 
      | AuthType   | AuthResults | NextEnabled  | PrevDisabled |
      | PREAUTH    | 15          | enabled      | disabled     |
    
  @Functional
  Scenario Outline: Verify APS19302 Auth Type Preaauth Search Last Screen
    Given User in Auth details page    
    Then User verifies the number of Auth results for Preauth Last Screen
      | AuthResults  | <AuthResults> |
    Then User verifies the Next link is disabled for Preauth Last Screen  
      | NextDisabled | <NextDisabled>|    
    Then User verifies the Prev link is enabled for Preauth Last Screen
      | PrevEnabled  | <PrevEnabled> |
    Then User click on Prev link
    Then User click on Clear
    Then User click on Search
    
    Examples: 
      | AuthResults | NextDisabled | PrevEnabled |
      | 8           | disabled     | enabled     |  

    
  @Functional
  Scenario Outline: Verify APS19302 Auth Type, Status Search
    Given User in Auth details page    
    Then User provides Auth type and Status and click on Search 
      | AuthType    | <AuthType>    | 
      | Status      | <Status>      |
    Then User verifies the number of Auth results for Auth Type and Status
      | AuthResults | <AuthResults> |
    Then User verifies the Next link is disabled for Auth Type and Status 
      | NextDisabled | <NextDisabled>|     
    Then User verifies the Prev link is disabled for Auth Type and Status
      | PrevDisabled | <PrevDisabled>|
    Then User verifies the Auth results
      | AuthIDResult   | <AuthIDResult>   |         
      | AuthTypeResult | <AuthTypeResult> |
      | StatusResult   | <StatusResult>   |
      | RxNumberResult | <RxNumberResult>	|
      | DrugNameResult | <DrugNameResult> | 
      | EffDateResult  | <EffDateResult>  |
      | EndDateResult  | <EndDateResult>  |
    Then User click on Clear
    Then User click on Search
    
    Examples: 
      | AuthType | Status             | AuthResults | NextDisabled | PrevDisabled | AuthIDResult        | AuthTypeResult    | StatusResult              | RxNumberResult      | DrugNameResult                        | EffDateResult             | EndDateResult       |
      | PREAUTH  | DO NOT USE ANYMORE | 1           | disabled     | disabled     | Auth ID^00150005456 | Auth Type^PREAUTH | Status^DO NOT USE ANYMORE | Rx Number^227201920 | Drug Name^METHOCARBAMOL 500 MG TABLET | Effective Date^05/01/2019 | End Date^05/31/2019 |    
    
  @Functional
  Scenario Outline: Verify APS19302 RxNumber Search
    Given User in Auth details page 
    Then User provides RxNumber and click on Search 
      | RxNumber    | <RxNumber>     | 
    Then User verifies the number of Auth results for RxNumber Search
      | AuthResults | <AuthResults>  |
    Then User verifies the Next link is disabled for RxNumber Search 
      | NextDisabled | <NextDisabled>|      
    Then User verifies the Prev link is disabled for RxNumber Search 
      | PrevDisabled | <PrevDisabled>|     
    Then User verifies the Auth results    
    	| AuthIDResult   | <AuthIDResult>   |         
      | AuthTypeResult | <AuthTypeResult> |
      | StatusResult   | <StatusResult>   |
      | RxNumberResult | <RxNumberResult>	|
      | DrugNameResult | <DrugNameResult> | 
      | EffDateResult  | <EffDateResult>  |
      | EndDateResult  | <EndDateResult>  |
      
    Examples: 
      | RxNumber  | AuthResults | NextDisabled | PrevDisabled | AuthIDResult     	  | AuthTypeResult    | StatusResult        | RxNumberResult      | DrugNameResult                                      | EffDateResult             | EndDateResult       |
      | 227201934 | 1           | disabled     | disabled     | Auth ID^00150005470 | Auth Type^PREAUTH | Status^EXPIRED/USED | Rx Number^227201934 |   Drug Name^ESOMEPRAZOLE MAGNESIUM 20 MG CAPSULE DR | Effective Date^06/01/2017 | End Date^06/30/2018 |    
  
  
  
  
  
  
   