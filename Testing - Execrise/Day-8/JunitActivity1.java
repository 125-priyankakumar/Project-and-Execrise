package com.selenium;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitActivity1 {

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
	void test() {
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://webapps.tekstac.com/InvoiceUpdates/");
		driver.findElement(By.id("name")).sendKeys("Rakesh ");
		driver.findElement(By.id("number")).sendKeys("123");
		driver.findElement(By.id("newUser")).click();
		driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[2]")).click();

		WebElement dropdown = driver.findElement(By.xpath("//tbody//tr//td//select"));
		dropdown.click();

		WebElement dropdown1 = driver.findElement(By.xpath("//option[contains(text(),'Utility Invoice')]"));
		dropdown1.click();

		driver.findElement(By.name("amount")).sendKeys("1000");

		driver.findElement(By.name("num")).sendKeys("9876543210");

		driver.findElement(By.name("comments")).sendKeys("New User Invoice");

		driver.findElement(By.id("submit")).click();

		WebElement txt1 = driver.findElement(By.id("result"));
		String txt2 = txt1.getText();
		System.out.println(txt2);

	}
}
