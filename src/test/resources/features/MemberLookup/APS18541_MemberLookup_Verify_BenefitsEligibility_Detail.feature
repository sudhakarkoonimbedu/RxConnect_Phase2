Feature: APS 18541 - Verify Benefits and Eligibility  Detail

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   |   |
      | password |   |
      | region   |   |

  @Functional
  Scenario Outline: Member Lookup search with valid data
    Given User in Landing Page, he selects the application from menu    
      | menu | <ApplicationMenu> |      
    Then Perform MemberLookup Search with valid inputs    
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
      | Customer       | <Customer>               |
      | MemberID       | <MemberID>               |
      | AltMemberID    | <AltMemberID>            |
      | FirstName      | <FirstName>              |
      | LastName       | <LastName>               |
      | MI             | <MI>                     |      
      | DOB            | <DOB>                    |
      | StartDate      | <StartDate>              |
      | EndDate        | <EndDate>                |      
    Then Verify the End Date Warning Message
      | WarningMessage | <EndDate_WarningMessage> |
            
    Examples: 
      | ApplicationMenu               | SearchCustomerSet | SearchCustomer |  SearchMemberID | SearchAltID | SearchExactMatch | SearchFirstName | SearchMI | SearchLastName | SearchDOB  | SearchClaimID | Customer                | MemberID                     | AltMemberID    | FirstName              | LastName       | MI  | DOB            | StartDate             | EndDate              | EndDate_WarningMessage 																																																					|
      | Miscellaneous->RxNova Connect | C1_Master         | 1447 - 1447COB |                 |             |                  | ELIGIBILITY     |          | DATE           | 03/15/1975 |               | Customer^1447 - 1447COB | Member ID^000002019020500101 | Alt Member ID^ | First Name^ELIGIBILITY | Last Name^DATE | MI^ | DOB^03/15/1975 | Start Date^01/01/2017 | End Date^No end date | Warning, the member may contain coverage gaps. Please review the View Additional Eligibility Dates information for full details. |
        
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
      | CustomerSet             | Customer                 | Client                      | Group           | Gender    | MemberID                      | AltMemberID     | FirstName               | LastName        | DOB             |
      | Customer Set:^C1_Master | Customer:^1447 - 1447COB | Client:^8007 - 8007-MEMCOMM | Group:^A1112402 | Gender:^F | Member ID:^000002019020500101 | Alt Member ID:^ | First Name:^ELIGIBILITY | Last Name:^DATE | DOB:^03/15/1975 |    
          
  @Functional
  Scenario Outline: Verify Benefits and Eligibility B&E Details
    Given User in Member Lookup details page    
    Then User click on Benefits Eligibility icon      
    Then User verifies Benefits and Eligibility details     
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
      | UniquePersonID				| <UniquePersonID>				|         
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
      | DateTimeAdded 			  | <Date_Time_Added>			  |
      | DeviceOperatorAdded   | <Device_Operator_Added> |
      | DateTimeUpdated       | <Date_Time_Updated>			|
      | DeviceOperatorUpdated | <DeviceOperatorUpdated> |
      
    Examples:       
      | MemberID                      | AltMemberID	    | FirstName	       			  | LastName        | MI   | CustomerSet             | Customer               | Client                    | Group           | EligibilityStatus            | DOB             | DeceasedDate    | Gender    | Relationship                 | MedicareBeneficiaryID     | CaseId	                    | UniquePersonID     | CardHolderFirstName | CardHolderLastName | CardHolderMI | CardReissueDate	   | CardReissueReason     | Line1	  | Line2    | Line3    | City	 | State   | Zip             | Country                           | Phone	 | Email   | MiscData1     | MiscData2     | MiscData3     | Date_Time_Added                      | Device_Operator_Added 											 | Date_Time_Updated   | DeviceOperatorUpdated     |
      | Member ID:^000002019020500101 | Alt Member ID:^ | First Name:^ELIGIBILITY | Last Name:^DATE | MI:^ | Customer Set:^C1_Master | Customer:^1447 1447COB | Client:^8007 8007-MEMCOMM | Group:^A1112402 | Eligibility Status: Eligible | DOB:^03/15/1975 | Deceased Date:^ | Gender:^F | Relationship:^1 - Cardholder | Medicare Beneficiary ID:^ | Case ID:^000000020190205001 | Unique Person ID:^ | First Name:^        | Last Name:^        | MI:^         | Card Reissue Date:^ | Card Reissue Reason:^ | Line 1:^ | Line 2:^ | Line 3:^ | City:^ | State:^ | ZIP:^66210-0000 | Country:^UNITED STATES OF AMERICA | Phone:^ | Email:^ | Misc Data 1:^ | Misc Data 2:^ | Misc Data 3:^ | Date/Time Added:^02/15/2019!11:24:52 | Device/Operator Added:^RXNOVA!Michael Bixler | Date/Time Updated:^ | Device/Operator Updated:^ |
      
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
      | MemEligbilityStart1		| <MemEligbilityStart1>   |
      | MemEligbilityEnd1			| <MemEligbilityEnd1>     |         
      | MemEligbilityProcess1	| <MemEligbilityProcess1> |
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
      | MemberID                      | AltMemberID	    | FirstName	              | LastName        | MI   | CustomerSet             | Customer               | Client                    | Group           | MemEligbilityStart | MemEligbilityEnd | MemEligbilityProcess    | MemEligbilityStart1 | MemEligbilityEnd1 | MemEligbilityProcess1    | GrpEligbilityStart | GrpEligbilityEnd | GrpEligbilityProcess    | CliEligbilityStart | CliEligbilityEnd | CliEligbilityProcess    | CusEligbilityStart | CusEligbilityEnd | CusEligbilityProcess    |
      | Member ID:^000002019020500101 | Alt Member ID:^ | First Name:^ELIGIBILITY | Last Name:^DATE | MI:^ | Customer Set:^C1_Master | Customer:^1447 1447COB | Client:^8007 8007-MEMCOMM | Group:^A1112402 | Start^10/31/2017   | End^No end date  | Process Date^02/15/2019 | Start^01/01/2017    | End^06/30/2017    | Process Date^02/15/2019  | Start^01/01/2016   | End^No end date  | Process Date^11/02/2017 | Start^01/01/2015   | End^No end date  | Process Date^02/12/2018 | Start^01/01/2015   | End^No end date  | Process Date^10/10/2019 |
      
  @Functional
  Scenario Outline: Verify Additional Eligibility Details
    Given User in Benefits & Eligibility Details page
    Then Verify Eligibility Dates table values
      | EligibilityDates_Member_StartDate     | <EligibilityDates_Member_StartDate>     |
      | EligibilityDates_Member_EndDate       | <EligibilityDates_Member_EndDate>       |
      | EligibilityDates_Member_ProcessDate   | <EligibilityDates_Member_ProcessDate>   |      
      | EligibilityDates_Group_StartDate      | <EligibilityDates_Group_StartDate>      |
      | EligibilityDates_Group_EndDate        | <EligibilityDates_Group_EndDate>        |
      | EligibilityDates_Group_ProcessDate    | <EligibilityDates_Group_ProcessDate>    |      
      | EligibilityDates_Client_StartDate     | <EligibilityDates_Client_StartDate>     |
      | EligibilityDates_Client_EndDate       | <EligibilityDates_Client_EndDate>       |
      | EligibilityDates_Client_ProcessDate   | <EligibilityDates_Client_ProcessDate>   |      
      | EligibilityDates_Customer_StartDate   | <EligibilityDates_Customer_StartDate>   |
      | EligibilityDates_Customer_EndDate     | <EligibilityDates_Customer_EndDate>     |
      | EligibilityDates_Customer_ProcessDate | <EligibilityDates_Customer_ProcessDate> |
        
    Examples:
      | EligibilityDates_Member_StartDate | EligibilityDates_Member_EndDate | EligibilityDates_Member_ProcessDate | EligibilityDates_Group_StartDate | EligibilityDates_Group_EndDate | EligibilityDates_Group_ProcessDate | EligibilityDates_Client_StartDate | EligibilityDates_Client_EndDate | EligibilityDates_Client_ProcessDate | EligibilityDates_Customer_StartDate | EligibilityDates_Customer_EndDate | EligibilityDates_Customer_ProcessDate |
      | Member^Start^10/31/2017						| Member^End^No end date					| Member^Process^02/15/2019						| Group^Start^01/01/2016					 | Group^End^No end date          | Group^Process^11/02/2017					 | Client^Start^01/01/2015  		     | Client^End^No end date				   | Client^Process^02/12/2018           | Customer^Start^01/01/2015           | Customer^End^No end date					 | Customer^Process^10/10/2019					 |
        
    