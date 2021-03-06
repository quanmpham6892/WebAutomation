package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningIFrame {

WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
//		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://docs.oracle.com/javase/6/docs/api/");

	}
	
	@Test
	public void dealWithIframe() {
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("java.awt.color")).click();
		
		//now we will try to locate the "ColorSpace" frame
		//using the name of the frame in the element, the code will be able to switch to the next frame
		//before switchTo() we will have to switch to parentFrame first
		//another alternative is to switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("ColorSpace")).click();
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("classFrame");
		driver.getTitle();
		
		
		
	}
}
