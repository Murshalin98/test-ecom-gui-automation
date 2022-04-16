package ecom.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="src/test/java/ecom/features",
		glue="ecom/stepDefinitions",
		dryRun=false,
		tags= "@Admin"
		
		)


public class TestRunner extends AbstractTestNGCucumberTests{

}
