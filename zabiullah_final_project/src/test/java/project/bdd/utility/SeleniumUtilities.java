package project.bdd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.bdd.base.BaseSetup;

import java.time.Duration;

public class SeleniumUtilities extends BaseSetup {
    private WebDriverWait getWait(){
        WebDriverWait wait = new WebDriverWait(getChrome(), Duration.ofSeconds(20));
        return wait;
    }
    public void clickOnElement(By locator){
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public String getElementText(By locator)  {

        String text = getWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
        return text;
    }
    public void sentTextToElement(By locator, String text){
        getWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }
    public boolean isElementDisplayed(By locator){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
    }

    public void selectFromDropDown(By locator, String visibleText){
        WebElement selectElement = driver.findElement(locator);
        Select select = new Select(selectElement);
        select.selectByVisibleText(visibleText);
    }
}
