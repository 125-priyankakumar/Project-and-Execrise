package com.selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;;

public class Testcase2 {
	// driver initialization
		private static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		// set the path of the web driver
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYANKA\\eclipse-workspace\\TestSelenium\\drivers\\chromedriver.exe");
				driver=new ChromeDriver();
				//open the webpage
				driver.get("https://demo.guru99.com/test/newtours/register.php");
				driver.manage().window().maximize();
				Thread.sleep(3000);
				driver.findElement(By.name("firstName")).sendKeys("Priyanka");
				driver.findElement(By.name("lastName")).sendKeys("Kumar");
				driver.findElement(By.name("phone")).sendKeys("9834567456");
				driver.findElement(By.id("userName")).sendKeys("priyanka@gmail.com");
				
				driver.findElement(By.name("address1")).sendKeys("SouthStreet");
				driver.findElement(By.name("city")).sendKeys("Chennai");
				driver.findElement(By.name("state")).sendKeys("TamilNadu");
				driver.findElement(By.name("postalCode")).sendKeys("606105");
				
		
				
				driver.findElement(By.id("email")).sendKeys("priyakumar@gmail.com");
				driver.findElement(By.name("password")).sendKeys("priya123");
				driver.findElement(By.name("confirmPassword")).sendKeys("priya123");
				driver.findElement(By.name("submit")).submit();
				
				
				
	}

}