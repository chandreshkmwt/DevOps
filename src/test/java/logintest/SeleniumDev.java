package logintest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumDev {
	WebDriver driver;
	@Test
	public void titleTest() {
		driver.get("https://www.selenium.dev/");
		Assert.assertEquals(driver.getTitle(), "Selenium");
	}
	  
	@BeforeTest
	public void beforeTest() throws Exception{
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void afterTest() throws Exception{
		Thread.sleep(3000);
		driver.quit();
	}
}
