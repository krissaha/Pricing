package TestNG_test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class practice_test 
{
	WebDriver driver; 
	String hiddenCaptchaVal = "";
	
	@BeforeMethod 
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		// Open Appdev web site
		driver.get("http://appdev.nvisionglobal.com");
		driver.manage().window().maximize();
		// Input Email id	
		driver.findElement(By.id("Email")).sendKeys("dibyendud@tranistics.com");
		// Input password
		driver.findElement(By.id("Password")).sendKeys("pass123");
		// Input Captcha
		hiddenCaptchaVal = driver.findElement(By.id("HiddenCaptcha")).getAttribute("value");
		driver.findElement(By.id("Captcha")).sendKeys(hiddenCaptchaVal);
		// 	Click Login Button
		driver.findElement(By.id("btnLogin")).click();
/*---------------------------------------------------------------------------------------------------------------*/				
		// For selecting data from Drop-down
		Select oS = new Select(driver.findElement(By.id("SelectedCompanyId")));
		oS.selectByValue("5692");
		// Click on Submit button 		
		driver.findElement(By.className("newsc")).click();
		// Click on Pricing menu in Dashboard Page 		
		driver.findElement(By.xpath("//span[contains(text(),'Pricing')]")).click();
		// Click on Pricing Search Page 		
        driver.findElement(By.xpath("//span[contains(text(),'Pricing Search')]")).click();
	}
	
	@Test(priority=2,groups ="Search")
	public void searchpricingtest() throws InterruptedException 
	{
		// Click on the search button 
		driver.findElement(By.id("msubmit")).click();
		Thread.sleep(5000);
		
		// Scroll down the page to find the element  
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement Element = driver.findElement(By.xpath("//span[contains(text(),'items per page')]"));
		js.executeScript("arguments[0].scrollIntoView();",Element);
		
		// Click to navigate last pricing details
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='k-icon k-i-seek-e']")).click();
		Assert.assertTrue(true);
	}
	
	@Test(priority=1,enabled = false)
	public void pricingkey_search() throws InterruptedException
	{
		// Click to Search with specific pricing key   
        driver.findElement(By.id("SPricingKey")).sendKeys("1661");
        driver.findElement(By.id("msubmit")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("btnpricingReset")).click();
		driver.findElement(By.id("msubmit")).click();
		Thread.sleep(5000);
	}
	
	@AfterMethod 
	public void teardown()
	{
		driver.close();
	}

}
