package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.*;

public class JavascriptExecutor {

	private static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYANKA\\eclipse-workspace\\TestSelenium\\drivers\\chromedriver.exe");
     	driver = new ChromeDriver();

		// create javascript executor interface
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// launch the site
		driver.get("https://demo.guru99.com/test/newtours/");

		// save the submit button as a web element
		WebElement button = driver.findElement(By.name("submit"));

		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");

		// click on submit button using java script executor
		 js.executeScript("arguments[0].click();", button);

		// display alert message using java script executor
		js.executeScript("alert('Login Successful');");

	}

	private void executeScript(String string) {
		// TODO Auto-generated method stub
		
	}

	private void executeScript(String string, WebElement button) {
		// TODO Auto-generated method stub
		
	}
}