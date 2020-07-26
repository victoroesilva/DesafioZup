package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/features/Americanas.feature"
		,glue = "stepDefinition"
		,plugin = {"pretty", "junit:output/cucumber-junit-report.xml", "html:output/cucumber-html-report","json:output/cucumber-json-report.json" }
		,monochrome = true
		,snippets = SnippetType.CAMELCASE
		,dryRun = false
		)

public class TestRunner {
	
}
