Feature: MemberLookup search verify Compound

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
  Scenario Outline: Verify Compound
    Given User in Member Lookup Claim details page
    Then User click on Compound in Claim screen
    Then User verifies Compound    
    	| CompoundCode                        | <CompoundCode>                        |         
      | DispensingUnitFormIndicator         | <DispensingUnitFormIndicator>         |
      | DosageFormDescriptionCode           | <DosageFormDescriptionCode>           |
      | CompoundProductID                   | <CompoundProductID>                   |
      | ProductIDQualifier                  | <ProductIDQualifier>                  | 
      | CompoundIngredientQTY               | <CompoundIngredientQTY>               |
      | SubmittedCompoundIngredientDrugCost | <SubmittedCompoundIngredientDrugCost> |
      | PlanCompoundIngredientDrugCost      | <PlanCompoundIngredientDrugCost>      |
      | CompoundIngreBasisCostDetermination | <CompoundIngreBasisCostDetermination> |
      | PostPay3Indicator                   | <PostPay3Indicator>                   |
      | PostPay4Indicator                   | <PostPay4Indicator>                   |
                   
    Examples: 
       | CompoundCode    | DispensingUnitFormIndicator      | DosageFormDescriptionCode     | CompoundProductID     | ProductIDQualifier    | CompoundIngredientQTY    | SubmittedCompoundIngredientDrugCost      | PlanCompoundIngredientDrugCost      | CompoundIngreBasisCostDetermination           | PostPay3Indicator     | PostPay4Indicator     |                     
	     | Compound Code^1 | Dispensing Unit Form Indicator^0 | Dosage Form Description Code^ | Compound Product ID^  | Product ID Qualifier^ | Compound Ingredient QTY^ | Submitted Compound Ingredient Drug Cost^ | Plan Compound Ingredient Drug Cost^ | Compound Ingredient Basis Cost Determination^ | Post Pay 3 Indicator^ | Post Pay 4 Indicator^ |
  
  
  
  
  
  
  
  
  
  
   