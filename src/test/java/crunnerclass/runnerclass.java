package crunnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\cfeature\\",glue="cStepDefinition" , plugin= {"pretty","html:Reports","junit:Reports/cucumber.xml","json:Reports/cucumber.json"})
public class runnerclass {

}
