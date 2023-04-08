
package cucumberOption;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(

		features="src/test/java/features",
		glue="stepDefinations",
		junit = "--step-notifications",
		monochrome=true,
		//tags= {"@DeletePlace"}
		plugin= "html:target/jsonReport/cucumber-report.html"
		
		
		)
public class TestRunner {

}

