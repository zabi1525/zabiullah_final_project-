package project.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import project.bdd.pages.AccountsPage;
import project.bdd.pages.LoginPage;
import project.bdd.utility.SeleniumUtilities;

import java.util.List;

public class AccountsTestSteps extends SeleniumUtilities {
    @Given("User Clicks on login button")
    public void userClicksOnLoginButton() {
    clickOnElement(LoginPage.LOGIN_BUTTON);
    }
    @Given("User Fills out the login form {string} and {string} and sign in")
    public void userFillsLoginFormAnd(String userName, String password) {
    sentTextToElement(LoginPage.NAME,userName);
    sentTextToElement(LoginPage.PASSWORD_INPUT,password);
    clickOnElement(LoginPage.SIGN_IN_BUTTON);
    }
    @When("User Navigates to Customer Service Portal and clicks on Account button")
    public void userNavigatesToCustomerServicePortalAndClicksOnAccountButton() {
        clickOnElement(AccountsPage.ACCOUNT_BUTTON);
    }
    @Then("Validate five row or page is default")
    public void validateFiveRowOrPageIsDefault() {
        String actualPageDefault = getElementText(AccountsPage.PAGE_NUM);
        String expectedPageDefault = "Show 5";
        Assert.assertEquals(expectedPageDefault,actualPageDefault);
    }
    @When("User changes show per page to ten")
    public void userChangesShowPerPageToTen() {
        selectFromDropDown(AccountsPage.PAGE_TEN,"Show 10");
    }
    @Then("Validate table records of page ten")
    public void validateTableRecordsOfPageTen() {
       List<WebElement> numOfEmails = driver.findElements(AccountsPage.PAGE_RECORD);
       int actualNumOfEmails = numOfEmails.size();
       int expectedNumOfEmails = 10;
       Assert.assertEquals(expectedNumOfEmails,actualNumOfEmails);

    }
    @When("User changes show per page to twenty-five")
    public void userChangesShowPerPageToTwentyFive() {
      selectFromDropDown(AccountsPage.PAGE_TWENTY_FIVE,"Show 25");
    }
    @Then("Validate table records of page twenty-five")
    public void validateTableRecordsOfPageTwentyFive() {
        List<WebElement> numOfEmails = driver.findElements(AccountsPage.PAGE_TWENTY_FIVE_RECORD);
        int actualNumOfEmails = numOfEmails.size();
        int expectedNumOfEmails = 25;
        Assert.assertEquals(expectedNumOfEmails,actualNumOfEmails);

    }
    @When("User changes show per page to fifty")
    public void userChangesShowPerPageToFifty() {
    selectFromDropDown(AccountsPage.PAGE_FIFTY,"Show 50");
    }
    @Then("Validate table records of page fifty")
    public void validateTableRecordsOfPageFifty() {
        List<WebElement> numOfEmails = driver.findElements(AccountsPage.PAGE_FIFTY_RECORD);
        int actualNumOfEmails = numOfEmails.size();
        int expectedNumOfEmails = 50;
        Assert.assertEquals(expectedNumOfEmails,actualNumOfEmails);
    }


}
