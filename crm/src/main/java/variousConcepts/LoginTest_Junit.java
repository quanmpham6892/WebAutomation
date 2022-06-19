package variousConcepts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit {
	static WebDriver driver;

	@Before
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/quan/Desktop/Automation/WebAutomation/SwagAutomation/drivers/chromedriver");

		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.get("https://www.techfios.com/billing/?ng=admin/");

		driver.manage().window().maximize();

	}

	@Test
	public void loginTest() {

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");

		driver.findElement(By.id("password")).sendKeys("abc123");

		driver.findElement(By.name("login")).click();
		
		//Implicit wait means it is happening on the browser that the code is waiting on AKA "Remote"
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//Explicit wait means the code is waiting on your local machine
//		WebDriverWait wait = new WebDriverWait();
//		wait.until(ExpectedConditions.visibilityof(driver.findElement("")));

	}

	@Test
	public void negativeLoginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techios.com");

		driver.findElement(By.id("password")).sendKeys("abc123");

		driver.findElement(By.name("login")).click();
	}

	@After
	public void closeWindow() {
//close() method shall close the browser which is in focus
//close() method closes the active WebDriver instance; meaning this will only close the browser that it was on before for example clicking on a link and it opens on a new  tab		
		driver.close();

//quit() method will close all the browsers; NOTE: if test open new browser like example above, quit() method will close all browsers
//that is the difference between close() and quit() methods

	}
}
