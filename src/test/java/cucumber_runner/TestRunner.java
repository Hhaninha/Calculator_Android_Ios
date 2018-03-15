package cucumber_runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/html/" }, features = {"resources/features" },
		glue = {"steps_definition"})

public class TestRunner {

	
	

	}


