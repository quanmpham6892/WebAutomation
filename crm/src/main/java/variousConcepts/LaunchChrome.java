package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	static WebDriver driver; 
	
	public static void main(String[] args) {
		launchBrowser();
		loginTest();
		closeWindow();

		launchBrowser();
		negativeLoginTest();
		closeWindow();
	}

	public static void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/quan/Desktop/Automation/WebAutomation/SwagAutomation/drivers/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();

		driver.get("https://www.techfios.com/billing/?ng=admin/");

		driver.manage().window().maximize();

	}

	public static void loginTest() {
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");

		driver.findElement(By.id("password")).sendKeys("abc123");

		driver.findElement(By.name("login")).click();
		

	}
	
	public static void negativeLoginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techios.com");

		driver.findElement(By.id("password")).sendKeys("abc123");

		driver.findElement(By.name("login")).click();
	}

	public static void closeWindow() {
		
		driver.close();
		
	}

}
