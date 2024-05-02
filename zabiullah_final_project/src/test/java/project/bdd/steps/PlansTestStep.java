package project.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import project.bdd.pages.LoginPage;
import project.bdd.pages.PlansPage;
import project.bdd.utility.DateGenerator;
import project.bdd.utility.SeleniumUtilities;

import java.util.List;


public class PlansTestStep extends SeleniumUtilities {
    @Given("User clicks on login button")
    public void userClicksOnLoginButton() {
        clickOnElement(LoginPage.LOGIN_BUTTON);
    }
    @When("User fills form {string} and {string}")
    public void userFillsForm(String userName, String password) {
      sentTextToElement(LoginPage.NAME,userName);
      sentTextToElement(LoginPage.PASSWORD_INPUT,password);
    }
    @When("User clicks on sign in option")
    public void user_clicks_on_sign_in_button(){
        clickOnElement(LoginPage.SIGN_IN_BUTTON);
    }
    @Then("user navigates to plans page")
    public void userNavigatesToPlansPage() {
    clickOnElement(PlansPage.PLAN_BUTTON);
    }
    @Then("Validate {int} rows of data are present")
    public void validateRowsOfDataArePresent(Integer expectedRowNumber) {
        List<WebElement> rowsOfData = driver.findElements(PlansPage.ROW_OF_DATA);
        int actualRowOfDataNum = rowsOfData.size();
        Assert.assertEquals((int)expectedRowNumber,actualRowOfDataNum);
    }
    @Given("User press on login button")
    public void userPressOnLoginButton() {
    clickOnElement(LoginPage.LOGIN_BUTTON);
    }
    @Given("User fills up form {string} and {string}")
    public void userFillsUpForm(String userName, String password) {
        sentTextToElement(LoginPage.NAME,userName);
        sentTextToElement(LoginPage.PASSWORD_INPUT,password);

    }
    @When("User presses on sign in button")
    public void userPressesOnSignInButton() {
        clickOnElement(LoginPage.SIGN_IN_BUTTON);
    }
    @When("User navigates to plans page")
    public void userNavigatesToPlanPage() {
    clickOnElement(PlansPage.PLAN_BUTTON);
    }
    @Then("Validate creation date is today's date")
    public void validateCreationDateIsTodayDate() {
    String creationDate = getElementText(PlansPage.CREATION_DATE);
    String expectedCreationDate = DateGenerator.getCurrentDate();
    Assert.assertEquals(expectedCreationDate,creationDate);

    }
    @Then("Validate expiration date is a day after")
    public void validateExpirationDateIsADayAfter() {
        String actualExpirationDate = getElementText(PlansPage.EXPIRATION_DATE);
        String expectedExpirationDate = DateGenerator.getADayAfterCurrentDate();
        Assert.assertEquals(expectedExpirationDate,actualExpirationDate);

    }


}
