package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OnlineWebsite {

	private static WebDriver driver;

	@Test
	public void Case1() throws Exception {
		driver.get("https://www.ebay.com/");
		// driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.findElement(By.id("gh-ac")).sendKeys("Apple watches");
	

		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		Thread.sleep(1000);
		Select selectCategory = new Select(dropdown);
		selectCategory.selectByVisibleText("Consumer Electronics");
		Thread.sleep(1000);
        driver.findElement(By.id("gh-btn")).click();
        

		String result = driver.findElement(By.className("srp-refine__category__list")).getText();
		System.out.println("Result :: " + result);
       
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYANKA\\eclipse-workspace\\TestSelenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
//	driver.close();
	}

}
