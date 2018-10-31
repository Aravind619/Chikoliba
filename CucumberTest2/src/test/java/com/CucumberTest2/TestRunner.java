package com.CucumberTest2;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features={"Features"},
		glue= {"Facebook"}
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
