package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C:\\Users\\kurel\\eclipse-workspace\\EmpireGlobal\\src\\test\\resources\\features",
		glue="stepDefinations",
		plugin= {"pretty","html:target/cucumber.html"},
		tags="@login1"
		)
public class TestRunner {

}
