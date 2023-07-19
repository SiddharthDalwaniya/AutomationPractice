package CucumberStepsAndRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/CucumberFeatures/Login.feature", glue = "CucumberStepsAndRunners", 
plugin= {"pretty","html:target/TargetHTML/targetHTML.html"
		,"json:target/JSONReport/report.json"}, monochrome=true)

public class LoginTestRunner {

}
