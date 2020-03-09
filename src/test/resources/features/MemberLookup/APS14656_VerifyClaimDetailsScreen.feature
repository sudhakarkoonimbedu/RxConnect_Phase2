Feature: APS 14656 - Validation of Claim Details Screen by performing the search operation

  Background: Perform Login
   
    Given Login Into Hybrid Desktop Application
      | userid   |   |
      | password |   |
      | region   |   |
      
  @Functional
  Scenario Outline: Perform search with valid inputs at Pharmacy Lookup Screen
    Given Verify the user is in Hybrid Desktop Landing Page and select the application from menu
      | menu | <ApplicationMenu> |
    When Perform search operation by giving valid inputs at Pharmacy Lookup screen
      | PharmacyNPI | <PHARMACYNPI> |
      | RxNumber    | <RXNUMBER>    |
      | Start_Date  | <STARTDATE>   |
    Then MemberDetails should be displayed at Pharmacy Lookup Screen
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
			
			Examples:
			   | ApplicationMenu               | PHARMACYNPI | RXNUMBER     | STARTDATE  | MemberID		           | DateOfBirth               | MemberName		                    | Error	 | Date            | Time          | CICSStatus      | CustID										| ClientID						                              | Group						                         |
			   | Miscellaneous->RxNova Connect | 1710927462  | 120005442999 | 06/05/2019 | Member ID^90413000100 | Date of Birth^01/01/1940  | Member Name^MBRNONBRIDGECUST RWT | Error^ | Date^06/06/2019 | Time^10:27:28 | CICS Status^PWE | Cust ID^319 - 0319HUMANA | Client ID^9007 - NBRG--CLNT1 - NONBRG CLIENT--PDP | Group^2 - RWNBRG REGR2 DONT USE REWORK10 |
	@Functional
	Scenario Outline: Perform search with valid inputs at Member Lookup Screen	
	Given Ensure user is in RxNova Connect Page
	When Perform search operation by giving valid inputs at Member Lookup Screen
	  | customerSet 		 | <SearchCustomerSet> |
	  | customer    		 | <SearchCustomer>    |
	  | memberid    		 | <SearchMemberID>    |
	  | exactMatch       | <SearchExactMatch>  |
	Then Member Lookup details should be displayed
	  | customer    | <Customer>     |
	  | memberid    | <Member_ID>    |
	  | altmemberid | <AltMember_ID> |
	  | firstname   | <First_Name>   |
	  | lastname    | <Last_Name>    |
	  | mi				  | <MI>			     |
	  | dob         | <DOB>          |
	  | startdate   | <Start_Date>   |
	  | enddate     | <End_Date>     |
  Then Click on PlayButton at Pharmacy Lookup MemberId section
  Then Claim Details Page Should be displayed 
	  
	  Examples:
	    | SearchCustomerSet | SearchCustomer    | SearchMemberID | SearchExactMatch| Customer                   | Member_ID                    | AltMember_ID                     | First_Name       | Last_Name                  | MI  | DOB            | Start_Date            | End_Date             |
	    | Humana            | 0319 - 0319HUMANA | 90413000100    |  checked        | Customer^0319 - 0319HUMANA | Member ID^000000090413000100 | Alt Member ID^000000090413000100 | First Name^RWTC4 | Last Name^MBRNONBRIDGECUST | MI^ | DOB^01/01/1940 | Start Date^01/01/2015 | End Date^No end date | 
  
    