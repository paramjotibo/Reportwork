package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions
(features="src/test/java/Feature/homepage.feature",glue="Stepdef",tags="@RegTest",
plugin= {"html:target/cucumber-html-report"}
)

public class testrun {

}
