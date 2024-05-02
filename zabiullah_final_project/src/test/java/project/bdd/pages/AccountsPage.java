package project.bdd.pages;

import org.openqa.selenium.By;

public class AccountsPage {
    public static final By ACCOUNT_BUTTON = By.xpath(
            "/html/body/div[1]/div/div[2]/div/div/a[1]");
    public static final By PAGE_NUM = By.xpath(
            "/html/body/div[1]/div/div[3]/div/div/div/div[2]/div/div/div[3]/select/option[1]");
    public static final By PAGE_TEN = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div[2]/div/div/div[3]/select");
    public static final By PAGE_RECORD = By.xpath("//tbody[@class='css-0']/tr");
    public static final By PAGE_TWENTY_FIVE = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div[2]/div/div/div[3]/select");
    public static final By PAGE_TWENTY_FIVE_RECORD = By.xpath("//tbody[@class='css-0']/tr");
    public static final By PAGE_FIFTY = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div[2]/div/div/div[3]/select");
    public static final By PAGE_FIFTY_RECORD = By.xpath("//tbody[@class='css-0']/tr");


}
