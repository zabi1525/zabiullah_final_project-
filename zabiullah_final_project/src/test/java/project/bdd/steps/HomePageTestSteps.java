package project.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import project.bdd.pages.HomePage;
import project.bdd.utility.SeleniumUtilities;

public class HomePageTestSteps extends SeleniumUtilities {
    @When("Validate home page title is {string}")
    public void validateHomePageTitle(String expectedTitle) {
        String actualTitle = getElementText(HomePage.TEK_INSURANCE_APP);
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Then("Validate create primary account button is exist")
    public void validateCreatePrimaryAccountButtonIsExist() {
        boolean isElementPresent = isElementDisplayed(HomePage.CREATE_PRIMARY_ACCOUNT_BUTTON);
        Assert.assertTrue(isElementPresent);
    }
}
