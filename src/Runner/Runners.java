package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/features/loginn.feature",
		glue="stepdefination", stepNotifications = true, 
		plugin = {"pretty", "html:target/cucumber.html",
		"json:target/cucumber.json","junit:target/cucumber.xml"}
		,monochrome = false)
		

public class Runners {
	
}
