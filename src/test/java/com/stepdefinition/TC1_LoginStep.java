package com.stepdefinition;

import org.baseclass.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.manager.PageObjectManager;

import io.cucumber.java.en.*;


public class TC1_LoginStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

@Given("User should be in the AdactinHotel login page")
public void user_should_be_in_the_adactin_hotel_login_page() {
    
}


@When("User should perform login {string},{string}")
public void user_should_perform_login(String username, String password) {
	
	pom.getLoginpage().login(username, password);
  
}





@Then("User should verify after login invalid credential error message contains {string}")
public void user_should_verify_after_login_invalid_credential_error_message_contains(String expLoginErrorMessage) {
   
	WebElement element = pom.getLoginpage().getTxtLoginErrorMsg();
	String actualLoginErrorMessage = elementGetText(element);
	boolean bl = actualLoginErrorMessage.contains(expLoginErrorMessage);
//	System.out.println(expLoginErrorMessage);
//	System.out.println(actualLoginErrorMessage);
//	
	Assert.assertTrue("Verify after login with invalid credential error message contains",bl);
	
}
}
