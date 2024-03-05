package FinalProject.TestRunner;

import FinalProject.Pages.Hooks;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/FinalProject/Resource/Features", glue = {"FinalProject.StepDefinitions"}, tags = "@Important",
        plugin = {"pretty", "html:target/CucumberReports/report.html"},
        monochrome = true)

public class TestRunner extends Hooks {

}
