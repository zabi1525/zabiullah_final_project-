package project.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import project.bdd.pages.CreateAccountPage;
import project.bdd.utility.RandomEmailGenerator;
import project.bdd.utility.SeleniumUtilities;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CreateAccountTestSteps extends SeleniumUtilities {


    private String randomEmail;

    @When("User clicks on create primary account button")
    public void userClicksOnCreatePrimaryAccountButton() {
        clickOnElement(CreateAccountPage.CREATE_PRIMARY_ACCOUNT_BUTTON);
    }

    @Then("Validate form page title {string}")
    public void validateFormPageTitleAsExpected(String expected) {
        String actualTitle = getElementText(CreateAccountPage.CREATE_PRIMARY_ACCOUNT_HOLDER_TITLE);
        assertEquals(expected, actualTitle);
    }

    @Given("User clicks on create primary account btn")
    public void userClicksOnCreatePrimaryAccountBtn() {
        clickOnElement(CreateAccountPage.CREATE_PRIMARY_ACCOUNT_BUTTON);
    }

    @When("User fills up the form")
    public void userFillsUpTheForm(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap();
        String firstName = data.get("firstName");
        String gender = data.get("gender");
        String employmentStatus = data.get("employmentStatus");
        String title = data.get("title");
        String lastName = data.get("lastName");
        String maritalStatus = data.get("maritalStatus");
        String dateOfBirth = data.get("dateOfBirth");


        randomEmail = RandomEmailGenerator.randomEmail();


        sentTextToElement(CreateAccountPage.EMAIL, randomEmail);
        sentTextToElement(CreateAccountPage.FIRST_NAME, firstName);
        selectFromDropDown(CreateAccountPage.GENDER, gender);
        sentTextToElement(CreateAccountPage.EMPLOYMENT_STATUS, employmentStatus);
        selectFromDropDown(CreateAccountPage.title, title);
        sentTextToElement(CreateAccountPage.LAST_NAME, lastName);
        selectFromDropDown(CreateAccountPage.MARITAL_STATUS, maritalStatus);
        sentTextToElement(CreateAccountPage.DATE_OF_BIRTH, dateOfBirth);
    }

    @When("user clicks on create account button")
    public void userClicksOnCreateAccountButton() {
        clickOnElement(CreateAccountPage.CREATE_ACCOUNT_BUTTON);
    }

    @Then("Validate user navigates to sign up your account page")
    public void validateUserNavigatesToSignUpYourAccountPage() {
        boolean isUserNavigatedToSignYourAccountPage = isElementDisplayed(CreateAccountPage.SIGN_UP_YOUR_ACCOUNT_PAGE);
        assertTrue(isUserNavigatedToSignYourAccountPage);
    }

    @Then("Validate email shows as expected on the page")
    public void validateEmailShowsAsExpectedOnThePage() {
        String actualEmail = getElementText(CreateAccountPage.EMAIL_AS_SHOWN_ON_SIGN_UP_PAGE);
        assertEquals(randomEmail, actualEmail);
    }

    @Given("User navigates to account creation page")
    public void userNavigatesToAccountCreationPage() {
        clickOnElement(CreateAccountPage.CREATE_PRIMARY_ACCOUNT_BUTTON);
    }

    @When("user fills up the form with existing credentials")
    public void userFillsUpTheFormWithExistingCredentials(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap();
        String email = data.get("email");
        String firstName = data.get("firstName");
        String gender = data.get("gender");
        String employmentStatus = data.get("employmentStatus");
        String title = data.get("title");
        String lastName = data.get("lastName");
        String maritalStatus = data.get("maritalStatus");
        String dateOfBirth = data.get("dateOfBirth");


        sentTextToElement(CreateAccountPage.EMAIL, email);
        sentTextToElement(CreateAccountPage.FIRST_NAME, firstName);
        selectFromDropDown(CreateAccountPage.GENDER, gender);
        sentTextToElement(CreateAccountPage.EMPLOYMENT_STATUS, employmentStatus);
        selectFromDropDown(CreateAccountPage.title, title);
        sentTextToElement(CreateAccountPage.LAST_NAME, lastName);
        selectFromDropDown(CreateAccountPage.MARITAL_STATUS, maritalStatus);
        sentTextToElement(CreateAccountPage.DATE_OF_BIRTH, dateOfBirth);
    }

    @Then("click on create account button")
    public void userClicksOnCreateAccountBtn() {
        clickOnElement(CreateAccountPage.CREATE_ACCOUNT_BUTTON);
    }

    @Then("Validate error message {string} as expected")
    public void validateErrorMessageAsExpected(String expectedErrorMessage) {
        String actualErrorMessage = getElementText(CreateAccountPage.ERROR_MESSAGE);
        String modifiedErrorMessage = actualErrorMessage.replace("ERROR", randomEmail).trim();
        assertEquals(expectedErrorMessage, modifiedErrorMessage);
    }


}


