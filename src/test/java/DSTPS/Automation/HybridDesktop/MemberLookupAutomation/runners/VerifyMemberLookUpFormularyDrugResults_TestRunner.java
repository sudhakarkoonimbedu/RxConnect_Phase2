package DSTPS.Automation.HybridDesktop.MemberLookupAutomation.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//@RunWith(CucumberRunner.class)
@CucumberOptions(
		features = {"classpath:features/MemberLookup/MemberLookup_Formulary_Verify_DrugResults.feature" }, 
			tags = {"@Functional"}, 
			glue= {"classpath:DSTPS.Automation.HybridDesktop.MemberLookupAutomation.stepDefinitions",
					"classpath:DSTPS.Automation.HybridDesktop.Apps.common",
					"classpath:DSTPS.Automation.HybridDesktop.MemberLookupApp.common",
					"classpath:DSTPS.Automation.HybridDesktop.MemberLookupAutomation.pages",
					"classpath:DSTPS.Automation.HybridDesktop.MemberLookupAutomation.runners",
					"classpath:DSTPS.Automation.HybridDesktop.MemberLookupAutomation.steps"},
			plugin =  {"pretty","html:target/html", "json:memberlookup_formulary_verify_drugresults.json", "rerun:src/test/resources/rerun.txt"},
			strict=true
)

public class VerifyMemberLookUpFormularyDrugResults_TestRunner extends AbstractTestNGCucumberTests {
	
}
