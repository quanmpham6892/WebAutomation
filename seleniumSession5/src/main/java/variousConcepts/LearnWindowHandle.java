package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.yahoo.com/");
	}
	
	@Test
	public void windowHandle() {
		String handle1 = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("xpath");
		driver.findElement(By.xpath("//input[@id='ybar-search']")).click();
		driver.findElement(By.linkText("XPath Tutorial - W3Schools")).click();
		
		
	}
	
}
