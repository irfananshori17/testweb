package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefs", "hooks"},
        plugin = {
                "pretty",
                "html:build/cucumber-reports/cucumber.html",
                "json:build/cucumber-reports/cucumber.json",
                "junit:build/cucumber-reports/cucumber.xml"
        }
)
public class TestRunner {
}