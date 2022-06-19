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

public class LearnMouseHover {
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
	public void mouseHover() {
		WebElement PRODUCT_ELEMENT =driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/a/span"));
		WebElement MONITOR_ELEMENT =driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[13]/a"));
		WebElement HOME_MONITOR_ELEMENT =driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[13]/ul/li[3]/a"));
		
		Actions action = new Actions(driver);
		action.moveToElement(PRODUCT_ELEMENT).build().perform();
		action.moveToElement(MONITOR_ELEMENT).build().perform();
		HOME_MONITOR_ELEMENT.click();
		
		//OTHER OPERATIONS:
		//These two actions below goes together if you need to clickAndHold to an element, after you will need to release
		//action.clickAndHold() - click(without releasing) at the current mouse location.
		//action.release() - Releases the depressed left mouse button at the current mouse location
		
		//action.doubleClick() - Performs a double-click at the current mouse location.
		//action.dragAndDrop(source, target) - Performs click-and-hold at the location of the source element, 
			//moves to the location of the target element, then releases the mouse.
		//action.dragAndDropBy(source, x-offset, y-offset) -Performs click-andhold at the location
			//of the source element, moves by a given offset, then releases the mouse.
		//action.moveToElement(toElement) -moves the mouse to the middle of the element
		
		
		
		
		
		
	}
}
