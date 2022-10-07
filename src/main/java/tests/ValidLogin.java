package tests;

import BasePages.LoginPage;
import Utilities.ReadingPropertiesFile;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ValidLogin extends BasePages.mainPage {

    @Test
    public void signIn() {// Locate the email field and send data
        driver.findElement(LoginPage.email_field).sendKeys(username);
        driver.findElement(LoginPage.password_field).sendKeys(password);
        driver.findElement(LoginPage.login_btn).click();
    }
}