package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumberReports.html",
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@test",
        dryRun = false
)
public class CukesRunner {

}
