package com.selenium.test2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert1 {
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\PRIYANKA\\eclipse-workspace\\TestSelenium\\drivers\\geckodriver.exe");
		Thread.sleep(1000);
		driver = new FirefoxDriver();
		Thread.sleep(1000);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
	    Alert a = driver.switchTo().alert();
	    a.sendKeys("Priyanka");
	    a.accept();
	    
	    driver.findElement(By.xpath("//p[@id='demo1']")).getText();
	}

}
