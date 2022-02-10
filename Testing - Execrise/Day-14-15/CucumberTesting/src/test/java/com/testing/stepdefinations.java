package com.testing;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinations {
	
	
	@Given("^I am on login page$")
	public void i_am_on_login_page() throws Throwable {
		System.out.println("i am on login page");
	    
	}

	@When("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void i_enter_username_as_and_password_as(String arg1, String arg2) throws Throwable {
		System.out.println("Enter username and password");

	   
	}

	@When("^I click on submit$")
	public void i_click_on_submit() throws Throwable {
		System.out.println("click on submit");

	   
	}

	@Then("^I will see the user home page$")
	public void i_will_see_the_user_home_page() throws Throwable {
		System.out.println("user view the home screen");

	    
	}

}
