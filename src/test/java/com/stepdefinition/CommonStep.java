package com.stepdefinition;

import org.baseclass.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.manager.PageObjectManager;

import io.cucumber.java.en.Then;

public class CommonStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@Then("User should verify after login success message {string}")
	public void user_should_verify_after_login_success_message(String expLoginSuccessMsg) {
		WebElement element = pom.getSearchHotelpage().getTxtLoginSuccessMsg();
		String actLoginSuccessMsg = elementGetAttribute(element);
		Assert.assertEquals("Verify after login success message", expLoginSuccessMsg, actLoginSuccessMsg);

	}

}
