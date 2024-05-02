package project.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import project.bdd.pages.HomePage;
import project.bdd.pages.LoginPage;
import project.bdd.pages.UserProfilePage;
import project.bdd.utility.SeleniumUtilities;

import java.util.Map;

public class UserProfileTestSteps extends SeleniumUtilities {
    @Given("user navigates to login page and enter valid CSR credential")
    public void userNavigatesToLoginPageAndEnterValidCsrCredential(DataTable dataTable) {
        clickOnElement(LoginPage.LOGIN_BUTTON);
        Map<String, String> data = dataTable.asMap();
        String username = data.get("username");
        String password = data.get("password");

        sentTextToElement(LoginPage.NAME,username);
        sentTextToElement(LoginPage.PASSWORD_INPUT,password);
        clickOnElement(LoginPage.SIGN_IN_BUTTON);
    }
    @When("user clicks on profile button")
    public void userClicksOnProfileButton() {
       clickOnElement(UserProfilePage.PROFILE_BTN);
    }
    @Then("Validate user profile information")
    public void validateUserProfileInformation(DataTable dataTable) {
        Map<String, String> data = dataTable.asMap();
        String expectedAccountStatus = data.get("status");
        String expectedUserType = data.get("User Type");
        String expectedFullName = data.get("Full Name");
        String expectedUserName = data.get("UserName");
        String expectedAuthority = data.get("Authorities");

        String actualAccountStatus = getElementText(UserProfilePage.ACCOUNT_STATUS);
        Assert.assertEquals(expectedAccountStatus,actualAccountStatus);

        String actualUserType = getElementText(UserProfilePage.USER_TYPE);
        Assert.assertEquals(expectedUserType,actualUserType);

        String actualFullName = getElementText(UserProfilePage.FULL_NAME);
        Assert.assertEquals(expectedFullName,actualFullName);

        String actualUserName = getElementText(UserProfilePage.USER_NAME);
        Assert.assertEquals(expectedUserName,actualUserName);

        String actualAuthority = getElementText(UserProfilePage.AUTHORITY);
        Assert.assertEquals(expectedAuthority,actualAuthority);
    }
    @Given("User navigates to login page and provide valid credentials")
    public void userNavigatesToLoginPageAndProvideValidCredentials(DataTable dataTable) {
        clickOnElement(LoginPage.LOGIN_BUTTON);
        Map<String, String> data = dataTable.asMap();
        String userName = data.get("username");
        String password = data.get("password");

        sentTextToElement(LoginPage.NAME,userName);
        sentTextToElement(LoginPage.PASSWORD_INPUT,password);
    }
    @When("User clicks on sign in")
    public void userClicksOnSignIn() {
    clickOnElement(LoginPage.SIGN_IN_BUTTON);
    }
    @Then("User clicks on profile button then logout button")
    public void userClicksOnProfileButtonThenLogoutButton() {
    clickOnElement(UserProfilePage.PROFILE_BTN);
    clickOnElement(UserProfilePage.LOG_OUT_BTN);
    }
    @Then("Validate user is taken back to home page after success logout")
    public void validateUserIsTakenBackToHomePageAfterSuccessLogout() {
    boolean isUserTakenToHomePageAfterLogOut = isElementDisplayed(HomePage.LETS_GET_YOU_STARTED);
    Assert.assertTrue("User should be taken to home page after logout ",isUserTakenToHomePageAfterLogOut);
    }
}
