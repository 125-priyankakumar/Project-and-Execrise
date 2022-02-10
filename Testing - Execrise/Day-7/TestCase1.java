package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
	
   private static WebDriver driver;
   
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYANKA\\eclipse-workspace\\TestSelenium\\drivers\\chromedriver.exe");
       driver = new ChromeDriver();
       
       driver.get("http://www.google.com");
       
       driver.findElement(By.name("q")).sendKeys("Selenium");
       driver.findElement(By.name("btnK")).submit();
       
       driver.close();
       }
	
}
