package stepdefs;
 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
 

public class ServiceHooks {
	public  static WebDriver driver;

	TestBase testBase;
    @Before
    public void initializeTest(){
    	testBase = new TestBase();
		testBase.selectBrowser();
    }
 
    @After
    public void embedScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                // Code to capture and embed images in test reports (if scenario fails)
            	final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png"); 
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
			try {
			//	log.info(scenario.getName() + " is pass");
				scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	driver.quit();
    }
}