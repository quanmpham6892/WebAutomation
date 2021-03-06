package learningConcepts;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestingConcepts {
	
	WebDriver driver;
	String browser;
	String url;
	
	@BeforeMethod
	public void readConfig() {
		Properties prop = new Properties();
		
		try {
			//InputStream //BufferedReader //FileReader  //Scanner --These classes can read files
			InputStream input = new FileInputStream("./src/main/java/config/config.properties");
			prop.load(input);
			prop.getProperty("browser");
			url = prop.getProperty("url");
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}

		
	}
	
	@Test
	public void init() {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
			driver = new FirefoxDriver();
		}
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
	}
	
	

}
