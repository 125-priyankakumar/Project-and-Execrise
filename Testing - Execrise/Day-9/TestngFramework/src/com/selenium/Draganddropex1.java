package com.selenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddropex1 {

	WebDriver driver;

	@Test
	public void DragnDrop() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PRIYANKA\\eclipse-workspace\\TestSelenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");

		
		WebElement From = driver.findElement(By.xpath("//*[@id='credit2']/a"));
		WebElement To = driver.findElement(By.xpath("//*[@id='bank']/li"));
		
	//	WebElement From1 = driver.findElement(By.xpath("//*[@id='credit']/a"));
	//	WebElement To1 = driver.findElement(By.xpath("//li[contains(text(),'5000')]"));

		Actions act = new Actions(driver);
        act.dragAndDrop(From, To).build().perform();
    //    act.dragAndDrop(From1, To1).build().perform();
        
	}
}