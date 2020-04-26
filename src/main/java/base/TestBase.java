package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class TestBase {

	public  static WebDriver driver;

	
	public WebDriver selectBrowser() {
	
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			
		return driver;
	}
}
