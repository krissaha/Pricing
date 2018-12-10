package automationFramwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSelenium {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Action class implementation.
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("ch_funnel_more"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='ch_logged-intrip' and @class='hdr_item_link']")).click();
		driver.close();
		
	}
}
