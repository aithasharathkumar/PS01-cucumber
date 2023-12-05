package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",
       glue= {"stepdefinitions"},
    		   plugin = {"pretty",
		  "html:target/TestreportToday.html"})
public class TestRunner {
	

}
