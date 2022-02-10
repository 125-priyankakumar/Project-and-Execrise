package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinationselenium {
	private WebDriver driver;
	
	
	@BeforeClass
	@Given("^I am on login page$")
	public void i_am_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get("http://www.newtours.demoaut.com");

		System.out.println("i am on login page");
	    
	}
    @Test
    
	@When("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void i_enter_username_as_and_password_as() throws Throwable {
    	driver.findElement(By.name("userName")).sendKeys("robert");
    	driver.findElement(By.name("password")).sendKeys("robert");
    			System.out.println("Enter username and password");

	   
	}
   @Test
   
	@When("^I click on submit$")
	public void i_click_on_submit() throws Throwable {
		driver.findElement(By.name("login")).click();
	   System.out.println("click on submit");
		

	   
	}
  @AfterClass

	@Then("^I will see the user home page$")
	public void i_will_see_the_user_home_page() throws Throwable {
		System.out.println("user view the home screen");
       driver.close();
	    
	}

}
