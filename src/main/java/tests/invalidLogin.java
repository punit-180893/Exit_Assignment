package tests;

import BasePages.LoginPage;
import Utilities.ReadingPropertiesFile;
import org.testng.annotations.Test;

public class invalidLogin extends BasePages.mainPage {

    @Test
    public void signIn() {
        driver.findElement(LoginPage.email_field).sendKeys(ReadingPropertiesFile.getProperty("email"));
        driver.findElement(LoginPage.password_field).sendKeys(ReadingPropertiesFile.getProperty("wrong_password"));
        driver.findElement(LoginPage.login_btn).click();

    }
}
