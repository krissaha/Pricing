package automationFramwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class first_test_case {

	public static void main(String[] args) throws InterruptedException {
		///Create firfox driver's instance
		WebDriver driver = new FirefoxDriver();
		
		//Set implicit wait of 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Launch google
		driver.get("http://www.google.co.in");
		
		//Write 2+2 in google textbox
		WebElement googleTextBox = driver.findElement(By.id("gbqfq"));
		googleTextBox.sendKeys("2+2");
		
		//Click on searchButton
		WebElement searchButton = driver.findElement(By.id("gbqfb"));
		searchButton.click();
		
		//Get result from calculator
		WebElement calculatorTextBox = driver.findElement(By.id("cwos"));
		String result = calculatorTextBox.getText();
		
		//Verify that result of 2+2 is 4
		Assert.assertEquals(result, "4");
     
        
        
	}
}
