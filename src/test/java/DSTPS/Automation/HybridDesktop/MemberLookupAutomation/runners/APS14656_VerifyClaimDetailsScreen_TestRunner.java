package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.runners; 

import cucumber.api.CucumberOptions; 
import cucumber.api.testng.AbstractTestNGCucumberTests; 
 
@CucumberOptions( 
                features = {"classpath:features/MemberLookup/APS14656_VerifyClaimDetailsScreen.feature" }, 
                        tags = {"@Functional"}, 
                        glue= {"classpath:DSTPS.Automation.HybridDesktop.MemberLookupAutomation.stepDefinitions", 
                                        "classpath:DSTPS.Automation.HybridDesktop.Apps.common", 
                                        "classpath:DSTPS.Automation.HybridDesktop.MemberLookupApp.common", 
                                        "classpath:DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages", 
                                        "classpath:DSTPS.Automation.HybridDesktop.MemberLookupAutomation.runners", 
                                        "classpath:DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps"}, 
                        plugin =  {"pretty","html:target/html", "json:APS14656_VerifyClaimDetailsScreen.feature.json", "rerun:src/test/resources/rerun.txt"},

                        strict=true 
) 

public class APS14656_VerifyClaimDetailsScreen_TestRunner extends AbstractTestNGCucumberTests 
{ 
        
}