Feature: MemberLookup search verify Benefits

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
  Scenario Outline: Verify Benefits
    Given User in Member Lookup Claim details page
    Then User click on Benefits in Claim screen 
    Then User verifies Benefits    
    	| CaseID    	           | <CaseID>                 |         
      | HICN                   | <HICN>                   |
      | CopayFieldUsed         | <CopayFieldUsed>         |
      | TierLevel              | <TierLevel>              |
      | FormularyIndicator     | <FormularyIndicator>     | 
      | PlaceOfService         | <PlaceOfService>         |
      | PatientResidence       | <PatientResidence>       |
      | PharmacyServiceType    | <PharmacyServiceType>    |
      | DeductibleMessage      | <DeductibleMessage>      |           
      | LICSCode               | <LICSCode>               |
      | LICSEffectiveDate      | <LICSEffectiveDate>      |
      | InstitutionalCode      | <InstitutionalCode>      |
      | InstitutionalEffDate   | <InstitutionalEffDate>   |
      | FreeFirstFill          | <FreeFirstFill>          |
      | CostShareReduction     | <CostShareReduction>     |
      | GracePeriod            | <GracePeriod>            |
      | MemberDeductible       | <MemberDeductible>       |
      | PlanDeductible         | <PlanDeductible>         |
      | DeductibleExcluded     | <DeductibleExcluded>     |
      | TROOP                  | <TROOP>                  |
      | NonTROOP               | <NonTROOP>               |
      | LICS                   | <LICS>                   |
      | OtherTROOP             | <OtherTROOP>             |
      | BenefitStageQualifier  | <BenefitStageQualifier>  |
      | BenefitStageAmount     | <BenefitStageAmount>     |       
      | SpendingAccRemaining   | <SpendingAccRemaining>   |
      | RemainingBenefit       | <RemainingBenefit>       |
      | AccumulatedDeductible  | <AccumulatedDeductible>  |
      | RemainingDeductible    | <RemainingDeductible>    |      
       
    Examples: 
      | CaseID                     | HICN  | CopayFieldUsed      | TierLevel     | FormularyIndicator   | PlaceOfService     | PatientResidence   | PharmacyServiceType      | DeductibleMessage                | LICSCode   | LICSEffectiveDate    | InstitutionalCode   | InstitutionalEffDate          | FreeFirstFill    | CostShareReduction    | GracePeriod   | MemberDeductible        | PlanDeductible        | DeductibleExcluded        | TROOP       | NonTROOP        | LICS       | OtherTROOP        | BenefitStageQualifier    | BenefitStageAmount         | SpendingAccRemaining             | RemainingBenefit        | AccumulatedDeductible          | RemainingDeductible        |                          
	    | Case ID^000000000908180001 | HICN^ | Copay field used^52 | Tier level^00 | Formulary indicator^ | Place of service^1 | Patient residence^ | Pharmacy service type^01 | Deductible message^MAX PLAN ONLY | LICS code^ | LICS effective date^ | Institutional code^ | Institutional effective date^ | Free first fill^ | Cost share reduction^ | Grace period^ | Member deductible^$0.00 | Plan deductible^$0.00 | Deductible excluded^$0.00 | TROOP^$0.00 | Non TROOP^$0.00 | LICS^$0.00 | Other TROOP^$0.00 | Benefit stage qualifier^ | Benefit stage amount^$0.00 | Spending account remaining^$0.00 | Remaining benefit^$0.00 | Accumulated deductible^$100.00 | Remaining deductible^$0.00 | 

  
  
  
  
  
  
  
  
  
  
  
  
   