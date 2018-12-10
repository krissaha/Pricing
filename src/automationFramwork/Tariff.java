package automationFramwork;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.SortingFocusTraversalPolicy;

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

public class Tariff {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		                String hiddenCaptchaVal = "";
						//System.setProperty("webdriver.gecko.driver", "E:\\\\Selenium\\geckodriver.exe");
				// Create a new instance of the FireFox driver		
						//WebDriver driver = new FirefoxDriver();
					System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
				// Open Appdev web site
						//String appUrl = "http://appdev.nvisionglobal.com";
						driver.get("http://appdev.nvisionglobal.com");
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
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
				        driver.findElement(By.xpath("//span[contains(text(),'Tariff')]")).click();
				        Thread.sleep(3000);
		/*---------------------------------------------------------------------------------------------------------------*/		      
		
				// Click on the search button 
				     	//driver.findElement(By.id("btnSearchTariff")).click();
				     	Thread.sleep(5000);
			    // Click to navigate last Tariff Details     	
				    	//driver.findElement(By.xpath("//span[@class='k-icon k-i-seek-e']")).click();
				    	//Thread.sleep(2000);
				     	
				     	
				// Adding Tariff Header Data with AIR  
				    	driver.findElement(By.xpath("//span[contains(text(), 'Select Provider')]")).click();
				    	Thread.sleep(3000);
				    	driver.findElement(By.xpath("//ul[@id='TPdropdownlist_listbox']//child::li[12]")).click();
				    	driver.findElement(By.xpath("//input[@id='HTariffName']")).sendKeys("Sel_DATA");
				    	driver.findElement(By.xpath("//span[contains(text(), '--Service--')]")).click();
				    	Thread.sleep(5000);
				    	driver.findElement(By.xpath("//input[@aria-owns='Hservice_listbox']")).sendKeys("AIR FREIGHT");
				    	Thread.sleep(5000);
				    	driver.findElement(By.xpath("//ul[@id='Hservice_listbox']//child::li[2]")).click();
				    				    					    	
				// Adding Tariff Details data    	
				    	Thread.sleep(5000);
				    	driver.findElement(By.xpath("//a[@class='k-button k-button-icontext k-grid-add-tariff']//child::span[@class='k-icon k-add']")).click();
				    	Thread.sleep(5000);
//				    	driver.findElement(By.xpath("//td[@id='aria_active_cell']")).click();
//				    	Thread.sleep(2000);
				    	driver.findElement(By.xpath("//td[@id='aria_active_cell' and contains(text(),'Cost per Weight')]")).clear();
    	
				    	
//				// Adding Tariff Header Data with small package 
//				    	driver.findElement(By.xpath("//span[contains(text(), 'Select Provider')]")).click();
//				    	Thread.sleep(3000);
//				    	driver.findElement(By.xpath("//ul[@id='TPdropdownlist_listbox']//child::li[2]")).click();
//				    	driver.findElement(By.xpath("//input[@id='HTariffName']")).sendKeys("Sel_DATA");
//				    	driver.findElement(By.xpath("//span[contains(text(), '--Service--')]")).click();
//				    	Thread.sleep(5000);
//				    	driver.findElement(By.xpath("//input[@aria-owns='Hservice_listbox']")).sendKeys("STANDARD");
//				    	Thread.sleep(5000);
//				    	driver.findElement(By.xpath("//ul[@id='Hservice_listbox']//child::li[2]")).click();
//				    	Thread.sleep(5000);
//				    	driver.findElement(By.xpath("//span[contains(text(),'--Select--')]")).click();
//				    	Thread.sleep(5000);
//				    	driver.findElement(By.xpath("//ul[@id='HTariffType_listbox']//child::li[5]")).click();
//				    	
//				// Adding Tariff Details data    	
//				    	Thread.sleep(5000);
//				    	driver.findElement(By.xpath("//a[@class='k-button k-button-icontext k-grid-add-tariff']//child::span[@class='k-icon k-add']")).click();
//				    	Thread.sleep(5000);
//				    	driver.findElement(By.xpath("//td[@id='aria_active_cell']")).click();
//				    	Thread.sleep(3000);
//				    	//driver.findElement(By.xpath("//td[@role='gridcell' and contains(text(),'01-Oct-2018')]")).click(); 	
//				    	
//				    	Actions action = new Actions(driver);
//				    	WebElement btn = driver.findElement(By.xpath("//td[@id='aria_active_cell' and @data-role='editable']"));	
//				    	Thread.sleep(5000);
//				    	action.doubleClick(btn).perform();
										
//						Thread.sleep(5000);
//						driver.findElement(By.xpath("//td[@id='aria_active_cell' and contains(text(),' 0')]")).click();
//				    	//sendKeys("All-US_GA_30303_US_CA_90001");
					     				     	
				     	// Click on the Class Rate Tariff     	
				     	//driver.findElement(By.xpath("//span[contains(text(),'ClassRateTariff')]")).click();
				     	//Thread.sleep(5000);
				     	//driver.close();
				 
				 
		
	}
}
