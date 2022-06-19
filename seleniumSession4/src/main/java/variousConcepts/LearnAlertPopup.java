package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class LearnAlertPopup {

	WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
//		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

	}
	
	@Test
	public void dealWithPopup() throws InterruptedException {

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//To click on the 'Cancel' button:
		//driver.switch	To().alert().dismiss();
		//To click on the 'OK' button:
		//driver.switchTo().alert().accept();
		//To capture the alert message:
		//driver.switchTo().alert().getText();
		//To send some data to alert box:
		//driver.switchTo().alert().sendKeys("Text");
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		////session 4 1:14


		
		
	}
	
	public void tearDown() {
		driver.close();
	}

}
