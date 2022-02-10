package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown
  {
	private static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYANKA\\eclipse-workspace\\TestSelenium\\drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Index.html");
	driver.manage().window().maximize();
	
	WebElement signin = driver.findElement(By.xpath("//button[@id='btn2']"));
	signin.click();
	
	WebElement text1 = driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]"));
	text1.sendKeys("Priyanka");
	
	WebElement text2 = driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]"));
	text2.sendKeys("Kumar");

	WebElement text3 = driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]"));
	text3.sendKeys("271/2 SouthStreet Murugankudi");
	
	WebElement text5 = driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]"));
    text5.sendKeys("priyakumar@gmail.com");
    

	WebElement text6 = driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]"));
    text6.sendKeys("9345428651");
    
    WebElement radiobtn = driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[2]/input[1]"));
    radiobtn.click();
    
    WebElement checkbox = driver.findElement(By.id("checkbox2"));
    checkbox.click();
   
   
    WebElement text7 = driver.findElement(By.id("msdd"));
    text7.click();
   
    Thread.sleep(3000);
    WebElement text8 = driver.findElement(By.xpath("//a[contains(text(),'English')]"));
    text8.click();
    
    WebElement text9 = driver.findElement(By.id("Skills"));
    Select s = new Select(text9);
    s.selectByIndex(17);
    
    WebElement text11 = driver.findElement(By.className("select2-selection__arrow"));
    text11.click();
    
    Thread.sleep(2000);
    WebElement txt1 = driver.findElement(By.xpath("//li[contains(text(),'India')]"));
    txt1.click();
    
    WebElement radiobtn3 = driver.findElement(By.id("yearbox"));
    Select s1 = new Select(radiobtn3);
    s1.selectByVisibleText("2000");
    
    WebElement radiobtn4 = driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[11]/div[2]/select[1]"));
    Select s2 = new Select(radiobtn4);
    s2.selectByIndex(2);
    
    WebElement radiobtn5 = driver.findElement(By.id("daybox"));
    Select s3 = new Select(radiobtn5);
    s3.selectByVisibleText("22");
	
    WebElement passwrd = driver.findElement(By.id("firstpassword"));
    passwrd.sendKeys("Priya@22");
    
    WebElement passwrd1 = driver.findElement(By.id("secondpassword"));
    passwrd1.sendKeys("Priya@22");
    
    String url = driver.getCurrentUrl();
    System.out.println(url);
    
    String title = driver.getTitle();
    System.out.println(title);
    
    WebElement submit = driver.findElement(By.id("submitbtn"));
    submit.click();
    
   // driver.quit();
    
	}
}