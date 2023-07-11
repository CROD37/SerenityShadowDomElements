package starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"json:target/cucumber-report.json", "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@Test4",
        monochrome = true
)
public class CucumberTestSuite {
}
