package tests;

import BasePages.Common;
import BasePages.LoginPage;
import Utilities.ReadingPropertiesFile;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Cart extends BasePages.mainPage {

    @Test
    public void cart() {
 //       driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
        driver.findElement(LoginPage.email_field).sendKeys(ReadingPropertiesFile.getProperty("email"));
        driver.findElement(LoginPage.password_field).sendKeys(ReadingPropertiesFile.getProperty("password"));
        driver.findElement(LoginPage.login_btn).click();
        driver.findElement(Common.cartBtn).click();
    }
}
