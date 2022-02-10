package com.testing;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:login/login.feature",glue="com.testing",plugin={"json:target/test.report"})



public class TestRunner {
	

}
