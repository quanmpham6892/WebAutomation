package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMouseScroll {
WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
//		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.dell.com/en-us");

	}
	
	@Test
	public void scroll() {
		//Vertically scroll by 200 pixels
		//There are two ways you can scroll
		//1. js.executeScript("scroll(0,200)");
		//2. js.executeScript("window.scrollBy(0,200)");
		// NOTE: inside the parentheses are represented as (x-axis, y-axis)
		// (verticle, horizontal)
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("scroll(0,800)");
		
		
		
	}

	
}
