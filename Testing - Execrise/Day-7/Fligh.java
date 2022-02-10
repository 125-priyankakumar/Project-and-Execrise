package com.selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Fligh {

	private static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/nadarrobert/Downloads/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		
		// identify the dropdown and save as a web element
		WebElement citydropdown = driver.findElement(By.name("fromPort"));
		Select dropdown = new Select(citydropdown);
		
		
		// select the city from the dropdown
		//dropdown.selectByIndex(4);
		
		
		dropdown.selectByValue("Frankfurt");
		
		//dropdown.selectByVisibleText(text);
		
		
		
		
	}

}