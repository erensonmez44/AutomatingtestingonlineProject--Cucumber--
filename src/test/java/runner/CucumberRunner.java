package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@AutomatingTestOnline",
        glue = "stepdefs",
        features ="src/test/resources/features/automatingtestonline.feature"

)
public class CucumberRunner {

}