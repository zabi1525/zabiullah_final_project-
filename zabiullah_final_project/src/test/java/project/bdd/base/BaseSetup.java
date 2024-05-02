package project.bdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseSetup {
    public static WebDriver driver;
    private final Properties properties = new Properties();
    public BaseSetup(){
        try {
            String fileFilePath = System.getProperty("user.dir") +
                    "/src/test/resources/configuration/application-configuration.properties";
            File propertiesFile = new File(fileFilePath);
            FileInputStream propertyFileInputStream = new FileInputStream(propertiesFile);
            properties.load(propertyFileInputStream);

            System.out.println(properties.get("retail.ui.url"));
        }catch(IOException ex){

        }
    }
    public void openBrowser(){
        String browserType = this.properties.getProperty("retail.browser.type");
        boolean isHeadless = Boolean.parseBoolean(this.properties.getProperty("retail.browser.headless"));

        if(browserType.equalsIgnoreCase("chrome")){
            ChromeOptions options = new ChromeOptions();
            if(isHeadless) options.addArguments("--headless");
            driver = new ChromeDriver(options);
        }
        else if (browserType.equalsIgnoreCase("edge")){
            EdgeOptions options = new EdgeOptions();
            if(isHeadless) options.addArguments("--headless");
            driver = new EdgeDriver(options);
        }
        else {
            throw new RuntimeException("wrong browser type");
        }
        driver.manage().window().maximize();

        String url = this.properties.getProperty("retail.ui.url");
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public WebDriver getChrome(){
        return driver;
    }
}
