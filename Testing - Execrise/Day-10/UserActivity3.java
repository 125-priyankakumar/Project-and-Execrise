package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UserActivity3 {
	
	private static WebDriver driver;
  @Test
  public void Case1() throws Exception {
	  driver.get("http://practice.automationtesting.in");
		//driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("priya123gmail.com");
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Priyaka@122");
		driver.findElement(By.name("login")).click();

		String expmsg = "Password is required.";
		WebElement actlmsg = driver.findElement(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-36']/div[1]/div[1]/ul[1]/li[1]"));
		String amsg = actlmsg.getText();
		System.out.println(amsg);
		Assert.assertEquals(amsg, expmsg);
		
	}
  
  @BeforeTest
	public void beforeTest() {
		System.out.println("Browser Successfully Launched");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYANKA\\eclipse-workspace\\TestSelenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
	driver.close();
	}
}
