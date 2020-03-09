Feature: MemberLookup search verify Pricing

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
  Scenario Outline: Verify Pricing
    Given User in Member Lookup Claim details page
    Then User click on Pricing in Claim screen    
    Then User verifies Pricing    
    	| BaseCopayAmt    	         | <BaseCopayAmt>                |         
      | BaseCoinsAmt               | <BaseCoinsAmt>                |
      | AmtAppliedToPeriodicDed    | <AmtAppliedToPeriodicDed>     |
      | AmtExceededProcBenefitMax  | <AmtExceededProcBenefitMax>   |
      | AmtAttributedToProcssorFee | <AmtAttributedToProcssorFee>  | 
      | AmtAttributedToSalesTax    | <AmtAttributedToSalesTax>     |
      | AmtAttributedToCoverageGap | <AmtAttributedToCoverageGap>  |
      | HealthPlanFundedAmt        | <HealthPlanFundedAmt>         |
      | MemberPaidDifference       | <MemberPaidDifference>        |
      | AttrToNetSelection         | <AttrToNetSelection>          |
      | AttrToBrandDrug            | <AttrToBrandDrug>             |
      | AttrToNonPrefFormulary     | <AttrToNonPrefFormulary>      |
      | AttrToNonPrefFormularyBrand| <AttrToNonPrefFormularyBrand> |
      | TotalPatientPay            | <TotalPatientPay>             |
      | HRAAmount                  | <HRAAmount>                   |
      | FSAAmount                  | <FSAAmount>                   |
      | HSAAmount                  | <HSAAmount>                   |
      | ADJAmount                  | <ADJAmount>                   |
      | SPAPAmount                 | <SPAPAmount>                  |
      | TotalMemberPaidToPharmacy  | <TotalMemberPaidToPharmacy>   |
      | IngredientCost             | <IngredientCost>              |
      | DispenseFee                | <DispenseFee>                 |
      | IncentiveAmount            | <IncentiveAmount>             |
      | OtherAmountPaid            | <OtherAmountPaid>             |
      | FlatSalesTax               | <FlatSalesTax>                |
      | PercentageSalesTax         | <PercentageSalesTax>          |
      | PPTotalPatientPay          | <PPTotalPatientPay>           |
      | TotalOtherPayerAmount      | <TotalOtherPayerAmount>       |
      | OtherPayer                 | <OtherPayer>                  |
      | RxCostIngredientCost       | <RxCostIngredientCost>        |
      | RxCostDispenseFee          | <RxCostDispenseFee>           |
      | RxCostIncentiveAmount      | <RxCostIncentiveAmount>       |
      | RxCostOtherAmountPaid      | <RxCostOtherAmountPaid>       |
      | RxCostFlatSalesTax         | <RxCostFlatSalesTax>          |
      | RxCostPercentageSalesTax   | <RxCostPercentageSalesTax>    |
      | TotalPlanPaid              | <TotalPlanPaid>               |
      | TotalOtherPayer            | <TotalOtherPayer>             |      
      | TotalRxCost                | <TotalRxCost>                 |      
       
    Examples: 
      | BaseCopayAmt            | BaseCoinsAmt                  | AmtAppliedToPeriodicDed                      | AmtExceededProcBenefitMax                     | AmtAttributedToProcssorFee               | AmtAttributedToSalesTax               | AmtAttributedToCoverageGap               | HealthPlanFundedAmt             | MemberPaidDifference         | AttrToNetSelection                    | AttrToBrandDrug                | AttrToNonPrefFormulary                      | AttrToNonPrefFormularyBrand                       | TotalPatientPay            | HRAAmount        | FSAAmount        | HSAAmount        | ADJAmount        | SPAPAmount        | TotalMemberPaidToPharmacy             | IngredientCost          | DispenseFee        | IncentiveAmount        | OtherAmountPaid         | FlatSalesTax         | PercentageSalesTax         | PPTotalPatientPay         | TotalOtherPayerAmount          | OtherPayer        | RxCostIngredientCost    | RxCostDispenseFee  | RxCostIncentiveAmount  | RxCostOtherAmountPaid   | RxCostFlatSalesTax   | RxCostPercentageSalesTax   | TotalPlanPaid				  | TotalOtherPayer          |TotalRxCost            |
	    | Base copay amount^$0.00 | Base coinsurance amount^$0.00 | Amount applied to periodic deductible^$0.00  | Amount exceeded processed benefit max^$184.26 | Amount attributed to processor fee^$0.00 | Amount attributed to sales tax^$0.00  | Amount attributed to coverage gap^$0.00  | Health plan funded amount^$0.00 | Member paid difference^$0.00 | Attributed to network selection^$0.00 | Attributed to brand drug^$0.00 | Attributed to non-preferred formulary^$0.00 | Attributed to non-preferred formulary brand^$0.00 | Total patient pay:^$184.26 | HRA amount^$0.00 | FSA amount^$0.00 | HSA amount^$0.00 | ADJ amount^$0.00 | SPAP amount^$0.00 | Total member paid to pharmacy^$184.26 | Ingredient cost^$182.26 | Dispense fee^$2.00 | Incentive amount^$0.00 | Other amount paid^$0.00 | Flat sales tax^$0.00 | Percentage sales tax^$0.00 | Total patient pay^$184.26 | Total other payer amount^$0.00 | Other payer^$0.00 | Ingredient cost^$182.26 | Dispense fee^$2.00 | Incentive amount^$0.00 | Other amount paid^$0.00 | Flat sales tax^$0.00 | Percentage sales tax^$0.00 | Total plan paid:^$0.00 | Total other payer:^$0.00 |Total Rx cost:^$184.26 | 
 
   
  
  
  
  
  
  
  
  
  
   