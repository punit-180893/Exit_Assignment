package tests;

import BasePages.Common;
import BasePages.LoginPage;
import Utilities.ReadingPropertiesFile;
import org.testng.annotations.Test;

public class Logout extends BasePages.mainPage{
    @Test
    public void logout() throws InterruptedException {
        driver.findElement(LoginPage.email_field).sendKeys(ReadingPropertiesFile.getProperty("email"));
        driver.findElement(LoginPage.password_field).sendKeys(ReadingPropertiesFile.getProperty("password"));
        driver.findElement(LoginPage.login_btn).click();
        Thread.sleep(2500);
        driver.findElement(Common.hover).click();
        Thread.sleep(2500);
        driver.findElement(Common.logout).click();
    }
}
