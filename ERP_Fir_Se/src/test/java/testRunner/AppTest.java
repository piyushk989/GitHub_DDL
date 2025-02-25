package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(dryRun=false,
			features= {"FeatureFiles"},
			tags= ("@Suppliers"),
			monochrome = true,
			glue = {"stepDefinition"}
		       )
public class AppTest extends AbstractTestNGCucumberTests  {

}
