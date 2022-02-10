package com.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TestngActivity1 {

	private static WebDriver driver;

	@Test
	public void test() throws Exception {

		driver.get("https://webapps.tekstac.com/Agent_Registration/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);

		driver.findElement(By.name("firstname")).sendKeys("John");
		driver.findElement(By.name("lastname")).sendKeys("Smith");
		driver.findElement(By.name("username")).sendKeys("Johnsmith");

		driver.findElement(By.name("password")).sendKeys("pass123");
		driver.findElement(By.name("phonenumber")).sendKeys("9876543210");
		driver.findElement(By.name("email")).sendKeys("smith123");
		driver.findElement(By.id("submit")).click();

		String expmsg = "Enter a valid email id";
		WebElement actlmsg = driver.findElement(By.id("message"));
		String amsg = actlmsg.getText();
		System.out.println(amsg);
		Assert.assertNotEquals(amsg, expmsg);
		// driver.switchTo()
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Launch the browser");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYANKA\\eclipse-workspace\\TestSelenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		//driver.close();
	}

}