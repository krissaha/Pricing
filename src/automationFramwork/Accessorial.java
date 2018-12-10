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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Accessorial {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
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
        driver.findElement(By.xpath("//span[contains(text(),'Accessorial')]")).click();
/*---------------------------------------------------------------------------------------------------------------*/	
	}

}
