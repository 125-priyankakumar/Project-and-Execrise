package com.selenium.test2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Activity2 {
	private static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYANKA\\eclipse-workspace\\TestSelenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		// driver .close();
	}

	@Test
	void test() throws Exception {
		driver.get("http://google.com");
		// maximize the window
		driver.manage().window().maximize();
		// navigate to facebook
		driver.navigate().to("http://www.fb.com");
		driver.manage().deleteAllCookies();

		// page title
		String pgtl = driver.getTitle();
		System.out.println("the page title is :" + pgtl);

		// verify current url and expected url
		String expurl = "https://www.facebook.com/";
		String acurl = driver.getCurrentUrl();
		System.out.println("Actual url is :" + acurl);

		System.out.println("expected  url is :" + expurl);

		if (acurl.toLowerCase().contains(expurl)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail ");
		}
		System.out.println("--------------------------------------");
		// Verify that there is a “Create an account” section on the page.
         WebElement element=driver.findElement(By.xpath(""));
         Assert.assertTrue(element.isEnabled());

		// Fill in the text boxes: First Name, Surname, Mobile Number or email address,
		// “Re-enter mobile number”
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]")).click();
		
		Thread.sleep(3000);
		// enter first name
		
		driver.findElement(By.name("firstname")).sendKeys("ankit");
				// lastname
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"))
				.sendKeys("agarwal");
		// email or number
		driver.findElement(By.name("reg_email__")).sendKeys("9178559324");

		// password
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]"))
				.sendKeys("Bijuaju@123");

		// Update the date of birth in the drop-down.
		// identify the date

		WebElement date = driver.findElement(By.name("birthday_day"));
		Select dt = new Select(date);
		// select the index from the dropdown
		dt.selectByIndex(19);

		// identify the month
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select mnth = new Select(month);
		// select the index from the dropdown
		mnth.selectByIndex(0);

		// identify the year
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select yr = new Select(year);
		// select the index from the dropdown
		yr.selectByIndex(18);

		// Select gender.
		WebElement gender = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		System.out.println(gender.isSelected());
		gender.click();

		// Click on “Create an account”.
		// driver.findElement(By.xpath("//button[@id='u_4_s_Ya']")).click();
		// Verify that the account is created successfully.
	}

}
