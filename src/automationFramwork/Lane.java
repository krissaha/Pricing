package automationFramwork;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lane {

	public static void main(String[] args) throws InterruptedException
	
	{
		String hiddenCaptchaVal = "";
	  //System.setProperty("webdriver.gecko.driver", "E:\\\\Selenium\\geckodriver.exe");
    // Create a new instance of the FireFox driver		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
    // Open Appdev web site
		//String appUrl = "http://appdev.nvisionglobal.com";
		driver.get("http://appdev.nvisionglobal.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
/*---------------------------------------------------------------------------------------------------------------*/ 		
    // Input Email id	
		driver.findElement(By.id("Email")).sendKeys("dibyendud@tranistics.com");
    // Input password
		driver.findElement(By.id("Password")).sendKeys("pass123");
    // Input Captcha
		hiddenCaptchaVal = driver.findElement(By.id("HiddenCaptcha")).getAttribute("value");
		driver.findElement(By.id("Captcha")).sendKeys(hiddenCaptchaVal);
    // Click Login Button
		driver.findElement(By.id("btnLogin")).click();
/*---------------------------------------------------------------------------------------------------------------*/				
    // For selecting data from Drop-down
		Select oS = new Select(driver.findElement(By.id("SelectedCompanyId")));
		oS.selectByValue("5692");
    // Click on Submit button 		
		driver.findElement(By.className("newsc")).click();
    // Click on Pricing menu in Dashboard Page 		
		driver.findElement(By.xpath("//span[contains(text(),'Pricing')]")).click();
		Thread.sleep(5000);
    // Click on Pricing Search Page 		
        driver.findElement(By.xpath("//span[contains(text(),'Lane')]")).click();
/*---------------------------------------------------------------------------------------------------------------*/	

       // driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
        Thread.sleep(5000);
    // Selecting ORIGIN Country 
		 driver.findElement(By.xpath("//span[contains(text(),'--Select--')]")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id='o_Country_listbox']/child::li[2]")).click(); // Country Select UNITED STATES 
   
	// Selecting DESTINATION Country	 
		 driver.findElement(By.xpath("//span[contains(text(),'--Select--')]")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id='d_Country_listbox']/child::li[2]")).click();
		 
		 
		 driver.findElement(By.id("msubmit")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.id("btnlaneReset")).click();
		 driver.findElement(By.id("LaneCode")).sendKeys("30301 to 75201");
		 driver.findElement(By.id("msubmit")).click();
		 
	// Clicking the search element 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//td[@role='gridcell']//child::i[@aria-hidden='true']")).click();
		 
	
		 		 
     // Close the browser
	     //driver.close();

	  
	}
}
