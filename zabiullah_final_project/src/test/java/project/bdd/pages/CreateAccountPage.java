package project.bdd.pages;

import org.openqa.selenium.By;

public class CreateAccountPage {
    public static final By CREATE_PRIMARY_ACCOUNT_BUTTON =
            By.xpath("//a[@class='chakra-button css-1jp0m7c']");
    public static final By CREATE_PRIMARY_ACCOUNT_HOLDER_TITLE =
            By.xpath("//h2[@class='chakra-heading css-1jb3vzl']");
    public static final By EMAIL = By.name("email");
    public static final By FIRST_NAME = By.id("firstName");
    public static final By GENDER = By.id("gender");

    public static final By EMPLOYMENT_STATUS = By.name("employmentStatus");

    public static final By title = By.name("title");
    public static final By LAST_NAME = By.name("lastName");
   public static final By MARITAL_STATUS = By.id("maritalStatus");
    public static final By DATE_OF_BIRTH = By.name("dateOfBirth");
    public static final By CREATE_ACCOUNT_BUTTON = By.xpath("//button[@class='chakra-button css-jut409']");
    public static final By SIGN_UP_YOUR_ACCOUNT_PAGE = By.xpath(
            "//h2[@class='chakra-heading css-1jb3vzl']");
    public static final By EMAIL_AS_SHOWN_ON_SIGN_UP_PAGE = By.xpath(
            "/html/body/div[1]/div/div[2]/div/div/div/h2[3]");
    public static final By ERROR_MESSAGE = By.xpath(
            "//div[@class='chakra-alert banner-error css-1ykemat']");
}
