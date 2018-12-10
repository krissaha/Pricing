package TestNG_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Parameterstestng 
{

	WebDriver driver;
	
	@Test
	@Parameters({"email","browser"})
	public void yahoologintestmethod(String email, String browser)
	{
		if (browser.equals("chrome"))
		{
	 System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");	
	 driver = new ChromeDriver();
		}
		else if(browser.equals("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	 driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.yahoo.com");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(email);
	 driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	}
	
	
	
}
