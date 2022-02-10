package com.selenium;

import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DataDriven {
	private static WebDriver driver;
	
  @Test(dataProvider = "login")

  public void Testcase1(String user, String pwd) {
	  driver.get("https://demo.guru99.com/test/newtours/\n");
	  driver.findElement(By.name("userName")).sendKeys(user);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.name("submit")).submit();
	  System.out.println("Success");
  }

  @DataProvider
  public Object[][] login() {
    return new Object[][] {
      new Object[] { "priya", "priya" },
      new Object[] { "ajay", "ajay" },
      new Object[] {"mena","menaka"},
    };
  }
 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRIYANKA\\eclipse-workspace\\TestSelenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Browser launched successfully");
  }
}
