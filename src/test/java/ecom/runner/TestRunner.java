package ecom.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features="src/test/java/ecom/features/TS4U_Ecom_01_buyerLogin.feature",
		glue="ecom/stepDefinitions",
		dryRun=false
	)


public class TestRunner extends AbstractTestNGCucumberTests{

}
