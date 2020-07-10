package APITesting.RestAssuredSample;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java", glue = "stepDefinations")
public class AppTest {
//    
}