package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\PRAKASH\\eclipse-workspace\\AdactinHotel\\src\\test\\resources\\Features",
		glue = "com.stepdefinition",
		dryRun = false
		)


public class TestRunnerClass {

}
