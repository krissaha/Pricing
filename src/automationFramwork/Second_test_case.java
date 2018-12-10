package automationFramwork;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Second_test_case 
	{

	    public static void main(String[] args) throws InterruptedException {
		
	     		String hiddenCaptchaVal = "";
				System.setProperty("webdriver.gecko.driver", "E:\\\\Selenium\\geckodriver.exe");
		// Create a new instance of the FireFox driver		
				WebDriver driver = new FirefoxDriver();
		// Open Appdev web site
				//String appUrl = "http://appdev.nvisionglobal.com";
				driver.get("http://appdev.nvisionglobal.com");
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
		// Click on Pricing Search Page 		
		        driver.findElement(By.xpath("//span[contains(text(),'Pricing Search')]")).click();
/*---------------------------------------------------------------------------------------------------------------*/		        
		        
		// Click on Search Button in pricing page  
		        //driver.findElement(By.id("SPricingKey")).sendKeys("1661");
				driver.findElement(By.id("msubmit")).click();
				Thread.sleep(5000);
				
		// Storing the current tab handle
				//String oldTab = driver.getWindowHandle();
				//String t = driver.getTitle();
				//System.out.println("Parent Window Title "+ t );
				String parentGUID = driver.getWindowHandle();
				System.out.println(driver.getCurrentUrl());
         //	Add new pricing Click on Add Button
				driver.findElement(By.cssSelector("input[id = 'btnAdd']")).sendKeys(Keys.CONTROL +"t");  
				Thread.sleep(5000);
		 // get the All the session id of the browsers
		
				Set<String>  allGUID = driver.getWindowHandles();

		 // print the title of the page
				 System.out.println("Total Windows : " + allGUID.size());
		 // iterate the values in the set
				  for(String guid : allGUID)
				  {
		 // one enter into if blobk if the GUID is not equal to parent window's GUID
				   if(! guid.equals(parentGUID))
				   {
		 // switch to the guid
				    driver.switchTo().window(guid);
				    // break the loop
				    break;
				   }
				   }
		  // print the title after switching
				  System.out.println("Page URL After Switching : "+ "__" + driver.getCurrentUrl());
				  Thread.sleep(10000);
		  // close the browser
				  driver.close();
				  
}
	
			
		//Get All Tabs or Window handles and iterate using for each loop
				/*ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());					
				for(String handle:newTab)
                {
                System.out.println(handle + "---" +driver.getCurrentUrl());
                driver.switchTo().window(handle);
                }
                           
                String s1 = "https://appdev.nvisionglobal.com/Pricing/Pricing/PricingSearch";
			    String s2 = driver.getCurrentUrl();
			    if (s1 == s2)
			    {
			    	System.out.println("Same page");
			    }
				*/
				
			
		// Switch to new Tab opened
				//ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
			    //newTab.remove(oldTab);
			    //driver.switchTo().window(newTab.get(0));   //change focus to new tab
			    //Thread.sleep(3000);
			    
			    			    
				//driver.findElement(By.id("InterstateInboundDisc")).sendKeys("123456");
				
				  
		//	Scroll down the page to find the element  
				/*JavascriptExecutor js = (JavascriptExecutor)driver;
				WebElement Element = driver.findElement(By.xpath("//div[contains(@class,'col-xs-4 col-md-1 zeropadright textbold' and .//text()='Note:']"));
				js.executeScript("arguments[0].scrollIntoView();",Element);	
				driver.findElement(By.id("txtNotes")).sendKeys("123456"); // Adding data in Notes*/ 
							
				
				/*    for(String winHandle : driver.getWindowHandles()){
					    driver.switchTo().window(winHandle);
					    System.out.println(winHandle);
					    driver.close();*/
				//String handle = driver.getWindowHandle();
				//System.out.println(handle);
			
				//WebDriverWait wait = new WebDriverWait(driver, 20);
				//wait.until(ExpectedConditions.elementToBeClickable(lastElementToLoad));
		
		/* Add data in pricing page 
				Select TP = new Select(driver.findElement(By.className("k-input")));
			    TP.selectByValue("UPS SUPPLY CHAIN SOLUTIONS UNITED STATES");*/
							
		 /*Scroll down the page to find the element  
				JavascriptExecutor js = (JavascriptExecutor)driver;
				WebElement Element = driver.findElement(By.xpath("//span[contains(text(),'items per page')]"));
				js.executeScript("arguments[0].scrollIntoView();",Element);
				
		// Navigate to the Last page of the search result 		
				            
	     		//driver.findElement(By.xpath("//span[contains(text(),'arrow-e')]")).click();
				//driver.wait(5000);
		        //driver.findElement(By.className("k-link").className("k-pager-nav").className("k-pager-last")).click();
				//driver.findElement(By.xpath("//div[contains(@class, '.k-link.k-pager-nav.k-pager-last')]")).click();
				//This will scroll the page till the element is found		
		        //js.executeScript("arguments[0].scrollIntoView();", Element);
		        //js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				//js.executeScript("scrollBy(0,2500)");	 */
				
				//driver.close();
						
				
	}
	


