Feature: MemberLookup Search and verify Reimbursement Reimbursement Results

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
   Scenario Outline: Verify Reimbursement_Reimbursement Results 
     Given User in Member Lookup details page    
     Then User click on Reimbursement icon      
     Then User verifies Reimbursement Results details     
       | RPAccount         | <RPAccount>         |         
       | RPPayment			   | <RPPayment>      	 |
       | RPStatus   		   | <RPStatus>          |
       | RPPaymentDate     | <RPPaymentDate>     |
       | RPFinancialDate   | <RPFinancialDate>   |
       | RPReplacement     | <RPReplacement>     |
       | RPOriginalPayment | <RPOriginalPayment> |
       | RPAmount          | <RPAmount>          |
       | RPName            | <RPName>            |         
       | RPAddress			   | <RPAddress>      	 |
       | RPCity    		     | <RPCity>            |
       | RPState           | <RPState>           |
       | RPZip					   | <RPZip>             |
       | RPReasonCode      | <RPReasonCode>      |
       | RPPaymentAmount   | <RPPaymentAmount>   |
       | RPPIPaymentDate   | <RPPIPaymentDate>   | 
       | RPClearedAmount   | <RPClearedAmount>   |
       | RPClearedDate     | <RPClearedDate>     |
       | RPVariance        | <RPVariance>        | 
       | RPVoidDate        | <RPVoidDate>        |        
       | RPComments        | <RPComments>        |
       | RPFillDate				 | <RPFillDate>        |
       | RPLabelName       | <RPLabelName>       |
       | RPClaimStatus     | <RPClaimStatus>     |
       | RPPharmacyName		 | <RPPharmacyName>    |
       | RAWPFillDate			 | <RAWPFillDate>      |
       | RAWPLabelName     | <RAWPLabelName>     |
       | RAWPClaimStatus   | <RAWPClaimStatus>   |
       | RAWPPharmacyName	 | <RAWPPharmacyName>  |
       | RDFillDate				 | <RDFillDate>  			 |
       | RDLabelName       | <RDLabelName>       |
       | RDClaimStatus     | <RDClaimStatus>     |
       | RDPharmacyName		 | <RDPharmacyName>    |     
          
    Examples: 
      | RPAccount | RPPayment  | RPStatus | RPPaymentDate | RPFinancialDate | RPReplacement | RPOriginalPayment   | RPAmount | RPName | RPAddress | RPCity | RPState | RPZip | RPReasonCode | RPPaymentAmount | RPPIPaymentDate | RPClearedAmount | RPClearedDate | RPVariance | RPVoidDate | RPComments | RPFillDate | RPLabelName | RPClaimStatus | RPPharmacyName | RAWPFillDate | RAWPLabelName | RAWPClaimStatus | RAWPPharmacyName | RDFillDate | RDLabelName | RDClaimStatus | RDPharmacyName |
      | Account^  | Payment #^ | Status^  | Payment Date^ | Financial Date^ | Replacement^  | Original Payment #^ | Amount^  | Name^  | Address^  | City^  | State^  | ZIP^  | Reason code^ | Payment amount^ | Payment date^   | Cleared amount^ | Cleared date^ | Variance^  | Void date^ | Comments^  | Fill Date^ | Label Name^ | Claim Status^ | Pharmacy Name^ | Fill Date^   | Label Name^   | Claim Status^   | Pharmacy Name^   | Fill Date^ | Label Name^ | Claim Status^ | Pharmacy Name^ | 
  
  
  
   