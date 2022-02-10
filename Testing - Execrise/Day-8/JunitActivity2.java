package com.selenium;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitActivity2 {
	
   private static WebDriver driver;
   
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYANKA\\eclipse-workspace\\TestSelenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	//	driver.close();
	}

	@Test
	void test() {
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://webapps.tekstac.com/Shopify/");
		driver.findElement(By.id("firstname")).sendKeys("Rahul");
		driver.findElement(By.id("lastname")).sendKeys("Dravid");
		driver.findElement(By.id("username")).sendKeys("Rahul Dravid");
		driver.findElement(By.id("selectcity")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Chennai')]")).click();
		driver.findElement(By.xpath("//body/form[1]/div[6]/input[2]")).click();
        driver.findElement(By.id("pass")).sendKeys("Rahul@123");
        driver.findElement(By.id("reg")).click();
        WebElement txt1 = driver.findElement(By.id("ttab"));
		String txt2 = txt1.getText();
		System.out.println(txt2);
	
	}
}
