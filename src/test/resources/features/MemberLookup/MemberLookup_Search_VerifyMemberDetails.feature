Feature: MemberLookup Search and verify Member Details

  Background: performLogin
    Given the user access the Hybrid Desktop Application
      | userid   | |
      | password | |
      | region   | |

  @Functional
  Scenario Outline: Member Lookup Search with valid data
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
  Scenario Outline: Member Lookup Search and verify Member ID Details
    Given User in Member Lookup Search Page
    Then User click on Customer Field and verifies the member id details
      | CustomerSet      | <CustomerSet>      |
      | Customer         | <Customer>         |
      | Client           | <Client>           |
      | Group            | <Group>            |
      | StartDate        | <StartDate>        |
      | EndDate          | <EndDate>          |
      | MemberID         | <MemberID>         |
      | AltMemberID      | <AltMemberID>      |
      | FirstName        | <FirstName>        |
      | LastName         | <LastName>         |
      | DOB              | <DOB>              |
      | Gender           | <Gender>           |
      | RelationshipCode | <RelationshipCode> |
      | Line1            | <Line1>            |
      | Phone            | <Phone>            | 
      | Line2            | <Line2>            |            
      | City             | <City>             |
      | State            | <State>            |
      | ZIP              | <ZIP>              | 
    Examples: 
      | CustomerSet          | Customer                    | Client                      | Group             | StartDate              | EndDate               | MemberID                | AltMemberID     | FirstName        | LastName                    | DOB             | Gender    | RelationshipCode      | Line1         | Phone   | Line2    | City         | State     | ZIP               |
      | Customer Set:^Humana | Customer:^0319 - 0319HUMANA | Client:^09007 - NBRG--CLNT1 | Group:^RXCONNECT2 | Start Date:^01/01/2015 | End Date:^No end date | Member ID:^908180001 01 | Alt Member ID:^ | First Name:^MBR1 | Last Name:^MBRNONBRIDGECUST | DOB:^01/15/1964 | Gender:^M | Relationship code:^01 | Line 1:^12345 | Phone:^ | Line 2:^ | City:^ATHENS | State:^AL | ZIP:^35611 - 0000 |

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
