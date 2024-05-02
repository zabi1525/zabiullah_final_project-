package project.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import project.bdd.pages.LoginPage;
import project.bdd.utility.SeleniumUtilities;

import java.util.Map;

public class LoginTestSteps extends SeleniumUtilities {
    @Given("user clicks on login button")
    public void userClicksOnLoginButton() {
        clickOnElement(LoginPage.LOGIN_BUTTON);
    }
    @When("user fills up the login form")
    public void userFillsUpTheLoginForm(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap();
        String userName = data.get("username");
        String password = data.get("password");

        sentTextToElement(LoginPage.NAME,userName);
        sentTextToElement(LoginPage.PASSWORD_INPUT,password);
    }
    @Then("user clicks on sign in button")
    public void userClicksOnSignInButton(){
        clickOnElement(LoginPage.SIGN_IN_BUTTON);
    }
    @Then("Validate user navigates to Customer Service Portal")
    public void validateUserNavigatesToCustomerServicePortal() {
    boolean isCustomerServicePortalDisplayed = isElementDisplayed(LoginPage.CUSTOMER_SERVICE_PORTAL);
        Assert.assertTrue(isCustomerServicePortalDisplayed);
    }
    @Given("user clicks on login button to navigate to login page")
    public void userClicksOnLoginButtonToNavigateToLoginPage() {
        clickOnElement(LoginPage.LOGIN_BUTTON);
    }
    @When("User fills up the login form with invalid credentials")
    public void usersFillUpTheLoginFormWithInvalidCredentials(DataTable dataTable) {
       Map<String, String> data = dataTable.asMap();
       String userName = data.get("username");
       String password = data.get("password");

        sentTextToElement(LoginPage.NAME,userName);
        sentTextToElement(LoginPage.PASSWORD_INPUT,password);
    }
    @Then("User clicks on sign in button")
    public void userClicksOnSignInBtn() {
        clickOnElement(LoginPage.SIGN_IN_BUTTON);
    }
    @Then("Validate error message {string}")
    public void validateErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = getElementText(LoginPage.ERROR_MESSAGE);
        String modifiedErrorMessage = actualErrorMessage.replace("ERROR","").trim();
        Assert.assertEquals(expectedErrorMessage,modifiedErrorMessage);

    }
    @Given("user clicks on login button to be taken to login page")
    public void userClicksOnLoginButtonToBeTakenToLoginPage() {
        clickOnElement(LoginPage.LOGIN_BUTTON);
    }
    @When("User fills up the login form with valid username and invalid password")
    public void userFillsUpTheLoginFormWithValidUsernameAndInvalidPassword(DataTable dataTable) {
       Map<String, String> data = dataTable.asMap();
       String username = data.get("username");
       String password = data.get("password");
       sentTextToElement(LoginPage.NAME,username);
       sentTextToElement(LoginPage.PASSWORD_INPUT,password);
    }
    @Then("User clicks on sign in btn")
    public void userClickOnSignInBtn() {
     clickOnElement(LoginPage.SIGN_IN_BUTTON);
    }
    @Then("Validate password error message {string} as expected")
    public void validatePasswordErrorMessageAsExpected(String expectedErrorMessage) {
       String actualErrorMessage = getElementText(LoginPage.PASSWORD_ERROR_MESSAGE);
       String modifiedErrorMessage = actualErrorMessage.replace("ERROR","").trim();
       Assert.assertEquals(expectedErrorMessage,modifiedErrorMessage);
    }


}
