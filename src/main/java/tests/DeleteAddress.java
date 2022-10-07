package tests;

import BasePages.Common;
import BasePages.LoginPage;
import Utilities.ReadingPropertiesFile;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DeleteAddress extends BasePages.mainPage{
    @Test
    public void dltAdress() throws InterruptedException {
        driver.findElement(LoginPage.email_field).sendKeys(ReadingPropertiesFile.getProperty("email"));
        driver.findElement(LoginPage.password_field).sendKeys(ReadingPropertiesFile.getProperty("password"));
        driver.findElement(LoginPage.login_btn).click();
        Thread.sleep(2500);
        driver.findElement(Common.giftCards).click();
        Thread.sleep(2500);
        driver.findElement(Common.addToWallet).click();
        Thread.sleep(2000);
        driver.findElement(Common.MyAdress).click();
        Thread.sleep(2500);
        driver.findElement(Common.Delete).click();
    }
}
