package project.bdd.pages;

import org.openqa.selenium.By;

public class LoginPage {
    public static final By LOGIN_BUTTON = By.xpath("//a[@class='chakra-button css-ez23ye']");
    public static final By NAME = By.name("username");
    public static final By PASSWORD_INPUT = By.name("password");
    public static final By SIGN_IN_BUTTON = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/form/div/div[3]/button[1]");
    public static final By CUSTOMER_SERVICE_PORTAL = By.xpath("//h2[@class='chakra-heading css-1at26de']");
    public static final By ERROR_MESSAGE = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div");
    public static final By PASSWORD_ERROR_MESSAGE = By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div");
}
