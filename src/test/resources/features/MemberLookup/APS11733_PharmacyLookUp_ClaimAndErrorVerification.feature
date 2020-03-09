Feature: APS 11733 - Validation of Claim Raw Data and Error Tabs in Pharmacy Lookup screen
  
  Background: performLogin
    
    Given Access the Hybrid Desktop Application
      | userid   |  |
      | password |  |
      | region   |  |
      
  @Functional
  Scenario Outline: MemberID search with valid data
    Given Ensure user is in Landing Page and he selects the application from menu    
      | menu | <ApplicationMenu> |
    Then Perform search operation by entering details in Pharmacy Lookup screen
      | PharmacyNPI | <PHARMACYNPI> |
      | RxNumber    | <RXNUMBER>    |
      | Start_Date  | <STARTDATE>   |
    Then Member details should be displayed at Pharmacy Lookup Screen
      | Member_ID     | <MemberID>    |
			| Date_Of_Birth | <DateOfBirth> |
			| Member_Name   | <MemberName>  |
			| Error         | <Error>				|
			| Date          | <Date>				|
			| Time          | <Time>				|
			| CICS_Status   | <CICSStatus>	|
			| Cust_ID       | <CustID>			|
			| Client_ID     | <ClientID>    |
			| Group         | <Group>				|
		Then Click on PlayButton at PharmacyLookup screen
		Then POS Transaction Data should be displayed
			
			Examples:
			   | ApplicationMenu               | PHARMACYNPI | RXNUMBER     | STARTDATE  | MemberID		           | DateOfBirth               | MemberName		              | Error														       | Date            | Time          | CICSStatus      | CustID												         | ClientID						           | Group						             |
			   | Miscellaneous->RxNova Connect | 1063515880  | 121987155153 | 05/05/2018 | Member ID^71709375000 | Date of Birth^03/01/1968  | Member Name^ANAHEIM CLOVER | Error^169 - PHARMACY NOT FOUND IN PLAN | Date^03/09/2019 | Time^16:39:08 | CICS Status^DNI | Cust ID^518 - CIGNA PHARMACY SERVICES | Client ID^2002 - CHOICELEGACY | Group^4 - BROOKSIDE EQUIPMENT |
    @Functional
    Scenario Outline: Verify Claim Raw Data
      Given Ensure user is in POS Transaction Data page
      Then Verify Claim Raw Data is displayed
      	| DataLength  | <DataLength>  |

    	Examples: 
      	| DataLength      |  
      	| Data Length^731 |
    @Functional
    Scenario Outline:
      Given Ensure user is in POS Transaction Data page
      Then Verify Error Information for NCPDP Error Message Table Data
        | code 								| <Code> 								|
        | occ  								| <Occ>   							|
        | ncpdp_error_message | <NCPDP_Error_Message> |
      Then Verify Error Information for RxNova Error Message Table Data
        | code1 							   | <Code1> 		             |
        | di1 							     | <DI1> 		 					     |
        | rxnova_error_message1  | <RxNova_Error_Message1> |
        | code2 							   | <Code2> 		             |
        | di2 							     | <DI2> 		 					     |
        | rxnova_error_message2  | <RxNova_Error_Message2> |
         
      Examples: 
        | Code    | Occ  | NCPDP_Error_Message                             | Code1    | DI1   | RxNova_Error_Message1                           | Code2    | DI2   | RxNova_Error_Message2 																							  |
        | Code^50 | Occ^ | NCPDP Error Message^NON-MATCHED PHARMACY NUMBER | Code^169 | D/I^D | RxNova Error Message^PHARMACY NOT FOUND IN PLAN | Code^020 | D/I^I | RxNova Error Message^INGRED COST > NDC AMT BY MORE THAN PLAN EXPECTS |