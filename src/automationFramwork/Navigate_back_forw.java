package automationFramwork;

import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.sun.jna.platform.FileUtils;

public class Navigate_back_forw {

	public static void main(String[] args)throws IOException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://artoftesting.com/automationTesting/tddWithCucumber.html");
		driver.navigate().refresh();
		
//		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(scrFile, new File("D:\\testScreenShot.jpg"));
	}
}
