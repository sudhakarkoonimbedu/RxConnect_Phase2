Feature: Member Lookup Search and verify Authorization General Information

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
    Then User click on Authorization icon     
    Then User click on General Information in Authorization screen     
    Then User verifies Authorization General Information details     
      | AuthID	           | <AuthID>             |         
      | Status			       | <Status>      	      |
      | AuthType 		       | <AuthType>           |
      | RxNumber           | <RxNumber>           |
      | EffectiveDate      | <EffectiveDate>      |
      | RefillsAllowed     | <RefillsAllowed>     |
      | EndDate            | <EndDate>            |
      | FillsUsed          | <FillsUsed>          |
      | Compound				   | <Compound>           |         
      | DedInclude/Exclude | <DedInclude/Exclude> |
      | RuleType   		     | <RuleType>           |
      | DedMaxOverride     | <DedMaxOverride>     |
      | MetricDecimalQty   | <MetricDecimalQty>   |
      | NetworkIndicator   | <NetworkIndicator>   |
      | DaysSupply         | <DaysSupply>         |
      | DollarAmount			 | <DollarAmount>       |
      | LICSLevel					 | <LICSLevel>          |         
      | MedPartDType			 | <MedPartDType>       |
      | TierValue					 | <TierValue>       	  |
      | Phases						 | <Phases>             |
      | Type							 | <Type>               |
      | BrandOverrideType  | <BrandOverrideType>  |
      | BrandOverrideValue | <BrandOverrideValue> |
      | MultiplierUse			 | <MultiplierUse>      |
      | GenOverrideType    | <GenOverrideType>    |         
      | GenOverrideValue	 | <GenOverrideValue>   |
      | MultiplierUse      | <MultiplierUse>      |
      | DrugLevel					 | <DrugLevel>          |
      | DrugValue					 | <DrugValue>          |
      | DrugName					 | <DrugName>           |
      | Errors					   | <Errors>             |
      | ErrorCategory1		 | <ErrorCategory1>     |
      | ErrorCategory2		 | <ErrorCategory2>     |
      | ErrorCategory3		 | <ErrorCategory3>     |
      | ErrorCategory4		 | <ErrorCategory4>     |
      | ErrorCategory5		 | <ErrorCategory5>     |
      | ErrorCategory6		 | <ErrorCategory6>     |
      | ErrorCategory7		 | <ErrorCategory7>     |
      | ErrorCategory8		 | <ErrorCategory8>     |
      | ErrorCategory9		 | <ErrorCategory9>     |
      | ErrorCategory10		 | <ErrorCategory10>    |
      | ErrorCategory11		 | <ErrorCategory11>    |
      | ErrorCategory12		 | <ErrorCategory12>    |
      
    Examples: 
      | AuthID   | Status	 | AuthType   | RxNumber   | EffectiveDate   | RefillsAllowed   | EndDate   | FillsUsed   | Compound  | DedInclude/Exclude          | RuleType   | DedMaxOverride           | MetricDecimalQty         | NetworkIndicator   | DaysSupply   | DollarAmount   | LICSLevel   | MedPartDType     | TierValue   | Phases  | Type  | BrandOverrideType    | BrandOverrideValue    | MultiplierUse   | GenOverrideType        | GenOverrideValue        | MultiplierUse   | DrugLevel   | DrugValue   | DrugName	  | Errors  | ErrorCategory1 | ErrorCategory2 | ErrorCategory3 | ErrorCategory4 | ErrorCategory5 | ErrorCategory6 | ErrorCategory7 | ErrorCategory8 | ErrorCategory9 | ErrorCategory10 | ErrorCategory11 | ErrorCategory12 |
      | Auth ID^ | Status^ | Auth type^ | Rx number^ | Effective date^ | Refills allowed^ | End date^ | Fills used^ | Compound^ | Deductible include/exclude^ | Rule type^ | Deductible max override^ | Metric decimal quantity^ | Network indicator^ | Days supply^ | Dollar amount^ | LICS level^ | Med Part D type^ | Tier value^ | Phases^ | Type^ | Brand Override Type^ | Brand Override Value^ | Multiplier Use^ | Generic Override Type^ | Generic Override Value^ | Multiplier Use^ | Drug Level^ | Drug Value^ | Drug Name^ | Errors^ |                |                |                |                |                |                |                |                |                |                 |                 |                 | 
  
  
  
  
  
  
  
  
   