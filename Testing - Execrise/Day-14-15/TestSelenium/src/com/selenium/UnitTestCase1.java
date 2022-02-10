package com.selenium;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

class UnitTestCase1 {
	
   private static WebDriver driver;
   
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYANKA\\eclipse-workspace\\TestSelenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.close();
	}

	@Test
	void test() {
		driver.get("http://www.google.com");
		String expectedvalue="Google";
		String actualvalue=driver.getTitle();
		Assert.assertEquals(expectedvalue, actualvalue);
		driver.findElement(By.name("q")).sendKeys("Selenium");		
	}
}
