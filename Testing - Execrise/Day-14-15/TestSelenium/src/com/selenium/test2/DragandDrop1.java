package com.selenium.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop1 {
	
		private static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYANKA\\eclipse-workspace\\TestSelenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Static.html");
		//driver.manage().window().maximize();
		
		Thread.sleep(1000);
		WebElement s1= driver.findElement(By.xpath(" //img[@id='angular']"));
		Thread.sleep(1000);
		WebElement d1= driver.findElement(By.xpath("//div[@id='droparea']"));
	
		Actions actions = new Actions(driver);
		actions.dragAndDrop(s1,d1).build().perform();

}
	}
