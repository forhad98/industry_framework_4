package testrunner_package_2;

import cucumber.api.CucumberOptions;
import utility_package_2.Baseclass1;

@CucumberOptions(features = {"src/test/resources/redfolder"},
plugin = {"json:target/cucumber.json"},
glue = "stepdefination_package_2")//tags = {"@Sanity"})

public class testrunner_class extends Baseclass1 {

}
