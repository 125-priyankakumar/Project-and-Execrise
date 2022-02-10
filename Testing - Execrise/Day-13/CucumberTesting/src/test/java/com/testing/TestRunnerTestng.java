package com.testing;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features="classpath:login/login.feature",glue="com.testing")


public class TestRunnerTestng extends AbstractTestNGCucumberTests {

}
