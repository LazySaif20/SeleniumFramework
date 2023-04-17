package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features",
		glue = {"StepDefs", "Hooks", "Pages_ObjectsAndActions", "Utils"},
		plugin = {"html:target/cucumber-report/cucumberHTMLReport.html", 
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

public class RunnerFile extends AbstractTestNGCucumberTests{

}
