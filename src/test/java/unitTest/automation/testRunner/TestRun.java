package unitTest.automation.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = ".//Features//",
                glue = {"unitTest.automation.stepDefinitions"}
                //dryRun = true
                //plugin = {"pretty","html:test-output"}
        )
public class TestRun {
}
