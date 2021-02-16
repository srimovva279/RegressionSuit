package org.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\List.feature", glue ="C:\\Users\\Admin\\eclipse-workspace\\Srikanth\\CucumberProject\\src\\test\\resources\\Features\\List.feature")
public class TestRunnerClass {
	

}
