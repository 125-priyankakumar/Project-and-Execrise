package com.selenium;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

class JunitActivity3 {
	
   private static WebDriver driver;
   
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYANKA\\eclipse-workspace\\TestSelenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	//	driver.close();
	}

	@Test
	void test() {
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		String expectedvalue="Priyanka";
		String actualvalue=driver.getTitle();
		Assert.assertEquals(expectedvalue, actualvalue);
	}
	
	@Test
	void test3()  throws Exception{
		driver.navigate().to("https://webapps.tekstac.com/Shopify/");
		driver.findElement(By.id("firstname")).sendKeys("Mithali");
		driver.findElement(By.id("lastname")).sendKeys("Raj");
		driver.findElement(By.id("username")).sendKeys("Mithali Raj");
		driver.findElement(By.id("selectcity")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Chennai')]")).click();
		driver.findElement(By.xpath("//body/form[1]/div[6]/input[2]")).click();
        driver.findElement(By.id("pass")).sendKeys("MR@123");
        driver.findElement(By.id("reg")).click();
	
	}
}
