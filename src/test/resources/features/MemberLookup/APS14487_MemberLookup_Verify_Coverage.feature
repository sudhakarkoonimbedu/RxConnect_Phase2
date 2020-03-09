Feature: APS 14487 - Validation of Verify Coverage functionality in Member Lookup
  
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
    When User click on Claim icon in Select a call category page      
    Then Claim History Page should be displayed    
    And User click on Blue arrow at claim table in Claim History page
    | claim_Input_link | <Claim_Input_Link> |        
    Then Claim details Page should be displayed
    And User navigates to Verify Coverage page by clicking the VerifyCoverage button
    Then Verify Coverage Page Should be displayed 
          
    Examples: 
      | Claim_Input_Link |   
      | 196550000781     |
  
  @Functional   
  Scenario Outline: Verify Drug details in Verify Coverage Page
    Given Ensure user is in Verify Coverage Page
    Then Verify the Calim Drug Deatails
    | claim_Text				 | <Claim_Text>					|
    | drug_value				 | <Drug_Value>					|
    | quantity    			 | <Quantity>           |
    | days_supply 			 | <Days_Supply>        |
    | daw				  			 | <DAW>						    |
    | fill_date   			 | <Fill_Date>			    |
    | prescriber_qlfr_id | <Prescriber_Qlfr_Id> |
    | pharmacy_Svc_Type  | <Pharmacy_Svc_Type>	|
    | pharmacy_address1	 | <Pharmacy_Address1>	|
    | pharmacy_address2	 | <Pharmacy_Address2>	|
    | pharmacy_address3	 | <Pharmacy_Address3>	|
    
    Examples:
    | Quantity           | Days_Supply     | DAW    | Fill_Date             | Prescriber_Qlfr_Id                | Pharmacy_Svc_Type     |  Claim_Text						 | Drug_Value											  | Pharmacy_Address1         | Pharmacy_Address2 | Pharmacy_Address3 |
    | Quantity:^10.000   |  Days Supply:^5 | DAW:^0 | Fill Date:^05/17/2019 | Prescriber Qlfr/ID:^011053398768	| Pharmacy Svc Type:^01 | Claim: 19-655-000078-1 |	Drug Name:TAMIFLU 75 MG CAPSULE | Pharmacy:^ATHENS PHARMACY | 705 W MARKET ST	  | ATHENS, AL 35611  |
  
  @Functional
  Scenario Outline: Verify General Table Values Under Results Panel in Verify Coverage Page
    Given Ensure user is in Verify Coverage Page
    Then Verify General Table Values Under Results Panel
    | claimStatus        | <Claim_Status>        |
    | ndc				         | <NDC>					       |
    | labelname          | <Label_Name>          |
    | quantity           | <Quantity>            |
    | daysSupply         | <Days_Supply>         |
    | pharmacy           | <Pharmacy>            |
    | filldate           | <Fill_Date>           |
    | tierLevel          | <Tier_Level>          |
    | formularyIndicator | <Formulary_Indicator> |
    
    Examples: 
    | Claim_Status        | NDC 					    | Label_Name                       | Quantity        | Days_Supply   | Pharmacy                 | Fill_Date						 | Tier_Level    | Formulary_Indicator  |
    | Claim status^10-PWE | NDC^00004-0800-85 | Label name^TAMIFLU 75 MG CAPSULE | Quantity^10.000 | Days supply^5 | Pharmacy^ATHENS PHARMACY | Fill date^05/17/2019 | Tier level^00 | Formulary indicator^ |
    
  @Functional
  Scenario Outline: Verify Error Table Values Under Results Panel in Verify Coverage Page
    Given Ensure user is in Verify Coverage Page
    Then Verify Error Table Values Under Results Panel
    | errors_Code             | <Errors_Code>             |
    | errors_Action           | <Errors_Action>           |
    | errors_Argus_Error_Text | <Errors_Argus_Error_Text> |
    
    Examples: 
    | Errors_Code | Errors_Action      | Errors_Argus_Error_Text 																					|
    | Code^020    | Action^Information | Argus Error Text^INGRED COST > NDC AMT BY MORE THAN PLAN EXPECTS |
    
 @Functional
  Scenario Outline: Verify TotalRxCost Table Values Under MemberCost Panel in Verify Coverage Page
    Given Ensure user is in Verify Coverage Page
    Then Verify TotalRxCost Table Values Under MemberCost Panel
    | totalpatientpay     | <Total_Patient_Pay>      |
    | totalplanpaid       | <Total_Plan_paid>        |
    | totalotherpayerpaid | <Total_Other_Payer_Paid> |
    | taotalrxcost        | <Total_Rx_Cost>					 |
    
    Examples: 
    | Total_Patient_Pay         | Total_Plan_paid       | Total_Other_Payer_Paid       | Total_Rx_Cost         |
    | Total patient pay^$184.26 | Total plan paid^$0.00 | Total other payer paid^$0.00 | Total Rx Cost^$184.26 |
    
 @Functional
  Scenario Outline: Verify PatientPay Table Values Under MemberCost Panel in Verify Coverage Page
    Given Ensure user is in Verify Coverage Page
    Then Verify PatientPay Table Values Under MemberCost Panel
    | Base_copay_amount 													| <Base_Copay_Amount>                           |
    | Base_coinsurance_amount 										| <Base_coinsurance_amount>                     |
    | Amount_applied_to_periodic_deductible 			| <Amount_Applied_To_Periodic_Deductible>       |
    | Amount_exceeded_processed_benefit_max 			| <Amount_Exceeded_Processed_Benefit_Max>       |
    | Amount_attributed_to_processor_fee    			| <Amount_Attributed_To_Processor_Fee>		      |
    | Amount_attributed_to_sales_tax							| <Amount_Attributed_To_Sales_Tax>              |
    | Amount_attributed_to_coverage_gap     			| <Amount_Attributed_To_Coverage_Gap>			      |
    | Health_plan_funded_amount 									| <Health_Plan_Funded_Amount>							      |
    | Member_paid_difference 							  			| <Member_Paid_Difference>					            |
    | Attributed_to_network_selection 						| <Attributed_To_Network_Selection>			        |
    | Attributed_to_brand_drug 										| <Attributed_To_Brand_Drug>				            |
    | Attributed_to_non_preferred_formulary 			| <Attributed_To_Non_Preferred_Formulary>       |
    | Attributed_to_non_preferred_formulary_brand | <Attributed_To_Non_Preferred_Formulary_Brand> |
    | Total_patient_pay													  | <Total_Patient_Pay>													  |
    | HRA_amount																	| <HRA_Amount>																	|
    | FSA_amount																	| <FSA_Amount>																	|
    | HSA_amount																	| <HSA_Amount>																  |
    | ADJ_amount																	| <ADJ_Amount>																  |
    | SPAP_amount																	| <SPAP_Amount>															    |
    | Total_member_paid_to_pharmacy								| <Total_Member_Paid_To_Pharmacy>							  |
    
    Examples: 
    | Base_Copay_Amount       | Base_coinsurance_amount       | Amount_Applied_To_Periodic_Deductible       | Amount_Exceeded_Processed_Benefit_Max					| Amount_Attributed_To_Processor_Fee       | Amount_Attributed_To_Sales_Tax				| Amount_Attributed_To_Coverage_Gap       | Health_Plan_Funded_Amount       | Member_Paid_Difference       | Attributed_To_Network_Selection       | Attributed_To_Brand_Drug       | Attributed_To_Non_Preferred_Formulary       | Attributed_To_Non_Preferred_Formulary_Brand				| Total_Patient_Pay          | HRA_Amount       | FSA_Amount       | HSA_Amount				| ADJ_Amount       | SPAP_Amount       | Total_Member_Paid_To_Pharmacy         |
    | Base copay amount^$0.00 | Base coinsurance amount^$0.00 | Amount applied to periodic deductible^$0.00 | Amount exceeded processed benefit max^$184.26 | Amount attributed to processor fee^$0.00 | Amount attributed to sales tax^$0.00 | Amount attributed to coverage gap^$0.00 | Health plan funded amount^$0.00 | Member paid difference^$0.00 | Attributed to network selection^$0.00 | Attributed to brand drug^$0.00 | Attributed to non-preferred formulary^$0.00 | Attributed to non-preferred formulary brand^$0.00 | Total patient pay:^$184.26 | HRA amount^$0.00 | FSA amount^$0.00 | HSA amount^$0.00 | ADJ amount^$0.00 | SPAP amount^$0.00 | Total member paid to pharmacy^$184.26 |
    
 @Functional
  Scenario Outline: Verify Applied Amounts Table Values Under MemberCost Panel in Verify Coverage Page
    Given Ensure user is in Verify Coverage Page
    Then Verify AppliedAmounts Table Values Under MemberCost Panel   
    | member_deductible       | <Member_Deductible>       |
    | plan_deductible         | <Plan_Deductible> 	      |
    | deductible_excluded     | <Deductible_Excluded>     |
    | TROOP                   | <TROOP>								    |
    | Non_TROOP               | <Non_TROOP>						    |
    | LICS                    | <LICS>						        |
    | Other_TROOP             | <Other_TROOP>					    |
    | Benefit_stage_qualifier | <Benefit_Stage_Qualifier> |
    | Benefit_stage_amount    | <Benefit_Stage_Amount>    |
    
    Examples: 
    | Member_Deductible       | Plan_Deductible       | Deductible_Excluded       | TROOP       | Non_TROOP       | LICS       | Other_TROOP       | Benefit_Stage_Qualifier   | Benefit_Stage_Amount       |
    | Member deductible^$0.00 | Plan deductible^$0.00 | Deductible excluded^$0.00 | TROOP^$0.00 | Non TROOP^$0.00 | LICS^$0.00 | Other TROOP^$0.00 | Benefit stage qualifier^  | Benefit stage amount^$0.00 |
    
 @Functional
 Scenario Outline: Verify Balances Table Values Under MemberCost Panel in Verify Coverage Page
   Given Ensure user is in Verify Coverage Page
   Then Verify Balances Table Values Under MemberCost Panel
   | Spending_account_remaining | <Spending_Account_Remaining> |
   | Remaining_benefit					| <Remaining_Benefit>					 |
   | Accumulated_deductible     | <Accumulated_Deductible>		 |  
   | Remaining_deductible       | <Remaining_Deductible>			 |
   
   Examples:
   | Spending_Account_Remaining       | Remaining_Benefit       | Accumulated_Deductible         | Remaining_Deductible       |
   | Spending account remaining^$0.00 | Remaining benefit^$0.00 | Accumulated deductible^$100.00 | Remaining deductible^$0.00 |
 
 @Functional
 Scenario Outline: Verify Coverage Verification Panel Values
   Given Ensure user is in Verify Coverage Page
   Then User should verify the Drug,Prescriber,Pharmacy details
   | coverageverificationTitle    | <CoverageVerificationTitle>     |
   | coverageverifiation_drugname | <CoverageVerification_DrugName> |
   | prescriberqlfrid_Part1		    | <PrescriberQlfrID_part1>        |
   | prescriberqlfrid_Part2		    | <PrescriberQlfrID_part2>        |
   | pharmacySvcType					    | <PharmacySvcType>					      |
   | pharmacy_address_part1       | <Pharmacy_address_part1>		    |
   | pharmacy_address_part2       | <Pharmacy_address_part2>		    |
   | pharmacy_address_part3       | <Pharmacy_address_part3>		    |
   Then Input the required quantity details
   | cv_quantity    | <cv_Quantity>    |
   | cv_daysSupplay | <cv_Days_Supply> |
   | cv_daw					| <cv_DAW>         |
   | cv_filldate    | <cv_FillDate>    |
   Then click on Verify Coverage button in Coverage Verification Panel
   Then Coverage Verification Details should be displayed
   
   Examples:
   | CoverageVerificationTitle | CoverageVerification_DrugName   | PrescriberQlfrID_part1 | PrescriberQlfrID_part2 | PharmacySvcType | Pharmacy_address_part1   | Pharmacy_address_part2 | Pharmacy_address_part3 | cv_Quantity | cv_Days_Supply | cv_DAW | cv_FillDate |
   | Coverage Verification     | Drug Name:TAMIFLU 75 MG CAPSULE | 01                     | 1053398768             | 01				       | Pharmacy:^LIMESTONE DRUG | 200 W MARKET ST        | ATHENS, AL 356110709   |   10        |   5            | 0      | 05/16/2019  |
   
 @Functional
 Scenario Outline: Verify Coverage Verification Panel Values
   Given Ensure user is in Verify Coverage Page
   Then Verify General Table Values for Coverage Verification
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
   | CV_Claim_Status     | CV_NDC 					 | CV_Label_Name                    | CV_Quantity | CV_Days_Supply | CV_Pharmacy             | CV_Fill_Date				  | CV_Tier_Level | CV_Formulary_Indicator |
   | Claim status^10-PWE | NDC^00004-0800-85 | Label name^TAMIFLU 75 MG CAPSULE | Quantity^10 | Days supply^5  | Pharmacy^LIMESTONE DRUG | Fill date^05/16/2019 | Tier level^00 | Formulary indicator^   |
    
 @Functional
  Scenario Outline: Verify Error Table Values Under Results Panel in Verify Coverage Page
    Given Ensure user is in Verify Coverage Page
    Then Verify Error Table Values for Coverage Verification
    | cv_errorsCode           | <CV_ErrorsCode>            |
    | cv_errorsAction         | <CV_ErrorsAction>          |
    | cv_errorsArgusErrorText | <CV_Errors_ArgusErrorText> |
    
    Examples: 
    | CV_ErrorsCode | CV_ErrorsAction    | CV_Errors_ArgusErrorText 																			  |
    | Code^020      | Action^Information | Argus Error Text^INGRED COST > NDC AMT BY MORE THAN PLAN EXPECTS |
    
 @Functional
  Scenario Outline: Verify TotalRxCost Table Values Under MemberCost Panel in Verify Coverage Page
    Given Ensure user is in Verify Coverage Page
    Then Verify TotalRxCost Table Values for Coverage Verification
    | cv_totalpatientpay     | <CV_TotalPatientPay>      |
    | cv_totalplanpaid       | <CV_TotalPlanPaid>        |
    | cv_totalotherpayerpaid | <CV_TotalOtherPayerPaid>  |
    | cv_taotalrxcost        | <CV_TotalRxCost>					 |
    
    Examples: 
    | CV_TotalPatientPay       | CV_TotalPlanPaid        | CV_TotalOtherPayerPaid       | CV_TotalRxCost        |
    | Total patient pay^$10.00 | Total plan paid^$121.83 | Total other payer paid^$0.00 | Total Rx Cost^$131.83 |
 
 @Functional
  Scenario Outline: Verify PatientPay Table Values Under MemberCost Panel in Verify Coverage Page
    Given Ensure user is in Verify Coverage Page
    Then Verify PatientPay Table Values for Coverage Verification
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
    Then Verify AppliedAmounts Table Values for Coverage Verification   
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
   Then Verify Balances Table Values for Coverage Verification
   | CV_SpendingAccountRemaining | <CV_SpendingAccountRemaining> |
   | CV_RemainingBenefit				 | <CV_RemainingBenefit>				 |
   | CV_AccumulatedDeductible    | <CV_AccumulatedDeductible>		 |  
   | CV_RemainingDeductible      | <CV_RemainingDeductible>			 |
   
   Examples:
   | CV_SpendingAccountRemaining      | CV_RemainingBenefit     | CV_AccumulatedDeductible     | CV_RemainingDeductible     |
   | Spending account remaining^$0.00 | Remaining benefit^$0.00 | Accumulated deductible^$0.00 | Remaining deductible^$0.00 |