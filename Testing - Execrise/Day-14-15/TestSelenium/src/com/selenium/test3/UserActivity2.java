package com.selenium.test3;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

class UserActivity2 {
	private static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRIYANKA\\eclipse-workspace\\TestSelenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		Thread.sleep(2000);
		// driver.close();
	}

	@Test
	void test() throws Exception {
		driver.get("http://practice.automationtesting.in");
		//driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("priya123gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Priyaka@122");
		driver.findElement(By.name("login")).click();
	//	WebElement txt1 = driver.findElement(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-36']/div[1]/div[1]/ul[1]/li[1]"));
	//	String txt2 = txt1.getText();
	//	System.out.println(txt2);
		
		String expmsg = "Account details ";
		WebElement actlmsg = driver.findElement(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-36']/div[1]/div[1]/ul[1]/li[1]"));
		String amsg = actlmsg.getText();
		System.out.println(amsg);
		Assert.assertEquals(amsg, expmsg);
		

	}

}
