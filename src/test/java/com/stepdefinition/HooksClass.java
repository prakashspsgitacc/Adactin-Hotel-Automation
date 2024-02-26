package com.stepdefinition;

import org.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
	
	
	@Before
	public void beforeScenario() {
		launchBrowser();
		enterApplnUrl("https://adactinhotelapp.com/");
		maximizeWindow();
		implicitWait();
		
		

	}
	
	@After
	public void afterScenario() {
		quitBrowser();
		

}
}
