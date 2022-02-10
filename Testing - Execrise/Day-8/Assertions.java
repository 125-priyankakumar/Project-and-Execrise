package com.selenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertions {

	private static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYANKA\\eclipse-workspace\\TestSelenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// open the page
		driver.get("http://www.google.com");

		String expectedtitle = "Google";
		String actualtitle = driver.getTitle();

		// assert equals
	Assert.assertEquals(expectedtitle, actualtitle);

		
//		// assert true
	WebElement element = driver.findElement(By.name("q"));
	Assert.assertTrue(element.isDisplayed());
	Assert.assertTrue(element.isEnabled());
//	Assert.assertTrue(element.isSelected());
//		
// assertnotequals
//		Assert.assertNotEquals(expectedtitle, actualtitle);
//
//		// assert true
//		WebElement element1 = driver.findElement(By.name("q"));
//		Assert.assertTrue(element1.isDisplayed());
//		Assert.assertTrue(element1.isEnabled());
//		Assert.assertTrue(element1.isSelected());

	}
}
