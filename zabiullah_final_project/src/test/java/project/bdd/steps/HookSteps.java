package project.bdd.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import project.bdd.utility.SeleniumUtilities;

public class HookSteps extends SeleniumUtilities {
    @Before
    public void initiateTest()  {
        openBrowser();

    }
    @After
    public void closingBrowser(Scenario scenario) throws InterruptedException {
        if(scenario.isFailed()){
            TakesScreenshot screenShot  = (TakesScreenshot)  getChrome();
            byte[] capture = screenShot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(capture, "image/png","screenshot");
        }
        Thread.sleep(3000);
        getChrome().quit();
    }
}
