package com.sowkea.riota;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SowkeaAutomation {
	private static WebDriver driver;

	@Test(priority = 1)
	public void Case() throws Exception {
		driver.get(" https://www.sowkea.com/ ");
		driver.manage().window().maximize();
		WebElement text = driver.findElement(By.xpath("//marquee[@id='top_news']"));
		String s = text.getText();
		driver.findElement(By.id("search_svg")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("search")).sendKeys("Water");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='input-group']//div[1]//div[1]//div[1]//a[2]//img[1]")).click();
		driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-plus']")).click();
		driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-plus']")).click();
		driver.findElement(By.className("productlocbutton")).click();
		driver.findElement(By.name("areaname")).click();

//          JavascriptExecutor js = (JavascriptExecutor)driver;
//          js.executeScript("window.scrollBy()0,500");
//          Select  dropdown = new Select(driver.findElement(By.xpath("//b[contains(text(),'PALLIKARANAI HUB - 600061')]")));
//          dropdown.selectByValue("11");
//          
//          driver.findElement(By.xpath("//div[@class='pincode']//ul[@class='dropdown-menu']")).click();
//          driver.findElement(By.xpath("//a[contains(text(),'600064 - PALLIKARANAI HUB')]")).click();
		driver.findElement(By.id("button-cart")).click();
		driver.findElement(By.id("account_svg")).click();
		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.id("//a[contains(text(),'Register')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Priyanka");
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		driver.findElement(By.name("email")).sendKeys("priyakumar007365@gmail.com");
		driver.findElement(By.name("telephone")).sendKeys("9345428650");
		driver.findElement(By.name("password")).sendKeys("Priya@22");
		driver.findElement(By.name("confirm")).sendKeys("Priya@22");
		driver.findElement(By.xpath("//input[contains(@name,'agree')]")).click();
		driver.findElement(By.id("btn-continue")).click();
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\YahooProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@org.testng.annotations.AfterTest
	public void AfterTest() {
		driver.close();
	}

}
