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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Pricing_Header_Search 

{
	public static void main(String[] args) throws InterruptedException 

	{
		String hiddenCaptchaVal = "";
        
		// Firefox driver 	     		
		//	System.setProperty("webdriver.gecko.driver", "E:\\\\Selenium\\geckodriver.exe");
		//String appUrl = "http://appdev.nvisionglobal.com";
		
		// Create a new instance of the Chrome driver	
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		// Open Appdev web site
		driver.get("http://appdev.nvisionglobal.com");
		driver.manage().window().maximize();
		
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
				        //driver.findElement(By.id("msubmit")).click();
						//Thread.sleep(5000);
						//driver.findElement(By.id("btnpricingReset")).click();
						driver.findElement(By.id("msubmit")).click();
						Thread.sleep(5000);
						
				// Scroll down the page to find the element  
						JavascriptExecutor js = (JavascriptExecutor)driver;
						WebElement Element = driver.findElement(By.xpath("//span[contains(text(),'items per page')]"));
						js.executeScript("arguments[0].scrollIntoView();",Element);
						
				// Click to navigate last pricing details
						Thread.sleep(3000);
						driver.findElement(By.xpath("//span[@class='k-icon k-i-seek-e']")).click();
						
						String parent = driver.getWindowHandle();
						System.out.println("Parent Window :- " + parent);
						
				// Click on the Add Pricing Button 
						Thread.sleep(3000);
						driver.findElement(By.xpath("//span[@class='k-icon k-add']")).click();
						
						Set<String> alwind = driver.getWindowHandles();
						int count = alwind.size();
						Thread.sleep(3000);
						System.out.println("Total number of windows:- " + count);
						
						for(String child:alwind)
						{
							if(!parent.equalsIgnoreCase(child))
							{
								Thread.sleep(3000);
								driver.switchTo().window(child);
								Thread.sleep(3000);
								//driver.findElement(By.xpath("//input[@class='k-textbox' and @id='txtReferenceNumber']")).sendKeys("Hello");
								
							}
						}
}
}
