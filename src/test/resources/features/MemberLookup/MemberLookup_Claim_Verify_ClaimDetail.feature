Feature: MemberLookup Search verify Claim Details

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
  Scenario Outline: Verify Claim Information  
    Given User in Member Lookup Claim details page    
    Then User verifies the Claim Information details     
      | Status   		       | <Status>            |         
      | PharmacyID   		   | <PharmacyID>   	   |
      | PharmacyQlfr       | <PharmacyQlfr>      |
      | RxNo    	         | <RxNo>  	           |
      | POSNo              | <POSNo>             | 
      | ClaimNo            | <ClaimNo>           |
      | DateFilled         | <DateFilled>        |
      | DateWritten        | <DateWritten>       |     
      | DateReversed       | <DateReversed>    	 |
      | DateAdded          | <DateAdded>         |
      | TimeAdded   		   | <TimeAdded>         |         
      | DateUpdated   		 | <DateUpdated>   	   |
      | TimeUpdated        | <TimeUpdated>       |
      | RxOrigin    	     | <RxOrigin>  	       |
      | Source             | <Source>            | 
      | Version            | <Version>           |
      
    Examples: 
      | Status         | PharmacyID              | PharmacyQlfr      | RxNo               | POSNo                | ClaimNo                  | DateFilled              | DateWritten              | DateReversed   | DateAdded              | TimeAdded            |DateUpdated   | TimeUpdated            | RxOrigin     |Source       | Version     |
      | Status:^10-PWE | Pharmacy ID:^1225134133 | Pharmacy Qlfr:^01 | Rx #:^120005443111 | POS #:^19-255-000078 | Claim #:^19-655-000078-1 | Date Filled:^05/17/2019 | Date Written:^07/16/2019 | Date Reversed:^| Date Added:^09/12/2019 | Time Added:^13:17:12 |Date Updated:^| Time Updated:^00:00:00 | Rx Origin:^1 | Source:^POS | Version:^D0 |
      
         
  @Functional
  Scenario Outline: Verify Drug Override Information  
    Given User in Member Lookup Claim details page    
    Then User verifies the Drug Override Information details     
      | NDC   		         | <NDC>               |         
      | LabelName   		   | <LabelName>   	     |
      | GenericName        | <GenericName>       |
      | DaysSupply	       | <DaysSupply>  	     |
      | Quantity           | <Quantity>          | 
      | DAW                | <DAW>               |
      | NewRefill          | <NewRefill>         |
      | Compound           | <Compound>          |     
      | DrugDiscount       | <DrugDiscount>    	 |
      | SpecialtyDrugFlag  | <SpecialtyDrugFlag> |
      | ResAuthNumber   	 | <ResAuthNumber>     |         
      | PreAuthNumber		   | <PreAuthNumber>   	 |
      | CustAuthNumber     | <CustAuthNumber>    |
      | PriorAuthNumberSub | <PriorAuthNumberSub>|
      | ClinicalSupportID  | <ClinicalSupportID> | 
      | SubmissionClarCode | <SubmissionClarCode>|
      | OtherCoverage   	 | <OtherCoverage>     |         
      | DURInterven   		 | <DURInterven>   	   |
      | DURConflict        | <DURConflict>       |
      | DUROutcome	       | <DUROutcome>  	     |
      | PostPay2           | <PostPay2>          | 
      | PostPay3           | <PostPay3>          |
      | PostPay4           | <PostPay4>          |
      
    Examples:   
      | NDC                | LabelName                         | GenericName                         | DaysSupply     | Quantity         | DAW    | NewRefill     | Compound    | DrugDiscount   | SpecialtyDrugFlag      | ResAuthNumber                     | PreAuthNumber              | CustAuthNumber                    | PriorAuthNumberSub                    | ClinicalSupportID    | SubmissionClarCode               | OtherCoverage     | DURInterven      | DURConflict      | DUROutcome      | PostPay2     | PostPay3    | PostPay4      |
      | NDC:^00004-0800-85 | Label Name:^TAMIFLU 75 MG CAPSULE | Generic Name:^OSELTAMIVIR PHOSPHATE | Days Supply:^5 | Quantity:^10.000 | DAW:^0 | New/Refill:^0 | Compound:^1 | Drug Discount:^| Specialty Drug Flag:^Y | Restricted Authorization Number:^ | Pre-Authorization Number:^ | Customized Authorization Number:^ | Prior Authorization Number Submitted:^| Clinical Support ID:^| Submission Clarification Code:^1 | Other Coverage:^1 | DUR Interven:^00 | DUR Conflict:^NA | DUR Outcome:^1B | Post Pay 2:^ | Post Pay 3:^| Post Pay 4:^D |    
      
  @Functional
  Scenario Outline: Verify Pharmacy Prescriber Information   
    Given User in Member Lookup Claim details page    
    Then User verifies the Pharmacy Prescriber Information details     
      | PharmacyName   		 | <PharmacyName>      |         
      | Address 		       | <Address>   	       |
      | City               | <City>              |
      | State	             | <State>  	         |
      | ZIP                | <ZIP>               | 
      | Phone              | <Phone>             |
      | Affiliation        | <Affiliation>       |
      | Chain              | <Chain>             |     
      | PharmacyNetwork    | <PharmacyNetwork>   |
      | PrescriberID       | <PrescriberID>      |
      | PrescriberQlfr   	 | <PrescriberQlfr>    |         
      | PrescriberName	   | <PrescriberName>    |
      | FillRecInterval    | <FillRecInterval>   |       
      
    Examples: 
      | PharmacyName                   | Address                  | City         | State     | ZIP        | Phone                | Affiliation          | Chain    | PharmacyNetwork        | PrescriberID              | PrescriberQlfr     |PrescriberName             | FillRecInterval             |  
      | Pharmacy Name:^ATHENS PHARMACY | Address:^705 W MARKET ST | City:^ATHENS | State:^AL | ZIP:^35611 | Phone:^(256)232-2242 | Affiliation:^9000391 | Chain:^0 | Pharmacy Network:^0069 | Prescriber ID:^1053398768 | Prescriber Qlfr:^01|Prescriber Name:^OTTO BURKY| Fill Received Interval:^999 | 
      
  @Functional
  Scenario Outline: Verify Claim Pricing Information  
    Given User in Member Lookup Claim details page      
    Then User verifies the Claim Pricing Information details     
      | PlanPaid   		     | <PlanPaid>          |         
      | PatientPaid 		   | <PatientPaid>   	   |
      | AWPCost            | <AWPCost>           |
      | MACIngrCost        | <MACIngrCost>  	   |
      | UCAmount           | <UCAmount>          | 
      | WACAmount          | <WACAmount>         |
      | PriceSource        | <PriceSource>       |
      | SubIngrCost        | <SubIngrCost>       |     
      | DispenseFee        | <DispenseFee>       |
      | SalesTax           | <SalesTax>          |
      | IncentiveAmount  	 | <IncentiveAmount>   |         
      | Copay              | <Copay>             |
      | Total              | <Total>             |      
     #Then User verifies the Claim History button is active and enabled          
     #Then User verifies the Reverse Claim button is active and enabled       
       
    Examples: 
      | PlanPaid         | PatientPaid           | AWPCost           | MACIngrCost          | UCAmount              | WACAmount           | PriceSource       | SubIngrCost            | DispenseFee         | SalesTax         | IncentiveAmount         | Copay        | Total          |  
      | Plan Paid:^$0.00 | Patient Paid:^$184.26 | AWP Cost:^$182.26 | MAC Ingr Cost:^$0.00 | U & C Amount:^$305.00 | WAC Amount:^$151.88 | Price Source:^AWP | Sub Ingr Cost:^$305.00 | Dispense Fee:^$0.00 | Sales Tax:^$0.00 | Incentive Amount:^$0.00 | Copay:^$0.00 | Total:^$305.00 |

  
  
  
  
  
  
  
  
  
  
  
  
   