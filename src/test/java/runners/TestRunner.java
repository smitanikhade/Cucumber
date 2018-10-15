package runners;


import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="classpath:functionalTests",
		glue= {"stepDefinitions"},
		//plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		monochrome=true,
				strict=true,
				dryRun=false
		)
public class TestRunner {
	

}
