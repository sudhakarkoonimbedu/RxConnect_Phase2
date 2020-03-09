Feature: MemberLookup Search and verify Benefits and Eligibility Part D

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
  Scenario Outline: Verify Benefits and Eligibility Part D
    Given User in Member Lookup details page    
    Then User click on Benefits Eligibility icon      
    Then User click on Part D     
    Then User verifies Part D details     
      | CMSMemberSSN		      | <CMSMemberSSN>          |         
      | CMSSpouseSSN			    | <CMSSpouseSSN>          |
      | CMSHealthInsClaimNo   | <CMSHealthInsClaimNo>   |
      | CMSRRBenefitNumber    | <CMSRRBenefitNumber>    |         
      | CMSMaritalStatus	    | <CMSMaritalStatus>   	  |
      | CMSIncome             | <CMSIncome>             |
      | CMSMedicaidID					| <CMSMedicaidID>         |         
      | CMSDatesStart 		 		| <CMSDatesStart>   	    |
      | CMSDatesEnd				 		| <CMSDatesEnd>           |
      | PartDProgramType	 		| <PartDProgramType>      |         
      | PartDProgramValue	 		| <PartDProgramValue>   	|
      | PartDProgramStatus    | <PartDProgramStatus>    |
      | PartDProgramConractID | <PartDProgramConractID> |         
      | PartDProgramIndicator | <PartDProgramIndicator> |
      | PartDProgramStart			| <PartDProgramStart>     |
      | PartDProgramEnd				| <PartDProgramEnd>       |         
      | PartDProgramPorcDate  | <PartDProgramPorcDate>	|
      | PartDSType  				  | <PartDSType>            |
      | PartDSRxTypeCode	    | <PartDSRxTypeCode>      |         
      | PartDSRxGroupID 	    | <PartDSRxGroupID>       |
      | PartDSRxBIN     		  | <PartDSRxBIN>   				|
      | PartDSRxPCN     		  | <PartDSRxPCN>     		  |         
      | PartDSRxMemberID		  | <PartDSRxMemberID>   	  |
      | PartDSRxPersonCode	  | <PartDSRxPersonCode>    |
      | PartDSRxHelpDesk      | <PartDSRxHelpDesk>      |         
      | PartDSStart           | <PartDSStart>   	      |
      | PartDSEnd          	  | <PartDSEnd>             |                
      
    Examples: 
      | CMSMemberSSN | CMSSpouseSSN | CMSHealthInsClaimNo            | CMSRRBenefitNumber       | CMSMaritalStatus | CMSIncome | CMSMedicaidID | CMSDatesStart | CMSDatesEnd | PartDProgramType | PartDProgramValue | PartDProgramStatus | PartDProgramConractID | PartDProgramIndicator | PartDProgramStart | PartDProgramEnd | PartDProgramPorcDate | PartDSType | PartDSRxTypeCode | PartDSRxGroupID | PartDSRxBIN | PartDSRxPCN | PartDSRxMemberID | PartDSRxPersonCode | PartDSRxHelpDesk | PartDSStart | PartDSEnd |
	    | Member SSN^  | Spouse SSN^  | Health insurance claim number^ | Railroad benefit number^ | Marital status^  | Income^   | Medicaid ID^  | Start^        | End^        | Type^            | Value^            | Status^            | Contract ID^          | Indicator^            | Start^            | End^            | Process Date^        | Type^      | Rx Type Code^    | Rx Group ID^    | Rx BIN^     | Rx PCN^     | Rx Member ID^    | Rx Person Code^    | Rx Help Desk^    | Start^      | End^      | 

  
  
  
  
  
  
  
  
  
  
  
  
   