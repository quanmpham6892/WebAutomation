package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	WebDriver driver;
	
	@Before
	public void init() {
//		System.setProperty("webdriver.chrome.driver", "/Users/quan/Desktop/Automation/WebAutomation/SwagAutomation/drivers/chromedriver");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
//		driver.get("https://objectspy.space/");
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void differentLocators() {
		//linkText- Requires the full text within the ahref element in the dom; Note: the example below is from objectspy website
//		driver.findElement(By.linkText("Link Test : Page Change")).click();
		//partialLinkText- Only need to identify unique text that is 1 out of 1 within the DOM; Note: the example below is from objectspy website
//		driver.findElement(By.partialLinkText("New Page")).click();
		
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");

		driver.findElement(By.id("password")).sendKeys("abc123");
		//Absolute Xpath; Note: the example below is from techfios website
		driver.findElement(By.xpath("html/body/div/div/div/form/div[3]/button")).click();
		
		
	}

}
