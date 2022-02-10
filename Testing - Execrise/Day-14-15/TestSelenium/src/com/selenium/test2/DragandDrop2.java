package com.selenium.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYANKA\\eclipse-workspace\\TestSelenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement s1 = driver.findElement(By.id("credit2"));
		WebElement d1 = driver.findElement(By.id("Bank"));
		
		WebElement s2 = driver.findElement(By.id("credit"));
		WebElement d2 = driver.findElement(By.id("amt7"));
		
		WebElement s3 = driver.findElement(By.id("credit1"));
		WebElement d3 = driver.findElement(By.id("loan"));
		
		WebElement s4 = driver.findElement(By.id("credit0"));
		WebElement d4 = driver.findElement(By.id("amt8"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(s1, d1).perform();
		actions.dragAndDrop(s2, d2).perform();
		actions.dragAndDrop(s3, d3).perform();
		actions.dragAndDrop(s4, d4).perform();
	
	}
}
