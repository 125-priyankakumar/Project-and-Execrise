package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Script {

	private static WebDriver driver;

	@Test
	public void test() throws Exception {

		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.name("userName")).sendKeys("priya");
//		System.out.println("Username :");
//       Scanner scan1 = new Scanner(System.in);
//       String input1 = scan1.nextLine();
//        System.out.println(input1);

		driver.findElement(By.name("password")).sendKeys("priya");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);

//
//		String expmsg = "Enter a valid email id";
//		WebElement actlmsg = driver.findElement(By.id("message"));
//		String amsg = actlmsg.getText();
//		System.out.println(amsg);
//		Assert.assertEquals(amsg, expmsg);
//	
	}

	@BeforeTest
	public void beforeTest() {
		// Set the key and path using a location of driver and Configure the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYANKA\\eclipse-workspace\\TestSelenium\\drivers\\chromedriver.exe");
		// Instantiate for webdriver
		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() 
	{
//   driver.close();
	}
}