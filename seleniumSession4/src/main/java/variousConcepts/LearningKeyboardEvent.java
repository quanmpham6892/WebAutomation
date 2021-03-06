package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningKeyboardEvent {
WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
//		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.techfios.com/billing/?ng=admin/");

	}
	
	@Test
	public void keyboardEvent() {
		WebElement USERNAME_ELEMENT =driver.findElement(By.xpath("//input[@id='username']"));
		WebElement PASSWORD_ELEMENT =driver.findElement(By.xpath("//input[@id='password']"));
		WebElement SIGNIN_ELEMENT =driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button"));
		
		USERNAME_ELEMENT.sendKeys("demo@techfios.com");
		PASSWORD_ELEMENT.sendKeys("abc123");
		
		Actions action = new Actions(driver);
		
		//theres a functions call "Keys" that you can put into the action parameter that contains many other keyboard functions
		// Keys.ENTER and Keys.RETURN basically perform the same action 
		// .build().perform() compiles your function on runtime
		action.sendKeys(Keys.ENTER).build().perform();
		
		
		
	}
	
}
