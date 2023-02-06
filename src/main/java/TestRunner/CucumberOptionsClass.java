package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "classpath:FeatureFile", glue = "StepDefination")
public class CucumberOptionsClass extends AbstractTestNGCucumberTests{

}
