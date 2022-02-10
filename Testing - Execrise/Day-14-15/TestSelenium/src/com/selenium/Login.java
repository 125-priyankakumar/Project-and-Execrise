package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	private static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYANKA\\eclipse-workspace\\TestSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		// driver.manage().window().minimize();
		// login
		//implicit wait 
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//Explict wait
//		WebDriverWait w = new WebDriverWait(driver,10);
//		w.until(Ex)
		
		Thread.sleep(1000);		
		WebElement txt1 = driver.findElement(By.name("userName"));
		txt1.sendKeys("admin");
		WebElement txt2 = driver.findElement(By.name("password"));
		txt2.sendKeys("admin");
		WebElement btnclick = driver.findElement(By.name("submit"));
		btnclick.click();
		
		//Explict wait
		WebDriverWait w = new WebDriverWait(driver,10);
		w.until(ExpectedConditions.elementToBeClickable(By.name("submit")));		

		// Flight click
		WebElement click1 = driver.findElement(By.xpath("//a[contains(text(),'Flights')]"));
		click1.click();

		// radio button
		WebElement radiobtn = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/b[1]/font[1]/input[2]"));
		radiobtn.click();

		WebElement passcount1 = driver.findElement(By.name("passCount"));

		// for selecting the dropdown value
		Select dropdown = new Select(passcount1);
		dropdown.selectByValue("2");

		WebElement Port = driver.findElement(By.name("fromPort"));
		Select dropdown1 = new Select(Port);
		dropdown1.selectByIndex(3);

		WebElement down = driver.findElement(By.name("fromMonth"));
		Select dropdown2 = new Select(down);
		dropdown2.selectByVisibleText("February");

		WebElement down1 = driver.findElement(By.name("fromDay"));
		Select dropdown3 = new Select(down1);
		dropdown3.selectByVisibleText("22");

		WebElement port1 = driver.findElement(By.name("toPort"));
		Select dropdown4 = new Select(port1);
		dropdown4.selectByValue("");

		WebElement down2 = driver.findElement(By.name("toMonth"));
        Select dropdown5 = new Select(Port);
		dropdown5.selectByIndex(8);

		WebElement down3 = driver.findElement(By.name("toDay"));
        Select dropdown6 = new Select(down3);
		dropdown6.selectByIndex(3);
	}

}