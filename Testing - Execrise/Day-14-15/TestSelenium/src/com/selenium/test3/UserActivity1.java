package com.selenium.test3;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.Assert;


class UserActivity1 {

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
		driver.findElement(By.xpath("//input[@id='reg_email']")).sendKeys("priyakumar1091@gmail.com");
		driver.findElement(By.xpath("//input[@id='reg_password']")).sendKeys("Priyanka@22");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-36']/div[1]/div[1]/div[1]/div[2]/form[1]/p[3]/input[3]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Account Details')]")).click();
		driver.findElement(By.xpath("//input[@id='account_first_name']")).sendKeys("Priyanka");
		driver.findElement(By.xpath("//input[@id='account_last_name']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@id='password_current']")).sendKeys("Priyanka@22");
		driver.findElement(By.xpath("//input[@id='password_1']")).sendKeys("Priyaka@123");
		driver.findElement(By.xpath("//input[@id='password_2']")).sendKeys("Priyaka@123");
		driver.findElement(By.name("save_account_details")).click();	
		//driver.findElement(By.className("woocommerce-message")).getText();
		//WebElement txt1 = driver.findElement(By.className("woocommerce-message"));
		//String txt2 = txt1.getText();
		//System.out.println(txt2);
		
		String expmsg = "Account details changed successfully.";
		WebElement actlmsg = driver.findElement(By.className("woocommerce-message"));
		String amsg = actlmsg.getText();
		System.out.println(amsg);
		Assert.assertEquals(amsg, expmsg);
		
	
	}
}
