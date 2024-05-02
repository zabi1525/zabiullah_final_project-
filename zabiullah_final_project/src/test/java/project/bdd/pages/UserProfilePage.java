package project.bdd.pages;

import org.openqa.selenium.By;

public class UserProfilePage {
    public static final By PROFILE_BTN = By.xpath("//button[@class='chakra-button chakra-button css-1lzp9bh']");
    public static final By ACCOUNT_STATUS = By.xpath("//span[@class='css-1ny2kle']");
    public static final By USER_TYPE = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[2]/p[2]");
    public static final By FULL_NAME = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[3]/p[2]");
    public static final By USER_NAME = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[4]/p[2]");
    public static final By AUTHORITY = By.xpath("/html/body/div[3]/div[3]/div/div/div/div/div/div[5]/ul/li");
    public static final By LOG_OUT_BTN = By.xpath("/html/body/div[3]/div[3]/div/div/footer/div/button[1]");

}
