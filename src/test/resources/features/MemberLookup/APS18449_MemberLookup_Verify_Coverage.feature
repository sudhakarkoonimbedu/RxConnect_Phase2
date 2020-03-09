Feature: APS 18449 - Validation of Verify Coverage functionality in Member Lookup 
  
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
      | ApplicationMenu               | SearchCustomerSet | SearchCustomer    | SearchMemberID | SearchAltID | SearchExactMatch |  SearchFirstName | SearchMI | SearchLastName | SearchDOB | SearchClaimID | Customer                   | MemberID                     | AltMemberID    | FirstName       | LastName                   | MI  | DOB            | StartDate             | EndDate              |
      | Miscellaneous->RxNova Connect | Humana            | 0319 - 0319HUMANA | 90818000101    |             | checked          |                  |          |                |           |               | Customer^0319 - 0319HUMANA | Member ID^000000090818000101 | Alt Member ID^ | First Name^MBR1 | Last Name^MBRNONBRIDGECUST | MI^ | DOB^01/15/1964 | Start Date^01/01/2015 | End Date^No end date |
          
  @Functional
  Scenario Outline: Verify Header details
    Given User in Member Lookup Search Page and click on Blue arrow at Customer Field         
    Then User verifies the header details     
      | CustomerSet | <CustomerSet> |         
      | Customer    | <Customer>    |
      | Client      | <Client>      |
      | Group       | <Group>       |
      | Gender      | <Gender>      |
      | MemberID    | <MemberID>    | 
      | AltMemberID | <AltMemberID> |
      | FirstName   | <FirstName>   |
      | LastName    | <LastName>    |
      | DOB         | <DOB>         |      
      
    Examples: 
      | CustomerSet          | Customer                    | Client                     | Group             | Gender    | MemberID                      | AltMemberID     | FirstName        | LastName                    | DOB             |
      | Customer Set:^Humana | Customer:^0319 - 0319HUMANA | Client:^9007 - NBRG--CLNT1 | Group:^RXCONNECT2 | Gender:^M | Member ID:^000000090818000101 | Alt Member ID:^ | First Name:^MBR1 | Last Name:^MBRNONBRIDGECUST | DOB:^01/15/1964 |    
            
  @Functional
  Scenario Outline: Verify Coverage Page Validation 
    Given Ensure User is in Select a call category page    
    When User click on Formulary icon in Select a call category page      
    Then Drug Results Page should be displayed    
    And Input the required search text and click on search button
    | search_Input_text | <Search_Input_Text> |        
    Then Showing drugs with brand name as xanax
    And Select the required NDC record
    | requiredNDC | <Required_NDC> |
    Then Click on Verify Coverage button
    Then Verify Coverage Page should be displayed  
          
    Examples: 
      | Search_Input_Text | Required_NDC |  
      | XANAX             | 00009002901  |
      
  @Functional
  Scenario Outline: Verify Coverage Verification Panel Values
    Given Ensure user is in Verify Coverage Page
    Then User should verify the formulary category Drug,Prescriber,Pharmacy details
   | coverageverificationTitle    | <CoverageVerificationTitle>     |
   | coverageverifiation_drugname | <CoverageVerification_DrugName> |
   | prescriberqlfrid_Part1		    | <PrescriberQlfrID_part1>        |
   | prescriberqlfrid_Part2		    | <PrescriberQlfrID_part2>        |
   | pharmacySvcType					    | <PharmacySvcType>					      |
   | pharmacy_address_part1       | <Pharmacy_address_part1>		    |
   | pharmacy_address_part2       | <Pharmacy_address_part2>		    |
   | pharmacy_address_part3       | <Pharmacy_address_part3>		    |
   Then Input the required quantity values
   | cv_quantity    | <cv_Quantity>    |
   | cv_daysSupplay | <cv_Days_Supply> |
   | cv_daw					| <cv_DAW>         |
   | cv_filldate    | <cv_FillDate>    |
   Then click on Verify Coverage button in Coverage Verification Page
   Then Coverage Verification Details results should be displayed
   
   Examples:
   | CoverageVerificationTitle | CoverageVerification_DrugName  | PrescriberQlfrID_part1 | PrescriberQlfrID_part2 | PharmacySvcType | Pharmacy_address_part1   | Pharmacy_address_part2 | Pharmacy_address_part3 | cv_Quantity | cv_Days_Supply | cv_DAW | cv_FillDate |
   | Coverage Verification     | Drug Name:XANAX 0.25 MG TABLET | 01                     | 1053398768             | 01				      | Pharmacy:^LIMESTONE DRUG | 200 W MARKET ST        | ATHENS, AL 356110709   |   10        |   5            | 0      | 05/16/2019  |
   
 @Functional
 Scenario Outline: Verify Coverage Verification Panel General Table Values
   Given Ensure user is in Verify Coverage Page
   Then Verify General Table Values Under Result Panel
   | cv_claimStatus        | <CV_Claim_Status>        |
   | cv_ndc				         | <CV_NDC>					        |
   | cv_labelname          | <CV_Label_Name>          |
   | cv_quantity           | <CV_Quantity>            |
   | cv_daysSupply         | <CV_Days_Supply>         |
   | cv_pharmacy           | <CV_Pharmacy>            |
   | cv_filldate           | <CV_Fill_Date>           |
   | cv_tierLevel          | <CV_Tier_Level>          |
   | cv_formularyIndicator | <CV_Formulary_Indicator> |
    
   Examples: 
   | CV_Claim_Status     | CV_NDC 					 | CV_Label_Name                   | CV_Quantity | CV_Days_Supply | CV_Pharmacy             | CV_Fill_Date				 | CV_Tier_Level | CV_Formulary_Indicator |
   | Claim status^70-DNI | NDC^00009-0029-01 | Label name^XANAX 0.25 MG TABLET | Quantity^10 | Days supply^5  | Pharmacy^LIMESTONE DRUG | Fill date^05/16/2019 | Tier level^00 | Formulary indicator^   |
    
 @Functional
  Scenario Outline: Verify Error Table Values Under Results Panel in Verify Coverage Page
    Given Ensure user is in Verify Coverage Page
    Then Verify Error Table Values in Results Panel
    | cv_errorsCode            | <CV_ErrorsCode>             |
    | cv_errorsAction          | <CV_ErrorsAction>           |
    | cv_errorsArgusErrorText  | <CV_Errors_ArgusErrorText>  |
    | cv_errorsCode1           | <CV_ErrorsCode1>            |
    | cv_errorsAction1         | <CV_ErrorsAction1>          |
    | cv_errorsArgusErrorText1 | <CV_Errors_ArgusErrorText1> |
    
    Examples: 
    | CV_ErrorsCode | CV_ErrorsAction | CV_Errors_ArgusErrorText 																| CV_ErrorsCode1 | CV_ErrorsAction1   | CV_Errors_ArgusErrorText1 																		   |
    | Code^436      | Action^Deny     | Argus Error Text^ASSOCIATED DEA INACTIVE ON DATE FILLED | Code^020       | Action^Information | Argus Error Text^INGRED COST > NDC AMT BY MORE THAN PLAN EXPECTS |
    
 @Functional
  Scenario Outline: Verify TotalRxCost Table Values Under MemberCost Panel in Verify Coverage Page
    Given Ensure user is in Verify Coverage Page
    Then Verify TotalRxCost Table Values in MemberCost Panel
    | cv_totalpatientpay     | <CV_TotalPatientPay>      |
    | cv_totalplanpaid       | <CV_TotalPlanPaid>        |
    | cv_totalotherpayerpaid | <CV_TotalOtherPayerPaid>  |
    | cv_taotalrxcost        | <CV_TotalRxCost>					 |
    
    Examples: 
    | CV_TotalPatientPay       | CV_TotalPlanPaid       | CV_TotalOtherPayerPaid       | CV_TotalRxCost       |
    | Total patient pay^$10.00 | Total plan paid^$28.86 | Total other payer paid^$0.00 | Total Rx Cost^$38.86 |
 
 @Functional
  Scenario Outline: Verify PatientPay Table Values Under MemberCost Panel in Verify Coverage Page
    Given Ensure user is in Verify Coverage Page
    Then Verify PatientPay Table Values in Member Cost Panel
    | cv_BaseCopayAmount 												| <CV_BaseCopayAmount>                        |
    | cv_BaseCoinsuranceAmount 									| <CV_BaseCoinsuranceAmount>                  |
    | cv_AmountAppliedToPeriodicDeductible 			| <CV_AmountAppliedToPeriodicDeductible>      |
    | cv_AmountExceededProcessedBenefitMax 			| <CV_AmountExceededProcessedBenefitMax>      |
    | cv_AmountAttributedToProcessorFee    			| <CV_AmountAttributedToProcessorFee>		      |
    | cv_AmountAttributedToSalesTax						  | <CV_AmountAttributedToSalesTax>             |
    | cv_AmountAttributedToCoverageGap     			| <CV_AmountAttributedToCoverageGap>			    |
    | cv_HealthPlanFundedAmount 								| <CV_HealthPlanFundedAmount>							    |
    | cv_MemberPaidDifference 							  	| <CV_MemberPaidDifference>					          |
    | cv_AttributedToNetworkSelection 					| <CV_AttributedToNetworkSelection>			      |
    | cv_AttributedToBrandDrug 									| <CV_AttributedToBrand_Drug>				          |
    | cv_AttributedToNonPreferredFormulary 			| <CV_AttributedToNonPreferredFormulary>      |
    | cv_AttributedToNonPreferredFormularyBrand | <CV_AttributedToNonPreferredFormularyBrand> |
    | cv_TotalPatientPay												| <CV_TotalPatientPay>												|
    | cv_HRAAmount															| <CV_HRAAmount>															|
    | cv_FSAAmount															| <CV_FSAAmount>															|
    | cv_HSAAmount															| <CV_HSAAmount>															|
    | cv_ADJAamount															| <CV_ADJAmount>															|
    | cv_SPAPAmount															| <CV_SPAPAmount>															|
    | cv_TotalMemberPaidToPharmacy							| <CV_TotalMemberPaidToPharmacy>							|
    
    Examples: 
    | CV_BaseCopayAmount       | CV_BaseCoinsuranceAmount      | CV_AmountAppliedToPeriodicDeductible        | CV_AmountExceededProcessedBenefitMax				 | CV_AmountAttributedToProcessorFee        | CV_AmountAttributedToSalesTax				 | CV_AmountAttributedToCoverageGap        | CV_HealthPlanFundedAmount       | CV_MemberPaidDifference      | CV_AttributedToNetworkSelection       | CV_AttributedToBrand_Drug      | CV_AttributedToNonPreferredFormulary        | CV_AttributedToNonPreferredFormularyBrand				 | CV_TotalPatientPay        | CV_HRAAmount     | CV_FSAAmount     | CV_HSAAmount			| CV_ADJAmount     | CV_SPAPAmount     | CV_TotalMemberPaidToPharmacy         |
    | Base copay amount^$10.00 | Base coinsurance amount^$0.00 | Amount applied to periodic deductible^$0.00 | Amount exceeded processed benefit max^$0.00 | Amount attributed to processor fee^$0.00 | Amount attributed to sales tax^$0.00 | Amount attributed to coverage gap^$0.00 | Health plan funded amount^$0.00 | Member paid difference^$0.00 | Attributed to network selection^$0.00 | Attributed to brand drug^$0.00 | Attributed to non-preferred formulary^$0.00 | Attributed to non-preferred formulary brand^$0.00 | Total patient pay:^$10.00 | HRA amount^$0.00 | FSA amount^$0.00 | HSA amount^$0.00 | ADJ amount^$0.00 | SPAP amount^$0.00 | Total member paid to pharmacy^$10.00 |
    
 @Functional
 Scenario Outline: Verify Applied Amounts Table Values Under MemberCost Panel in Verify Coverage Page
    Given Ensure user is in Verify Coverage Page
    Then Verify AppliedAmounts Table Values in Member Cost Panel   
    | cv_memberDeductible       | <CV_MemberDeductible>      |
    | cv_planDeductible         | <CV_PlanDeductible> 	     |
    | cv_deductibleExcluded     | <CV_DeductibleExcluded>    |
    | cv_TROOP                  | <CV_TROOP>								 |
    | cv_NonTROOP               | <CV_NonTROOP>						   |
    | cv_LICS                   | <CV_LICS>						       |
    | cv_OtherTROOP             | <CV_OtherTROOP>					   |
    | cv_BenefitStageQualifier  | <CV_BenefitStageQualifier> |
    | cv_BenefitStageAmount     | <CV_BenefitStageAmount>    |
    
    Examples: 
    | CV_MemberDeductible     | CV_PlanDeductible     | CV_DeductibleExcluded     | CV_TROOP    | CV_NonTROOP     | CV_LICS    | CV_OtherTROOP     | CV_BenefitStageQualifier  | CV_BenefitStageAmount      |
    | Member deductible^$0.00 | Plan deductible^$0.00 | Deductible excluded^$0.00 | TROOP^$0.00 | Non TROOP^$0.00 | LICS^$0.00 | Other TROOP^$0.00 | Benefit stage qualifier^  | Benefit stage amount^$0.00 |
    
 @Functional
 Scenario Outline: Verify Balances Table Values Under MemberCost Panel in Verify Coverage Page
   Given Ensure user is in Verify Coverage Page
   Then Verify Balances Table Values in Member Cost Panel
   | CV_SpendingAccountRemaining | <CV_SpendingAccountRemaining> |
   | CV_RemainingBenefit				 | <CV_RemainingBenefit>				 |
   | CV_AccumulatedDeductible    | <CV_AccumulatedDeductible>		 |  
   | CV_RemainingDeductible      | <CV_RemainingDeductible>			 |
   
   Examples:
   | CV_SpendingAccountRemaining      | CV_RemainingBenefit     | CV_AccumulatedDeductible     | CV_RemainingDeductible     |
   | Spending account remaining^$0.00 | Remaining benefit^$0.00 | Accumulated deductible^$0.00 | Remaining deductible^$0.00 |