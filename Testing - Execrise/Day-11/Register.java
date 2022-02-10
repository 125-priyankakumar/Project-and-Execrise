package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Register {

	private static WebDriver driver;

	@Test(priority = 2)
	public void Case1() throws Exception {
		driver.get("https://demoqa.com/forms");
		// driver.manage().window().maximize();
			
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Practice Form')]")).click();
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Practice Form')]")));
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Priyanka");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("priyakumar07@gmail.com");
		WebElement radiobtn = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		radiobtn.click();

		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9345428769");
//		driver.findElement(By.id("submit")).click();
//		WebDriverWait w = new WebDriverWait(driver, 30);
//		w.until(ExpectedConditions.elementToBeClickable(By.id("submit")));

//		String expmsg = "Password is required.";
//		WebElement actlmsg = driver.findElement(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-36']/div[1]/div[1]/ul[1]/li[1]"));
//		String amsg = actlmsg.getText();
//		System.out.println(amsg);
//		Assert.assertEquals(amsg, expmsg);
//		
	}

	@Test(priority = 1)
	public void Case2() throws Exception {
		driver.get("https://google.com/");
		// driver.manage().window().maximize();
		Thread.sleep(4000);
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Browser Successfully Launched");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRIYANKA\\eclipse-workspace\\TestSelenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		// driver.close();
	}
}
