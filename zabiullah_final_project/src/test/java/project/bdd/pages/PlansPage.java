package project.bdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PlansPage {

    public static final By PLAN_BUTTON = By.xpath("/html/body/div[1]/div/div[2]/div/div/a[2]");
     public static final By ROW_OF_DATA = By.xpath("//tbody[@class='css-0']/tr");
     public static final By CREATION_DATE = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[1]/td[4]");
     public static final By EXPIRATION_DATE = By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/table/tbody/tr[1]/td[5]");
}
