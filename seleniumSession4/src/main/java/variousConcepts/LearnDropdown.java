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

public class LearnDropdown {
	
	WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
//		driver.get("https://objectspy.space/");
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void dropDown() {
		WebElement USERNAME_ELEMENT =driver.findElement(By.xpath("//input[@id='username']"));
		WebElement PASSWORD_ELEMENT =driver.findElement(By.xpath("//input[@id='password']"));
		WebElement SIGNIN_ELEMENT =driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button"));
		
		USERNAME_ELEMENT.sendKeys("demo@techfios.com");
		PASSWORD_ELEMENT.sendKeys("abc123");
		SIGNIN_ELEMENT.click();
		
		WebElement DASHBOARD_TITLE_ELEMENT = driver.findElement(By.xpath("//h2[contains(text(), 'Dashboard ')]"));
		Assert.assertEquals("Dashboard page not found!!", "Dashboard", DASHBOARD_TITLE_ELEMENT.getText());
		
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"account\"]")).sendKeys("selenium");
		
		WebElement COMPANY_DROPDOWN_ELEMENT = driver.findElement(By.xpath("//select[@id='cid']"));
		
		//in order to SELECT, we must create a select object like the one below
		Select sel = new Select(COMPANY_DROPDOWN_ELEMENT);
		
		sel.selectByVisibleText("Techfios");
		
		//if we want to get all the options from the dropdown, we will need to 
		
		
	}
	
	public void tearDown() {
		driver.close();
	}

}
