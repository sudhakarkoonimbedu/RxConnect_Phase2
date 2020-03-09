Feature: MemberLookup Search and verify Benefits and Eligibility B&E Detail

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
  Scenario Outline: Verify Benefits and Eligibility B&E Details
    Given User in Member Lookup details page    
    Then User click on Benefits Eligibility icon      
    Then User verifies Benefits & Elegibility details     
      | MemberID				      | <MemberID>              |         
      | AltMemberID				    | <AltMemberID>           |
      | FirstName					    | <FirstName>             |
      | LastName				      | <LastName>              |
      | MI                    | <MI>                    |         
      | CustomerSet				    | <CustomerSet>   	      |
      | Customer					    | <Customer>              |
      | Client					  		| <Client>                |         
      | Group							 		| <Group>   	            |
      | EligibilityStatus	 		| <EligibilityStatus>     |
      | DOB							  		| <DOB>                   |
      | DeceasedDate          | <DeceasedDate>          |         
      | Gender						 		| <Gender>   	            |
      | Relationship			    | <Relationship>          |
      | MedicareBeneficiaryID | <MedicareBeneficiaryID> |
      | CaseId					      | <CaseId>                |         
      | CardHolderFirstName   | <CardHolderFirstName>   |
      | CardHolderLastName	  | <CardHolderLastName>    |
      | CardHolderMI          | <CardHolderMI>          |
      | CardReissueDate		    | <CardReissueDate>       |         
      | CardReissueReason  		| <CardReissueReason>   	|
      | Line1								  | <Line1>                 |
      | Line2			 		        | <Line2>                 |         
      | Line3				 			    | <Line3>              	  |
      | City								  | <City>   								|
      | State								  | <State>     					  |         
      | Zip 								  | <Zip>   							  |
      | Country							  | <Country>               |
      | Phone				          | <Phone>                 |
      | Email                 | <Email>                 |    
      | MiscData1             | <MiscData1>   	        |
      | MiscData2						  | <MiscData2>             |
      | MiscData3             | <MiscData3>             |         
      
    Examples:       
      | MemberID                      | AltMemberID	    | FirstName	       | LastName                    | MI   | CustomerSet          | Customer                 | Client                   | Group             | DOB             | DeceasedDate    | Gender    | Relationship                 | MedicareBeneficiaryID     | CaseId	                    | CardHolderFirstName | CardHolderLastName | CardHolderMI | CardReissueDate	    | CardReissueReason     | Line1	        | Line2    | Line3    | City	       | State     | Zip             | Country                           | Phone	 | Email   | MiscData1     | MiscData2     | MiscData3     |
      | Member ID:^000000090818000101 | Alt Member ID:^ | First Name:^MBR1 | Last Name:^MBRNONBRIDGECUST | MI:^ | Customer Set:^Humana | Customer:^319 0319HUMANA | Client:^9007 NBRG--CLNT1 | Group:^RXCONNECT2 | DOB:^01/15/1964 | Deceased Date:^ | Gender:^M | Relationship:^1 - Cardholder | Medicare Beneficiary ID:^ | Case ID:^000000000908180001 | First Name:^        | Last Name:^        | MI:^         | Card Reissue Date:^ | Card Reissue Reason:^ | Line 1:^12345 | Line 2:^ | Line 3:^ | City:^ATHENS | State:^AL | ZIP:^35611-0000 | Country:^UNITED STATES OF AMERICA | Phone:^ | Email:^ | Misc Data 1:^ | Misc Data 2:^ | Misc Data 3:^ | 
      
  @Functional
  Scenario Outline: Verify Additional Eligibility Details
    Given User in Benefits & Eligibility Details page    
    Then User click on View Additional Eligibility Dates icon and verifies Additional Eligibility Dates
      | MemberID				      | <MemberID>              |         
      | AltMemberID				    | <AltMemberID>           |
      | FirstName					    | <FirstName>             |
      | LastName				      | <LastName>              |
      | MI                    | <MI>                    |         
      | CustomerSet				    | <CustomerSet>   	      |
      | Customer					    | <Customer>              |
      | Client					  		| <Client>                |         
      | Group							 		| <Group>   	            |
      | MemEligbilityStart		| <MemEligbilityStart>    |
      | MemEligbilityEnd			| <MemEligbilityEnd>      |         
      | MemEligbilityProcess	| <MemEligbilityProcess>  |
      | GrpEligbilityStart		| <GrpEligbilityStart>    |
      | GrpEligbilityEnd			| <GrpEligbilityEnd>      |         
      | GrpEligbilityProcess	| <GrpEligbilityProcess>  |
      | CliEligbilityStart		| <CliEligbilityStart>    |
      | CliEligbilityEnd			| <CliEligbilityEnd>      |         
      | CliEligbilityProcess	| <CliEligbilityProcess>  |
      | CusEligbilityStart		| <CusEligbilityStart>    |
      | CusEligbilityEnd			| <CusEligbilityEnd>      |         
      | CusEligbilityProcess	| <CusEligbilityProcess>  |
      
    Examples:       
      | MemberID                      | AltMemberID	    | FirstName	       | LastName                    | MI   | CustomerSet          | Customer                 | Client                   | Group             | MemEligbilityStart | MemEligbilityEnd | MemEligbilityProcess    | GrpEligbilityStart | GrpEligbilityEnd | GrpEligbilityProcess    | CliEligbilityStart | CliEligbilityEnd | CliEligbilityProcess    | CusEligbilityStart | CusEligbilityEnd | CusEligbilityProcess    |
      | Member ID:^000000090818000101 | Alt Member ID:^ | First Name:^MBR1 | Last Name:^MBRNONBRIDGECUST | MI:^ | Customer Set:^Humana | Customer:^319 0319HUMANA | Client:^9007 NBRG--CLNT1 | Group:^RXCONNECT2 | Start^01/01/2015   | End^No end date  | Process Date^03/05/2019 | Start^01/01/2015   | End^No end date  | Process Date^07/19/2018 | Start^01/01/2004   | End^No end date  | Process Date^09/07/2018 | Start^01/01/2000   | End^No end date  | Process Date^12/27/2018 |
      
  @Functional
  Scenario Outline: Verify Member ID Details
    Given User in Benefits & Eligibility Details page
    Then User click on MemberID details link and verifies the Member details in Member Home Screen 
      | MasterCustomerSet     | <MasterCustomerSet>     |         
      | CustomerName          | <CustomerName>          |
      | ClientName            | <ClientName>            |
      | ExternalGroupID       | <ExternalGroupID>       |         
      | InternalGroupID       | <InternalGroupID>   	  |
      | MemberID              | <MemberID>              |
      | MemberLastFirstName		| <MemberLastFirstName>   |         
      | DateOfBirth						| <DateOfBirth>           |
      | Gender								| <Gender>                |
      | ActiveEffDateRange		| <ActiveEffDateRange>    |         
      | Test									| <Test>                  |  
      
    Examples: 
      | MasterCustomerSet           | CustomerName                   | ClientName                              | ExternalGroupID               | InternalGroupID      | MemberID               | MemberLastFirstName                      | DateOfBirth               | Gender           | ActiveEffDateRange                                    | Test     | 
      | Master customer set:^Humana | Customer name:^0319-0319HUMANA | Client name:^09007-NBRG--CLNT1 - NONBRG | External Group ID:^RXCONNECT2 | Internal Group ID:^6 | Member ID:^90818000101 | Member: Last First^MBRNONBRIDGECUST MBR1 | Date of birth:^01/15/1964 | Gender:^M - Male | Active effective date range:^01/01/2015 - No end date | Test:^No |  
  
  
  
  
  
  
  
  
  
   