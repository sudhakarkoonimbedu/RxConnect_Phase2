Feature: MemberLookup Search and verify Benefits and Eligibility Deductible & Accumulators

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
  Scenario Outline: Verify Benefits and Eligibility Deductible & Accumulators
    Given User in Member Lookup details page    
    Then User click on Benefits Eligibility icon     
    Then User click on Deductible & Accumulators     
    Then User verifies Deductible & Accumulators details     
      | ABPStart 				  | <ABPStart>          |         
      | ABPEnd					  | <ABPEnd>            |
      | ABPLevel				  | <ABPLevel>          |
      | ACAccumulatorID	  | <ACAccumulatorID>   |         
      | ACStart						| <ACStart>   	      |
      | ACEnd							| <ACEnd>             |
      | ACIndicator			  | <ACIndicator>       |
      | AccumAmounts1     | <AccumAmounts1>     |
      | AccumAmounts2     | <AccumAmounts2>     |
      | AccumAmounts3     | <AccumAmounts3>     |
      | AccumAmounts4     | <AccumAmounts4>     |
      | AccumAmounts5     | <AccumAmounts5>     |             
      #| AAType						| <AAType>   	        |
      #| AAName						| <AAName>            |
      #| AAMedicalRx				| <AAMedicalRx>       |         
      #| AANetwork					| <AANetwork>   	    |
      #| AARetailMailOrder	| <AARetailMailOrder> |
      #| AABrandGeneric		| <AABrandGeneric>    |         
      #| AACSRIndicator		| <AACSRIndicator>    |
      #| AACSRComparison		| <AACSRComparison>   |
      #| AARenewal					| <AARenewal>         |         
      | IAIndividualLimit | <IAIndividualLimit> |
      | IAMemberPaid			| <IAMemberPaid>      |
      | IAAmountToMeet		| <IAAmountToMeet>    |         
      | IAPlanPaid				| <IAPlanPaid>        |
      | IAExcludedAmount	| <IAExcludedAmount>  |
      | IAPLRO						| <IAPLRO>     			  |         
      | IAClaims					| <IAClaims>   				|
      | IAMetDate					| <IAMetDate>         |
      | FAFamilyLimit     | <FAFamilyLimit>     |         
      | FAFamilyPaid	    | <FAFamilyPaid>   	  |
      | FAAmountToMeet		| <FAAmountToMeet>    |
      | FAPlanPaid		    | <FAPlanPaid>        |         
      | FAExcludedAmount	| <FAExcludedAmount>  |
      | FAClaims					| <FAClaims>          |
      | FAMetDate 				| <FAMetDate>         |                
      
    Examples: 
      | ABPStart         | ABPEnd         | ABPLevel    | ACAccumulatorID          | ACStart          | ACEnd          | ACIndicator      | AccumAmounts1                                                                                                                                                                              | AccumAmounts2                                                                                                                                                                                                    | AccumAmounts3                                                                                                                                                                            | AccumAmounts4                                                                                                                                                                                                  | AccumAmounts5                                                                                                                                                                           | IAIndividualLimit        | IAMemberPaid        | IAAmountToMeet       | IAPlanPaid      | IAExcludedAmount      | IAPLRO     | IAClaims   | IAMetDate           | FAFamilyLimit        | FAFamilyPaid        | FAAmountToMeet        | FAPlanPaid      | FAExcludedAmount      | FAClaims   | FAMetDate |
      | Start^01/01/2019 | End^12/31/2019 | Level^Group | Accumulator ID^AMQTPCOMM | Start^01/01/2019 | End^12/31/2019 | Indicator^RxNova | DED!Type^DED - Deductible (Commercial)!Name^DED!Medical/Rx^All!Network^All!Retail/Mail Order^All!Brand/Generic^All!CSR Indicator^ST - Standard!CSR Comparison^$0.00!Renewal^Benefit Period | DED2!Type^DED - Deductible (Commercial)!Name^DED2!Medical/Rx^All!Network^All!Retail/Mail Order^All!Brand/Generic^All!CSR Indicator^04 - 73% AV Level Silver Plan CSR!CSR Comparison^$0.00!Renewal^Benefit Period | MOP!Type^MOP - Maximum Out of Pocket!Name^MOP!Medical/Rx^All!Network^All!Retail/Mail Order^All!Brand/Generic^All!CSR Indicator^ST - Standard!CSR Comparison^$0.00!Renewal^Benefit Period | MOP2!Type^MOP - Maximum Out of Pocket!Name^MOP2!Medical/Rx^All!Network^All!Retail/Mail Order^All!Brand/Generic^All!CSR Indicator^04 - 73% AV Level Silver Plan CSR!CSR Comparison^$0.00!Renewal^Benefit Period | MPP!Type^MPP - Maximum Paid by Plan!Name^MPP!Medical/Rx^All!Network^All!Retail/Mail Order^All!Brand/Generic^All!CSR Indicator^ST - Standard!CSR Comparison^$0.00!Renewal^Benefit Period | Individual limit^$100.00 | Member paid^$100.00 | Amount to meet^$0.00 | Plan paid^$0.00 | Excluded amount^$0.00 | PLRO^$0.00 | # Claims^1 | Met date^2019-09-08 | Family limit^$120.00 | Family paid^$100.00 | Amount to meet^$20.00 | Plan paid^$0.00 | Excluded amount^$0.00 | # Claims^1 | Met date^ |
  
  
  
  
  
  
  
  
   